package org.jboss.as.jdr.logger;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:23+0200")
public class JdrLogger_$logger_zh_CN extends JdrLogger_$logger_zh implements JdrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JdrLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String jdrConfigMessage$str() {
        return "服务器的配置文件（如果没有运行）。";
    }
    @Override
    protected String couldNotConfigureJDR$str() {
        return "WFLYJDR0008: 无法配置 JDR。至少有一个配置步骤失败了。";
    }
    @Override
    protected String jdrDescriptionMessage$str() {
        return "JBoss Diagnostic Reporter (JDR) 是一个收集信息以协助故障解除的子系统。jdr 脚本是生成 JDR 报表的工具。";
    }
    @Override
    protected String noCommandsToRun$str() {
        return "WFLYJDR0009: 没有加载 JDR 命令。请确保在 plugins.properties 里指定有效的 Plugin 类。";
    }
    @Override
    protected String jdrProtocolMessage$str() {
        return "连接的协议。可以是 remote、http 或 https（默认值为 http）";
    }
    @Override
    protected String jdrPortMessage$str() {
        return "管理 api 绑定的端口。（default: 9990）";
    }
    @Override
    protected String couldNotCreateJDRPropertiesFile$str() {
        return "WFLYJDR0012: 在 %1$s 无法创建 JDR 属性文件";
    }
    @Override
    protected String jdrHostnameMessage$str() {
        return "管理 api 绑定的主机名。（default: localhost）";
    }
    @Override
    protected String couldNotCreateZipfile$str() {
        return "WFLYJDR0007: 无法创建 ZIP 文件。";
    }
    @Override
    protected String jdrHelpMessage$str() {
        return "显示这条消息并退出";
    }
    @Override
    protected String couldNotFindJDRPropertiesFile$str() {
        return "WFLYJDR0011: 无法找到 JDR 属性文件。";
    }
}
