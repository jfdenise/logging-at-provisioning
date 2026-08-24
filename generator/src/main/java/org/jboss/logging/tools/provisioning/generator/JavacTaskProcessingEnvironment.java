package org.jboss.logging.tools.provisioning.generator;

import java.io.Writer;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;

import com.sun.source.util.JavacTask;

/**
 * A synthetic {@link ProcessingEnvironment} backed by a {@link JavacTask} that was
 * initialised against the source JAR on the classpath.
 *
 * <p>The {@link JavacTask} must have already had {@link JavacTask#analyze()} called so that
 * its symbol table (and therefore {@link Elements} / {@link Types}) is fully populated from
 * the compiled classes on the classpath.  This allows the jboss-logging-tools generators to
 * receive <em>real</em> {@code TypeMirror}, {@code TypeElement}, and {@code Types} objects
 * derived from bytecode — no stub implementations are needed.</p>
 *
 * <p>Only the methods actually called by the generators are implemented.  All others throw
 * {@link UnsupportedOperationException} so that any unexpected call surfaces immediately
 * during testing.</p>
 */
public class JavacTaskProcessingEnvironment implements ProcessingEnvironment {

    private final Elements elements;
    private final Types types;
    private final Filer filer;
    private final Messager messager;

    /**
     * @param task      an already-analysed {@link JavacTask} — {@code task.analyze()} must
     *                  have been called before constructing this object
     * @param pathFiler the {@link PathJFiler} that routes generated {@code .java} files to
     *                  the temp source directory
     */
    public JavacTaskProcessingEnvironment(JavacTask task, PathJFiler pathFiler) {
        this.elements = task.getElements();
        this.types = task.getTypes();
        this.filer = new FilerAdapter(pathFiler);
        this.messager = SilentMessager.INSTANCE;
    }

    @Override
    public Elements getElementUtils() {
        return elements;
    }

    @Override
    public Types getTypeUtils() {
        return types;
    }

    @Override
    public Filer getFiler() {
        return filer;
    }

    @Override
    public Messager getMessager() {
        return messager;
    }

    @Override
    public Map<String, String> getOptions() {
        return Collections.emptyMap();
    }

    @Override
    public SourceVersion getSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public Locale getLocale() {
        return Locale.ROOT;
    }

    // ─────────────────────────────────────────────────────────────────────
    // Filer adapter — bridges javax.annotation.processing.Filer to PathJFiler
    // ─────────────────────────────────────────────────────────────────────

    private static class FilerAdapter implements Filer {

        private final PathJFiler delegate;

        FilerAdapter(PathJFiler delegate) {
            this.delegate = delegate;
        }

        @Override
        public javax.tools.JavaFileObject createSourceFile(CharSequence name,
                Element... originatingElements) throws java.io.IOException {
            // Derive packageName and simpleName from the FQCN
            String fqcn = name.toString();
            int lastDot = fqcn.lastIndexOf('.');
            String pkg = lastDot < 0 ? "" : fqcn.substring(0, lastDot);
            String simple = lastDot < 0 ? fqcn : fqcn.substring(lastDot + 1);

            java.io.OutputStream out = delegate.openStream(pkg, simple);
            // Wrap in a JavaFileObject so callers can open its OutputStream
            return new OutputStreamJavaFileObject(fqcn, out);
        }

        @Override
        public javax.tools.JavaFileObject createClassFile(CharSequence name,
                Element... originatingElements) {
            throw new UnsupportedOperationException("createClassFile not used by provisioning bridge");
        }

        @Override
        public javax.tools.FileObject createResource(javax.tools.JavaFileManager.Location location,
                CharSequence pkg, CharSequence relativeName, Element... originatingElements) {
            throw new UnsupportedOperationException("createResource not used by provisioning bridge");
        }

        @Override
        public javax.tools.FileObject getResource(javax.tools.JavaFileManager.Location location,
                CharSequence pkg, CharSequence relativeName) {
            throw new UnsupportedOperationException("getResource not used by provisioning bridge");
        }
    }

    // ─────────────────────────────────────────────────────────────────────
    // Minimal JavaFileObject that holds an OutputStream for source writing
    // ─────────────────────────────────────────────────────────────────────

    private static class OutputStreamJavaFileObject extends javax.tools.SimpleJavaFileObject {

        private final java.io.OutputStream out;

        OutputStreamJavaFileObject(String fqcn, java.io.OutputStream out) {
            super(java.net.URI.create("mem:///" + fqcn.replace('.', '/') + ".java"),
                    javax.tools.JavaFileObject.Kind.SOURCE);
            this.out = out;
        }

        @Override
        public java.io.OutputStream openOutputStream() {
            return out;
        }

        @Override
        public Writer openWriter() throws java.io.IOException {
            return new java.io.OutputStreamWriter(out, java.nio.charset.StandardCharsets.UTF_8);
        }
    }

    // ─────────────────────────────────────────────────────────────────────
    // Silent messager — the generators may call note/warning; we discard them
    // ─────────────────────────────────────────────────────────────────────

    private static class SilentMessager implements Messager {
        static final SilentMessager INSTANCE = new SilentMessager();

        @Override
        public void printMessage(Diagnostic.Kind kind, CharSequence msg) {}

        @Override
        public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e) {}

        @Override
        public void printMessage(Diagnostic.Kind kind, CharSequence msg,
                Element e, AnnotationMirror a) {}

        @Override
        public void printMessage(Diagnostic.Kind kind, CharSequence msg,
                Element e, AnnotationMirror a, AnnotationValue v) {}
    }
}
