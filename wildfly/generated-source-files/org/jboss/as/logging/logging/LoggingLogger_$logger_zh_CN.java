package org.jboss.as.logging.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:28+0200")
public class LoggingLogger_$logger_zh_CN extends LoggingLogger_$logger_zh implements LoggingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public LoggingLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidPropertyAttribute$str() {
        return "WFLYLOG0007: 属性 %1$s 无法被设置，因为这不是一个可配置的属性值。";
    }
    @Override
    protected String perDeploymentPropertyDeprecated$str() {
        return "WFLYLOG0015: per-logging 部署属性（%1$s）已被舍弃。请使用 %2$s 属性来启用/禁用 per-deployment 日志。";
    }
    @Override
    protected String loggerNotFound$str() {
        return "WFLYLOG0035: 未找到 Logger '%1$s'";
    }
    @Override
    protected String unresolvablePathExpressions$str() {
        return "WFLYLOG0090: 当试图确定哪些日志文件可读时下列路径表达式无法被解析：%1$s";
    }
    @Override
    protected String replacingNamedHandler$str() {
        return "WFLYLOG0012: 在 add 操作中替换处理程序 '%1$s'。处理程序类型或模块名称都和初始配置不同。";
    }
    @Override
    protected String formatterNotFound$str() {
        return "WFLYLOG0061: 未找到 Formatter '%1$s'";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYLOG0006: 关闭资源 %1$s 失败";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYLOG0082: 后缀（%1$s）不能包含秒或毫秒。";
    }
    @Override
    protected String invalidEscapeFoundInFilterExpression$str() {
        return "WFLYLOG0071: 在过滤器表达式字符串里发现无效的脱字符";
    }
    @Override
    protected String pathManagerServiceNotStarted$str() {
        return "WFLYLOG0008: 路径管理者（Path Manager）服务还未启动，因此任何修改都会丢失。";
    }
    @Override
    protected String deploymentNameNotFound$str() {
        return "WFLYLOG0086: 无法从地址 %1$s 确定部署名称。";
    }
    @Override
    protected String handlerAttachedToHandlers$str() {
        return "WFLYLOG0044: 处理程序 %1$s 被附加到了下面的处理程序上，无法被删除；%2$s";
    }
    @Override
    protected String handlerAttachedToLoggers$str() {
        return "WFLYLOG0045: 处理程序 %1$s 被附加到了下面的 logger 上，无法被删除；%2$s";
    }
    @Override
    protected String invalidExceptionOutputType$str() {
        return "WFLYLOG0091: 异常输出类型 %1$s 无效。";
    }
    @Override
    protected String expectedString$str() {
        return "WFLYLOG0074: 在过滤器表达式里期望的下一个字符串";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYLOG0041: 后缀（%1$s）是无效的。后缀必须是有效的日期格式。";
    }
    @Override
    protected String loggingProfileNotFound$str() {
        return "WFLYLOG0010: 为找到为部署 '%2$s' 指定的日志配置集 '%1$s'，正在使用系统日志配置。";
    }
    @Override
    protected String unknownLogManager$str() {
        return "WFLYLOG0089: 跳过日志管理者检查，系统属性 \"java.util.logging.manager\" 没有设置为 \"org.jboss.logmanager.LogManager\"。当前的值是 \"%1$s\"。日志输出的一些行为（如 MDC 和 NDC）无法按预期工作。";
    }
    @Override
    protected String truncatedFilterExpression$str() {
        return "WFLYLOG0070: 截短的过滤器表达式字符串";
    }
    @Override
    protected String unsupportedMethod$str() {
        return "WFLYLOG0050: 类 %2$s 不支持方法 %1$s";
    }
    @Override
    protected String failedToReadLogFile$str() {
        return "WFLYLOG0079: 读取日志文件 '%1$s' 失败";
    }
    @Override
    protected String expected2$str() {
        return "WFLYLOG0075: 在过滤器表达式里期望的下一个 '%1$s' 或 '%2$s'";
    }
    @Override
    protected String cannotLoadModule$str() {
        return "WFLYLOG0019: 为 %2$s '%3$s' 加载模块 '%1$s' 失败";
    }
    @Override
    protected String perLoggingDeploymentIgnored$str() {
        return "WFLYLOG0016: per-logging 部署属性（%1$s）被忽略，因为已设置 %2$s 属性来忽略部署 %3$s 里的配置文件。";
    }
    @Override
    protected String classNotFound$str() {
        return "WFLYLOG0021: 未找到类 '%1$s'。";
    }
    @Override
    protected String invalidRelativeTo$str() {
        return "WFLYLOG0039: 对于 relative-to 不能指定绝对路径（%1$s）";
    }
    @Override
    protected String errorDeterminingChildrenExist$str() {
        return "WFLYLOG0088: 无法确定 %1$s 具有任何子资源。";
    }
    @Override
    protected String failedToConfigureSslContext$str() {
        return "WFLYLOG0093: 为 %1$s %2$s 配置 SSL 上下文失败。";
    }
    @Override
    protected String unexpectedEnd$str() {
        return "WFLYLOG0076: 过滤器表达式里意外的结束符";
    }
    @Override
    protected String invalidLogFile$str() {
        return "WFLYLOG0083: 路径 '%1$s' 是一个目录且无法用作日志文件。";
    }
    @Override
    protected String logFileNotFound$str() {
        return "WFLYLOG0080: 未找到文件 '%1$s' 也无法在 %2$s 目录里找到。";
    }
    @Override
    protected String invalidLogLevel$str() {
        return "WFLYLOG0026: 日志级别 %1$s 是无效的。";
    }
    @Override
    protected String filterNotFound$str() {
        return "WFLYLOG0072: 未找到过滤器 '%1$s'";
    }
    @Override
    protected String invalidFilterName$str() {
        return "WFLYLOG0097: %1$s 不能做为一个过滤器的名称，因为它包括一个无效的字符 %2$s";
    }
    @Override
    protected String usageOfLog4j1Config$str() {
        return "WFLYLOG0100: 在部署 %2$s 中发现了 log4j 配置文件( %1$s )的用法。对部署中 log4j 配置文件的支持已被弃用，并将在以后的版本中删除。";
    }
    @Override
    protected String invalidOverflowAction$str() {
        return "WFLYLOG0027: 溢出行为 %1$s 是无效的";
    }
    @Override
    protected String handlerAlreadyDefined$str() {
        return "WFLYLOG0023: 已经分配了处理程序 %1$s。";
    }
    @Override
    protected String expected1$str() {
        return "WFLYLOG0075: 在过滤器表达式里期望的下一个 '%1$s'";
    }
    @Override
    protected String cannotRegisterResourceOfType$str() {
        return "WFLYLOG0084: 无法注册类型为 %1$s 的资源";
    }
    @Override
    protected String failedToConfigureLogging$str() {
        return "WFLYLOG0042: 使用 '%1$s' 配置文件配置日志失败。";
    }
    @Override
    protected String failedToWriteConfigurationFile$str() {
        return "WFLYLOG0051: 写入配置文件 %1$s 失败";
    }
    @Override
    protected String cannotAddHandlerToSelf$str() {
        return "WFLYLOG0046: 无法为自己添加处理程序（%1$s）";
    }
    @Override
    protected String expectedIdentifier$str() {
        return "WFLYLOG0073: 在过滤器表达式里期望的下一个标识符";
    }
    @Override
    protected String errorProcessingLogDirectory$str() {
        return "WFLYLOG0087: 处理日志目录 %1$s 失败。无法列出日志文件。";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYLOG0028: 无效的大小 %1$s";
    }
    @Override
    protected String handlerClosed$str() {
        return "WFLYLOG0047: 处理程序已关闭，无法发布到已关闭的处理程序。";
    }
    @Override
    protected String reservedFilterName$str() {
        return "WFLYLOG0095: %1$s 不能做为一个过滤器的名称，因为它是一个保留的过滤器名称。保留的名称包括：%2$s";
    }
    @Override
    protected String handlerConfigurationNotFound$str() {
        return "WFLYLOG0048: 无法找到处理程序 ‘%1$s' 的配置。";
    }
    @Override
    protected String replacingConfigurator$str() {
        return "WFLYLOG0013: 配置器类 '%1$s' 不是一个已知的配置器，它将被替换。";
    }
    @Override
    protected String logContextNotRemoved$str() {
        return "WFLYLOG0014: 日志上下文 (%1$s) 无法从部署 %2$s 里删除";
    }
    @Override
    protected String invalidFilter$str() {
        return "WFLYLOG0025: 过滤器 %1$s 是无效的";
    }
    @Override
    protected String illegalFormatterName$str() {
        return "WFLYLOG0094: Formatter 的名称不能以 '-wfcore-pattern-formatter' 结束";
    }
    @Override
    protected String invalidFilterNameStart$str() {
        return "WFLYLOG0096: %1$s 不能做为一个过滤器的名称，因为它以无效的字符开始 %2$s";
    }
    @Override
    protected String extensionNotInitialized$str() {
        return "WFLYLOG0078: 日志子系统要求日志管理者为 org.jboss.logmanager.LogManager。这个子系统还没有被初始化且无法被使用。要使用 JBoss Log Manager，您必须添加系统属性 \"java.util.logging.manager\" 并将其设置为 \"org.jboss.logmanager.LogManager\"。";
    }
    @Override
    protected String julConfigurationFileFound$str() {
        return "WFLYLOG0011: '%1$s' 里的配置文件是一个 J.U.L. 配置文件。日志管理者不允许这种类型的配置文件。";
    }
    @Override
    protected String errorProcessingLoggingConfiguration$str() {
        return "WFLYLOG0043: 当搜索日志配置文件时发生错误。";
    }
    @Override
    protected String usageOfAppender$str() {
        return "WFLYLOG0099: 在 custom-handler 中发现了 log4j 追加程序的(%1$s) 的用法。将追加程序用作自定义处理程序的支持已被弃用，并将在以后的版本中删除。";
    }
    @Override
    protected String loggerConfigurationNotFound$str() {
        return "WFLYLOG0049: 无法找到 Logger '%1$s' 的配值。";
    }
    @Override
    protected String readNotAllowed$str() {
        return "WFLYLOG0081: 文件 '%1$s' 不允许被读取。";
    }
    @Override
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYLOG0085: 无法删除类型为 %1$s 的资源";
    }
    @Override
    protected String invalidType$str() {
        return "WFLYLOG0092: 找到无效类型。预期 %1$s 但找到 %2$s。";
    }
}
