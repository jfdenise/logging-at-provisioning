package org.jboss.as.controller.client.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:01+0200")
public class ControllerClientLogger_$logger_ja extends ControllerClientLogger_$logger implements ControllerClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ControllerClientLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotAddDeploymentAction$str() {
        return "WFLYCC0001: ロールアウトプランの作成が開始されるとデプロイメントアクションを追加できません。";
    }
    @Override
    protected String cannotAddDeploymentActionsAfterStart$str() {
        return "WFLYCC0002: ロールアウトプランの作成が開始されるとデプロイメントアクションを追加できません。";
    }
    @Override
    protected String cannotConvert$str() {
        return "WFLYCC0003: %1$s を %2$s へ変換できません。";
    }
    @Override
    protected String cannotDeriveDeploymentName$str() {
        return "WFLYCC0004: %1$s からデプロイメント名を取得できません。'name'パラメーターを取るオーバーロードメソッド変数を使用してください。";
    }
    @Override
    protected String cannotUseDeploymentPlan$str() {
        return "WFLYCC0005: このマネージャーが作成していないDeploymentPlan は利用できません。";
    }
    @Override
    protected String domainDeploymentAlreadyExists$str() {
        return "WFLYCC0007: %1$s という名前のデプロイメントはすでにこのドメインに存在します。";
    }
    @Override
    protected String failed$str() {
        return "WFLYCC0008: 失敗";
    }
    @Override
    protected String globalRollbackNotCompatible$str() {
        return "WFLYCC0009: グローバルロールバックはサーバーの再起動に対応していません。";
    }
    @Override
    protected String gracefulShutdownAlreadyConfigured$str() {
        return "WFLYCC0010: 正常なシャットダウンが %1$d ミリ秒のタイムアウトですでに設定されています。";
    }
    @Override
    protected String incompleteDeploymentReplace$str() {
        return "WFLYCC0011: このドメインでは、指定の一意名を持つデプロイメントのバージョンは 1 つのみとなっています。このデプロイメントプランでは、新しいバージョンのデプロイメント %1$s が同じ一意名を持つ既存のサーバーグループを置き換えるように指定されており、すべてのサーバーグループを置き換えませんでした。 不足しているサーバーグループ: %2$s";
    }
    @Override
    protected String invalidActionType$str() {
        return "WFLYCC0012: 無効なアクション型 %1$s";
    }
    @Override
    protected String invalidPrecedingAction$str() {
        return "WFLYCC0013: 1 つ前のアクションは %1$s ではありませんでした。";
    }
    @Override
    protected String invalidUri$str() {
        return "WFLYCC0014: %1$s は有効な URI ではありません。";
    }
    @Override
    protected String invalidValue3$str() {
        return "WFLYCC0015: 不正な %1$s の値 %2$d -- %3$d より大きくなければなりません。";
    }
    @Override
    protected String invalidValue4$str() {
        return "WFLYCC0016: 不正な %1$s の値 %2$d -- %3$d より大きく、かつ %4$d より小さくなければなりません。";
    }
    @Override
    protected String maxDisplayUnitLength$str() {
        return "WFLYCC0017: 画面の制約があるため、displayUnits は 5 文字以下でなければなりません。";
    }
    @Override
    protected String noFailureDetails$str() {
        return "WFLYCC0019: 障害の詳細が提示されていません。";
    }
    @Override
    protected String notConfigured$str() {
        return "WFLYCC0020: %1$s が設定されていません。";
    }
    @Override
    protected String objectIsClosed$str() {
        return "WFLYCC0022: %1$s は終了しています。";
    }
    @Override
    protected String operationOutcome$str() {
        return "WFLYCC0023: 操作の結果は %1$s です。";
    }
    @Override
    protected String operationsNotAllowed$str() {
        return "WFLYCC0024: コンテンツとデプロイメントを変更後、%1$s 操作は許可されません。";
    }
    @Override
    protected String rollbackCancelled$str() {
        return "WFLYCC0025: ロールバックはキャンセルされました。";
    }
    @Override
    protected String rollbackRolledBack$str() {
        return "WFLYCC0026: ロールバックによりロールバックが完了しました。";
    }
    @Override
    protected String rollbackTimedOut$str() {
        return "WFLYCC0027: ロールバックのタイムアウト";
    }
    @Override
    protected String serverDeploymentAlreadyExists$str() {
        return "WFLYCC0028: %1$s という名前のデプロイメントはすでにこのサーバーに存在します。";
    }
    @Override
    protected String unknownActionType$str() {
        return "WFLYCC0029: 不明なアクション型 %1$s";
    }
    @Override
    protected String controllerClientNotClosed$str() {
        return "WFLYCC0030: 割り当てスタックトレース";
    }
    @Override
    protected String noFailureDescription$str() {
        return "WFLYCC0031: 操作は正常に行われたため、失敗の詳細はありません。";
    }
    @Override
    protected String operationNameNotFound$str() {
        return "WFLYCC0032: 操作名が定義されていませんでした。";
    }
    @Override
    protected String invalidAddressType$str() {
        return "WFLYCC0033: アドレスは ModelType.LIST 型でなければなりません。";
    }
    @Override
    protected String leakedControllerClient$str() {
        return "WFLYCC0034: リークしたコントローラークライアントの終了";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYCC0035: 一時ファイル %1$s は削除できません。終了時に削除されます。";
    }
    @Override
    protected String streamWasClosed$str() {
        return "WFLYCC0036: ストリームは閉じられました";
    }
    @Override
    protected String failedToParseAuthenticationConfig$str() {
        return "WFLYCC0037: 設定ファイルの解析に失敗しました: %1$s";
    }
}
