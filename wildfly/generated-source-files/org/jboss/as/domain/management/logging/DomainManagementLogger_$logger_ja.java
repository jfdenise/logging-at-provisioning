package org.jboss.as.domain.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:14+0200")
public class DomainManagementLogger_$logger_ja extends DomainManagementLogger_$logger implements DomainManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DomainManagementLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String passwordMustHaveSymbolInfo$str() {
        return "%1$s 文字 (英数字以外の記号)";
    }
    @Override
    protected String argHelp$str() {
        return "このメッセージを表示し、終了";
    }
    @Override
    protected String usernamePrompt0$str() {
        return "ユーザ名";
    }
    @Override
    protected String handlerAlreadyExists$str() {
        return "WFLYDM0063: ハンドラー名は一意でなければなりません。%2$s には '%1$s' というハンドラーがすでに存在します";
    }
    @Override
    protected String failedToGenerateSelfSignedCertificate$str() {
        return "WFLYDM0112: 自己署名証明書の生成に失敗しました";
    }
    @Override
    protected String invalidChoiceUpdateUserResponse$str() {
        return "WFLYDM0070: 無効な応答 (有効な応答は A、a、B、b、C、または c)。";
    }
    @Override
    protected String argServerConfigDirUsers$str() {
        return "サーバー設定ディレクトリーの場所を定義してください。";
    }
    @Override
    protected String multipleAuthenticationMechanismsDefined$str() {
        return "WFLYDM0033: セキュリティーレルム '%1$s' の設定には、複数のユーザー名／パスワードをベースとする認証メカニズム (%2$s) が含まれます。";
    }
    @Override
    protected String passwordUsernameMustMatchInfo$str() {
        return "パスワードとユーザー名は異なるものにする必要があります";
    }
    @Override
    protected String addedGroups$str() {
        return "グループ '%2$s' のユーザー '%1$s' をファイル '%3$s' に追加しました";
    }
    @Override
    protected String sysLogProtocolAlreadyConfigured$str() {
        return "WFLYDM0059: %1$s では syslog ハンドラーにすでにプロトコルが設定されています";
    }
    @Override
    protected String multipleRealmDeclarations$str() {
        return "ユーザーのプロパティーファイル '%1$s' には複数のレルム名宣言が含まれています";
    }
    @Override
    protected String realmPrompt$str() {
        return "レルム (%1$s)";
    }
    @Override
    protected String passwordRequirements$str() {
        return "パスワードの要件は以下のとおりです。この制限を変更するには、add-user.properties 設定ファイルを編集します。";
    }
    @Override
    protected String badBaseRole$str() {
        return "WFLYDM0081: ベースロール '%1$s' は現在の承認プロバイダーの標準ロールではありません。";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYDM0104: 接尾辞 (%1$s) に秒またはミリ秒を含むことはできません。";
    }
    @Override
    protected String passwordShouldNotEqualInfo$str() {
        return "パスワードは、制限された次の値のいずれかでない必要があります {%1$s}";
    }
    @Override
    protected String argEnable$str() {
        return "ユーザーの有効化。";
    }
    @Override
    protected String aliasNotKey$str() {
        return "WFLYDM0084: 指定されたエイリアス '%1$s' はキーではありません。有効なエイリアス: %2$s";
    }
    @Override
    protected String multipleGroupSearchConfigurationsDefined$str() {
        return "WFLYDM0075: セキュリティーレルム '%1$s' の設定には、authorization=ldap リソース内に複数の group-search リソースが含まれますが (%2$s)、1 つのみが許可されます。";
    }
    @Override
    protected String passwordShouldContainInfo$str() {
        return "パスワードは %1$s 文字以上にしてください。";
    }
    @Override
    protected String yesNo$str() {
        return "yes/no?";
    }
    @Override
    protected String failedToCreateLazyInitSSLContext$str() {
        return "WFLYDM0114: SSL コンテキストのレイジーな初期化に失敗しました";
    }
    @Override
    protected String alternativeRealm$str() {
        return "指定するレルム名はサーバー設定によって使用される名前と一致しなければなりません。デフォルトでは '%1$s' になります。";
    }
    @Override
    protected String invalidConfirmationResponse$str() {
        return "WFLYDM0029: 無効な応答です (有効な応答は %1$s および %2$s)";
    }
    @Override
    protected String realmMustBeSpecified$str() {
        return "WFLYDM0067: レルム名を指定する必要があります。";
    }
    @Override
    protected String keystoreHasBeenCreated$str() {
        return "WFLYDM0113: %1$s で自己署名証明書が生成されました。自己署名証明書は安全ではなく、テストのためのみに使用する必要があることに注意してください。実稼働ではこの自己署名証明書を使用しないでください。生成されたキーの %nSHA-1 フィンガープリントは %2$s です。生成されたキーの %nSHA-256 フィンガープリントは %3$s です";
    }
    @Override
    protected String passwordConfirmationPrompt$str() {
        return "パスワードを再度入力してください。";
    }
    @Override
    protected String aboutToUpdateEnabledUser$str() {
        return "ユーザー '%1$s' はすでに存在し、有効になっています。次から選択してください。 %n a) 既存ユーザーのパスワードおよびロールを更新します。%n b) 既存ユーザーを無効にします。 %n c) 新しいユーザー名を入力します。";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYDM0017: プロパティーをロードできません。";
    }
    @Override
    protected String userSuppliedRealm$str() {
        return "レルム '%1$s' をコマンドラインで指定されたとおりに使用しています。";
    }
    @Override
    protected String unableToLoadPlugInProviders$str() {
        return "WFLYDM0045: エラー (%2$s) が原因でモジュール %1$s のプラグインをロードできません。";
    }
    @Override
    protected String aliasNotFound$str() {
        return "WFLYDM0085: 指定されたエイリアス '%1$s' は KeyStore に存在しません。有効なエイリアス: %2$s";
    }
    @Override
    protected String unableToLoadSimpleNameForGroup$str() {
        return "WFLYDM0110: グループ '%1$s' の単純名をロードできません。";
    }
    @Override
    protected String unableToAddUser$str() {
        return "WFLYDM0030: エラー %2$s が原因で %1$s へユーザーを追加できません。";
    }
    @Override
    protected String noNonProgressingOperationFound$str() {
        return "WFLYDM0089: [%1$d] 秒以上操作実行の書き込みロックを保持している操作が見つかりませんでした";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYDM0058: '%1$s' というハンドラーはありません";
    }
    @Override
    protected String passwordUsernameShouldNotMatch$str() {
        return "WFLYDM0098: パスワードとユーザー名は異なるものにする必要があります";
    }
    @Override
    protected String passwordMustHaveDigit$str() {
        return "WFLYDM0050: パスワードは %1$d 文字以上である必要があります。";
    }
    @Override
    protected String imcompatibleConfiguredRequiresAttributeValue$str() {
        return "WFLYDM0144: 機密制約 %1$s には、他の機密分類制約と互換性のない属性値が含まれています。";
    }
    @Override
    protected String passwordMustNotEqualInfo$str() {
        return "パスワードは、制限された次の値のいずれかでない必要があります {%1$s}";
    }
    @Override
    protected String no$str() {
        return "no";
    }
    @Override
    protected String outboundConnectionsUnsupported$str() {
        return "WFLYDM0146: 送信接続はサポート対象外になりました。設定から削除してください。";
    }
    @Override
    protected String invalidLocalUser$str() {
        return "WFLYDM0041: ユーザー '%1$s' はローカル認証で拒否されました。";
    }
    @Override
    protected String noGroupSearchDefined$str() {
        return "WFLYDM0074: セキュリティーレルム '%1$s' の設定には、authorization=ldap リソース内に group-search リソースが含まれていません。";
    }
    @Override
    protected String passwordShouldHaveSymbol$str() {
        return "WFLYDM0102: パスワードには英数字でない記号が %1$s 文字以上必要です。";
    }
    @Override
    protected String passwordMustHaveAlphaInfo$str() {
        return "%1$d 英字";
    }
    @Override
    protected String passwordRecommendations$str() {
        return "パスワードの推奨事項は以下のとおりです。この制限を変更するには、add-user.properties 設定ファイルを編集します。";
    }
    @Override
    protected String scopedRoleStandardName$str() {
        return "WFLYDM0080: 名前 '%1$s' は標準ロール名の '%2$s' と競合します - 大文字と小文字を区別せずに比較します。";
    }
    @Override
    protected String securityRealmsUnsupported$str() {
        return "WFLYDM0145: セキュリティーレルムはサポート対象外になりました。設定から削除してください。";
    }
    @Override
    protected String userAndPasswordWarning$str() {
        return "WFLYDM0001: デフォルトのユーザーとパスワードで定義されたプロパティーファイルです。このパスワードは簡単に推測されてしまいます。";
    }
    @Override
    protected String usageDescription$str() {
        return "add-user スクリプトは、新しいユーザーをプロパティーファイルに追加してすぐに認証を行うことを可能にするユーティリティーです。ManagementRealm と ApplicationRealm でユーザーを管理するために使用できます。";
    }
    @Override
    protected String argConfirmWarning$str() {
        return "対話モードで警告を自動的に確認する";
    }
    @Override
    protected String unableToUpdateUser$str() {
        return "WFLYDM0040: エラー %2$s が原因で %1$s へユーザーを更新できません。";
    }
    @Override
    protected String multipleRealmsDetected$str() {
        return "WFLYDM0064: 異なるレルム名 '%1$s' が検出されました。'%2$s' ユーザープロパティーファイルを読み取りしています。すべてのレルムは同等でなければなりません。";
    }
    @Override
    protected String inconsistentRbacRuntimeState$str() {
        return "WFLYDM0069: ランタイムのロールマッピング設定に一貫性がなく、サーバーを再起動する必要があります。";
    }
    @Override
    protected String passwordMustNotBeEqual$str() {
        return "WFLYDM0049: パスワードは '%1$s' と同等ではいけません。この値は制限されています。";
    }
    @Override
    protected String passwordShouldHaveAlpha$str() {
        return "WFLYDM0100: パスワードには英数字が %1$d 文字以上必要です。";
    }
    @Override
    protected String usernamePrompt1$str() {
        return "ユーザー名 (%1$s)";
    }
    @Override
    protected String noFormatterCalled$str() {
        return "WFLYDM0061: '%1$s' というフォーマッターはありません";
    }
    @Override
    protected String usernameEasyToGuess$str() {
        return "ユーザー名 '%1$s' は簡単に推測できます。";
    }
    @Override
    protected String invalidKeytab$str() {
        return "WFLYDM0090: 向こうなキータブパス";
    }
    @Override
    protected String passwordNotStrongEnough$str() {
        return "WFLYDM0048: パスワードの強度が足りません。現在の強度は '%1$s' ですが最低でも '%2$s' である必要があります。";
    }
    @Override
    protected String argDomainConfigDirUsers$str() {
        return "ドメイン設定ディレクトリーの場所を定義してください。";
    }
    @Override
    protected String passwordMisMatch$str() {
        return "WFLYDM0026: パスワードは正しくありません。";
    }
    @Override
    protected String invalidRoleName$str() {
        return "WFLYDM0076: ロール名'%1$s' は有効な標準ロールではありません。";
    }
    @Override
    protected String passwordNotLongEnough$str() {
        return "WFLYDM0053: パスワードは %1$s 文字以上である必要があります。";
    }
    @Override
    protected String noSyslogProtocol$str() {
        return "WFLYDM0060: syslog プロトコルが指定されていません";
    }
    @Override
    protected String duplicateScopedRole$str() {
        return "WFLYDM0079: '%2$s' という名前の %1$s はすでに存在します";
    }
    @Override
    protected String userRealmNotMatchDiscovered$str() {
        return "WFLYDM0065: ユーザー指定のレルム名 '%1$s' がプロパティーファイル '%2$s' で見つかったレルム名と一致しません。";
    }
    @Override
    protected String invalidChoiceResponse$str() {
        return "WFLYDM0039: 無効なレスポンス (有効なレスポンスはA、a、B、bです)";
    }
    @Override
    protected String argUser$str() {
        return "ユーザーの名前";
    }
    @Override
    protected String argUserProperties$str() {
        return "絶対パスで指定できるユーザープロパティーファイルのファイル名。";
    }
    @Override
    protected String keyStoreNotFound$str() {
        return "WFLYDM0086: %1$s では KeyStore が見つかりません。";
    }
    @Override
    protected String multipleCallbackHandlerForMechanism$str() {
        return "WFLYDM0042: 同じメカニズム (%1$s) に対する複数の CallbackHandlerServices";
    }
    @Override
    protected String unableToObtainTGT$str() {
        return "WFLYDM0092: Kerberos TGT を取得できません";
    }
    @Override
    protected String argPassword$str() {
        return "ユーザーのパスワード。これは、add-user.properties 設定内で定義されたパスワード要件と照合されます。";
    }
    @Override
    protected String argApplicationUsers$str() {
        return "設定された場合、管理ユーザーではなくアプリケーションユーザーを追加";
    }
    @Override
    protected String sureToAddUser$str() {
        return "'%1$s' を追加してもよろしいですか? yes/no?";
    }
    @Override
    protected String unableToOperateOnTrustStore$str() {
        return "WFLYDM0055: トラストストアで操作できません。";
    }
    @Override
    protected String noCipherSuitesInCommon$str() {
        return "WFLYDM0095: 共通の暗号スイートがありません、supported=(%1$s)、requested=(%2$s)";
    }
    @Override
    protected String shortNo$str() {
        return "n";
    }
    @Override
    protected String aboutToAddUser$str() {
        return "レルム '%2$s' にユーザー '%1$s' を追加します。";
    }
    @Override
    protected String passwordMustContainInfo$str() {
        return "パスワードは %1$s 文字以上である必要があります";
    }
    @Override
    protected String passwordPrompt$str() {
        return "パスワード";
    }
    @Override
    protected String usernameNotAlphaNumeric$str() {
        return "WFLYDM0028: ユーザー名に使用できるのは英数字と許可されるシンボル (%1$s) です。";
    }
    @Override
    protected String noPlugInProvidersLoaded$str() {
        return "WFLYDM0044: モジュール名 %1$s のプラグインプロバイダーが見つかりません。";
    }
    @Override
    protected String unsupportedResource$str() {
        return "WFLYDM0108: サポートされていないリソース '%1$s'";
    }
    @Override
    protected String updatedGroups$str() {
        return "グループ %2$s のユーザー '%1$s' をファイル '%3$s' へ更新しました";
    }
    @Override
    protected String argUsage$str() {
        return "使用方法: ./add-user.sh [args...]%nargs には次が含まれます。";
    }
    @Override
    protected String isCorrectPrompt$str() {
        return "正しいですか";
    }
    @Override
    protected String multipleUsernameToDnConfigurationsDefined$str() {
        return "WFLYDM0073: セキュリティーレルム '%1$s' の設定には、authorization=ldap リソース内に複数の username-to-dn リソースが含まれますが (%2$s)、1 つのみが許可されます。";
    }
    @Override
    protected String shortYes$str() {
        return "y";
    }
    @Override
    protected String argRealm$str() {
        return "管理インターフェイスを安全にするために使用されるレルムの名前 (デフォルトは \"ManagementRealm\")";
    }
    @Override
    protected String cannotRemoveReferencedFormatter$str() {
        return "WFLYDM0062: フォーマッターを削除できません。ハンドラー '%1$s' によって参照されています。";
    }
    @Override
    protected String usingDeprecatedSystemProperty$str() {
        return "WFLYDM0140: システムプロパティー \"%1$s\" は非推奨のため、使用しないでください。代わりに管理モデル設定を使用してください。";
    }
    @Override
    protected String invalidRoleNameDomain$str() {
        return "WFLYDM0077: ロール名'%1$s' は有効な標準ロールではありません。また、ホストまたはサーバーグループのスコープ指定されたロールではありません。";
    }
    @Override
    protected String filePrompt$str() {
        return "どのようなユーザータイプを追加しますか? %n a) 管理ユーザー (mgmt-users.properties) %n b) アプリケーションユーザー (application-users.properties)";
    }
    @Override
    protected String filePermissionsProblemsFound$str() {
        return "WFLYDM0106: %1$s ファイルの更新中にファイルパーミッションの問題が見つかりました。";
    }
    @Override
    protected String onlyOneSyslogHandlerProtocol$str() {
        return "WFLYDM0057: syslog-handler にはプロトコル %1$s を 1 つのみ含むことができます";
    }
    @Override
    protected String noUsernameExiting$str() {
        return "WFLYDM0024: ユーザー名が入力されていないため、終了します。";
    }
    @Override
    protected String invalidSensitiveClassificationAttribute$str() {
        return "WFLYDM0143: 無効な機密分類属性 '%1$s'";
    }
    @Override
    protected String errorHeader$str() {
        return "エラー";
    }
    @Override
    protected String noSecurityContextEstablished$str() {
        return "WFLYDM0037: 設定済みのセキュリティコンテキストはありません。";
    }
    @Override
    protected String unableToLoadKeyTrustFile$str() {
        return "WFLYDM0054: キートラストファイルをロードできません。";
    }
    @Override
    protected String groupPropertiesButNoUserProperties$str() {
        return "WFLYDM0066: グループプロパティーファイル '%1$s' は指定されましたが、ユーザープロパティーが指定されていません。";
    }
    @Override
    protected String duplicateIncludeExclude$str() {
        return "WFLYDM0071: ロール '%1$s' には type=%3$s、name=%4$s、realm=%5$s の %2$s がすでに含まれています。";
    }
    @Override
    protected String keystoreWillBeCreated$str() {
        return "WFLYDM0111: キーストア %1$s が見つかりません。これは初回使用時にホスト %2$s の自己署名証明書を使用して自動生成されます";
    }
    @Override
    protected String unableToCreateDelegateTrustManager$str() {
        return "WFLYDM0056: 委譲トラストマネージャーを作成できません。";
    }
    @Override
    protected String argGroup$str() {
        return "ユーザーに対するグループのカンマ区切りリスト。";
    }
    @Override
    protected String passwordMustHaveAlpha$str() {
        return "WFLYDM0052: パスワードには英数字が %1$d 文字以上必要です。";
    }
    @Override
    protected String noPasswordExiting$str() {
        return "WFLYDM0025: パスワードが入力されていないため、終了します。";
    }
    @Override
    protected String passwordShouldHaveXCharacters$str() {
        return "WFLYDM0099: パスワードは %1$s 文字以上である必要があります。";
    }
    @Override
    protected String noConsoleAvailable$str() {
        return "WFLYDM0021: ユーザーとのやり取りに利用できる java.io.Console がありません。";
    }
    @Override
    protected String unableToObtainCredential$str() {
        return "サーバー %1$s のクレデンシャルを取得できません";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYDM0103: 無効なサイズ %1$s";
    }
    @Override
    protected String unableToLoadUsers$str() {
        return "WFLYDM0031: エラー %2$s が原因で %1$s からユーザーをロードできません。";
    }
    @Override
    protected String roleMappingRemaining$str() {
        return "WFLYDM0078: ロールマッピングが存在するため、スコープ指定されたロール '%1$s' は削除できません。";
    }
    @Override
    protected String passwordUsernameShouldMatchInfo$str() {
        return "パスワードとユーザー名は異なるものにする必要があります";
    }
    @Override
    protected String passwordShouldHaveDigit$str() {
        return "WFLYDM0101: パスワードには数字が %1$d 文字以上必要です。";
    }
    @Override
    protected String operationFailedOneOfRequired$str() {
        return "WFLYDM0034: '%1$s' の 1 つまたは '%2$s' が必要です。";
    }
    @Override
    protected String noCallbackHandlerForMechanism$str() {
        return "WFLYDM0043: レルム %2$s にメカニズム %1$s で利用できる CallbackHandler がありません。";
    }
    @Override
    protected String keyTabFileNotFound$str() {
        return "WFLYDM0109: Keytab ファイル '%1$s' は存在しません。";
    }
    @Override
    protected String removedBrokenResource$str() {
        return "WFLYDM0135: リソース %1$s が適切に動作しなかったため、削除されました。";
    }
    @Override
    protected String inconsistentRbacConfiguration$str() {
        return "WFLYDM0068: 現在の演算によって、ロールベースのアクセス制御は有効になりますが、認証されたユーザーへロールを割り当てできなくなります。";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYDM0105: 接尾辞 (%1$s) は無効です。接尾辞は有効な日付形式でなければなりません。";
    }
    @Override
    protected String usernameNotLoaded$str() {
        return "WFLYDM0088: 指定されたユーザー名 '%1$s' のユーザー名をロードできません。";
    }
    @Override
    protected String propertiesFileNotFound$str() {
        return "WFLYDM0023: ファイル %1$s が見つかりません。";
    }
    @Override
    protected String groupsPrompt$str() {
        return "このユーザーが所属するグループはどれですか？ (カンマ区切りリストを入力してください。所属グループがない場合は空白のままにしてください。)";
    }
    @Override
    protected String kerberosWithoutKeytab$str() {
        return "WFLYDM0094: Kerberos はセキュリティーレルム '%1$s' 上の認証に対して有効になっていますが、server-identity に追加されたキータブがありません。";
    }
    @Override
    protected String passwordMustHaveSymbol$str() {
        return "WFLYDM0051: パスワードには英数字でない記号が %1$s 文字以上必要です。";
    }
    @Override
    protected String multipleAuthorizationConfigurationsDefined$str() {
        return "WFLYDM0072: セキュリティーレルム '%1$s' の設定には、複数の承認設定が含まれていますが (%2$s)、1 つのみが許可されます。";
    }
    @Override
    protected String operationFailedOnlyOneOfRequired$str() {
        return "WFLYDM0035: '%1$s' または '%2$s' のどちらか１つだけを指定ください。";
    }
    @Override
    protected String multipleCacheConfigurationsDefined$str() {
        return "WFLYDM0087: セキュリティーレルム '%1$s' の設定には階層の同じポジションに複数のキャッシュ定義が含まれています。1 つのキャッシュ定義のみが許可されます。";
    }
    @Override
    protected String noSubjectIdentityForProtocolAndHost$str() {
        return "WFLYDM0139: %1$s/%2$s の SubjectIdentity は見つかりませんでした。";
    }
    @Override
    protected String passwordLengthInfo$str() {
        return "%1$s 文字";
    }
    @Override
    protected String noKey$str() {
        return "WFLYDM0083: KeyStore %1$s にはキーが含まれていません。";
    }
    @Override
    protected String domainRolloutNotProgressing$str() {
        return "WFLYDM0107: 操作 '%1$s' が操作実行の書き込みロックを [%2$d] 秒以上保持していますが、domain-uuid が '%3$s' のドメイン全体操作のロールアウトの一部で他の操作も処理されていません。この ids は %4$s です。ドメインコントローラーで操作を中止することをお勧めします。";
    }
    @Override
    protected String legacyMechanismsAreNotSupported$str() {
        return "WFLYDM0142: サーバー (%1$s) で設定された次のメカニズムは、レルム '%2$s' によってサポートされません。";
    }
    @Override
    protected String callbackHandlerNotInitialized$str() {
        return "ドメインサーバー %1$s に対してコールバックハンドラーは初期化されません。";
    }
    @Override
    protected String subjectIdentityLoggedOut$str() {
        return "WFLYDM0091: この SubjectIdentity 上でログアウトがすでに呼び出されました。";
    }
    @Override
    protected String passwordMustHaveDigitInfo$str() {
        return "%1$d 桁";
    }
    @Override
    protected String argSilent$str() {
        return "サイレントモードをアクティベート (コンソールへの出力なし)";
    }
    @Override
    protected String aboutToUpdateDisabledUser$str() {
        return "ユーザー '%1$s' はすでに存在し、無効になっています。次から選択してください。 %n a) 既存ユーザーのパスワードおよびロールを更新します。%n b) 既存ユーザーを有効にします。 %n c) 新しいユーザー名を入力します。";
    }
    @Override
    protected String noAuthenticationPlugInFound$str() {
        return "WFLYDM0046: 名前 %1$s の認証プラグインが見つかりません。";
    }
    @Override
    protected String argGroupProperties$str() {
        return "絶対パスで指定できるグループプロパティーファイルのファイル名 (グループプロパティーが指定されている場合はユーザープロパティーも指定する必要があります)。";
    }
    @Override
    protected String realmConfirmation$str() {
        return "レルムを '%1$s' に設定してもよろしいですか?";
    }
    @Override
    protected String keytabLoginFailed$str() {
        return "WFLYDM0093: ホスト '%2$s' のリクエストを処理するプリンシパル '%1$s' のキータブを使用したログインに失敗しました";
    }
    @Override
    protected String discoveredRealm$str() {
        return "レルム '%1$s' を既存のプロパティーファイルで検出されたとおりに使用しています。";
    }
    @Override
    protected String unableToInitialisePlugIn$str() {
        return "WFLYDM0047: エラー %2$s が原因でプラグイン %1$s を初期化できません。";
    }
    @Override
    protected String updateUser$str() {
        return "ユーザー '%1$s' をファイル '%2$s' に更新しました。";
    }
    @Override
    protected String noProtocolsInCommon$str() {
        return "WFLYDM0096: 共通のプロトコルがありません、supported=(%1$s)、requested=(%2$s)";
    }
    @Override
    protected String sureToSetPassword$str() {
        return "入力したパスワードを使用してもよろしいですか? yes/no?";
    }
    @Override
    protected String passwordUsernameMatchError$str() {
        return "WFLYDM0082: パスワードとユーザー名は異なるものにする必要があります";
    }
    @Override
    protected String passwordShouldNotBeEqual$str() {
        return "WFLYDM0097: '%1$s' とは異なるパスワードを指定する必要があります。この値は制限されています。";
    }
    @Override
    protected String enterNewUserDetails$str() {
        return "追加する新規ユーザーの詳細を入力します。";
    }
    @Override
    protected String yes$str() {
        return "yes";
    }
    @Override
    protected String addedUser$str() {
        return "ユーザー '%1$s' をファイル '%2$s' に追加しました。";
    }
    @Override
    protected String argRole$str() {
        return "ユーザーに対するロールのカンマ区切りリスト。";
    }
    @Override
    protected String argDisable$str() {
        return "ユーザーの無効化";
    }
    @Override
    protected String userNotFoundInDirectory$str() {
        return "WFLYDM0020: ユーザー '%1$s' はディレクトリーに存在しません。";
    }
}
