package org.jboss.logging.tools.provisioning.descriptor;

import java.util.Map;

/**
 * Metadata for one .properties translation file co-located with a source interface
 * inside a JAR. See spec §1.7.5.
 */
public class TranslationFileDescriptor {

    /** Binary name of the owning source interface, e.g. "org/jboss/as/web/WebLogger". */
    public final String interfaceBinaryName;

    /**
     * Locale suffix including leading underscore, e.g. "_de_DE".
     * Used as a class-name suffix: WebLogger_$logger_de_DE.
     */
    public final String localeSuffix;

    /**
     * Locale string without leading underscore, e.g. "de_DE".
     * Passed to ClassModelFactory.translation(…) as the locale parameter.
     */
    public final String locale;

    /**
     * Internal name of the superclass (dot-separated), e.g.
     * "org.jboss.as.web.WebLogger_$logger_de" for locale "de_DE", or
     * "org.jboss.as.web.WebLogger_$logger" for the base locale.
     * See spec §1.7.3.
     */
    public final String parentClassName;

    /**
     * Validated translations: translationKey → translated message string.
     * Keys are method names (un-overloaded) or "method.N" (overloaded).
     */
    public final Map<String, String> translations;

    public TranslationFileDescriptor(String interfaceBinaryName, String localeSuffix,
            String locale, String parentClassName, Map<String, String> translations) {
        this.interfaceBinaryName = interfaceBinaryName;
        this.localeSuffix = localeSuffix;
        this.locale = locale;
        this.parentClassName = parentClassName;
        this.translations = Map.copyOf(translations);
    }

    @Override
    public String toString() {
        return "TranslationFileDescriptor{interface='" + interfaceBinaryName
                + "', locale='" + locale + "'}";
    }
}
