package org.wildfly.iiop.openjdk.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:20+0200")
public class IIOPLogger_$logger_zh_CN extends IIOPLogger_$logger_zh implements IIOPLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public IIOPLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String duplicateRepositoryName$str() {
        return "WFLYIIOP0087: 重复的库名称";
    }
    @Override
    protected String invalidEmptyName$str() {
        return "WFLYIIOP0037: 无效的空名字";
    }
    @Override
    protected String errorDecodingPrincipalName$str() {
        return "WFLYIIOP0021: 无法解码转入 principal 名称";
    }
    @Override
    protected String errorResolvingRefToImplementedInterface$str() {
        return "WFLYIIOP0096: ValueDef %1$s 无法解析到实现接口 %2$s 的引用";
    }
    @Override
    protected String failedToCreateNamingContext$str() {
        return "WFLYIIOP0005: 创建 CORBA 命名上下文失败";
    }
    @Override
    protected String failedToLookupJSSEDomain$str() {
        return "WFLYIIOP0051: 配置域套接字工厂出错：查找 JSSE 安全域失败";
    }
    @Override
    protected String unavailableISOLatin1Decoder$str() {
        return "WFLYIIOP0049: ISO-Latin-1 解码器不可用";
    }
    @Override
    protected String valueTypeCantBeProxy$str() {
        return "WFLYIIOP0076: 值类型 %1$s 不能是代理或 inner 类";
    }
    @Override
    protected String errorParsingSASReply$str() {
        return "WFLYIIOP0016: 无法解析 SAS 回复：%1$s";
    }
    @Override
    protected String notAPrimitive$str() {
        return "WFLYIIOP0065: 非原始类型: %1$s";
    }
    @Override
    protected String corbaNamingServiceStarted$str() {
        return "WFLYIIOP0008: CORBA 命名服务已启动";
    }
    @Override
    protected String errorResolvingNSInitRef$str() {
        return "WFLYIIOP0029: ORB.resolve_initial_references(\"NameService\") 没有返回 NamingContext";
    }
    @Override
    protected String ineffectiveAuthenticationContextConfiguration$str() {
        return "WFLYIIOP0113: 已定义验证上下文，但它无效，因为安全初始值未设置为 'elytron'";
    }
    @Override
    protected String invalidObjectReference$str() {
        return "WFLYIIOP0033: 无效的对象引用：%1$s";
    }
    @Override
    protected String nameCannotBeNullEmptyOrQualified$str() {
        return "WFLYIIOP0069: 名字不能为 null、空的或限定的";
    }
    @Override
    protected String badKindForSuperValueType$str() {
        return "WFLYIIOP0095: %1$s 的超 valuetype 的错误类型";
    }
    @Override
    protected String unavailableRMIPackages$str() {
        return "WFLYIIOP0048: javax.rmi 软件包不可用";
    }
    @Override
    protected String errorConstructingCNCtx$str() {
        return "WFLYIIOP0026: 构建上下文出错：必须提供 ORB 或 NamingContext";
    }
    @Override
    protected String noReferenceFound$str() {
        return "WFLYIIOP0036: 对于指定的名称没有绑定对象引用";
    }
    @Override
    protected String errorGettingBindingList$str() {
        return "WFLYIIOP0024: 获得绑定列表出错";
    }
    @Override
    protected String errorResolvingInitRef$str() {
        return "WFLYIIOP0098: 解析初始的引用 %1$s 失败";
    }
    @Override
    protected String duplicateTypeCodeForClass$str() {
        return "WFLYIIOP0091: 类 %1$s 的 TypeCode 已经建立";
    }
    @Override
    protected String inconsistentRequiredTransportConfig$str() {
        return "WFLYIIOP0106: 不一致的 transport-config 配置：%1$s 设置为 true，请将 %2$s 配置为必需";
    }
    @Override
    protected String unavailableSHADigest$str() {
        return "WFLYIIOP0071: 没有可用的 SHA 消息摘要";
    }
    @Override
    protected String badRMIIIOPMethodSignature$str() {
        return "WFLYIIOP0068: 接口方法必须抛出 javax.rmi.RemoteException，但接口 %1$s 的方法 %2$s 并没有";
    }
    @Override
    protected String missingSASContext$str() {
        return "WFLYIIOP0018: SAS 上下文不存在";
    }
    @Override
    protected String invalidURLOrIOR$str() {
        return "WFLYIIOP0032: 无效的 IOR 或 URL：%1$s";
    }
    @Override
    protected String cannotAnalyzeStringType$str() {
        return "WFLYIIOP0073: 无法分析 java.lang.String：这是一个特例";
    }
    @Override
    protected String errorDecodingInitContextToken$str() {
        return "WFLYIIOP0019: 无法解码初始的上下文令牌";
    }
    @Override
    protected String errorGeneratingObjectViaFactory$str() {
        return "WFLYIIOP0025: 通过对象工厂生成对象出错";
    }
    @Override
    protected String unexpectedException$str() {
        return "WFLYIIOP0014: 意外的异常";
    }
    @Override
    protected String noMethodDefForPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0043: 没有定义 javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote) 方法";
    }
    @Override
    protected String exceptionDestroingIterator$str() {
        return "WFLYIIOP0102: 销毁 Iterator %1$s 时捕获异常";
    }
    @Override
    protected String errorConvertingIORToNamingCtx$str() {
        return "WFLYIIOP0028: 无法把 IOR 转换为 NamingContext: %1$s";
    }
    @Override
    protected String logInternalError$str() {
        return "WFLYIIOP0004: 内部错误";
    }
    @Override
    protected String notACorbaObject$str() {
        return "WFLYIIOP0035: 只可以绑定 org.omg.CORBA.Object 的实例";
    }
    @Override
    protected String errorMashalingParams$str() {
        return "WFLYIIOP0083: 无法对参数解码：参数个数不对";
    }
    @Override
    protected String notANamingContext$str() {
        return "WFLYIIOP0027: %1$s 没有命名 NamingContext";
    }
    @Override
    protected String errorMarshaling$str() {
        return "WFLYIIOP0081: 对 %1$s 编码出错";
    }
    @Override
    protected String elytronInitializerNotSupportedInPreviousVersions$str() {
        return "WFLYIIOP0114: 以前的 iiop-openjdk 版本不支持 Elytron 安全初始值，无法转换";
    }
    @Override
    protected String collisionWhileCreatingPackage$str() {
        return "WFLYIIOP0092: 创建软件包时出现名称冲突";
    }
    @Override
    protected String failedToStartJBossCOSNaming$str() {
        return "WFLYIIOP0054: 启动 JBoss Corba 命名服务失败";
    }
    @Override
    protected String warnClassDescDoesNotConformToSpec$str() {
        return "WFLYIIOP0010: 兼容性问题：类 javax.rmi.CORBA.ClassDesc 没有遵循 Java(TM) 语言的 IDL Mapping 规格 (01-06-07), 章节 1.3.5.11";
    }
    @Override
    protected String badKindForTypeCode$str() {
        return "WFLYIIOP0085: TypeCode 的错误类型 %1$d";
    }
    @Override
    protected String badRMIIIOPConstantType$str() {
        return "WFLYIIOP0066: 接口 %2$s 的字段 %1$s 是一个常量，但不是原始类型或字符串";
    }
    @Override
    protected String errorDecodingContextData$str() {
        return "WFLYIIOP0022: 解码 %1$s 里的上下文数据抛出异常";
    }
    @Override
    protected String problemInvokingPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0041: PortableRemoteObject.toStub() 出现问题；未到处对象或没有找到 stub";
    }
    @Override
    protected String cannotInvokeStubConnect$str() {
        return "WFLYIIOP0045: 无法调用 javax.rmi.CORBA.Stub.connect()";
    }
    @Override
    protected String cannotObtainExceptionRepositoryID$str() {
        return "WFLYIIOP0082: 无法获得 %1$s 的异常库 ID";
    }
    @Override
    protected String wrongInterfaceRepository$str() {
        return "WFLYIIOP0086: 错误的接口库";
    }
    @Override
    protected String caughtExceptionEncodingGSSUPMechOID$str() {
        return "WFLYIIOP0003: 当对 GSSUPMechOID 编码时捕获异常";
    }
    @Override
    protected String errorUnmarshaling$str() {
        return "WFLYIIOP0080: 对 %1$s 解码出错";
    }
    @Override
    protected String errorObtainingKeyManagers$str() {
        return "WFLYIIOP0052: 安全域 %1$s 的 keyManager[] 为空";
    }
    @Override
    protected String illegalBatchSize$str() {
        return "WFLYIIOP0023: 批次大小不是数值：%1$s";
    }
    @Override
    protected String cannotAnalyzeSpecialClass$str() {
        return "WFLYIIOP0061: 无法分析特殊类：%1$s";
    }
    @Override
    protected String valueTypeCantImplementRemote$str() {
        return "WFLYIIOP0075: 值类型 %1$s 无法实现 java.rmi.Remote";
    }
    @Override
    protected String errorCreatingPOAFromParent$str() {
        return "WFLYIIOP0099: 从父节点创建 POA 失败";
    }
    @Override
    protected String warnCouldNotDeactivateAnonIRObject$str() {
        return "WFLYIIOP0012: 无法取消激活匿名的 IR 对象";
    }
    @Override
    protected String problemInvokingStubConnect$str() {
        return "WFLYIIOP0044: 调用 javax.rmi.CORBA.Stub.connect() 出现问题";
    }
    @Override
    protected String noReadMethodInHelper$str() {
        return "WFLYIIOP0078: 在 helper 类 %1$s 里没有 read 方法";
    }
    @Override
    protected String sslNotConfigured$str() {
        return "WFLYIIOP0103: IOR 设置暗示使用 SSL 连接，但还未配置安全连接";
    }
    @Override
    protected String unknownTypeCodeForClass$str() {
        return "WFLYIIOP0090: 类 %1$s 的 TypeCode 是未知的";
    }
    @Override
    protected String unknownPrimitiveType$str() {
        return "WFLYIIOP0072: 未知的原始类型: %1$s";
    }
    @Override
    protected String cannotAnalyzeClassType$str() {
        return "WFLYIIOP0074: 无法分析 java.lang.Class：这是一个特例";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYIIOP0118: 传统的安全不再被支持。";
    }
    @Override
    protected String cannotCreateSSLSocket$str() {
        return "WFLYIIOP0109: 服务器要求使用 SSL 套接字，但未配置安全连接";
    }
    @Override
    protected String inconsistentSupportedTransportConfig$str() {
        return "WFLYIIOP0104: 不一致的 transport-config 配置：支持 %1$s，请将其配置为 %2$s 值";
    }
    @Override
    protected String inconsistentUnsupportedTransportConfig$str() {
        return "WFLYIIOP0105: 不一致的 transport-config 配置：不支持 %1$s，请移除它或将其未配置为 NONE 值";
    }
    @Override
    protected String errorSettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0058: 设置 TxServerInterceptor 里的 slot 时抛出异常";
    }
    @Override
    protected String foreignTransaction$str() {
        return "WFLYIIOP0055: 外部事务";
    }
    @Override
    protected String noWriteMethodInHelper$str() {
        return "WFLYIIOP0079: 在 helper 类 %1$s 里没有 write 方法";
    }
    @Override
    protected String errorConnectingToORB$str() {
        return "WFLYIIOP0031: 无法连接至 ORB";
    }
    @Override
    protected String notAnClassOrInterface$str() {
        return "WFLYIIOP0063: 不是接口或类：%1$s";
    }
    @Override
    protected String wontUseCleartextSocket$str() {
        return "WFLYIIOP0117: 不会使用 IIOP 子系统中的 CLEARTEXT，因为 server-requires-ssl 参数已设置为 true";
    }
    @Override
    protected String invalidIIOPURLVersion$str() {
        return "WFLYIIOP0047: 无效的 IIOP URL 版本: %1$s";
    }
    @Override
    protected String invalidURIEncoding$str() {
        return "WFLYIIOP0050: 无效的 URI 编码：%1$s";
    }
    @Override
    protected String failedToGetSSLContext$str() {
        return "WFLYIIOP0053: 获取 SSL 上下文失败";
    }
    @Override
    protected String errorRegisteringSASCurrentInitRef$str() {
        return "WFLYIIOP0017: 无法注册 SASCurrent 的初始引用";
    }
    @Override
    protected String errorEncodingContext$str() {
        return "WFLYIIOP0056: 编码时抛出异常";
    }
    @Override
    protected String errorLoadingClass$str() {
        return "WFLYIIOP0077: 加载类 %1$s 出错";
    }
    @Override
    protected String badClassForConstant$str() {
        return "WFLYIIOP0089: 用于常量的错误类 %1$s";
    }
    @Override
    protected String cannotInvokePortableRemoteObjectToStub$str() {
        return "WFLYIIOP0042: 无法调用 javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote)";
    }
    @Override
    protected String cannotAnalyzeNullClass$str() {
        return "WFLYIIOP0059: 无法分析 null 类";
    }
    @Override
    protected String badConstantType$str() {
        return "WFLYIIOP0060: 常量的错误类型：%1$s";
    }
    @Override
    protected String invalidPOACreationArgs$str() {
        return "WFLYIIOP0100: 无法初始化 POA：必须指定运行的 ORB 或父 POA";
    }
    @Override
    protected String noSocketBindingsConfigured$str() {
        return "WFLYIIOP0115: 尚未配置 IIOP 套接字绑定";
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYIIOP0119: 不支持在运行时使用安全域。";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYIIOP0001: 激活 IIOP 子系统";
    }
    @Override
    protected String unescapedCharacter$str() {
        return "WFLYIIOP0038: %1$s: 组件尾未转义";
    }
    @Override
    protected String classIsNotArray$str() {
        return "WFLYIIOP0093: 类 %1$s 不是一个数组类";
    }
    @Override
    protected String badRMIIIOPExceptionType$str() {
        return "WFLYIIOP0067: 异常类型 %1$s 必须是一个已检查的异常类";
    }
    @Override
    protected String invalidNullClass$str() {
        return "WFLYIIOP0088: 无效的 null 类";
    }
    @Override
    protected String notAnAccessor$str() {
        return "WFLYIIOP0062: 不是一个 accessor：%1$s";
    }
    @Override
    protected String errorDecodingTargetInContextToken$str() {
        return "WFLYIIOP0020: 无法解码初始上下文令牌里的目标名";
    }
    @Override
    protected String notAnInterface$str() {
        return "WFLYIIOP0064: 类 %1$s 不是一个接口";
    }
    @Override
    protected String runtimeSecurityDomainUnsupported$str() {
        return "WFLYIIOP0120: 不支持在运行时使用安全域。";
    }
    @Override
    protected String serverDoesNotSupportSsl$str() {
        return "WFLYIIOP0110: 客户端要求使用 SSL，但服务器不支持 SSL";
    }
    @Override
    protected String noMethodDefForStubConnect$str() {
        return "WFLYIIOP0046: 未定义 javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB) 方法";
    }
    @Override
    protected String corbaORBServiceStarted$str() {
        return "WFLYIIOP0009: CORBA ORB 服务已启动";
    }
    @Override
    protected String failedToObtainJSSEDomain$str() {
        return "WFLYIIOP0007: 获取名为 %1$s 的 JSSE 安全域失败";
    }
    @Override
    protected String primitivesHaveNoIRIds$str() {
        return "WFLYIIOP0070: 原始类型没有 IR ID";
    }
    @Override
    protected String errorResolvingRefToAbstractValuetype$str() {
        return "WFLYIIOP0097: ValueDef %1$s 无法解析到抽象基础 valuetype %2$s 的引用";
    }
    @Override
    protected String cannotDestroyRMIIIOPMapping$str() {
        return "WFLYIIOP0094: 无法销毁 RMI/IIOP 映射";
    }
    @Override
    protected String invalidURL$str() {
        return "WFLYIIOP0040: 无效的 %1$s URL: %2$s";
    }
    @Override
    protected String invalidEscapedCharacter$str() {
        return "WFLYIIOP0039: %1$s: 无效字符被转义";
    }
    @Override
    protected String cannotChangeRMIIIOPMapping$str() {
        return "WFLYIIOP0084: 无法修改 RMI/IIOP 映射";
    }
    @Override
    protected String warnCouldNotDeactivateIRObject$str() {
        return "WFLYIIOP0011: 无法取消激活 IR 对象";
    }
    @Override
    protected String failedToUnbindObject$str() {
        return "WFLYIIOP0006: 取消 %1$s 的绑定失败";
    }
    @Override
    protected String urlDoesNotContainIOR$str() {
        return "WFLYIIOP0034: %1$s 没有包含 IOR";
    }
    @Override
    protected String cosNamingNotRegisteredCorrectly$str() {
        return "WFLYIIOP0030: COS 名称服务没有注册在 ORB 的名称 'NameService' 下";
    }
    @Override
    protected String errorActivatingPOA$str() {
        return "WFLYIIOP0101: 激活 POA 失败";
    }
    @Override
    protected String failedToFetchCSIv2Policy$str() {
        return "WFLYIIOP0002: 获取 CSIv2Policy 出错";
    }
    @Override
    protected String errorGettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0057: 获取 TxServerInterceptor 里的 slot 时抛出异常";
    }
    @Override
    protected String unexpectedContextErrorInSASReply$str() {
        return "WFLYIIOP0015: SAS 回复里出现意外的 ContextError";
    }
}
