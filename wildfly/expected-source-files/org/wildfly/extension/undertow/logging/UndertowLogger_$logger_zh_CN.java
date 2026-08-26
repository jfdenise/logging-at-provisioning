package org.wildfly.extension.undertow.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:29+0200")
public class UndertowLogger_$logger_zh_CN extends UndertowLogger_$logger_zh implements UndertowLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public UndertowLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String couldNotInitJsp$str() {
        return "WFLYUT0001: 无法初始化 Jakarta 服务器页";
    }
    @Override
    protected String serverStarting$str() {
        return "WFLYUT0003: 正在启动 Undertow %1$s";
    }
    @Override
    protected String serverStopping$str() {
        return "WFLYUT0004: 正在停止 Undertow %1$s";
    }
    @Override
    protected String secureListenerNotAvailableForPort$str() {
        return "WFLYUT0005: 未找到协议 '%1$s' 的 Secure Listener! 正在使用非安全端口！";
    }
    @Override
    protected String listenerStarted$str() {
        return "WFLYUT0006: Undertow %1$s listener %2$s 正在侦听 %3$s:%4$d";
    }
    @Override
    protected String listenerStopped$str() {
        return "WFLYUT0007: Undertow %1$s listener %2$s 已停止，绑定到 %3$s:%4$d";
    }
    @Override
    protected String listenerSuspend$str() {
        return "WFLYUT0008: 正在暂停 Undertow %1$s listener %2$s";
    }
    @Override
    protected String cannotLoadDesignatedHandleTypes$str() {
        return "WFLYUT0009: 无法加载由 HandlesTypes [%1$s] 指定的类。";
    }
    @Override
    protected String couldNotLoadWebSocketEndpoint$str() {
        return "WFLYUT0010: 无法加载 web 套接字端点 %1$s。";
    }
    @Override
    protected String couldNotLoadWebSocketConfig$str() {
        return "WFLYUT0011: 无法加载 web 套接字应用程序配置 %1$s。";
    }
    @Override
    protected String startedServer$str() {
        return "WFLYUT0012: 已启动服务器 %1$s。";
    }
    @Override
    protected String invalidRedirectURI$str() {
        return "WFLYUT0013: 无法创建重定向 URI。";
    }
    @Override
    protected String creatingFileHandler$str() {
        return "WFLYUT0014: 使用选项 [directory-listing: '%2$s', follow-symlink: '%3$s', case-sensitive: '%4$s', safe-symlink-paths: '%5$s'] 为路径 '%1$s' 创建文件处理程序";
    }
    @Override
    protected String invalidAbsoluteOrdering$str() {
        return "WFLYUT0016: 无法以绝对顺序解析名称 %1$s";
    }
    @Override
    protected String couldNotDeleteTempFile$str() {
        return "WFLYUT0017: 无法删除 servlet 临时文件 %1$s";
    }
    @Override
    protected String hostStarting$str() {
        return "WFLYUT0018: 正在启动主机 %1$s";
    }
    @Override
    protected String hostStopping$str() {
        return "WFLYUT0019: 正在停止主机 %1$s";
    }
    @Override
    protected String clusteringNotSupported$str() {
        return "WFLYUT0020: 不支持群集，回滚至非群集的会话管理者";
    }
    @Override
    protected String registerWebapp$str() {
        return "WFLYUT0021: 已注册服务器 '%2$s' 的 web 上下文 '%1$s'";
    }
    @Override
    protected String unregisterWebapp$str() {
        return "WFLYUT0022: 已取消注册服务器 '%2$s' 的 web 上下文 '%1$s'";
    }
    @Override
    protected String skippedSCI$str() {
        return "WFLYUT0023: 跳过 JAR %1$s 的 SCI";
    }
    @Override
    protected String failedToPersistSessionAttribute$str() {
        return "WFLYUT0024: 使用会话 %3$s 的值 %2$s 持久化会话属性 %1$s 失败";
    }
    @Override
    protected String failToParseXMLDescriptor3$str() {
        return "WFLYUT0027: 在 [%2$s,%3$s] 解析 XML 描述符 %1$s 失败";
    }
    @Override
    protected String failToParseXMLDescriptor1$str() {
        return "WFLYUT0028: 解析 XML 描述符 %1$s 失败";
    }
    @Override
    protected String invalidWebServletAnnotation$str() {
        return "WFLYUT0029: 只有类级别 %1$s 允许 @WebServlet";
    }
    @Override
    protected String invalidWebInitParamAnnotation$str() {
        return "WFLYUT0030: @WebInitParam 要求 %1$s 的名称和值";
    }
    @Override
    protected String invalidWebFilterAnnotation$str() {
        return "WFLYUT0031: 只有类级别 %1$s 允许 @WebFilter";
    }
    @Override
    protected String invalidWebListenerAnnotation$str() {
        return "WFLYUT0032: 只有类级别 %1$s 允许 @WebListener";
    }
    @Override
    protected String invalidRunAsAnnotation$str() {
        return "WFLYUT0033: @RunAs 需要指定 %1$s 的角色名";
    }
    @Override
    protected String invalidDeclareRolesAnnotation$str() {
        return "WFLYUT0034: @DeclareRoles 需要指定 %1$s 的角色名";
    }
    @Override
    protected String invalidMultipartConfigAnnotation$str() {
        return "WFLYUT0035: 只有类级别 %1$s 允许 @MultipartConfig";
    }
    @Override
    protected String invalidServletSecurityAnnotation$str() {
        return "WFLYUT0036: 只有类级别 %1$s 允许 @ServletSecurity";
    }
    @Override
    protected String wrongComponentType$str() {
        return "WFLYUT0037: %1$s 具有错误的组件类型，它无法用做 web 组件。";
    }
    @Override
    protected String tldFileNotContainedInRoot$str() {
        return "WFLYUT0038: TLD 文件 %1$s 没有包括在 root %2$s";
    }
    @Override
    protected String failedToResolveModule$str() {
        return "WFLYUT0039: 解析部署 %1$s 的模块失败";
    }
    @Override
    protected String invalidMultipleOthers$str() {
        return "WFLYUT0040: 以绝对顺序复制其他节点";
    }
    @Override
    protected String invalidRelativeOrdering0$str() {
        return "WFLYUT0041: 无效的相关顺序";
    }
    @Override
    protected String invalidWebFragment$str() {
        return "WFLYUT0042: 处理 JAR %1$s 的 web 片断时发生冲突";
    }
    @Override
    protected String invalidRelativeOrdering1$str() {
        return "WFLYUT0043: JAR %1$s 的相关顺序处理出现错误";
    }
    @Override
    protected String invalidRelativeOrderingBeforeAndAfter$str() {
        return "WFLYUT0044: 顺序包括 JAR %1$s 里的前/后顺序";
    }
    @Override
    protected String invalidRelativeOrderingDuplicateName$str() {
        return "WFLYUT0045: JAR %1$s 里声明了重复名称";
    }
    @Override
    protected String invalidRelativeOrderingUnknownName$str() {
        return "WFLYUT0046: JAR 中宣布的未知 web 碎片名称：%1$s";
    }
    @Override
    protected String invalidRelativeOrderingConflict$str() {
        return "WFLYUT0047: 相关顺序和 JAR %1$s 冲突";
    }
    @Override
    protected String failToProcessWebInfLib$str() {
        return "WFLYUT0048: 处理 WEB-INF/lib: %1$s 失败";
    }
    @Override
    protected String errorLoadingSCIFromModule$str() {
        return "WFLYUT0049: 从模块 %1$s 加载 SCI 出错";
    }
    @Override
    protected String unableToResolveAnnotationIndex$str() {
        return "WFLYUT0050: 无法解析部署单元 %1$s 的注解索引";
    }
    @Override
    protected String errorProcessingSCI$str() {
        return "WFLYUT0051: 处理 JAR %1$s 的 SCI 出现部署错误";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYUT0054: 未知的指标数据：%1$s";
    }
    @Override
    protected String nullDefaultHost$str() {
        return "WFLYUT0055: 缺省主机为空";
    }
    @Override
    protected String nullHostName$str() {
        return "WFLYUT0056: 主机名为空";
    }
    @Override
    protected String invalidPersistentSessionDir$str() {
        return "WFLYUT0060: 无效的持久性会话目录 %1$s";
    }
    @Override
    protected String failedToCreatePersistentSessionDir$str() {
        return "WFLYUT0061: 创建持久性会话目录 %1$s 失败";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYUT0062: 无法创建日志目录：%1$s";
    }
    @Override
    protected String noPortListeningForProtocol$str() {
        return "WFLYUT0063: 无法找到侦听协议 %1$s 的端口号码";
    }
    @Override
    protected String failedToConfigureHandler$str() {
        return "WFLYUT0064: 配置处理程序 %1$s 失败";
    }
    @Override
    protected String handlerWasNotAHandlerOrWrapper$str() {
        return "WFLYUT0065: Handler 类 %1$s 不是 handler 或 wrapper";
    }
    @Override
    protected String failedToConfigureHandlerClass$str() {
        return "WFLYUT0066: 配置处理程序 %1$s 失败";
    }
    @Override
    protected String servletClassNotDefined$str() {
        return "WFLYUT0067: 没有为 servlet %1$s 定义 Servlet 类";
    }
    @Override
    protected String sharedSessionConfigNotInRootDeployment$str() {
        return "WFLYUT0069: 忽略部署 %1$s 里的 jboss-all.xml 里的 shared-session-config。这个条目只对顶层部署有效。";
    }
    @Override
    protected String couldNotLoadHandlerFromModule$str() {
        return "WFLYUT0070: 无法从模块 %2$s 加载处理程序 %1$s";
    }
    @Override
    protected String alpnNotFound$str() {
        return "WFLYUT0071: 未找到 ALPN 提供者，HTTP/2 将不会被启用。要删除这个消息，请将 ndertow 子系统里的 listener %1$s 上的 enable-http2 设置为 false。";
    }
    @Override
    protected String couldNotFindExternalPath$str() {
        return "WFLYUT0072: 无法找到配置的外部路径 %1$s";
    }
    @Override
    protected String advertiseSocketBindingRequiresMulticastAddress$str() {
        return "WFLYUT0073: mod_cluster advertise 套接字绑定要求设置多点传送地址";
    }
    @Override
    protected String tldNotFound$str() {
        return "WFLYUT0074: 无法找到 TLD %1$s";
    }
    @Override
    protected String failedToRegisterWebsocket$str() {
        return "WFLYUT0078: 为 %2$s 上的 %1$s 注册 websocket 视图失败";
    }
    @Override
    protected String unsupportedValveFeature$str() {
        return "WFLYUT0080: 不再支持 Valve，没有激活 %1$s。";
    }
    @Override
    protected String distributableDisabledInFragmentXml$str() {
        return "WFLYUT0081: 部署 %1$s 不会是可分布式的，因为这个功能在模块 %2$s 的 web-fragment.xml 里是禁用的。";
    }
    @Override
    protected String couldNotStartListener$str() {
        return "WFLYUT0082: 无法启动 '%1$s' listener。";
    }
    @Override
    protected String nullNotAllowed$str() {
        return "WFLYUT0083: %1$s 不被允许为 null";
    }
    @Override
    protected String duplicateDefaultWebModuleMapping$str() {
        return "WFLYUT0087: 在服务器 '%2$s' 主机 '%3$s' 上配置了重复的默认 Web 模块 '%1$s'";
    }
    @Override
    protected String predicateNotValid$str() {
        return "WFLYUT0089: Predicate %1$s 是无效的，消息为：%2$s";
    }
    @Override
    protected String missingKeyStoreEntry$str() {
        return "WFLYUT0090: 已配置的密钥库中不存在密钥别名 %1$s";
    }
    @Override
    protected String keyStoreEntryNotPrivate$str() {
        return "WFLYUT0091: 密钥库条目 %1$s 不是私钥条目";
    }
    @Override
    protected String missingCredential$str() {
        return "WFLYUT0092: 已配置的凭证库中不存在凭证别名 %1$s";
    }
    @Override
    protected String credentialNotClearPassword$str() {
        return "WFLYUT0093: 凭证 %1$s 不是明文密码";
    }
    @Override
    protected String configurationOptionIgnoredWhenUsingElytron$str() {
        return "WFLYUT0094: 使用 Elytron 子系统时，配置选项 [%1$s] 被忽略";
    }
    @Override
    protected String unableAddHandlerForPath$str() {
        return "WFLYUT0095: 文件系统中不存在路径 ['%1$s']";
    }
    @Override
    protected String workerValueInHTTPListenerMustMatchRemoting$str() {
        return "WFLYUT0097: 如果启用了 http-upgrade，则远程工作节点和 http(s) 工作节点必须相同。请根据需要调整值。";
    }
    @Override
    protected String sessionManagerNotAvailable$str() {
        return "WFLYUT0099: 会话管理器不可用";
    }
    @Override
    protected String sessionNotFound$str() {
        return "WFLYUT0100: 没有找到会话 %1$s";
    }
    @Override
    protected String duplicateServletMapping$str() {
        return "WFLYUT0101: 找到重复 servlet 映射 %1$s";
    }
    @Override
    protected String invalidDateTimeFormatterPattern$str() {
        return "WFLYUT0102: 格式 %1$s 不是一个有效的日期格式。";
    }
    @Override
    protected String invalidTimeZoneId$str() {
        return "WFLYUT0103: 时区 id %1$s 无效。";
    }
    @Override
    protected String missingClassInAnnotation$str() {
        return "WFLYUT0104: 注解引用的一些类： %1$s 在类：%2$s 中缺少。";
    }
    @Override
    protected String duplicateHostContextDeployments$str() {
        return "WFLYUT0105: 主机和上下文路径已占用，%1$s 无法注册。信息为： %2$s";
    }
    @Override
    protected String unableToObfuscateSessionRoute$str() {
        return "WFLYUT0106: 无法从 \"%1$s\" 生成混淆的会话路由";
    }
    @Override
    protected String obfuscatedSessionRoute$str() {
        return "WFLYUT0107: 从 \"%2$s\" 生成混淆的会话路由 \"%1$s\"";
    }
    @Override
    protected String deploymentConfiguredForLegacySecurity$str() {
        return "WFLYUT0108: 部署被配置为使用传统的安全，其不再可用。";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYUT0109: 部署被配置为使用传统的安全，其不再被支持。";
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYUT0110: 不支持在运行时使用安全域。";
    }
    @Override
    protected String badAnnotationOnServlet$str() {
        return "WFLYUT0111: 注解： '%1$s' 对 Servlet: '%2$s' 没有影响";
    }
}
