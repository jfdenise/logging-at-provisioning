package org.jipijapa.hibernate.search;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:37+0200")
public class JpaHibernateSearchLogger_$logger_de extends JpaHibernateSearchLogger_$logger implements JpaHibernateSearchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaHibernateSearchLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failOnPropertyParsingForIntegration$str() {
        return "JIPISEARCH020290: Fehler beim Parsen der Eigenschaft '%2$s ' beim Integrieren von Hibernate Search in die Persistenzeinheit '%1$s";
    }
}
