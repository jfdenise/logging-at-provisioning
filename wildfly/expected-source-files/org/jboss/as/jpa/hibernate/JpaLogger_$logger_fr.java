package org.jboss.as.jpa.hibernate;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:36+0200")
public class JpaLogger_$logger_fr extends JpaLogger_$logger implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String secondLevelCacheIsEnabled$str() {
        return "JIPIORMV6020260: Cache de deuxième niveau activé pour %1$s";
    }
    @Override
    protected String HibernateORMDidNotRegisterLifeCycleListener$str() {
        return "JIPIORMV6020261: Hibernate ORM n'a pas enregistré LifeCycleListener";
    }
    @Override
    protected String ignoredCacheRegionSetting$str() {
        return "JIPIORMV6020262: Le paramètre de région de cache personnalisé de l'application est ignoré%1$s =%2$s";
    }
    @Override
    protected String failOnIncompatibleSetting$str() {
        return "JIPIORMV6020263: hibernate.id.new_generator_mappings défini sur false n'est pas pris en charge, supprimez le paramètre ou définissez-le sur true.  Reportez-vous à la documentation sur la migration Hibernate ORM pour savoir comment mettre à jour l'état du prochain id dans la base de données de l'application.";
    }
    @Override
    protected String unableOpenInputStream$str() {
        return "JIPIORMV6020264: Impossible d'ouvrir InputStream basé sur VirtualFile";
    }
}
