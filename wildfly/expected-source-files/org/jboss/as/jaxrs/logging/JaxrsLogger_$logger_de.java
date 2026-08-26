package org.jboss.as.jaxrs.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:48+0200")
public class JaxrsLogger_$logger_de extends JaxrsLogger_$logger implements JaxrsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JaxrsLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String classAnnotationNotFound$str() {
        return "WFLYRS0001: %1$s Annotation nicht an Klasse: %2$s";
    }
    @Override
    protected String classOrMethodAnnotationNotFound$str() {
        return "WFLYRS0002: %1$s Annotation nicht an Klasse oder Methode: %2$s";
    }
    @Override
    protected String moreThanOneServletMapping$str() {
        return "WFLYRS0003: Mehr als ein Mapping für Jakarta RESTful-Webdienste-Servlet %1$s gefunden, das zweite Mapping %2$s funktioniert nicht";
    }
    @Override
    protected String cannotLoadApplicationClass$str() {
        return "WFLYRS0006: Die Jakarta RESTful-Webdienste-Applikationsklasse konnte nicht geladen werden";
    }
    @Override
    protected String typeNameNotAnEjbView$str() {
        return "WFLYRS0010: Jakarta RESTful-Webdienste-Ressource %1$s stimmt nicht mit einer Ansicht des Jakarta Enterprise Beans %2$s überein. @Path-Annotationen können nur für Klassen oder Interfaces platziert werden, die eine lokale, remote oder nicht-Interface-Ansicht eines Jakarta Enterprise Beans-Beans repräsentieren.";
    }
    @Override
    protected String invalidParamValue$str() {
        return "WFLYRS0011: Ungültiger Wert für Parameter %1$s: %2$s";
    }
    @Override
    protected String noSpringIntegrationJar$str() {
        return "WFLYRS0012: Kein spring-Integrations-Jar gefunden";
    }
    @Override
    protected String disablePropertyDeprecated$str() {
        return "WFLYRS0013: Der Kontextparameter org.jboss.as.jaxrs.disableSpringIntegration ist veraltet und wird in einer zukünftigen Release entfernt. Bitte verwenden Sie statt dessen org.jboss.as.jaxrs.enableSpringIntegration";
    }
    @Override
    protected String failedToRegisterManagementViewForRESTResources$str() {
        return "WFLYRS0014: Fehler beim Registrieren der Managementansicht für REST-Ressourcenklasse: %1$s";
    }
    @Override
    protected String noServletDeclaration$str() {
        return "WFLYRS0015: Keine Servlet-Deklaration für Jakarta RESTful Web Services-Anwendung gefunden. Geben Sie unter %1$s entweder eine Klasse an, die jakarta.ws.rs.core.Application erweitert, oder deklarieren Sie eine Servlet-Klasse in web.xml.";
    }
    @Override
    protected String resteasyVersion$str() {
        return "WFLYRS0016: RESTEasy-Version %1$s";
    }
    @Override
    protected String failedToReadAttribute$str() {
        return "WFLYRS0017: Attribut konnte nicht aus der Jakarta RESTful-Webdienste-Bereitstellung unter %1$s mit dem Namen %2$s gelesen werden";
    }
    @Override
    protected String jacksonAnnotationDetected$str() {
        return "WFLYRS0018: Explizite Verwendung von Jackson-Annotation in einer Jakarta RESTful-Webdienste-Bereitstellung; das System deaktiviert die Jakarta JSON Binding-Verarbeitung für das aktuelle Deployment. Setzen Sie ggf. die Eigenschaft '%1$s' auf 'false', um Jakarta JSON Binding wiederherzustellen.";
    }
    @Override
    protected String paramConverterFailed$str() {
        return "WFLYRS0019: Fehler bei der Konvertierung des Standardwertes %1$s für den Parameter %2$s in der Methode %3$s unter Verwendung des Parameterkonvertierers %4$s. Ausnahme: %5$s : %6$s";
    }
    @Override
    protected String baseTypeMethodFailed$str() {
        return "WFLYRS0020: \"Fehler bei der Konvertierung des Standardwertes %1$s für den Parameter %2$s in der Methode %3$s unter Verwendung der Methode %4$s. Ausnahme: %5$s : %6$s\"";
    }
    @Override
    protected String classIntrospectionFailure$str() {
        return "WFLYRS0021: %1$s %2$s";
    }
    @Override
    protected String tracingEnabled$str() {
        return "WFLYRS0029: Die RESTEasy-API für Tracing wurde für das Deployment \"%1$s\" aktiviert und ist nicht für die Produktion gedacht.";
    }
    @Override
    protected String invalidConfigurationFactory$str() {
        return "WFLYRS0030: Ungültige ConfigurationFactory gefunden %1$s";
    }
    @Override
    protected String failedToLoadConfigurationFactory$str() {
        return "WFLYRS0031: RESTEasy MicroProfile-Konfiguration konnte nicht geladen werden: %1$s";
    }
}
