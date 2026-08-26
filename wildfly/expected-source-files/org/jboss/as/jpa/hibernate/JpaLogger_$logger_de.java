package org.jboss.as.jpa.hibernate;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:36+0200")
public class JpaLogger_$logger_de extends JpaLogger_$logger implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String secondLevelCacheIsEnabled$str() {
        return "JIPIORMV6020260: Cache der zweiten Ebene aktiviert für %1$s";
    }
    @Override
    protected String HibernateORMDidNotRegisterLifeCycleListener$str() {
        return "JIPIORMV6020261: Hibernate ORM hat LifeCycleListener nicht registriert.";
    }
    @Override
    protected String ignoredCacheRegionSetting$str() {
        return "JIPIORMV6020262: Die benutzerdefinierte Cache-Regionseinstellung der Anwendung wird ignoriert%1$s =%2$s";
    }
    @Override
    protected String failOnIncompatibleSetting$str() {
        return "JIPIORMV6020263: Die Festlegung von 'hibernate.id.new_generator_mappings' auf 'false' wird nicht unterstützt. Entfernen Sie die Einstellung, oder setzen Sie sie auf 'true'. Lesen Sie in der Hibernate ORM-Migrationsdokumentation nach, wie Sie den nächsten ID-Status in der Anwendungsdatenbank aktualisieren können.";
    }
    @Override
    protected String unableOpenInputStream$str() {
        return "JIPIORMV6020264: VirtualFile-basierter InputStream kann nicht geöffnet werden";
    }
}
