package org.wildfly.extension.elytron._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:14+0200")
public class ElytronSubsystemMessages_$logger_ja extends ElytronSubsystemMessages_$logger implements ElytronSubsystemMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronSubsystemMessages_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String duplicateRealmInjection$str() {
        return "WFLYELY00002: 単一のセキュリティードメインに同じレルム '%1$s' をインジェクトできません。";
    }
    @Override
    protected String operationAddressMissingKey$str() {
        return "WFLYELY00003: 操作に '%1$s' の値を持つアドレスが含まれていませんでした。";
    }
    @Override
    protected String unableToStartService$str() {
        return "WFLYELY00004: サービスを起動できません。";
    }
    @Override
    protected String unableToAccessKeyStore$str() {
        return "WFLYELY00005: 要求された操作を完了するために KeyStore にアクセスすることができません。";
    }
    @Override
    protected String requiredServiceNotUp$str() {
        return "WFLYELY00007: 要求されたサービス '%1$s' は UP の状態ではなく、現在 '%2$s' の状態です。";
    }
    @Override
    protected String invalidOperationName$str() {
        return "WFLYELY00008: 無効な操作名 '%1$s'、 '%2$s' の 1 つが想定されていました。";
    }
    @Override
    protected String unableToCompleteOperation$str() {
        return "WFLYELY00009: 操作を完了できません。 '%1$s'";
    }
    @Override
    protected String cantSaveWithoutFile$str() {
        return "WFLYELY00010: KeyStore を保存できません - KeyStore ファイル '%1$s' は存在しません。";
    }
    @Override
    protected String noSuitableProvider$str() {
        return "WFLYELY00012: 型 '%1$s' に適したプロバイダーが見つかりません。";
    }
    @Override
    protected String defaultRealmNotReferenced$str() {
        return "WFLYELY00013: デフォルトレルム '%1$s' は、このドメインによって参照されるレルムのリスト [%2$s] にありません。";
    }
    @Override
    protected String unableToLoadPropertiesFiles$str() {
        return "WFLYELY00014: プロパティーファイルによってバックアップされるレルムの開始に必要なプロパティーファイルをロードできません: ユーザーファイル: '%1$s' グループファイル: '%2$s'";
    }
    @Override
    protected String componentNotConfigurable$str() {
        return "WFLYELY00015: カスタムコンポーネント実装 '%1$s' は initialize(Map<String, String>) メソッドを実装しませんが、設定は提供されています。";
    }
    @Override
    protected String invalidRegularExpression$str() {
        return "WFLYELY00016: 指定の正規表現 '%1$s' は無効です。";
    }
    @Override
    protected String propertyFilesDoesNotExist$str() {
        return "WFLYELY00017: プロパティーレルムで参照されるプロパティーファイルが存在しません: %1$s";
    }
    @Override
    protected String unableToCreateManagerFactory$str() {
        return "WFLYELY00018: アルゴリズム '%2$s' の %1$s を作成できません。";
    }
    @Override
    protected String noTypeFound$str() {
        return "WFLYELY00019: インジェクトされた値に '%1$s' がありません。";
    }
    @Override
    protected String unableToReLoadPropertiesFiles$str() {
        return "WFLYELY00020: プロパティーファイルによってバックアップされるレルムが必要とするプロパティーファイルをリロードできません。";
    }
    @Override
    protected String exceptionWhileCreatingPermission$str() {
        return "WFLYELY00021: パーミッションマッピングのパーミッションオブジェクトの作成中に例外が発生しました。 [%1$s] の [class-name]、[target-name] (パーンミッションの名前) および [action] をチェックしてください。";
    }
    @Override
    protected String keyStoreFileNotExists$str() {
        return "WFLYELY00022: KeyStore ファイル '%1$s' は存在しませんが、必要です。";
    }
    @Override
    protected String keyStoreFileNotExistsButIgnored$str() {
        return "WFLYELY00023: KeyStore ファイル '%1$s' は存在しません。空白を使用しました。";
    }
    @Override
    protected String certificateNotValid$str() {
        return "WFLYELY00024: KeyStore の証明書 [%1$s] は無効です";
    }
    @Override
    protected String propertyFileIsInvalid$str() {
        return "WFLYELY00025: 参照されたプロパティーファイルは無効です: %1$s";
    }
    @Override
    protected String unableToObtainOidForX500Attribute$str() {
        return "WFLYELY00027: X.500 属性 '%1$s' の OID を取得できません";
    }
    @Override
    protected String x500AttributeMustBeDefined$str() {
        return "WFLYELY00028: X.500 属性は名前または OID で定義する必要があります";
    }
    @Override
    protected String invalidURL$str() {
        return "WFLYELY00029: URL '%1$s' の解析に失敗しました";
    }
    @Override
    protected String realmDoesNotSupportCache$str() {
        return "WFLYELY00030: レルム '%1$s' はキャッシュをサポートしません";
    }
    @Override
    protected String unableToAccessCRL$str() {
        return "WFLYELY00031: CRL ファイルにアクセスできません。";
    }
    @Override
    protected String unableToReloadCRL$str() {
        return "WFLYELY00032: CRL ファイルをリロードできません。";
    }
    @Override
    protected String unableToAccessEntryFromKeyStore$str() {
        return "WFLYELY00033: キーストア [%2$s] からエントリー [%1$s] にアクセスできません。";
    }
    @Override
    protected String jdbcRealmOnlySingleKeyMapperAllowed$str() {
        return "WFLYELY00034: プリンシパルクエリーでは単一のキーマッパーのみを指定できます";
    }
    @Override
    protected String unableToLoadModule$str() {
        return "WFLYELY00035: モジュール '%1$s' をロードできません。";
    }
    @Override
    protected String realmRefererencedTwice$str() {
        return "WFLYELY00036: セキュリティーレルム '%1$s' は同じセキュリティードメインで 2 度参照されました。";
    }
    @Override
    protected String invalidTypeInjected$str() {
        return "WFLYELY00037: インジェクトされた値は '%1$s' 型ではありません。";
    }
    @Override
    protected String invalidPermissionClass$str() {
        return "WFLYELY00038: パーミッションクラス '%1$s' をロードできませんでした。";
    }
    @Override
    protected String unableToReloadCRLNotReloadable$str() {
        return "WFLYELY00039: CRL ファイルをリロードできません - TrustManager はリロード可能でありません。";
    }
    @Override
    protected String invalidPermissionModule$str() {
        return "WFLYELY00040: パーミッションマッピングにパーミッションモジュール %1$s をロードできません。";
    }
    @Override
    protected String unableToTransformTornAttribute$str() {
        return "WFLYELY00041: 設定をターゲットバージョンに変換できません - 属性 '%1$s' は '%2$s' とは異なります。";
    }
    @Override
    protected String unableToTransformMultipleRealms$str() {
        return "WFLYELY00042: 複数の 'authorization-realms' を 1 つの値に変換できません。";
    }
    @Override
    protected String cycleDetected$str() {
        return "WFLYELY00043: リソースの初期化サイクルが検出されました: %1$s";
    }
    @Override
    protected String invalidServiceNameParent$str() {
        return "WFLYELY00044: サービス名の親の予期しない名前 - %1$s";
    }
    @Override
    protected String failedToLoadCallbackhandlerFromProvidedModule$str() {
        return "WFLYELY00045: 指定されたモジュールから CallbackHandler をロードできませんでした。";
    }
    @Override
    protected String jaasFileDoesNotExist$str() {
        return "WFLYELY00046: JAAS 設定ファイルへの指定されたパス '%1$s' は存在しません。";
    }
    @Override
    protected String ldapRealmDirectVerificationAndUserPasswordMapper$str() {
        return "WFLYELY00047: LDAP レルムは direct-verification および user-password-mapper を使用するように設定されていますが、これは無効な設定です。";
    }
    @Override
    protected String representationOfX500IsRequired$str() {
        return "WFLYELY00048: X.500 識別名の文字列表現が必要です: %1$s。";
    }
    @Override
    protected String jaasEntryNotDefined$str() {
        return "WFLYELY00049: エントリーが定義されていません。";
    }
    @Override
    protected String cachedRealmServiceNotAvailable$str() {
        return "WFLYELY00050: レルムが利用できません。キャッシュをフラッシュできません。";
    }
    @Override
    protected String credentialStoreEntryTypeNotSupported$str() {
        return "WFLYELY00909: クレデンシャルストア '%1$s' は指定のクレデンシャルストアエントリータイプ '%2$s' をサポートしません。";
    }
    @Override
    protected String keyStorePasswordCannotBeResolved$str() {
        return "WFLYELY00910: パスワードはキーストア '%1$s' に対して解決できません";
    }
    @Override
    protected String credentialStoreProtectionParameterCannotBeResolved$str() {
        return "WFLYELY00911: クレデンシャルストアの '%1$s' 保護パラメーターを解決できません";
    }
    @Override
    protected String credentialAlreadyExists$str() {
        return "WFLYELY00913: クレデンシャルタイプ '%2$s' のクレデンシャルエイリアス '%1$s' はすでにストアに存在します";
    }
    @Override
    protected String providerLoaderCannotSupplyProvider$str() {
        return "WFLYELY00914: プロバイダーローダー '%1$s' はタイプ '%2$s' のクレデンシャルストアプロバイダーを提供できません。";
    }
    @Override
    protected String credentialCannotBeResolved$str() {
        return "WFLYELY00916: クレデンシャルは解決できません";
    }
    @Override
    protected String dirContextPasswordCannotBeResolved$str() {
        return "WFLYELY00917: dir-context に対してパスワードを解決できません";
    }
    @Override
    protected String credentialDoesNotExist$str() {
        return "WFLYELY00920: クレデンシャルタイプ '%2$s' のクレデンシャルエイリアス '%1$s' はストアに存在しません";
    }
    @Override
    protected String filebasedKeystoreLocationMissing$str() {
        return "WFLYELY00921: ロケーションパラメーターは、ファイルベースのキーストアタイプ '%1$s' には指定されていません。";
    }
    @Override
    protected String reloadDependantServices$str() {
        return "秘密の値をすでにキャッシュした可能性がある依存サービスをリロードします";
    }
    @Override
    protected String updateDependantServices$str() {
        return "エイリアス '%1$s' が存在しなくなったため、依存リソースをアップデートします。";
    }
    @Override
    protected String unableToLoadCredential$str() {
        return "WFLYELY00922: 認証情報ストアから認証情報をロードできません。";
    }
    @Override
    protected String unableToEncryptClearText$str() {
        return "WFLYELY00923: 指定されたクリアテキストを暗号化できません。";
    }
    @Override
    protected String unableToCreateCredentialStoreImmediately$str() {
        return "WFLYELY00924: 即座に利用可能な認証情報ストアを作成できません。";
    }
    @Override
    protected String unableToReloadCredentialStore$str() {
        return "WFLYELY00925: 認証情報ストアをリロードできません。";
    }
    @Override
    protected String unableToInitialiseCredentialStore$str() {
        return "WFLYELY00926: 認証情報ストアを初期化できません。";
    }
    @Override
    protected String secretKeyOperationFailed$str() {
        return "WFLYELY00927: 秘密鍵操作 '%1$s' は、'%2$s' により完了できませんでした。";
    }
    @Override
    protected String identityAlreadyExists$str() {
        return "WFLYELY01000: 名前 [%1$s] を持つアイデンティティーはすでに存在します。";
    }
    @Override
    protected String couldNotCreateIdentity$str() {
        return "WFLYELY01001: 名前が [%1$s] のアイデンティティーを作成できませんでした。";
    }
    @Override
    protected String identityNotFound$str() {
        return "WFLYELY01002: 名前が [%1$s] のアイデンティティーは見つかりません。";
    }
    @Override
    protected String couldNotDeleteIdentity$str() {
        return "WFLYELY01003: 名前が [%1$s] のアイデンティティーを削除できませんでした。";
    }
    @Override
    protected String identityNotAuthorized$str() {
        return "WFLYELY01004: 名前が [%1$s] のアイデンティティーが承認されませんでした。";
    }
    @Override
    protected String couldNotReadIdentity2$str() {
        return "WFLYELY01005: セキュリティードメイン [%2$s] からアイデンティティー [%1$s] を読み取りできませんでした。";
    }
    @Override
    protected String couldNotReadIdentity1$str() {
        return "WFLYELY01007: 名前が [%1$s] のアイデンティティーを読み取りできませんでした。";
    }
    @Override
    protected String couldNotObtainAuthorizationIdentity$str() {
        return "WFLYELY01008: 承認アイデンティティーを取得できませんでした。";
    }
    @Override
    protected String couldNotAddAttribute$str() {
        return "WFLYELY01009: 属性を追加できませんでした。";
    }
    @Override
    protected String couldNotRemoveAttribute$str() {
        return "WFLYELY01010: 属性を削除できませんでした。";
    }
    @Override
    protected String couldNotCreatePassword$str() {
        return "WFLYELY01011: パスワードを作成できませんでした。";
    }
    @Override
    protected String unexpectedPasswordType$str() {
        return "WFLYELY01012: 予期せぬパスワードタイプ [%1$s]。";
    }
    @Override
    protected String patternRequiresCaptureGroup$str() {
        return "WFLYELY01013: パターン [%1$s] にはキャプチャーグループが必要です";
    }
    @Override
    protected String invalidDefinition$str() {
        return "WFLYELY01014: 無効な [%1$s] 定義。フィルターリストの 1 つのオブジェクトに '%2$s' または '%3$s' の 1 つのみを設定できます。";
    }
    @Override
    protected String unableToPerformOutflow$str() {
        return "WFLYELY01015: '%1$s' の自動アウトフローを実行できません";
    }
    @Override
    protected String serverNotKnown$str() {
        return "WFLYELY01016: '%1$s' は未知のサーバーです";
    }
    @Override
    protected String invalidCipherSuiteFilter$str() {
        return "WFLYELY01017: cipher-suite-filter の値が無効です。%1$s";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYELY01018: 無効なサイズ %1$s";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYELY01019: 接尾辞 (%1$s) に秒またはミリ秒を含むことはできません。";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYELY01020: 接尾辞 (%1$s) は無効です。接尾辞は有効な日付形式でなければなりません。";
    }
    @Override
    protected String failedToSetPolicy$str() {
        return "WFLYELY01022: ポリシー [%1$s] の設定に失敗しました";
    }
    @Override
    protected String cannotFindPolicyProvider$str() {
        return "WFLYELY01023: [%1$s] という名前のポリシープロバイダーは見つかりませんでした";
    }
    @Override
    protected String failedToRegisterPolicyHandlers$str() {
        return "WFLYELY01024: ポリシーコンテキストハンドラーの登録に失敗しました";
    }
    @Override
    protected String failedToCreatePolicy$str() {
        return "WFLYELY01025: ポリシー [%1$s] の作成に失敗しました";
    }
    @Override
    protected String discardingUnusedPolicy$str() {
        return "WFLYELY01026: %3$s に設定された属性 %2$s を持つ要素 %1$s は使用されていません。未使用のポリシー設定は設定モデルに格納できなくなったため、この項目は破棄されます。";
    }
    @Override
    protected String keyPasswordCannotBeResolved$str() {
        return "WFLYELY01027: キーパスワードはキーストア '%1$s' に対して解決できません";
    }
    @Override
    protected String invalidNotBefore$str() {
        return "WFLYELY01028: not-before の無効な値。%1$s";
    }
    @Override
    protected String keyStoreAliasDoesNotExist$str() {
        return "WFLYELY01029: エイリアス '%1$s' は KeyStore に存在しません";
    }
    @Override
    protected String keyStoreAliasDoesNotIdentifyPrivateKeyEntry$str() {
        return "WFLYELY01030: エイリアス '%1$s' は KeyStore の PrivateKeyEntry を識別しません";
    }
    @Override
    protected String unableToObtainPrivateKey$str() {
        return "WFLYELY01031: エイリアス '%1$s' の PrivateKey を取得できません";
    }
    @Override
    protected String unableToObtainCertificate$str() {
        return "WFLYELY01032: エイリアス '%1$s' の証明書を取得できません";
    }
    @Override
    protected String noCertificatesFoundInCertificateReply$str() {
        return "WFLYELY01033: 証明書のリプライで証明書が見つかりませんでした";
    }
    @Override
    protected String publicKeyFromCertificateReplyDoesNotMatchKeyStore$str() {
        return "WFLYELY01034: 証明書のリプライからのパブリックキーは、KeyStore の証明書からのパブリックキーと一致しません。";
    }
    @Override
    protected String certificateReplySameAsCertificateFromKeyStore$str() {
        return "WFLYELY01035: 証明書のリプライは KeyStore の PrivateKeyEntry からの証明書と同じです";
    }
    @Override
    protected String keyStoreAliasAlreadyExists$str() {
        return "WFLYELY01036: エイリアス '%1$s' はすでに KeyStore に存在します";
    }
    @Override
    protected String topMostCertificateFromCertificateReplyNotTrusted$str() {
        return "WFLYELY01037: 証明書のリプライからの最上部にある証明書は信用できません。証明書を注意して確認し、有効であれば、検証セットを false にして再度 import-certificate を実行してください。";
    }
    @Override
    protected String trustedCertificateAlreadyInKeyStore$str() {
        return "WFLYELY01038: 信用できる証明書はすでにエイリアス '%1$s' で KeyStore にあります";
    }
    @Override
    protected String trustedCertificateAlreadyInCacertsKeyStore$str() {
        return "WFLYELY01039: 信用できる証明書はすでにエイリアス '%1$s' で cacerts KeyStore にあります";
    }
    @Override
    protected String unableToDetermineIfCertificateIsTrusted$str() {
        return "WFLYELY01040: 証明書を信用できるか判断することができません。証明書を注意して確認し、有効であれば、検証セットを false にして再度 import-certificate を実行してください。";
    }
    @Override
    protected String certificateFileDoesNotExist$str() {
        return "WFLYELY01041: 証明書は存在しません";
    }
    @Override
    protected String unableToObtainEntry$str() {
        return "WFLYELY01042: エイリアス '%1$s' の Entry を取得できません";
    }
    @Override
    protected String unableToCreateAccountWithCertificateAuthority$str() {
        return "WFLYELY01043: 認証局でアカウントを作成できません: %1$s";
    }
    @Override
    protected String unableToChangeAccountKeyWithCertificateAuthority$str() {
        return "WFLYELY01044: 認証局に関連するアカウントキーを変更できません: %1$s";
    }
    @Override
    protected String unableToDeactivateAccountWithCertificateAuthority$str() {
        return "WFLYELY01045: 認証局に関連するアカウントを非アクティブ化できません: %1$s";
    }
    @Override
    protected String unableToObtainCertificateAuthorityAccountCertificate$str() {
        return "WFLYELY01046: エイリアス '%1$s' の認証局アカウント Certificate を取得できません。";
    }
    @Override
    protected String unableToObtainCertificateAuthorityAccountPrivateKey$str() {
        return "WFLYELY01047: エイリアス '%1$s' の認証局アカウント PrivateKey を取得できません";
    }
    @Override
    protected String unableToUpdateCertificateAuthorityAccountKeyStore$str() {
        return "WFLYELY01048: 認証局アカウントキーストアを更新できません: %1$s";
    }
    @Override
    protected String unableToRespondToCertificateAuthorityChallenge$str() {
        return "WFLYELY01049: 認証局からのチャレンジに応答できません: %1$s";
    }
    @Override
    protected String invalidCertificateAuthorityChallenge$str() {
        return "WFLYELY01050: 無効な認証局チャレンジ";
    }
    @Override
    protected String invalidCertificateRevocationReason$str() {
        return "WFLYELY01051: 無効な証明書取り消し理由 '%1$s'";
    }
    @Override
    protected String unableToInstatiateAcmeClientSpiImplementation$str() {
        return "WFLYELY01052: AcmeClientSpi 実装をインスタンス化できません。";
    }
    @Override
    protected String unableToUpdateAccountWithCertificateAuthority$str() {
        return "WFLYELY01053: 認証局でアカウントを更新できません: %1$s";
    }
    @Override
    protected String unableToGetCertificateAuthorityMetadata$str() {
        return "WFLYELY01054: 認証局に関連するメタデータを取得できません: %1$s";
    }
    @Override
    protected String invalidKeySize$str() {
        return "WFLYELY01055: 無効なキーサイズ: %1$d";
    }
    @Override
    protected String certificateAuthorityAccountAlreadyExists$str() {
        return "WFLYELY01056: このアカウントキーを持つ認証局アカウントはすでに存在します。この既存のアカウントに関連する連絡先情報を更新するには、%1$s を使用します。この既存のアカウントに関連するキーを変更するには、%2$s を使用します。";
    }
    @Override
    protected String failedToCreateServerAuthModule$str() {
        return "WFLYELY01057: モジュール '%2$s' を使用して ServerAuthModule [%1$s] を作成できませんでした。";
    }
    @Override
    protected String failedToParsePEMPublicKey$str() {
        return "WFLYELY01058: kid で PEM 公開鍵を解析できませんでした: %1$s";
    }
    @Override
    protected String unableToDetectKeyStore$str() {
        return "WFLYELY01059: KeyStore '%1$s' を検出できません。";
    }
    @Override
    protected String filelessKeyStoreMissingType$str() {
        return "WFLYELY01060: ファイルのない KeyStore には定義された型が必要です。";
    }
    @Override
    protected String invalidHostContextMapValue$str() {
        return "WFLYELY01061: ホストコンテキストマップの無効な値: '%1$s' は有効なホスト名パターンではありません。";
    }
    @Override
    protected String invalidAttributeValue$str() {
        return "WFLYELY01062: 属性 '%1$s' の値は無効です。";
    }
    @Override
    protected String letsEncryptNameNotAllowed$str() {
        return "WFLYELY01063: LetsEncrypt 証明機関はデフォルトで設定されています。";
    }
    @Override
    protected String failedToLoadResponderCert$str() {
        return "WFLYELY01064: OCSP レスポンダー証明書 '%1$s' をロードできませんでした。";
    }
    @Override
    protected String multipleMaximumCertPathDefinitions$str() {
        return "WFLYELY01065: 複数の maximum-cert-path 定義が見つかりました。";
    }
    @Override
    protected String invalidCipherSuiteNames$str() {
        return "WFLYELY01066: cipher-suite-names の値が無効です。%1$s";
    }
    @Override
    protected String invalidRegex$str() {
        return "WFLYELY01067: 値 '%1$s' は有効な正規表現ではありません。";
    }
    @Override
    protected String duplicatePolicyContextHandler$str() {
        return "WFLYELY01068: キー '%1$s' の重複した PolicyContextHandler が見つかりました。";
    }
    @Override
    protected String invalidImplementationLoaded$str() {
        return "WFLYELY01069: 無効な %1$s がロードされしました。%2$s がロードされる必要がありますが、%3$s を受信しました。";
    }
    @Override
    protected String unableToLoadModuleRuntime$str() {
        return "WFLYELY01079: モジュール '%1$s' をロードできません。";
    }
    @Override
    protected String nonexistingKeyStoreMissingType$str() {
        return "WFLYELY01080: 既存のキーストア以外のキーストアにはタイプを定義する必要があります。";
    }
    @Override
    protected String failedToLazilyInitKeyManager$str() {
        return "WFLYELY01081: キーマネージャーのレイジーな初期化に失敗しました";
    }
    @Override
    protected String failedToStoreGeneratedSelfSignedCertificate$str() {
        return "WFLYELY01082: 生成された自己署名証明書の保存に失敗しました";
    }
    @Override
    protected String noTypeFoundForLazyInitKeyManager$str() {
        return "WFLYELY01083: インジェクトされた値に '%1$s' がありません。";
    }
    @Override
    protected String selfSignedCertificateWillBeCreated$str() {
        return "WFLYELY01084: キーストア %1$s が見つかりません。これは初回使用時にホスト %2$s の自己署名証明書を使用して自動生成されます";
    }
    @Override
    protected String unableToEnableJaccSupport$str() {
        return "WFLYELY01086: レガシーの JACC サポートが有効な場合、Elytron JACC サポートを初期化することはできません。";
    }
    @Override
    protected String hostContextMapHostnameContainsCaret$str() {
        return "WFLYELY01087: SNI マッピングのホスト名に ^ の文字は使用できません。";
    }
    @Override
    protected String missingCertificateAuthorityChallenge$str() {
        return "WFLYELY01088: 認証局チャレンジがありません";
    }
    @Override
    protected String invalidEncodingName$str() {
        return "WFLYELY01089: 無効なファイルエンコーディング '%1$s'。";
    }
    @Override
    protected String noAllowedJkuValuesSpecifiedForTokenRealm$str() {
        return "WFLYELY01090: 許可される jku 値がトークンレルム '%1$s' に指定されていません。トークンに 'jku' ヘッダーパラメーターが含まれている場合、トークン検証が失敗します。許可される jku 値は、'%2$s' システムプロパティーを使用してスペース区切り文字列として指定できます。";
    }
    @Override
    protected String noResolverSpecifiedAndNoDefault$str() {
        return "WFLYELY01200: 使用するリゾルバーの名前が指定されていないため、default-resolver が定義されていません。";
    }
    @Override
    protected String noResolverWithSpecifiedName$str() {
        return "WFLYELY01201: '%1$s' という名前で式リゾルバーが定義されていません。";
    }
    @Override
    protected String cycleDetectedInitialisingExpressionResolver$str() {
        return "WFLYELY01202: '%1$s' および '%2$s' の式リゾルバーを開始しているサイクルが検出されました。";
    }
    @Override
    protected String expressionResolverInitialisationAlreadyFailed$str() {
        return "WFLYELY01203: 式リゾルバー初期化はすでに失敗しました。";
    }
    @Override
    protected String expressionResolutionWithoutResolver$str() {
        return "WFLYELY01204: 式 '%1$s' はリゾルバーを指定せず、デフォルトは定義されません。";
    }
    @Override
    protected String invalidResolver$str() {
        return "WFLYELY01205: 式 '%1$s' は、存在しないリゾルバー設定を指定します。";
    }
    @Override
    protected String unableToDecryptExpression$str() {
        return "WFLYELY01206: 式 '%1$s' を復号できません。";
    }
    @Override
    protected String modelStageResolutionNotSupported$str() {
        return "WFLYELY01207: 操作実行の MODEL ステージでは、クレデンシャルストア式の解決はサポートされません。";
    }
    @Override
    protected String unableToResolveCredentialStore$str() {
        return "WFLYELY01208: CredentialStore を解決できません %1$s -- %2$s";
    }
    @Override
    protected String unableToInitializeCredentialStore$str() {
        return "WFLYELY01209: CredentialStore を初期化できません %1$s -- %2$s";
    }
    @Override
    protected String illegalNonManagementInitialization$str() {
        return "WFLYELY01210: アクティブな管理 OperationContext がない %1$s の初期化は許可されません。";
    }
    @Override
    protected String unableToLoadCredentialStore$str() {
        return "WFLYELY01211: クレデンシャルストアをロードできません。";
    }
    @Override
    protected String missingPrivateKey$str() {
        return "WFLYELY01212: キーストアに、KeyStore: [%1$s] およびエイリアス: [%2$s] の PrivateKey は含まれません。";
    }
    @Override
    protected String missingPublicKey$str() {
        return "WFLYELY01213: キーストアには KeyStore: [%1$s] およびエイリアス [%2$s] の PublicKey は含まれません。";
    }
    @Override
    protected String unableToVerifyIntegrity$str() {
        return "WFLYELY01214: ファイルシステムレルムの整合性を検証できません: %1$s。";
    }
    @Override
    protected String filesystemMissingKeypair$str() {
        return "WFLYELY01215: ファイルシステムレルムにキーペアの設定がなく、整合性チェックが有効になっていません";
    }
    @Override
    protected String unableToGetKeyStorePassword$str() {
        return "WFLYELY01216: ファイルシステムレルムはキーストアのパスワードを取得できません";
    }
    @Override
    protected String filesystemIntegrityInvalid$str() {
        return "WFLYELY01217: レルムの検証に失敗しました。アイデンティティーの署名が無効です: %1$s";
    }
    @Override
    protected String keyStoreMissingAlias$str() {
        return "WFLYELY01218: ファイルシステムレルムで使用されるキーストアにエイリアスが含まれていません: %1$s";
    }
    @Override
    protected String addKeypairToInitializedFilesystemRealm$str() {
        return "WFLYELY01219: 初期化した後は、整合するキーペアを空でないファイルシステムレルムに追加できません。ファイルシステムレルムをアップグレードするには、Elytron Tool コマンド 'filesystem-realm-integrity' を使用します。";
    }
    @Override
    protected String addSecretKeyToInitializedFilesystemRealm$str() {
        return "WFLYELY01220: 暗号化秘密鍵は、空でないファイルシステムレルムに追加できません。ファイルシステムレルムをアップグレードするには、Elytron Tool コマンド 'filesystem-realm-encrypt' を使用します。";
    }
    @Override
    protected String unableToObtainDynamicSSLContext$str() {
        return "WFLYELY01221: 指定された認証コンテキストから DynamicSSLContext を取得できません";
    }
}
