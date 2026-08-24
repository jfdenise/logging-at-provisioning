package org.jboss.logging.tools.provisioning.generator;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.jboss.jdeparser.JFiler;

/**
 * A {@link JFiler} implementation that writes generated {@code .java} source files
 * to a filesystem {@link Path} directory.
 *
 * <p>This replaces {@code JFilerOriginatingElementAware} for the provisioning-time
 * path so that no live {@code ProcessingEnvironment.getFiler()} is needed.</p>
 */
public class PathJFiler extends JFiler {

    private final Path outputDir;

    /**
     * @param outputDir root directory under which generated source files are written.
     *                  Subdirectories are created as needed to match the package structure.
     */
    public PathJFiler(Path outputDir) {
        this.outputDir = outputDir;
    }

    /**
     * Opens an {@link OutputStream} for a generated source file.
     *
     * @param packageName the package name, e.g. {@code "org.jboss.as.web"}
     * @param fileName    the simple class name (without {@code .java}),
     *                    e.g. {@code "WebLogger_$logger"}
     */
    @Override
    public OutputStream openStream(String packageName, String fileName) throws IOException {
        String pkgPath = packageName.replace('.', '/');
        Path target = outputDir.resolve(pkgPath).resolve(fileName + ".java");
        Files.createDirectories(target.getParent());
        return Files.newOutputStream(target,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}
