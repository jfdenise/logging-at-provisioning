package org.wildfly.iiop.openjdk.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:20+0200")
public class IIOPLogger_$logger_ja extends IIOPLogger_$logger implements IIOPLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public IIOPLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String duplicateRepositoryName$str() {
        return "WFLYIIOP0087: レポジトリ名が重複しています";
    }
    @Override
    protected String invalidEmptyName$str() {
        return "WFLYIIOP0037: 無効な空の名前";
    }
    @Override
    protected String errorDecodingPrincipalName$str() {
        return "WFLYIIOP0021: 受信プリンシパル名を解読できませんでした";
    }
    @Override
    protected String errorResolvingRefToImplementedInterface$str() {
        return "WFLYIIOP0096: ValueDef %1$s は実装済みインターフェース %2$s への参照を解決できません。";
    }
    @Override
    protected String failedToCreateNamingContext$str() {
        return "WFLYIIOP0005: CORBA ネーミングコンテキストの作成に失敗しました";
    }
    @Override
    protected String failedToLookupJSSEDomain$str() {
        return "WFLYIIOP0051: ドメインソケットファクトリの設定エラー: JSSE セキュリティドメインのルックアップに失敗しました";
    }
    @Override
    protected String unavailableISOLatin1Decoder$str() {
        return "WFLYIIOP0049: ISO-Latin-1 デコーダーを利用できません";
    }
    @Override
    protected String valueTypeCantBeProxy$str() {
        return "WFLYIIOP0076: 値の型 %1$s はプロキシや内部クラスになることはできません。";
    }
    @Override
    protected String errorParsingSASReply$str() {
        return "WFLYIIOP0016: SAS の返信を解析できませんでした: %1$s";
    }
    @Override
    protected String notAPrimitive$str() {
        return "WFLYIIOP0065: プリミティブ型ではありません: %1$s";
    }
    @Override
    protected String corbaNamingServiceStarted$str() {
        return "WFLYIIOP0008: CORBA ネーミングサービスを開始しました";
    }
    @Override
    protected String errorResolvingNSInitRef$str() {
        return "WFLYIIOP0029: ORB.resolve_initial_references(\"NameService\") は NamingContext を返しません";
    }
    @Override
    protected String ineffectiveAuthenticationContextConfiguration$str() {
        return "WFLYIIOP0113: 認証コンテキストは定義されていますが、セキュリティーイニシャライザーが 'elytron' に設定されていないため効果がありません";
    }
    @Override
    protected String invalidObjectReference$str() {
        return "WFLYIIOP0033: 無効なオブジェクト参照: %1$s";
    }
    @Override
    protected String nameCannotBeNullEmptyOrQualified$str() {
        return "WFLYIIOP0069: 名前は null、空あるいは、修飾できません";
    }
    @Override
    protected String badKindForSuperValueType$str() {
        return "WFLYIIOP0095: %1$s の super valuetype は不正な種類です。";
    }
    @Override
    protected String unavailableRMIPackages$str() {
        return "WFLYIIOP0048: javax.rmi パッケージは利用できません";
    }
    @Override
    protected String errorConstructingCNCtx$str() {
        return "WFLYIIOP0026: コンテキスト構築エラー: ORB あるいは NamingContext のいずれかが提供されなければなりません";
    }
    @Override
    protected String noReferenceFound$str() {
        return "WFLYIIOP0036: 指定の名前にバインドされたオブジェクト参照はありません";
    }
    @Override
    protected String errorGettingBindingList$str() {
        return "WFLYIIOP0024: バインディング一覧の取得エラー";
    }
    @Override
    protected String errorResolvingInitRef$str() {
        return "WFLYIIOP0098: 初期参照 %1$s の解決に失敗しました。";
    }
    @Override
    protected String duplicateTypeCodeForClass$str() {
        return "WFLYIIOP0091: クラス %1$s の TypeCode はすでに確立されています。";
    }
    @Override
    protected String inconsistentRequiredTransportConfig$str() {
        return "WFLYIIOP0106: 一貫性のない transport-config 設定: %1$s は true に設定されているため、%2$s は必須として設定してください";
    }
    @Override
    protected String unavailableSHADigest$str() {
        return "WFLYIIOP0071: SHA メッセージダイジェストを利用できません";
    }
    @Override
    protected String badRMIIIOPMethodSignature$str() {
        return "WFLYIIOP0068: インターフェースメソッドはすべて javax.rmi.RemoteException をスローしますが、インターフェース %2$s のメソッド %1$s はスローしません。";
    }
    @Override
    protected String missingSASContext$str() {
        return "WFLYIIOP0018: SAS コンテキストは存在しません";
    }
    @Override
    protected String invalidURLOrIOR$str() {
        return "WFLYIIOP0032: 無効な IOR あるいは URL: %1$s";
    }
    @Override
    protected String cannotAnalyzeStringType$str() {
        return "WFLYIIOP0073: java.lang.String を分析できません: 特例です";
    }
    @Override
    protected String errorDecodingInitContextToken$str() {
        return "WFLYIIOP0019: 初期コンテキストのトークンを解読できませんでした";
    }
    @Override
    protected String errorGeneratingObjectViaFactory$str() {
        return "WFLYIIOP0025: オブジェクトファクトリ経由でのオブジェクト生成エラー";
    }
    @Override
    protected String unexpectedException$str() {
        return "WFLYIIOP0014: 予期せぬ例外";
    }
    @Override
    protected String noMethodDefForPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0043: javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote) に対するメソッド定義がありません";
    }
    @Override
    protected String exceptionDestroingIterator$str() {
        return "WFLYIIOP0102: イテレーター %1$s を破棄するときに例外が発生しました";
    }
    @Override
    protected String errorConvertingIORToNamingCtx$str() {
        return "WFLYIIOP0028: IOR を NamingContext へ変換できません: %1$s";
    }
    @Override
    protected String logInternalError$str() {
        return "WFLYIIOP0004: 内部エラー";
    }
    @Override
    protected String notACorbaObject$str() {
        return "WFLYIIOP0035: org.omg.CORBA.Object のインスタンスのみをバインドできます";
    }
    @Override
    protected String errorMashalingParams$str() {
        return "WFLYIIOP0083: パラメーターをマーシャリングできません: 予期せぬパラメーター数";
    }
    @Override
    protected String notANamingContext$str() {
        return "WFLYIIOP0027: %1$s は NamingContext の名前を付けません";
    }
    @Override
    protected String errorMarshaling$str() {
        return "WFLYIIOP0081: %1$s のマーシャリングエラー";
    }
    @Override
    protected String elytronInitializerNotSupportedInPreviousVersions$str() {
        return "WFLYIIOP0114: Elytron セキュリティーイニシャライザーは以前のバージョンの iiop-openjdk ではサポートされず、変換できません";
    }
    @Override
    protected String collisionWhileCreatingPackage$str() {
        return "WFLYIIOP0092: パッケージ作成中に名前の矛盾がありました";
    }
    @Override
    protected String failedToStartJBossCOSNaming$str() {
        return "WFLYIIOP0054: JBoss Corba Naming Service の開始に失敗しました";
    }
    @Override
    protected String warnClassDescDoesNotConformToSpec$str() {
        return "WFLYIIOP0010: 互換性の問題: クラス javax.rmi.CORBA.ClassDesc は Java(TM) Language to IDL Mapping Specification (01-06-07) セクション 1.3.5.11 に準拠していません";
    }
    @Override
    protected String badKindForTypeCode$str() {
        return "WFLYIIOP0085: TypeCode の不正な種別 %1$d";
    }
    @Override
    protected String badRMIIIOPConstantType$str() {
        return "WFLYIIOP0066: インターフェース %2$s のフィールド %1$s は定数ですが、プリミティブでも文字列でもありません。";
    }
    @Override
    protected String errorDecodingContextData$str() {
        return "WFLYIIOP0022: %1$s のコンテキストデータを解読中の例外";
    }
    @Override
    protected String problemInvokingPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0041: PortableRemoteObject.toStub()に問題があります; オブジェクトがエクスポートされていないか、スタブが見つかりません";
    }
    @Override
    protected String cannotInvokeStubConnect$str() {
        return "WFLYIIOP0045: javax.rmi.CORBA.Stub.connect() を呼び出すことができません";
    }
    @Override
    protected String cannotObtainExceptionRepositoryID$str() {
        return "WFLYIIOP0082: %1$s の例外リポジトリー id を取得できません。";
    }
    @Override
    protected String wrongInterfaceRepository$str() {
        return "WFLYIIOP0086: 不正なインターフェースレポジトリ";
    }
    @Override
    protected String caughtExceptionEncodingGSSUPMechOID$str() {
        return "WFLYIIOP0003: GSSUPMechOID のエンコード中に例外を検出しました";
    }
    @Override
    protected String errorUnmarshaling$str() {
        return "WFLYIIOP0080: %1$s のアンマーシャリングエラー";
    }
    @Override
    protected String errorObtainingKeyManagers$str() {
        return "WFLYIIOP0052: セキュリティドメイン %1$s に対し、keyManager[] は null です。";
    }
    @Override
    protected String illegalBatchSize$str() {
        return "WFLYIIOP0023: バッチサイズが数値ではありません: %1$s";
    }
    @Override
    protected String cannotAnalyzeSpecialClass$str() {
        return "WFLYIIOP0061: 特別クラスを分析できません: %1$s";
    }
    @Override
    protected String valueTypeCantImplementRemote$str() {
        return "WFLYIIOP0075: 値の型 %1$s は java.rmi.Remote を実装できません。";
    }
    @Override
    protected String errorCreatingPOAFromParent$str() {
        return "WFLYIIOP0099: 親から POA の作成に失敗しました";
    }
    @Override
    protected String warnCouldNotDeactivateAnonIRObject$str() {
        return "WFLYIIOP0012: 無名の IR オブジェクトを非アクティブ化できませんでした";
    }
    @Override
    protected String problemInvokingStubConnect$str() {
        return "WFLYIIOP0044: javax.rmi.CORBA.Stub.connect() の呼び出しに問題があります";
    }
    @Override
    protected String noReadMethodInHelper$str() {
        return "WFLYIIOP0078: ヘルパークラス %1$s に read メソッドはありません。";
    }
    @Override
    protected String sslNotConfigured$str() {
        return "WFLYIIOP0103: IOR 設定では、ssl 接続の使用が示されていますが、セキュア接続は設定されていません";
    }
    @Override
    protected String unknownTypeCodeForClass$str() {
        return "WFLYIIOP0090: クラス %1$s の TypeCode は不明です。";
    }
    @Override
    protected String unknownPrimitiveType$str() {
        return "WFLYIIOP0072: 不明なプリミティブ型: %1$s";
    }
    @Override
    protected String cannotAnalyzeClassType$str() {
        return "WFLYIIOP0074: java.lang.Class を分析できません: 特例です";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYIIOP0118: レガシーセキュリティーはサポートされなくなりました。";
    }
    @Override
    protected String cannotCreateSSLSocket$str() {
        return "WFLYIIOP0109: サーバーには SSL ソケットが必要ですが、セキュアな接続が設定されていません";
    }
    @Override
    protected String inconsistentSupportedTransportConfig$str() {
        return "WFLYIIOP0104: 一貫性のない transport-config 設定: %1$s はサポートされますが、値 %2$s を設定してください";
    }
    @Override
    protected String inconsistentUnsupportedTransportConfig$str() {
        return "WFLYIIOP0105: 一貫性のない transport-config 設定: %1$s はサポートされないため、削除するか値 none を設定してください。";
    }
    @Override
    protected String errorSettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0058: TxServerInterceptor のスロット設定中の例外";
    }
    @Override
    protected String foreignTransaction$str() {
        return "WFLYIIOP0055: 外部のトランザクション";
    }
    @Override
    protected String noWriteMethodInHelper$str() {
        return "WFLYIIOP0079: ヘルパークラス %1$s に write メソッドはありません。";
    }
    @Override
    protected String errorConnectingToORB$str() {
        return "WFLYIIOP0031: ORB に接続できません";
    }
    @Override
    protected String notAnClassOrInterface$str() {
        return "WFLYIIOP0063: クラスあるいはインターフェースではありません: %1$s";
    }
    @Override
    protected String wontUseCleartextSocket$str() {
        return "WFLYIIOP0117: server-requires-ssl パラメーターが true に設定されたため、IIOP サブシステムの CLEARTEXT は使用されません";
    }
    @Override
    protected String invalidIIOPURLVersion$str() {
        return "WFLYIIOP0047: 無効な IIOP URL バージョン: %1$s";
    }
    @Override
    protected String invalidURIEncoding$str() {
        return "WFLYIIOP0050: 無効な URI エンコーディング: %1$s";
    }
    @Override
    protected String failedToGetSSLContext$str() {
        return "WFLYIIOP0053: SSL コンテキストの取得に失敗しました";
    }
    @Override
    protected String errorRegisteringSASCurrentInitRef$str() {
        return "WFLYIIOP0017: SASCurrent に対する初期参照を登録できませんでした";
    }
    @Override
    protected String errorEncodingContext$str() {
        return "WFLYIIOP0056: エンコード中に発行された例外";
    }
    @Override
    protected String errorLoadingClass$str() {
        return "WFLYIIOP0077: クラス %1$s のロードエラー";
    }
    @Override
    protected String badClassForConstant$str() {
        return "WFLYIIOP0089: 定数の不正なクラス %1$s";
    }
    @Override
    protected String cannotInvokePortableRemoteObjectToStub$str() {
        return "WFLYIIOP0042: javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote) を呼び出すことができません";
    }
    @Override
    protected String cannotAnalyzeNullClass$str() {
        return "WFLYIIOP0059: null クラスを分析できません";
    }
    @Override
    protected String badConstantType$str() {
        return "WFLYIIOP0060: 定数の不正な型: %1$s";
    }
    @Override
    protected String invalidPOACreationArgs$str() {
        return "WFLYIIOP0100: POA をインスタンス化できません: 実行中の ORB あるいは親 POA を指定する必要があります";
    }
    @Override
    protected String noSocketBindingsConfigured$str() {
        return "WFLYIIOP0115: 設定された IIOP ソケットバインディングはありません";
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYIIOP0119: ランタイム時のセキュリティーレルムの使用はサポート対象外です。";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYIIOP0001: IIOP サブシステムの有効化";
    }
    @Override
    protected String unescapedCharacter$str() {
        return "WFLYIIOP0038: %1$s: コンポーネントの最後でエスケープが解除されました。";
    }
    @Override
    protected String classIsNotArray$str() {
        return "WFLYIIOP0093: クラス %1$s はアレイクラスではありません。";
    }
    @Override
    protected String badRMIIIOPExceptionType$str() {
        return "WFLYIIOP0067: 例外型 %1$s は確認済みの例外クラスでなければなりません。";
    }
    @Override
    protected String invalidNullClass$str() {
        return "WFLYIIOP0088: 無効な null クラス";
    }
    @Override
    protected String notAnAccessor$str() {
        return "WFLYIIOP0062: アクセッサ−ではありません: %1$s";
    }
    @Override
    protected String errorDecodingTargetInContextToken$str() {
        return "WFLYIIOP0020: 初期コンテキストトークンの対象名を解読できませんでした";
    }
    @Override
    protected String notAnInterface$str() {
        return "WFLYIIOP0064: クラス %1$s はインターフェースではありません。";
    }
    @Override
    protected String runtimeSecurityDomainUnsupported$str() {
        return "WFLYIIOP0120: ランタイム時のセキュリティードメインの使用はサポート対象外です。";
    }
    @Override
    protected String serverDoesNotSupportSsl$str() {
        return "WFLYIIOP0110: クライアントには SSL が必要ですが、サーバーがサポートしていません";
    }
    @Override
    protected String noMethodDefForStubConnect$str() {
        return "WFLYIIOP0046: javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB) に対するメソッド定義がありません";
    }
    @Override
    protected String corbaORBServiceStarted$str() {
        return "WFLYIIOP0009: CORBA ORB サービスを開始しました";
    }
    @Override
    protected String failedToObtainJSSEDomain$str() {
        return "WFLYIIOP0007: 名前 %1$s を持つ JSSE セキュリティドメインの取得に失敗しました。";
    }
    @Override
    protected String primitivesHaveNoIRIds$str() {
        return "WFLYIIOP0070: プリミティブ型は IR ID がありません";
    }
    @Override
    protected String errorResolvingRefToAbstractValuetype$str() {
        return "WFLYIIOP0097: ValueDef %1$s は 抽象ベース valuetype %2$s への参照を解決できません。";
    }
    @Override
    protected String cannotDestroyRMIIIOPMapping$str() {
        return "WFLYIIOP0094: RMI/IIOP マッピングを破棄できません";
    }
    @Override
    protected String invalidURL$str() {
        return "WFLYIIOP0040: 無効な %1$s の URL: %2$s";
    }
    @Override
    protected String invalidEscapedCharacter$str() {
        return "WFLYIIOP0039: %1$s: 無効な文字がエスケープされました。";
    }
    @Override
    protected String cannotChangeRMIIIOPMapping$str() {
        return "WFLYIIOP0084: RMI/IIOP マッピングを変更できません";
    }
    @Override
    protected String warnCouldNotDeactivateIRObject$str() {
        return "WFLYIIOP0011: IR オブジェクトを非アクティブ化できませんでした";
    }
    @Override
    protected String failedToUnbindObject$str() {
        return "WFLYIIOP0006: %1$s のバインド解除に失敗しました。";
    }
    @Override
    protected String urlDoesNotContainIOR$str() {
        return "WFLYIIOP0034: %1$s には IOR が含まれていません。";
    }
    @Override
    protected String cosNamingNotRegisteredCorrectly$str() {
        return "WFLYIIOP0030: COS Name Service は ORB に 'NameService' という名前で登録されていません";
    }
    @Override
    protected String errorActivatingPOA$str() {
        return "WFLYIIOP0101: POA のアクティベートに失敗しました。";
    }
    @Override
    protected String failedToFetchCSIv2Policy$str() {
        return "WFLYIIOP0002: CSIv2Policy のフェッチエラー";
    }
    @Override
    protected String errorGettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0057: TxServerInterceptor のスロット取得中の例外";
    }
    @Override
    protected String unexpectedContextErrorInSASReply$str() {
        return "WFLYIIOP0015: SAS の返信で予期せぬ ContextError";
    }
}
