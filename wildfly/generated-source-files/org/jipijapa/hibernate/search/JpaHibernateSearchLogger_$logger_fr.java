package org.jipijapa.hibernate.search;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:24+0200")
public class JpaHibernateSearchLogger_$logger_fr extends JpaHibernateSearchLogger_$logger implements JpaHibernateSearchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaHibernateSearchLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failOnPropertyParsingForIntegration$str() {
        return "JIPISEARCH020290: Échec de l'analyse de la propriété '%2$s « tout en intégrant Hibernate Search dans l'unité de persistance »%1$s";
    }
}
