package org.jboss.as.jpa.hibernate;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:36+0200")
public class JpaLogger_$logger_pt_BR extends JpaLogger_$logger_pt implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String secondLevelCacheIsEnabled$str() {
        return "JIPIORMV6020260: Cache de segundo nível habilitado para %1$s";
    }
    @Override
    protected String HibernateORMDidNotRegisterLifeCycleListener$str() {
        return "JIPIORMV6020261: Hibernate ORM não registrou o LifeCycleListener";
    }
    @Override
    protected String ignoredCacheRegionSetting$str() {
        return "JIPIORMV6020262: A configuração da região de cache personalizada do aplicativo é ignorada %1$s=%2$s";
    }
    @Override
    protected String failOnIncompatibleSetting$str() {
        return "JIPIORMV6020263: O hibernate.id.new_generator_mappings definido como false não é compatível, remova a configuração ou configure como true.  Consulte a documentação de migração do Hibernate ORM para saber como atualizar o próximo estado de ID no banco de dados do aplicativo.";
    }
    @Override
    protected String unableOpenInputStream$str() {
        return "JIPIORMV6020264: Não é possível abrir o InputStream baseado em VirtualFile";
    }
}
