package org.jboss.as.jpa.hibernate;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:36+0200")
public class JpaLogger_$logger_ja extends JpaLogger_$logger implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String secondLevelCacheIsEnabled$str() {
        return "JIPIORMV6020260: %1$s に 2 次キャッシュが有効";
    }
    @Override
    protected String HibernateORMDidNotRegisterLifeCycleListener$str() {
        return "JIPIORMV6020261: Hibernate ORM が LifeCycleListener を登録しませんでした";
    }
    @Override
    protected String ignoredCacheRegionSetting$str() {
        return "JIPIORMV6020262: アプリケーションのカスタムキャッシュリージョン設定は無視されます %1$s=%2$s";
    }
    @Override
    protected String failOnIncompatibleSetting$str() {
        return "JIPIORMV6020263: hibernate.id.new_generator_mappings を false に設定した場合はサポートされないので、設定を削除するか、または true に設定してください。アプリケーションデータベースの次の id の状態を更新する方法については、Hibernate ORM の移行ドキュメントを参照してください。";
    }
    @Override
    protected String unableOpenInputStream$str() {
        return "JIPIORMV6020264: VirtualFile ベースの InputStream を開けません";
    }
}
