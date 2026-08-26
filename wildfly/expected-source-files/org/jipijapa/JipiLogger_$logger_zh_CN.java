package org.jipijapa;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:36+0200")
public class JipiLogger_$logger_zh_CN extends JipiLogger_$logger_zh implements JipiLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JipiLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadEntityClass$str() {
        return "JIPI020200: 无法加载实体类 '%1$s'，忽略这个错误并继续部署应用程序。";
    }
    @Override
    protected String cannotChangeInputStream$str() {
        return "JIPI020201: 无法修改输入流引用。";
    }
    @Override
    protected String emptyParameter$str() {
        return "JIPI020202: 参数 %1$s 为空";
    }
    @Override
    protected String missingPersistenceUnitMetadata$str() {
        return "JIPI020203: 缺失了 PersistenceUnitMetadata（未设置 thread local ）";
    }
    @Override
    protected String notYetImplemented$str() {
        return "JIPI020204: 还没有实现";
    }
    @Override
    protected String nullVar$str() {
        return "JIPI020205: 参数 %1$s 为 null";
    }
    @Override
    protected String cannotOpenVFSStream$str() {
        return "JIPI020250: 无法打开基于 VirtualFile 的 InputStream %1$s";
    }
    @Override
    protected String uriSyntaxException$str() {
        return "JIPI020251: URI 语法错误";
    }
    @Override
    protected String cannotUseSecondLevelCache$str() {
        return "JIPI020252: 未集成第二级缓存 - %1$s";
    }
}
