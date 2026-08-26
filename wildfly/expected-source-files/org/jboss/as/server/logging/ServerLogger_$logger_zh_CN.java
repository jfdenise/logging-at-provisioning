package org.jboss.as.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:26+0200")
public class ServerLogger_$logger_zh_CN extends ServerLogger_$logger_zh implements ServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ServerLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String jbossDeploymentStructureIgnored$str() {
        return "WFLYSRV0001: 子部署里的 %1$s 被忽略。jboss-deployment-structure.xml 只对于顶层部署进行解析。";
    }
    @Override
    protected String cannotLoadAnnotationIndex$str() {
        return "WFLYSRV0002: 对注解索引 \"%1$s\" 加载失败，带有以下异常： %2$s";
    }
    @Override
    protected String cannotIndexClass$str() {
        return "WFLYSRV0003: 无法对 %2$s 里的类 %1$s 进行索引";
    }
    @Override
    protected String undeploymentRolledBack$str() {
        return "WFLYSRV0007: 取消部署 \"%1$s\" 的部署已回滚，并带有下列失败消息 %2$s";
    }
    @Override
    protected String undeploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0008: 取消部署 \"%1$s\" 的部署已回滚，但没有失败消息";
    }
    @Override
    protected String deploymentUndeployed$str() {
        return "WFLYSRV0009: 取消部署的 \"%1$s\"（runtime-name: \"%2$s\"）";
    }
    @Override
    protected String deploymentDeployed$str() {
        return "WFLYSRV0010: 已部署的 \"%1$s\"（runtime-name: \"%2$s\"）";
    }
    @Override
    protected String redeployRolledBack$str() {
        return "WFLYSRV0011: 部署 \"%1$s\" 的重部署已回滚并带有下列错误消息：%2$s";
    }
    @Override
    protected String redeployRolledBackWithNoMessage$str() {
        return "WFLYSRV0012: 部署 \"%1$s\" 的重部署已回滚但不带有错误消息";
    }
    @Override
    protected String deploymentRedeployed$str() {
        return "WFLYSRV0013: 重部署的 \"%1$s\"";
    }
    @Override
    protected String replaceRolledBack$str() {
        return "WFLYSRV0014: 由部署 \"%2$s\" 替换部署 \"%1$s\" 已回滚并带有下列错误消息：%3$s";
    }
    @Override
    protected String replaceRolledBackWithNoMessage$str() {
        return "WFLYSRV0015: 由部署 \"%2$s\" 替换部署 \"%1$s\" 已回滚但不带有错误消息";
    }
    @Override
    protected String deploymentReplaced$str() {
        return "WFLYSRV0016: 用部署 \"%2$s\" 替换了部署 \"%1$s\"";
    }
    @Override
    protected String annotationImportIgnored$str() {
        return "WFLYSRV0017: 为其他的模块 %2$s 在 jboss-deployment-structure.xml 里指定的注解导入选项 %1$s 已经被忽略。其他的模块无法导入注解。";
    }
    @Override
    protected String privateApiUsed$str() {
        return "WFLYSRV0018: 部署 \"%1$s\" 在使用一个私有模块 (\"%2$s\") ，在将来的版本里它可能不经通知而进行修改或删除。";
    }
    @Override
    protected String unsupportedApiUsed$str() {
        return "WFLYSRV0019: 部署 \"%1$s\" 在使用一个不被支持的模块 (\"%2$s\") ，在将来的版本里它可能不经通知而进行修改或删除。";
    }
    @Override
    protected String failedToRemoveDeploymentContent$str() {
        return "WFLYSRV0020: 删除部署内容 %1$s 时抛出异常";
    }
    @Override
    protected String deploymentRolledBack$str() {
        return "WFLYSRV0021: 部署 \"%1$s\" 的部署被回滚并带有下列错误消息：%2$s";
    }
    @Override
    protected String deploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0022: 部署 \"%1$s\" 的部署被回滚但不带有错误消息";
    }
    @Override
    protected String failedToParseCommandLineInteger$str() {
        return "WFLYSRV0023: 解析属性（%1$s）值（%2$s）为整数失败";
    }
    @Override
    protected String cannotAddURLStreamHandlerFactory$str() {
        return "WFLYSRV0024: 无法添加模块 '%1$s' 为 URLStreamHandlerFactory 提供者";
    }
    @Override
    protected String startedClean$str() {
        return "WFLYSRV0025: %1$s";
    }
    @Override
    protected String startedWitErrors$str() {
        return "WFLYSRV0026: %1$s";
    }
    @Override
    protected String startingDeployment$str() {
        return "WFLYSRV0027: 开始 \"%1$s\" 的部署（runtime-name: \"%2$s\"）";
    }
    @Override
    protected String stoppedDeployment$str() {
        return "WFLYSRV0028: 在 %3$d 毫秒内停止部署 %1$s（runtime-name: %2$s）";
    }
    @Override
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0034: 没有安全领域或为原生管理服务定义的 SASL 验证；所有的访问都将没有限制。";
    }
    @Override
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0035: 没有安全领域或为 HTTP 管理服务定义的 HTTP 服务器验证；所有的访问都将没有限制。";
    }
    @Override
    protected String creatingHttpManagementServiceOnSocket$str() {
        return "WFLYSRV0039: 使用 socket-binding (%1$s) 创建 HTTP 管理服务";
    }
    @Override
    protected String creatingHttpManagementServiceOnSecureSocket$str() {
        return "WFLYSRV0040: 使用 secure-socket-binding (%1$s) 创建 HTTP 管理服务";
    }
    @Override
    protected String creatingHttpManagementServiceOnSocketAndSecureSocket$str() {
        return "WFLYSRV0041: 使用 socket-binding (%1$s) 和 secure-socket-binding (%2$s) 创建 HTTP 管理服务";
    }
    @Override
    protected String caughtExceptionClosingContentInputStream$str() {
        return "WFLYSRV0042: 为上传的部署内容关闭输入流时捕获异常";
    }
    @Override
    protected String caughtExceptionUndeploying$str() {
        return "WFLYSRV0043: 在取消 %3$s 的 %2$s 阶段的部署期间，部署单元处理器 %1$s 意外抛出一个异常";
    }
    @Override
    protected String extensionMissingManifestAttribute$str() {
        return "WFLYSRV0045: 扩展 %1$s 缺失所必需的清单属性 %2$s-%3$s (跳过扩展)";
    }
    @Override
    protected String invalidExtensionURI$str() {
        return "WFLYSRV0046: 扩展 %1$s URI 语法是无效的：%2$s";
    }
    @Override
    protected String cannotFindExtensionListEntry$str() {
        return "WFLYSRV0047: 无法找到从 %2$s 中引用的 Extension-List 条目 %1$s";
    }
    @Override
    protected String duplicateServerNameConfiguration$str() {
        return "WFLYSRV0048: 服务器名配置是通过系统属性 %1$s（'%2$s'）和 XML 配置（'%3$s'）来提供的。将使用 XML 文件的校验。";
    }
    @Override
    protected String serverStarting$str() {
        return "WFLYSRV0049: %1$s 启动 %2$s";
    }
    @Override
    protected String serverStopped$str() {
        return "WFLYSRV0050: %1$s 在 %2$d 毫秒内停止";
    }
    @Override
    protected String logHttpConsole$str() {
        return "WFLYSRV0051: 管理控制台侦听于 http://%1$s:%2$d";
    }
    @Override
    protected String logHttpsConsole$str() {
        return "WFLYSRV0052: 管理控制台侦听于 https://%1$s:%2$d";
    }
    @Override
    protected String logHttpAndHttpsConsole$str() {
        return "WFLYSRV0053: 管理控制台侦听于 http://%1$s:%2$d 和 https://%3$s:%4$d";
    }
    @Override
    protected String logNoConsole$str() {
        return "WFLYSRV0054: 管理控制台还没启用";
    }
    @Override
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYSRV0055: 在引导时捕获异常";
    }
    @Override
    protected String unsuccessfulBoot$str() {
        return "WFLYSRV0056: 服务器引导已以不可恢复的方式失败；退出。有关详细信息，请参阅之前的消息。 %1$s";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYSRV0057: 在部署 %2$s 的部署内容库里没有可用的带有 hash %1$s 的部署内容。因为这个主机控制器是以 ADMIN-ONLY 模式引导的，引导过程将为管理员提供机会来纠正这个问题。如果主机控制器不处于 ADMIN-ONLY 模式，这将是一个严重的引导故障。";
    }
    @Override
    protected String additionalResourceRootDoesNotExist$str() {
        return "WFLYSRV0058: 通过 jboss-deployment-structure.xml 添加的其他资源根目录 %1$s 不存在";
    }
    @Override
    protected String classPathEntryNotValid$str() {
        return "WFLYSRV0059: %2$s 里的类路径条目 %1$s 没有指向有效的 JAR 用于类路径的引用。";
    }
    @Override
    protected String logHttpManagement$str() {
        return "WFLYSRV0060: 侦听 http://%1$s:%2$d/management 的 HTTP 管理接口";
    }
    @Override
    protected String logHttpsManagement$str() {
        return "WFLYSRV0061: 侦听 http://%1$s:%2$d/management 的 HTTP 管理接口";
    }
    @Override
    protected String logHttpAndHttpsManagement$str() {
        return "WFLYSRV0062: 侦听 http://%1$s:%2$d/management 和 https://%3$s:%4$d/management 的 HTTP 管理接口";
    }
    @Override
    protected String logNoHttpManagement$str() {
        return "WFLYSRV0063: 没有启用 HTTP 管理接口";
    }
    @Override
    protected String jbossDeploymentStructureNamespaceIgnored$str() {
        return "WFLYSRV0064: 在 jboss.xml 里找到了子部署 %1$s 的 urn:jboss:deployment-structure 命名空间。这只在顶级部署里有效。";
    }
    @Override
    protected String failedToUnmountContentOverride$str() {
        return "WFLYSRV0065: 卸载部署覆盖失败";
    }
    @Override
    protected String deploymentDependenciesAreATopLevelElement$str() {
        return "WFLYSRV0067: 在子部署里无法使用 jboss-deployment-dependencies，它必须在 EAR 级 %1$s 指定";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentOverlayContent$str() {
        return "WFLYSRV0068: 在位置 %3$s 上部署 %2$s 的部署内容库里没有可用的带有 hash %1$s 的部署覆盖内容。因为这个主机控制器是以 ADMIN-ONLY 模式引导的，引导过程将为管理员提供机会来纠正这个问题。如果主机控制器不处于 ADMIN-ONLY 模式，这将是一个严重的引导故障。";
    }
    @Override
    protected String deploymentRestartDetected$str() {
        return "WFLYSRV0070: 部署重启对部署 %1$s 的检测，改为执行完整的重新部署。";
    }
    @Override
    protected String fdTooLow$str() {
        return "WFLYSRV0071: 操作系统限制这个进程打开的文件数量为 %1$d；我们推荐的数量至少为 4096";
    }
    @Override
    protected String argServerConfig$str() {
        return "要使用的服务器配置文件的名称（默认为 \"standalone.xml\"）（和 -c 相同）";
    }
    @Override
    protected String argShortServerConfig$str() {
        return "要使用的服务器配置文件的名称（默认为 \"standalone.xml\"）（和 ---server-config 相同）";
    }
    @Override
    protected String argReadOnlyServerConfig$str() {
        return "要使用的服务器配置文件的名称。这和 '--server-config' 和 '-c' 不同，因为原始文件从没有被覆盖。";
    }
    @Override
    protected String argHelp$str() {
        return "显示这条消息并退出";
    }
    @Override
    protected String argProperties$str() {
        return "从给定的 URL 里加载系统属性";
    }
    @Override
    protected String argSecurityProperty$str() {
        return "设置安全属性";
    }
    @Override
    protected String argSystem$str() {
        return "设置系统属性";
    }
    @Override
    protected String argVersion$str() {
        return "打印版本并退出";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "设置系统属性 jboss.bind.address 为给定的值";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "把系统属性 jboss.bind.address.<interface> 设置为给定的值";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "设置系统属性 jboss.default.multicast.address 为给定的值";
    }
    @Override
    protected String argAdminOnly$str() {
        return "设置服务器的运行类型为 ADMIN_ONLY，使其打开管理性接口并接受管理请求，但不会启动其他运行时服务或接受最终用户的请求。它不能和 --start-mode 一起使用。已过时，使用 --start-mode=admin-only 替代它。";
    }
    @Override
    protected String argDebugPort$str() {
        return "指定端口的带有可选参数的活动调试模式。只在启动脚本支持时才能正常运行。";
    }
    @Override
    protected String argSecMgr$str() {
        return "用安装的安全管理者运行服务器。";
    }
    @Override
    protected String argStartMode$str() {
        return "设置服务器的启动模式，它可以是 'normal'、'admin-only' 或 'suspend'。如果为 'suspend'，服务器将以 suspended 模式启动，直至已恢复才会处理请求。如果以 admin-only 模式启动，服务器只会打开管理接口并接受管理请求，但不会启动其他运行时服务或接受最终用户请求。它无法和 --admin-only 一起使用。";
    }
    @Override
    protected String argGracefulStartup$str() {
        return "安全启动服务器，直到服务器完全启动前，将请求放人到队列或拒绝";
    }
    @Override
    protected String argGitRepo$str() {
        return "克隆以获取服务器配置的 Git 存储库。";
    }
    @Override
    protected String argGitBranch$str() {
        return "用于获取服务器配置的 Git 分支。默认值为 'master’";
    }
    @Override
    protected String argGitAuth$str() {
        return "用于管理 Git 凭据的 elytron 配置文件。默认值为 'null’";
    }
    @Override
    protected String argStability$str() {
        return "使用特定的稳定性级别运行服务器。可能的值：%1$s, Default = %2$s";
    }
    @Override
    protected String valueExpectedForCommandLineOption$str() {
        return "WFLYSRV0072: 选项 %1$s 所期待的值";
    }
    @Override
    protected String invalidCommandLineOption$str() {
        return "WFLYSRV0073: 无效的选项 '%1$s'";
    }
    @Override
    protected String malformedCommandLineURL$str() {
        return "WFLYSRV0074: 为选项 '%2$s' 提供的格式不正确的 URL '%1$s'";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYSRV0075: 无法从 URL '%1$s' 加载属性";
    }
    @Override
    protected String hostControllerNameNonNullInStandalone$str() {
        return "WFLYSRV0079: 如果服务器不是运行在受管域里，hostControllerName 必须为 null";
    }
    @Override
    protected String hostControllerNameNullInDomain$str() {
        return "WFLYSRV0080: 如果服务器运行在受管域里，hostControllerName 可以不为 null";
    }
    @Override
    protected String cannotResolveInterface$str() {
        return "WFLYSRV0081: IP 地址无法用给定接口选择标准解析。错误是 -- %1$s";
    }
    @Override
    protected String failedToResolveInterface$str() {
        return "WFLYSRV0082: 无法解析接口 %1$s";
    }
    @Override
    protected String failedToStartHttpManagementService$str() {
        return "WFLYSRV0083: 无法启动 http-interface 服务";
    }
    @Override
    protected String noSuchDeploymentContent$str() {
        return "WFLYSRV0084: 在部署内容库里没有具有 hash %1$s 的部署内容。";
    }
    @Override
    protected String noSuchDeployment$str() {
        return "WFLYSRV0085: 未找到名为 %1$s 的部署";
    }
    @Override
    protected String cannotReplaceDeployment$str() {
        return "WFLYSRV0086: 对于参数 %2$s 和 %3$s 无法使用具有相同值的 %1$s。请使用 %4$s 来重部署相同的内容或 %5$s 来用相同名称的更新版本来替换内容。";
    }
    @Override
    protected String deploymentAlreadyStarted$str() {
        return "WFLYSRV0087: 部署 %1$s 已启动";
    }
    @Override
    protected String missingHomeDirConfiguration$str() {
        return "WFLYSRV0088: 缺失 %1$s 的配置值";
    }
    @Override
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYSRV0093: 读取上传的部署内容时捕获 IOException";
    }
    @Override
    protected String nullStreamAttachment$str() {
        return "WFLYSRV0094: 索引 [%1$d] 的流为 null";
    }
    @Override
    protected String invalidDeploymentURL$str() {
        return "WFLYSRV0095: '%1$s' 不是一个有效的 URL";
    }
    @Override
    protected String problemOpeningStreamFromDeploymentURL$str() {
        return "WFLYSRV0096: 从 URL '%1$s' 里获取输入流出错";
    }
    @Override
    protected String serviceModuleLoaderAlreadyStarted$str() {
        return "WFLYSRV0097: ServiceModuleLoader 已经启动";
    }
    @Override
    protected String serviceModuleLoaderAlreadyStopped$str() {
        return "WFLYSRV0098: ServiceModuleLoader 已经停止";
    }
    @Override
    protected String missingModulePrefix$str() {
        return "WFLYSRV0099: '%1$s' 无法从 ServiceModuleLoader 加载，因为它的名字没有以 '%2$s' 开始";
    }
    @Override
    protected String failedToReadVirtualFile$str() {
        return "WFLYSRV0100: 读取 '%1$s' 失败";
    }
    @Override
    protected String deploymentRootRequired$str() {
        return "WFLYSRV0101: 部署根目录是必需的";
    }
    @Override
    protected String subdeploymentsRequireParent$str() {
        return "WFLYSRV0102: 子部署要求一个父部署单元";
    }
    @Override
    protected String noModuleIdentifier$str() {
        return "WFLYSRV0103: 部署 '%1$s' 没有附件模块标识符";
    }
    @Override
    protected String failedToCreateVFSResourceLoader$str() {
        return "WFLYSRV0104: 为根 [%1$s] 创建 VFSResourceLoader 失败";
    }
    @Override
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYSRV0105: 从远程库里获取文件失败";
    }
    @Override
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYSRV0106: 无法创建本地目录：%1$s";
    }
    @Override
    protected String didNotReadEntireFile$str() {
        return "WFLYSRV0107: 无法读取整个文件。缺失了：%1$d";
    }
    @Override
    protected String noArgValue$str() {
        return "WFLYSRV0108: 没有为参数 %1$s%n 提供值";
    }
    @Override
    protected String couldNotFindHcFileRepositoryConnection$str() {
        return "WFLYSRV0109: 无法找到到主机控制器的文件库连接。";
    }
    @Override
    protected String unknownMountType$str() {
        return "WFLYSRV0112: 未知的挂载类型 %1$s";
    }
    @Override
    protected String failedCreatingTempProvider$str() {
        return "WFLYSRV0113: 创建临时文件提供者失败";
    }
    @Override
    protected String systemPropertyNotManageable$str() {
        return "WFLYSRV0115: 系统属性 %1$s 不能通过 xml 配置文件或从管理客户端设置；其值必须在初始进程启动时就知道，以便它只能从命令行设置";
    }
    @Override
    protected String systemPropertyCannotOverrideServerName$str() {
        return "WFLYSRV0116: 在服务器名称已通过 XML 配置文件或管理客户设置后，无法设置系统属性 %1$s";
    }
    @Override
    protected String unableToInitialiseSSLContext$str() {
        return "WFLYSRV0117: 无法初始化基本的 SSLContext '%1$s'";
    }
    @Override
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYSRV0119: 主目录不存在：%1$s";
    }
    @Override
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYSRV0121: 配置目录不存在：%1$s";
    }
    @Override
    protected String serverBaseDirectoryDoesNotExist$str() {
        return "WFLYSRV0122: 服务器的基目录不存在：%1$s";
    }
    @Override
    protected String serverDataDirectoryIsNotDirectory$str() {
        return "WFLYSRV0123: 服务器数据目录不是一个目录：%1$s";
    }
    @Override
    protected String couldNotCreateServerDataDirectory$str() {
        return "WFLYSRV0124: 无法创建服务器数据目录：%1$s";
    }
    @Override
    protected String serverContentDirectoryIsNotDirectory$str() {
        return "WFLYSRV0125: 服务器内容目录不是一个目录：%1$s";
    }
    @Override
    protected String couldNotCreateServerContentDirectory$str() {
        return "WFLYSRV0126: 无法创建服务器内容目录：%1$s";
    }
    @Override
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYSRV0127: 日志目录不是一个目录：%1$s";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYSRV0128: 无法创建日志目录：%1$s";
    }
    @Override
    protected String serverTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0129: 服务器的临时目录不存在：%1$s";
    }
    @Override
    protected String couldNotCreateServerTempDirectory$str() {
        return "WFLYSRV0130: 无法创建服务器临时目录：%1$s";
    }
    @Override
    protected String controllerTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0131: 控制器的临时目录不存在：%1$s";
    }
    @Override
    protected String couldNotCreateControllerTempDirectory$str() {
        return "WFLYSRV0132: 无法创建服务器临时目录：%1$s";
    }
    @Override
    protected String domainBaseDirDoesNotExist$str() {
        return "WFLYSRV0133: 域的基目录不存在：%1$s";
    }
    @Override
    protected String domainConfigDirDoesNotExist$str() {
        return "WFLYSRV0134: 域的配置目录不存在：%1$s";
    }
    @Override
    protected String serverBaseDirectoryIsNotADirectory$str() {
        return "WFLYSRV0135: 服务器目录不是一个目录：%1$s";
    }
    @Override
    protected String couldNotCreateServerBaseDirectory$str() {
        return "WFLYSRV0136: 无法创建服务器基目录：%1$s";
    }
    @Override
    protected String noSuchDeploymentContentAtBoot$str() {
        return "WFLYSRV0137: 在部署 '%2$s' 的部署内容库里没有可用的带有 hash %1$s 的部署内容。这是一个严重的引导错误。要纠正这个问题，要么使用 --admin-only 开关设置重启，并使用 CLI 安装缺失的内容，要么从配置里删除这些内容，或者从 XML 配置文件里删除这个部署并重启。";
    }
    @Override
    protected String configuredSystemPropertiesLabel$str() {
        return "已配置的系统属性：";
    }
    @Override
    protected String vmArgumentsLabel$str() {
        return "VM 参数: %1$s";
    }
    @Override
    protected String configuredSystemEnvironmentLabel$str() {
        return "已配置的系统环境：";
    }
    @Override
    protected String vfsNotAvailable$str() {
        return "WFLYSRV0138: 在已配置模块加载器里 VFS 是不可用的";
    }
    @Override
    protected String serverControllerServiceRemoved$str() {
        return "WFLYSRV0139: 服务器控制器服务被删除";
    }
    @Override
    protected String rootServiceRemoved$str() {
        return "WFLYSRV0140: 根服务被删除";
    }
    @Override
    protected String cannotStartServer$str() {
        return "WFLYSRV0141: 无法启动服务器";
    }
    @Override
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYSRV0143: 在 '%2$s' 下不存在名为 '%1$s' 的目录";
    }
    @Override
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYSRV0144: -D%1$s=%2$s 不存在";
    }
    @Override
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYSRV0145: -D%1$s=%2$s 不是一个目录";
    }
    @Override
    protected String errorCopyingFile$str() {
        return "WFLYSRV0146: 复制 '%1$s' 到 '%2$s' 时出错";
    }
    @Override
    protected String invalidObject$str() {
        return "WFLYSRV0147: %1$s 为 null";
    }
    @Override
    protected String invalidPortOffset$str() {
        return "WFLYSRV0148: portOffset 超出范围";
    }
    @Override
    protected String invalidStreamIndex$str() {
        return "WFLYSRV0149: 无效的 '%1$s' 值：%2$d，最大的索引是 %3$d";
    }
    @Override
    protected String invalidStreamURL$str() {
        return "WFLYSRV0150: 无法从 URL '%1$s' 创建输入流";
    }
    @Override
    protected String invalidStreamBytes$str() {
        return "WFLYSRV0151: 参数 %1$s 里没有可用的字节";
    }
    @Override
    protected String multipleContentItemsNotSupported$str() {
        return "WFLYSRV0152: 目前只支持 1 条内容（AS7-431）";
    }
    @Override
    protected String deploymentPhaseFailed$str() {
        return "WFLYSRV0153: 无法处理 %2$s 的 %1$s 阶段";
    }
    @Override
    protected String deploymentIndexingFailed$str() {
        return "WFLYSRV0156: 无法为注解的部署根建立索引";
    }
    @Override
    protected String failedToInstantiateClassTransformer$str() {
        return "WFLYSRV0158: 无法实例化 %1$s";
    }
    @Override
    protected String noDeploymentRepositoryAvailable$str() {
        return "WFLYSRV0159: 没有可用的部署存储库。";
    }
    @Override
    protected String deploymentMountFailed$str() {
        return "WFLYSRV0160: 无法挂载部署内容";
    }
    @Override
    protected String failedToGetManifest$str() {
        return "WFLYSRV0161: 无法得到部署 %1$s 的清单";
    }
    @Override
    protected String cannotMergeResourceRoot$str() {
        return "WFLYSRV0163: 无法合并不同文件的资源根。文件：%1$s 要合并的文件：%2$s";
    }
    @Override
    protected String failedToCreateTempFileProvider$str() {
        return "WFLYSRV0164: 创建临时文件提供者失败";
    }
    @Override
    protected String resourceTooLarge$str() {
        return "WFLYSRV0165: 对于有效的类文件来说资源过大";
    }
    @Override
    protected String subdeploymentNotFound$str() {
        return "WFLYSRV0166: 在 jboss-deployment-structure.xml 里未找到子部署 %1$s。可用的子部署：%2$s";
    }
    @Override
    protected String deploymentStructureFileNotFound$str() {
        return "WFLYSRV0167: 在 %1$s 里未找到 jboss-deployment-structure.xml 文件";
    }
    @Override
    protected String errorLoadingDeploymentStructureFile$str() {
        return "WFLYSRV0168: 从 %1$s 加载 jboss-deployment-structure.xml 出错";
    }
    @Override
    protected String duplicateSubdeploymentListing$str() {
        return "WFLYSRV0169: 在 jboss-deployment-structure.xml 里子部署 '%1$s' 被列出了两次";
    }
    @Override
    protected String invalidModuleName$str() {
        return "WFLYSRV0170: 额外的模块名 '%1$s' 是无效的。名称必须以 'deployment' 开始";
    }
    @Override
    protected String externalResourceRootsNotSupported$str() {
        return "WFLYSRV0171: 不支持外部的资源根，资源根不能以 '/' 开始：%1$s";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSRV0172: 文档结尾";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSRV0173: 缺失一个或多个必需的属性：%1$s";
    }
    @Override
    protected String unexpectedContent$str() {
        return "WFLYSRV0174: 意外的类型内容 '%1$s'，名称为 '%2$s'，文本是：'%3$s'";
    }
    @Override
    protected String noMethodFound$str() {
        return "WFLYSRV0175: 在类（或其超类）%2$s 上未找到 id 为 %1$s 的方法";
    }
    @Override
    protected String errorGettingReflectiveInformation$str() {
        return "WFLYSRV0177: 获得带有类加载器 %1$s 的 %2$s 的反射信息出错";
    }
    @Override
    protected String externalModuleServiceAlreadyStarted$str() {
        return "WFLYSRV0178: 外部模块服务已经启动";
    }
    @Override
    protected String failedToLoadModule$str() {
        return "WFLYSRV0179: 加载模块 '%1$s' 失败";
    }
    @Override
    protected String failedToResolveMulticastAddress$str() {
        return "WFLYSRV0187: 获取 %1$s 的多点传送地址失败";
    }
    @Override
    protected String failedToResolveMulticastAddressForRollback$str() {
        return "WFLYSRV0188: 获取 %1$s 的多点传送地址失败";
    }
    @Override
    protected String cannotAddMoreThanOneSocketBindingGroupForServerOrHost$str() {
        return "WFLYSRV0190: 无法添加多个套接字绑定组。试图添加 '%1$s'，但 '%2$s' 已经存在";
    }
    @Override
    protected String cannotHaveBothInitialServerConfigAndServerConfig$str() {
        return "WFLYSRV0191: 无法同时使用 --server-config 和 --initial-server-config";
    }
    @Override
    protected String duplicateJBossXmlNamespace$str() {
        return "WFLYSRV0192: jboss-all.xml 文件里重复的命名空间 %1$s";
    }
    @Override
    protected String equivalentNamespacesInJBossXml$str() {
        return "WFLYSRV0193: 在 jboss-all.xml 里出现了相同命名空间的两个不同版本，%1$s 和 %2$s";
    }
    @Override
    protected String errorLoadingJBossXmlFile$str() {
        return "WFLYSRV0194: 从 %1$s 加载 jboss-all.xml 出错";
    }
    @Override
    protected String nullModuleAttachment$str() {
        return "WFLYSRV0195: 无法为 %1$s 获取所需模块";
    }
    @Override
    protected String deploymentOverlayFailed$str() {
        return "WFLYSRV0196: 在 %2$s 获取部署覆盖内容 %1$s 失败";
    }
    @Override
    protected String noSuchDeploymentOverlayContentAtBoot$str() {
        return "WFLYSRV0198: 在位置 %3$s 上的部署覆盖 '%2$s' 的部署内容库里没有可用的带有 hash %1$s 的部署覆盖内容。这是一个严重的引导错误。要纠正这个问题，要么使用 --admin-only 开关设置重启，并使用 CLI 来安装缺失的内容，要么从配置里删除这些内容，或者从 XML 配置文件里删除这个部署覆盖内容并重启。";
    }
    @Override
    protected String noSuchDeploymentOverlayContent$str() {
        return "WFLYSRV0199: 在部署内容库里没有具有 hash %1$s 的部署覆盖内容。";
    }
    @Override
    protected String failedToLoadFile$str() {
        return "WFLYSRV0200: 读取文件 %1$s 失败";
    }
    @Override
    protected String cannotHaveMoreThanOneManagedContentItem$str() {
        return "WFLYSRV0201: 不能具有多于一个的 %1$s";
    }
    @Override
    protected String unknownContentItemKey$str() {
        return "WFLYSRV0202: 未知的内容项目键：%1$s";
    }
    @Override
    protected String cannotMixUnmanagedAndManagedContentItems$str() {
        return "WFLYSRV0203: 当使用 %2$s 时无法使用 %1$s";
    }
    @Override
    protected String nullParameter$str() {
        return "WFLYSRV0204: Null '%1$s'";
    }
    @Override
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYSRV0205: 已经存在具有相同运行时名 %2$s 的名为 %1$s 的部署";
    }
    @Override
    protected String duplicateDeploymentUnitProcessor$str() {
        return "WFLYSRV0206: 使用优先级 %1$s 和类 %2$s 注册的多个部署单元处理器";
    }
    @Override
    protected String startingSubDeployment$str() {
        return "WFLYSRV0207: 启动子部署（runtime-name: \"%1$s\"）";
    }
    @Override
    protected String stoppedSubDeployment$str() {
        return "WFLYSRV0208: 再 %1$s 毫秒后停止子部署（runtime-name: %2$d）";
    }
    @Override
    protected String vaultModuleWithNoCode$str() {
        return "WFLYSRV0209: 在指定 'module' 时您也需要指定 'code'";
    }
    @Override
    protected String serverAlreadyPaused$str() {
        return "WFLYSRV0210: 服务器已暂停";
    }
    @Override
    protected String suspendingServer1$str() {
        return "WFLYSRV0211: 暂停服务器，%1$d 毫秒后超时。";
    }
    @Override
    protected String resumingServer$str() {
        return "WFLYSRV0212: 恢复服务器";
    }
    @Override
    protected String failedToConnectToHostController$str() {
        return "WFLYSRV0213: 连接主机控制器失败，重试中...";
    }
    @Override
    protected String failedToResume$str() {
        return "WFLYSRV0215: 无法恢复行动 %1$s。要恢复普通的操作，我们推荐您重启服务器。";
    }
    @Override
    protected String failedToCleanObsoleteContent$str() {
        return "WFLYSRV0216: 清理过时内容 %1$s 时出错";
    }
    @Override
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYSRV0219: %1$s 部署已被重新部署，它的内容不会被删除。您需要重启它。";
    }
    @Override
    protected String shutdownHookInvoked$str() {
        return "WFLYSRV0220: 已通过 OS 信号请求关闭服务器";
    }
    @Override
    protected String deprecatedApiUsed$str() {
        return "WFLYSRV0221: 部署 \"%1$s\" 采用的是已弃用的模块（\"%2$s\"），该模块可能从未来的版本中删除而不会另行通知。";
    }
    @Override
    protected String illegalPermissionName$str() {
        return "WFLYSRV0222: 非法的权限名称 '%1$s'";
    }
    @Override
    protected String illegalPermissionActions$str() {
        return "WFLYSRV0223: 非法的权限动作 '%1$s'";
    }
    @Override
    protected String couldNotMountOverlay$str() {
        return "WFLYSRV0224: 无法挂载重叠 %1$s，因为父 %2$s 不是一个目录";
    }
    @Override
    protected String vaultNotInitializedException$str() {
        return "WFLYSRV0230: Vault 未初始化；无法解析 vault 表达式";
    }
    @Override
    protected String couldNotObtainServerUuidFile$str() {
        return "WFLYSRV0231: 无法在文件 %1$s 里读取或创建服务器 UUID";
    }
    @Override
    protected String couldNotGetModuleInfo$str() {
        return "WFLYSRV0232: 无法获得模块 %1$s 的模块信息";
    }
    @Override
    protected String deploymentUndeployedNotification$str() {
        return "WFLYSRV0233: 取消部署的 \"%1$s\"（runtime-name: \"%2$s\"）";
    }
    @Override
    protected String deploymentDeployedNotification$str() {
        return "WFLYSRV0234: 已部署的 \"%1$s\"（runtime-name: \"%2$s\"）";
    }
    @Override
    protected String securityManagerEnabled$str() {
        return "WFLYSRV0235: 安全管理者已启用";
    }
    @Override
    protected String suspendingServerWithNoTimeout$str() {
        return "WFLYSRV0236: 暂停服务器，没有超时时间。";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentConfigAndServerConfig$str() {
        return "WFLYSRV0237: 在指定 server-config 时无法使用 use-current-server-config=false";
    }
    @Override
    protected String serverConfigForReloadNotFound$str() {
        return "WFLYSRV0238: 无法找到为重载指定的 server-config '%1$s'";
    }
    @Override
    protected String aborting$str() {
        return "WFLYSRV0239: 终止，退出码为 %1$d";
    }
    @Override
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYSRV0240: ProcessController 已给出关闭信号；正在关闭";
    }
    @Override
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYSRV0241: 对管理操作 '%1$s' 作出响应而关闭";
    }
    @Override
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYSRV0242: 无法在自包含服务器里展开部署";
    }
    @Override
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYSRV0243: 无法展开未管理的部署";
    }
    @Override
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYSRV0244: 无法展开已展开的部署";
    }
    @Override
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYSRV0245: 无法展开已部署的部署";
    }
    @Override
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYSRV0246: 无法添加内容至自包含服务器里的部署";
    }
    @Override
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYSRV0247: 无法添加内容至未管理的部署";
    }
    @Override
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYSRV0248: 无法添加内容至未展开的部署";
    }
    @Override
    protected String couldNotCopyFiles$str() {
        return "WFLYSRV0249: 无法从受管内容资料库复制文件至 %1$s 的运行部署";
    }
    @Override
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYSRV0250: 无法从自包含服务器里的部署删除内容";
    }
    @Override
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0251: 无法从未管理的部署删除内容";
    }
    @Override
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYSRV0252: 无法从未展开的部署删除内容";
    }
    @Override
    protected String couldNotDeleteFile$str() {
        return "WFLYSRV0253: 无法从运行的部署 %2$s 中删除文件 %1$s";
    }
    @Override
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYSRV0254: 无法从自包含服务器里的部署读取内容";
    }
    @Override
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0255: 无法从未管理的部署读取内容";
    }
    @Override
    protected String requiredSystemPropertyMissing$str() {
        return "WFLYSRV0257: 没有设置要求的系统属性 '%1$s'";
    }
    @Override
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYSRV0258: 无法展开未展开部署的子部署";
    }
    @Override
    protected String secureSocketBindingRequiresSSLContext$str() {
        return "WFLYSRV0259: 如果定义了属性 secure-socket-binding，则也必须定义 ssl-context";
    }
    @Override
    protected String startingServerSuspended$str() {
        return "WFLYSRV0260: 用 suspended 模式启动服务器";
    }
    @Override
    protected String bootComplete$str() {
        return "WFLYSRV0261: 引导完成";
    }
    @Override
    protected String cannotSetBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0262: 您不能既设置 --start-mode 又设置 --admin-only";
    }
    @Override
    protected String unknownStartMode$str() {
        return "WFLYSRV0263: 未知的启动模式 %1$s";
    }
    @Override
    protected String cannotSpecifyBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0264: 无法既指定 admin-only 又指定 start-mode";
    }
    @Override
    protected String invalidPoolSize$str() {
        return "WFLYSRV0265: 系统属性 '%2$s' 的无效值 '%1$s' - 值必须为非负整数";
    }
    @Override
    protected String archiveMountFailed$str() {
        return "WFLYSRV0267: 无法挂载资源根 '%1$s'，它是否真的是存档？";
    }
    @Override
    protected String failedToPullRepository$str() {
        return "WFLYSRV0268: 拉取存储库 %1$s 失败";
    }
    @Override
    protected String failedToInitRepository$str() {
        return "WFLYSRV0269: 初始化存储库 %1$s 失败";
    }
    @Override
    protected String failedToPublishConfiguration$str() {
        return "WFLYSRV0270: 将配置发布到 %1$s 失败";
    }
    @Override
    protected String errorUsingGit$str() {
        return "WFLYSRV0271: Git 错误：%1$s";
    }
    @Override
    protected String suspendingServer0$str() {
        return "WFLYSRV0272: 挂起服务器";
    }
    @Override
    protected String excludedSubSystemsNotExist$str() {
        return "WFLYSRV0273: 通过 jboss-deployment-structure.xml 排除的子系统 %1$s 不存在。";
    }
    @Override
    protected String excludedDependenciesNotExist$str() {
        return "WFLYSRV0274: 通过 jboss-deployment-structure.xml 排除的依赖性 %1$s 不存在。";
    }
    @Override
    protected String maximumNumberOfJarResources$str() {
        return "WFLYSRV0275: 名为 '%1$s' 的 global-directory 模块允许访问的 jar 资源的最大数量。最大允许值为 %2$d 个文件";
    }
    @Override
    protected String errorOpeningZipFile$str() {
        return "WFLYSRV0276: 打开 zip 文件 %1$s 时出错";
    }
    @Override
    protected String failedToLoadSSHCredentials$str() {
        return "WFLYSRV0277: 加载 SSH 凭证 %1$s 失败";
    }
    @Override
    protected String usingGit$str() {
        return "WFLYSRV0278: 配置历史记录通过 Git 管理";
    }
    @Override
    protected String gitRespositoryInitialized$str() {
        return "WFLYSRV0279: Git 已在 %1$s 中初始化";
    }
    @Override
    protected String unableToInitialiseGitRepository$str() {
        return "WFLYSRV0280: 无法初始化 git 存储库。";
    }
    @Override
    protected String wildflyConfigUrlIsSet$str() {
        return "WFLYSRV0281: 已设置系统属性 %1$s。这只应用于独立客户端。在服务器中进行此设置将覆盖您的配置文件配置。";
    }
    @Override
    protected String startingNonGraceful$str() {
        return "WFLYSRV0282: 在安全启动被禁用的情况下服务器正在启动。外部请求可能会收到故障响应，直到启动完成为止。";
    }
    @Override
    protected String disregardingNonGraceful$str() {
        return "WFLYSRV0283: 一个非安全的启动被请求，同时带有一个挂起的启动服务器将开始挂起。";
    }
    @Override
    protected String vaultSupportRemoved$str() {
        return "WFLYSRV0285: Vault 支持已删除，没有 vault 资源会被初始化。";
    }
    @Override
    protected String staticModuleIndexingFailed$str() {
        return "WFLYSRV0286: 为注解索引静态模块 %1$s 失败";
    }
    @Override
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYSRV0287: 不再支持安全领域，请从配置中迁移对它们的引用。";
    }
    @Override
    protected String unableToCreateTempDirForAuthTokensFileExists$str() {
        return "WFLYSRV0288: 无法为 auth 令牌生成 tmp 目录，因为该文件已存在。";
    }
    @Override
    protected String unableToCreateAuthDir$str() {
        return "WFLYSRV0289: 无法生成 auth 目录 %1$s。";
    }
    @Override
    protected String unableToFindYaml$str() {
        return "WFLYSRV0290: 无法找到指定的 YAML 文件 %1$s";
    }
    @Override
    protected String throwableIsNull$str() {
        return "WFLYSRV0291: 错误原因在此线程中未知。检查其他日志消息和调用者以了解可能的原因。";
    }
    @Override
    protected String requiredServiceNotUp$str() {
        return "WFLYSRV0292: 所需的服务 '%1$s' 不是 UP，它目前是 '%2$s'。";
    }
    @Override
    protected String aliasAddedAsDependency$str() {
        return "WFLYSRV0293: '%1$s' 模块别名已被添加为经过 %3$s 的 '%2$s' 部署的依赖项。虽然这被允许，则建议使用其目标模块。请考虑将这个别名替换为其目标模块 '%4$s'。";
    }
    @Override
    protected String aliasAddedAsExclusion$str() {
        return "WFLYSRV0294: '%1$s' 模块别名已从经过 %3$s 的 %2$s 部署中排除。虽然这是允许的，但建议使用其 target 模块。请考虑将这个别名替换为其目标模块 '%4$s'。";
    }
    @Override
    protected String noServerInstallationPrepared$str() {
        return "WFLYSRV0295: 没有准备 %1$s 安装。";
    }
    @Override
    protected String mechAuthenticationNotComplete$str() {
        return "WFLYSRV0296: 身份验证机制验证还没有完成";
    }
    @Override
    protected String mechMessageAfterComplete$str() {
        return "WFLYSRV0297: 验证机制交换在身份验证完成后收到一条消息";
    }
    @Override
    protected String mechMessageTooLong$str() {
        return "WFLYSRV0298: 身份验证机制消息太长";
    }
    @Override
    protected String mechServerSideAuthenticationFailed$str() {
        return "WFLYSRV0299: 身份验证机制服务器端身份验证失败";
    }
    @Override
    protected String mechTokenNotVerified$str() {
        return "WFLYSRV0300: 身份验证机制令牌没有被验证";
    }
    @Override
    protected String mechAuthorizationFailed$str() {
        return "WFLYSRV0301: 身份验证机制授权失败：\"%1$s\" 作为\"%2$s\"运行";
    }
    @Override
    protected String mechNoSecurityLayer$str() {
        return "WFLYSRV0302: 身份验证机制不支持安全层 (封装/解封)";
    }
    @Override
    protected String mechInvalidMessageReceived$str() {
        return "WFLYSRV0303: 收到无效的身份验证机制协商消息";
    }
    @Override
    protected String mechNoTokenGiven$str() {
        return "WFLYSRV0304: 未给出身份验证机制令牌";
    }
    @Override
    protected String mechMalformedFields$str() {
        return "WFLYSRV0305: 身份验证机制身份验证因为一个或多个不正确的字段而失败";
    }
    @Override
    protected String mechCallbackHandlerFailedForUnknownReason$str() {
        return "WFLYSRV0306: 回调处理程序因未知原因而失败";
    }
    @Override
    protected String mechNoLoginNameGiven$str() {
        return "WFLYSRV0307: 没有给出验证机制登录名称";
    }
    @Override
    protected String failedToParseEnumProperty$str() {
        return "WFLYSRV0308: 无法解析属性(%1$s)，值(%2$s)应匹配其中之一：%3$s";
    }
    @Override
    protected String unsupportedStability$str() {
        return "WFLYSRV0309: 在 %2$s 中不支持 %1$s 稳定性级别";
    }
    @Override
    protected String processStateChangeNotificationDescription$str() {
        return "当进程状态修改时，这个通知将被发出";
    }
    @Override
    protected String jmxAttributeChange$str() {
        return "属性 '%1$s' 已经从' %2$s' 改成了 '%3$s'";
    }
    @Override
    protected String repositoryInitialized$str() {
        return "存储库已初始化";
    }
    @Override
    protected String addingIgnored$str() {
        return "添加 .gitignore";
    }
    @Override
    protected String serverConfigFileInUse$str() {
        return "- 服务器配置文件在使用中：%1$s";
    }
    @Override
    protected String serverStabilityInUse$str() {
        return "- 最低功能稳定性级别：%1$s";
    }
    @Override
    protected String startedCleanMessage$str() {
        return "%1$s 在 %2$dms 内启动了 - 启动了 %4$d 个服务 %6$s 中的 %3$d 个（%5$d 个服务是 lazy、passive 或 on-demand）";
    }
    @Override
    protected String startedWitErrorsMessage$str() {
        return "%1$s 在 %2$dms 内启动（带有错误）- 启动了 %4$d 个服务 %7$s 中的 %3$d 个（%5$d 个服务失败或缺失依赖项，%6$d 个服务是 lazy、passive 或 on-demand）";
    }
}
