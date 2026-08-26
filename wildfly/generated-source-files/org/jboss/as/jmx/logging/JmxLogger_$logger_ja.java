package org.jboss.as.jmx.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:23+0200")
public class JmxLogger_$logger_ja extends JmxLogger_$logger implements JmxLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JmxLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String attributeNotWritable$str() {
        return "WFLYJMX0008: 属性 %1$s は書き込みできません。";
    }
    @Override
    protected String cannotUnregisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0045: 予約ドメイン '%1$s' で mbean の登録を解除できません";
    }
    @Override
    protected String unknownChild$str() {
        return "WFLYJMX0031: 不明な子 %1$s";
    }
    @Override
    protected String unsupportedMethod$str() {
        return "WFLYJMX0043: %1$s はサポートされていません";
    }
    @Override
    protected String notAuthorizedToExecuteOperation$str() {
        return "WFLYJMX0040: 操作の呼び出しは許可されていません: '%1$s'";
    }
    @Override
    protected String errorUnregisteringMBeanWithBadCalculatedName$str() {
        return "WFLYJMX0047: 予約 JMX ドメインに登録された '%1$s' MBean の登録解除でエラーが発生しました。";
    }
    @Override
    protected String differentLengths$str() {
        return "WFLYJMX0012: %1$s と %2$s の長さが違います。";
    }
    @Override
    protected String cannotSetAttribute$str() {
        return "WFLYJMX0010: %1$s を設定できませんでした。";
    }
    @Override
    protected String removeNotificationListenerNotAllowed$str() {
        return "WFLYJMX0051: ObjectName %1$s を使用した通知リスナーの削除はサポートされません";
    }
    @Override
    protected String descriptorMBeanExpressionSupportFalse$str() {
        return "この mbean は、基盤のモデルによってサポートされる場合でも属性または操作パラメーターの式をサポートしません。代わりに、解決済みの属性が返され、属性または呼び出し操作の書き込み時に真の型付け値を使用する必要があります。";
    }
    @Override
    protected String registrationNotFound$str() {
        return "WFLYJMX0022: パスアドレス %1$s への登録は見つかりません。";
    }
    @Override
    protected String notAuthorizedToWriteAttribute$str() {
        return "WFLYJMX0038: 属性の書き込みは許可されていません: '%1$s'";
    }
    @Override
    protected String descriptorAlternateMBeanLegacy$str() {
        return "解決済みの値を読み取り、型付け属性を書き、型付け操作パラメーターを使用する場合は %1$s に移動します。";
    }
    @Override
    protected String descriptorAttributeExpressionsAllowedFalse$str() {
        return "この属性は式をサポートしません";
    }
    @Override
    protected String cannotCreateObjectName$str() {
        return "WFLYJMX0009: 文字列 %2$s からのアドレス %1$s に対して ObjectName を作成できませんでした。";
    }
    @Override
    protected String objectNameCantBeNull$str() {
        return "WFLYJMX0032: ObjectName は null にできません";
    }
    @Override
    protected String attributeNotFound$str() {
        return "WFLYJMX0007: 一致する属性が見つかりませんでした: %1$s";
    }
    @Override
    protected String compositeEntryValueDescription$str() {
        return "値";
    }
    @Override
    protected String dontKnowHowToDeserialize$str() {
        return "WFLYJMX0042: デシリアライズの方法が分かりません";
    }
    @Override
    protected String compositeEntryTypeDescription$str() {
        return "エントリー";
    }
    @Override
    protected String descriptorAttributeExpressionsAllowedTrue$str() {
        return "この属性は式をサポートします";
    }
    @Override
    protected String cannotRegisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0044: 予約ドメイン '%1$s' で mbean を登録できません";
    }
    @Override
    protected String noOperationCalled1$str() {
        return "WFLYJMX0019: '%1$s' という操作はありません。";
    }
    @Override
    protected String descriptorMBeanExpressionSupportTrue$str() {
        return "この mbean は、基盤のモデルによってサポートされる場合に属性または操作パラメーターの属性に対する raw 式をサポートします。使用される式がない場合、文字列の表現が真の属性値に変換されます。";
    }
    @Override
    protected String propertyValue$str() {
        return "プロパティー値";
    }
    @Override
    protected String invalidAttributeType$str() {
        return "WFLYJMX0013: '%1$s' に対し不正な型";
    }
    @Override
    protected String mbeanNotFound$str() {
        return "WFLYJMX0017: 名前 %1$s という MBean は見つかりませんでした。";
    }
    @Override
    protected String noOperationCalled2$str() {
        return "WFLYJMX0020: %2$s には '%1$s' という操作はありません。";
    }
    @Override
    protected String unknownValue$str() {
        return "WFLYJMX0025: 不明な値 %1$s";
    }
    @Override
    protected String addNotificationListenerNotAllowed$str() {
        return "WFLYJMX0050: ObjectName %1$s を使用した通知リスナーの追加はサポートされません";
    }
    @Override
    protected String compositeEntryTypeName$str() {
        return "エントリー";
    }
    @Override
    protected String unknownType$str() {
        return "WFLYJMX0024: 不明な型 %1$s";
    }
    @Override
    protected String cannotCreateMBeansInReservedDomain$str() {
        return "WFLYJMX0041: 予約ドメイン '%1$s' で mbean を作成できません。";
    }
    @Override
    protected String compositeEntryKeyDescription$str() {
        return "キー";
    }
    @Override
    protected String compositeMapDescription$str() {
        return "マップは 'キー' によってインデックス化されます";
    }
    @Override
    protected String complexCompositeEntryTypeName$str() {
        return "複雑型";
    }
    @Override
    protected String unknownDomain$str() {
        return "WFLYJMX0029: 未知のドメイン: %1$s";
    }
    @Override
    protected String badDomainInCalculatedObjectNameException$str() {
        return "WFLYJMX0046: MBeanRegistration.preRegister() '%1$s' からの ObjectName は予約 JMX ドメインにあります";
    }
    @Override
    protected String invalidKey$str() {
        return "WFLYJMX0014: %2$s に対し無効なキー %1$s";
    }
    @Override
    protected String mbeanRegistrationFailed$str() {
        return "WFLYJMX0018: mbean [%1$s] の登録に失敗しました。";
    }
    @Override
    protected String invalidObjectName3$str() {
        return "WFLYJMX0015: 無効な ObjectName: %1$s,%2$s; %3$s";
    }
    @Override
    protected String expressionCannotBeConvertedIntoTargeteType$str() {
        return "WFLYJMX0030: 式をターゲット型 %1$s へ変換できません";
    }
    @Override
    protected String jmxConnectorNotSupported$str() {
        return "WFLYJMX0006: <jmx-connector/> には対応していません。代わりに <remoting-connector/> を使い JBoss Remoting を使ったリモート接続ができるようにしてください。";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYJMX0037: 不正アクセス";
    }
    @Override
    protected String notAuthorizedToReadAttribute$str() {
        return "WFLYJMX0039: 属性の読み取りは許可されていません: '%1$s'";
    }
    @Override
    protected String cannotUnregisterObject$str() {
        return "WFLYJMX0004: ObjectName がないため登録解除できません。";
    }
    @Override
    protected String invalidObjectName2$str() {
        return "WFLYJMX0015: 無効な ObjectName: %1$s; %2$s";
    }
    @Override
    protected String removeNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0049: ObjectName %1$s を使用した通知リスナーの削除はサポートされません";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYJMX0036: '%1$s' というハンドラーはありません";
    }
    @Override
    protected String descriptorAlternateMBeanExpressions$str() {
        return "式の設定および読み取りを有効にするには、%1$s に移動してください。";
    }
    @Override
    protected String propertyCompositeType$str() {
        return "プロパティーを表す複合型";
    }
    @Override
    protected String wildcardNameParameterRequired$str() {
        return "WFLYJMX0026: ワイルドカード追加には name パラメーターが必要です。";
    }
    @Override
    protected String propertyName$str() {
        return "プロパティー名";
    }
    @Override
    protected String complexCompositeEntryTypeDescription$str() {
        return "複雑型";
    }
    @Override
    protected String invalidObjectName4$str() {
        return "WFLYJMX0015: 無効な ObjectName: %1$s,%2$s,%3$s; %4$s";
    }
    @Override
    protected String compositeMapName$str() {
        return "マップ";
    }
    @Override
    protected String addNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0048: ObjectName %1$s を使用した通知リスナーの追加はサポートされません";
    }
    @Override
    protected String unregistrationFailure$str() {
        return "WFLYJMX0005: 登録解除に失敗しました [%1$s]";
    }
}
