package org.jboss.as.process.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:22+0200")
public class ProcessLogger_$logger_zh_CN extends ProcessLogger_$logger_zh implements ProcessLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ProcessLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String attemptToReconnectNonExistentProcess$str() {
        return "WFLYPC0001: 尝试重新连接不存在的进程 '%1$s'";
    }
    @Override
    protected String attemptToRemoveNonExistentProcess$str() {
        return "WFLYPC0002: 尝试删除不存在的进程 '%1$s'";
    }
    @Override
    protected String attemptToStartNonExistentProcess$str() {
        return "WFLYPC0003: 尝试启动不存在的进程 '%1$s'";
    }
    @Override
    protected String attemptToStopNonExistentProcess$str() {
        return "WFLYPC0004: 尝试停止不存在的进程 '%1$s'";
    }
    @Override
    protected String duplicateProcessName$str() {
        return "WFLYPC0005: 尝试注册重复命名的进程 '%1$s'";
    }
    @Override
    protected String failedToSendAuthKey$str() {
        return "WFLYPC0006: 向进程 '%1$s' 发送认证密钥失败：%2$s";
    }
    @Override
    protected String failedToSendDataBytes$str() {
        return "WFLYPC0007: 向进程 '%1$s' 输入流发送数据字节失败";
    }
    @Override
    protected String failedToSendReconnect$str() {
        return "WFLYPC0008: 向进程 '%1$s' 输入流发送重新连接信息失败";
    }
    @Override
    protected String failedToStartProcess$str() {
        return "WFLYPC0009: 启动进程 '%1$s' 失败";
    }
    @Override
    protected String failedToWriteMessage$str() {
        return "WFLYPC0010: 向连接中写入 %1$s 信息失败：%2$s";
    }
    @Override
    protected String processFinished$str() {
        return "WFLYPC0011: 进程 '%1$s' 结束，并进入退出状态 %2$d。";
    }
    @Override
    protected String receivedInvalidVersion$str() {
        return "WFLYPC0012: 收到来自 %1$s 使用无效版本的连接";
    }
    @Override
    protected String receivedUnknownGreetingCode$str() {
        return "WFLYPC0013: 收到来自 %2$s 的不可识别祝贺代码 0x%1$02x";
    }
    @Override
    protected String receivedUnknownCredentials$str() {
        return "WFLYPC0014: 收到来自 %1$s 的有未知凭证的连接";
    }
    @Override
    protected String receivedUnknownMessageCode$str() {
        return "WFLYPC0015: 收到代码为 0x%1$02x 的未知信息";
    }
    @Override
    protected String shutdownComplete$str() {
        return "WFLYPC0016: 所有进程结束，退出。";
    }
    @Override
    protected String shuttingDown$str() {
        return "WFLYPC0017: 关闭进程控制器";
    }
    @Override
    protected String startingProcess$str() {
        return "WFLYPC0018: 启动进程 '%1$s'";
    }
    @Override
    protected String stoppingProcess$str() {
        return "WFLYPC0019: 停止进程 '%1$s'";
    }
    @Override
    protected String streamProcessingFailed$str() {
        return "WFLYPC0020: 进程 '%1$s' 的流处理失败：%2$s";
    }
    @Override
    protected String waitingToRestart$str() {
        return "WFLYPC0021: 重启进程 %2$s 前等待 %1$d 秒。";
    }
    @Override
    protected String failedToKillProcess$str() {
        return "WFLYPC0022: 无法终止进程 '%1$s'，尝试销毁这个进程。";
    }
    @Override
    protected String argUsage$str() {
        return "用法：%1$s [args...]%n，其中 args 包括：";
    }
    @Override
    protected String argBackup$str() {
        return "即使这个主机不是域控制器，也请保留持久性域配置的一个拷贝。如果没有在 host.xml 里设置 ignore-unused-configuration，那么完整的域配置将被恢复，否则将使用 ignore-unused-configuration 的值。";
    }
    @Override
    protected String argCachedDc$str() {
        return "如果这个主机不是域控制器且无法在引导时联系域控制器，引导过程将使用本地缓存的域配置拷贝（参考 --backup）。域控制器进行后台轮询直至它可用。请注意，当域控制器可用时，使用 --cached-dc 启动主机将会缓存一个域配置的备份，即使没有使用 --backup。";
    }
    @Override
    protected String argDomainConfig$str() {
        return "要使用的域配置文件的名称（默认为 \"domain.xml\"）（和 -c 相同）";
    }
    @Override
    protected String argShortDomainConfig$str() {
        return "要使用的域配置文件的名称（默认为 \"domain.xml\"）（和 --domain-config 相同）";
    }
    @Override
    protected String argReadOnlyDomainConfig$str() {
        return "要使用的服务器配置文件的名称。这和 '--domain-config'、'-c' 和 '-domain-config' 不同，因为初始文件从没有被覆盖。";
    }
    @Override
    protected String argHelp$str() {
        return "显示这条消息并退出";
    }
    @Override
    protected String argInterProcessHcAddress$str() {
        return "主机控制器应该从进程控制器侦听通讯的地址";
    }
    @Override
    protected String argInterProcessHcPort$str() {
        return "主机控制器应该从进程控制器侦听通讯的端口";
    }
    @Override
    protected String argHostConfig$str() {
        return "要使用的主机配置文件的名称（默认为 \"host.xml\"）";
    }
    @Override
    protected String argReadOnlyHostConfig$str() {
        return "要使用的主机配置文件的名称。这和 '--host-config' 不同，因为初始文件从没有被覆盖。";
    }
    @Override
    protected String argPcAddress$str() {
        return "进程控制器从它控制的进程侦听通讯的地址";
    }
    @Override
    protected String argPcPort$str() {
        return "进程控制器从它控制的进程侦听通讯的端口";
    }
    @Override
    protected String argProperties$str() {
        return "从给定的 URL 里加载系统属性";
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
        return "将主机控制器的运行类型设为 ADMIN_ONLY 会导致它打开管理界面，并接受管理请求，但没有启动服务器，或者如果此主机控制器是域的主控制器，则接受来自辅助主机控制器的进入连接。";
    }
    @Override
    protected String argMasterAddress$str() {
        return "将系统属性 jboss.domain.primary.address 设为给定值。在默认的辅助主机控制器配置中，这用于配置主主机控制器的地址。";
    }
    @Override
    protected String argMasterPort$str() {
        return "将系统属性 jboss.domain.primary.port 设为给定值。在默认的辅助主机控制器配置中，这用于配置主主机控制器用于原生管理通信的端口。";
    }
    @Override
    protected String argSecMgr$str() {
        return "用安装的安全管理者运行服务器。";
    }
    @Override
    protected String argStability$str() {
        return "运行使用具体稳定性级别的服务器。可能的值：%1$s, Default = %2$s";
    }
    @Override
    protected String noArgValue$str() {
        return "WFLYPC0023: 没有为参数 %1$s 提供值";
    }
    @Override
    protected String invalidAuthKeyLen$str() {
        return "WFLYPC0025: 验证密钥必须为 24 位字节长";
    }
    @Override
    protected String invalidLength$str() {
        return "WFLYPC0029: %1$s 长度是无效的";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYPC0030: 无效选项：%1$s";
    }
    @Override
    protected String nullCommandComponent$str() {
        return "WFLYPC0031: 命令包含一个 null 组件";
    }
    @Override
    protected String failedToAcceptConnection$str() {
        return "WFLYPC0033: 无法接受连接";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYPC0034: 无法关闭资源 %1$s";
    }
    @Override
    protected String failedToCloseServerSocket$str() {
        return "WFLYPC0035: 无法关闭服务器套接字 %1$s";
    }
    @Override
    protected String failedToCloseSocket$str() {
        return "WFLYPC0036: 无法关闭套接字";
    }
    @Override
    protected String failedToHandleIncomingConnection$str() {
        return "WFLYPC0039: 无法处理进入的连接";
    }
    @Override
    protected String failedToHandleSocketFailure$str() {
        return "WFLYPC0040: 无法处理套接字失败条件";
    }
    @Override
    protected String failedToHandleSocketFinished$str() {
        return "WFLYPC0041: 无法处理套接字完成条件";
    }
    @Override
    protected String failedToHandleSocketShutdown$str() {
        return "WFLYPC0042: 无法处理套接字关闭条件";
    }
    @Override
    protected String failedToReadMessage$str() {
        return "WFLYPC0043: 无法读取信息";
    }
    @Override
    protected String leakedMessageOutputStream$str() {
        return "WFLYPC0044: 泄漏信息输出流，清除。";
    }
    @Override
    protected String failedToCreateServerThread$str() {
        return "WFLYPC0045: 无法创建服务器线程";
    }
    @Override
    protected String failedToReadObject$str() {
        return "WFLYPC0046: 无法读取对象";
    }
    @Override
    protected String invalidByte0$str() {
        return "WFLYPC0047: 无效的字节";
    }
    @Override
    protected String invalidByte2$str() {
        return "WFLYPC0048: 无效的字节：%1$s(%2$d)";
    }
    @Override
    protected String invalidByteToken$str() {
        return "WFLYPC0049: 无效字节令牌。需要 '%1$s'，得到的是 '%2$s'。";
    }
    @Override
    protected String invalidCommandByte$str() {
        return "WFLYPC0050: 无效命令字节读取：%1$s";
    }
    @Override
    protected String invalidStartChunk$str() {
        return "WFLYPC0051: 无效启动块开始 [%1$s]";
    }
    @Override
    protected String readBytes$str() {
        return "WFLYPC0056: 读取 %1$d 字节。";
    }
    @Override
    protected String streamClosed$str() {
        return "WFLYPC0058: 流关闭";
    }
    @Override
    protected String threadCreationRefused$str() {
        return "WFLYPC0059: 拒绝生成线程";
    }
    @Override
    protected String unexpectedEndOfStream$str() {
        return "WFLYPC0060: 意外流终止";
    }
    @Override
    protected String writeChannelClosed$str() {
        return "WFLYPC0061: 写入关闭的通道";
    }
    @Override
    protected String writesAlreadyShutdown$str() {
        return "WFLYPC0062: 写入已关闭";
    }
    @Override
    protected String attemptingToKillProcess$str() {
        return "WFLYPC0063: 进程 '%1$s' 在 %2$d 毫秒内未正常停止；尝试使用操作系统调用终止进程";
    }
    @Override
    protected String jpsCommandNotFound$str() {
        return "WFLYPC0064: 无法定位进程 '%1$s' -- 找不到 'jps' 命令";
    }
    @Override
    protected String processNotFound$str() {
        return "WFLYPC0065: 找不到可标识为 '%1$s' 的进程";
    }
    @Override
    protected String multipleProcessesFound$str() {
        return "WFLYPC0066: 找到多个可标识为 '%1$s' 的进程；无法安全执行操作系统级别终止";
    }
    @Override
    protected String destroyingProcess$str() {
        return "WFLYPC0067: 进程 '%1$s' 在 %2$d 毫秒内未正常停止；尝试使用 java.lang.Process.destroyForcibly() 破坏进程";
    }
}
