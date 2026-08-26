package org.jipijapa.hibernate.search;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:24+0200")
public class JpaHibernateSearchLogger_$logger_ja extends JpaHibernateSearchLogger_$logger implements JpaHibernateSearchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaHibernateSearchLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failOnPropertyParsingForIntegration$str() {
        return "JIPISEARCH020290: Hibernate Search を永続ユニット '%1$s に統合中、プロパティー '%2$s' の解析に失敗しました";
    }
}
