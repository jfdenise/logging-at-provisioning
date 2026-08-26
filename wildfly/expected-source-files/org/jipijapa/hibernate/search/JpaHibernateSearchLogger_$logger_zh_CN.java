package org.jipijapa.hibernate.search;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:37+0200")
public class JpaHibernateSearchLogger_$logger_zh_CN extends JpaHibernateSearchLogger_$logger_zh implements JpaHibernateSearchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaHibernateSearchLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failOnPropertyParsingForIntegration$str() {
        return "JIPISEARCH020290: 在将 Hibernate Search 集成到持久性单元 %1$s 时，无法解析属性 '%2$s'";
    }
}
