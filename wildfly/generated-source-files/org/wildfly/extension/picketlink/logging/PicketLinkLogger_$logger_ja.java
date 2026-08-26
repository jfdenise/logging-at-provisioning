package org.wildfly.extension.picketlink.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:45+0200")
public class PicketLinkLogger_$logger_ja extends PicketLinkLogger_$logger implements PicketLinkLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PicketLinkLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String requiredAlternativeAttributes$str() {
        return "WFLYPL0016: [%1$s] には次の属性の 1 つが必要です: [%2$s]";
    }
    @Override
    protected String cannotMigrateNonEmptyConfiguration$str() {
        return "WFLYPL0107: 空でない picketlink-federation サブシステム設定を移行できません。";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYPL0106: 移行に失敗しました。詳細については、結果を参照してください。";
    }
    @Override
    protected String boundToJndi$str() {
        return "WFLYPL0003: [%1$s] を [%2$s] にバインド済み";
    }
    @Override
    protected String couldNotLoadClass$str() {
        return "WFLYPL0009: クラス [%1$s] をロードできませんでした。";
    }
    @Override
    protected String attributeNoLongerSupported$str() {
        return "WFLYPL0012: 属性 [%1$s] はサポート対象外になりました。";
    }
    @Override
    protected String invalidChildTypeOccurrence$str() {
        return "WFLYPL0013: [%1$s] はタイプ [%3$s] の [%2$d] 個の子のみを持てます。";
    }
    @Override
    protected String typeAlreadyDefined$str() {
        return "WFLYPL0017: タイプ[%1$s] はすでに定義済みです。";
    }
    @Override
    protected String requiredAttribute$str() {
        return "WFLYPL0015: [%2$s] に必要な属性 [%1$s]。";
    }
    @Override
    protected String federationHandlerTypeNotProvided$str() {
        return "WFLYPL0101: ハンドラーのタイプが提供されていません。クラス名またはコードを指定する必要があります。";
    }
    @Override
    protected String typeNotProvided$str() {
        return "WFLYPL0010: %1$s のタイプが提供されていません。クラス名またはコードを指定する必要があります。";
    }
    @Override
    protected String requiredChild$str() {
        return "WFLYPL0019: [%1$s] には子 [%2$s] が必要です。";
    }
    @Override
    protected String idmNoSupportedTypesDefined$str() {
        return "WFLYPL0056: サポートされるタイプが指定されませんでした。";
    }
    @Override
    protected String idmNoIdentityConfigurationProvided$str() {
        return "WFLYPL0054: 少なくとも 1 つの ID 設定を提供する必要があります。";
    }
    @Override
    protected String idmNoIdentityStoreProvided$str() {
        return "WFLYPL0055: ID 設定 [%1$s] に対して少なくとも 1 つの ID ストアを提供する必要があります。";
    }
    @Override
    protected String invalidAlternativeAttributeOccurrence$str() {
        return "WFLYPL0014: [%2$s] の無効な属性 [%1$s]。次の属性の 1 つのみが許可されます: [%3$s]";
    }
    @Override
    protected String emptyResource$str() {
        return "WFLYPL0018: [%1$s] は空白にできません。";
    }
    @Override
    protected String idmLdapNoMappingDefined$str() {
        return "WFLYPL0057: マッピングが定義されませんでした。";
    }
    @Override
    protected String moduleCouldNotLoad$str() {
        return "WFLYPL0007: モジュール [%1$s] をロードできませんでした。";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYPL0105: 移行操作は実行できません。サーバーは admin-onlyモードである必要があります。";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYPL0001: PicketLink %1$s サブシステムのアクティブ化";
    }
}
