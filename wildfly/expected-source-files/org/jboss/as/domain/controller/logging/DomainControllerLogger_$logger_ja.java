package org.jboss.as.domain.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:30+0200")
public class DomainControllerLogger_$logger_ja extends DomainControllerLogger_$logger implements DomainControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DomainControllerLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String warnIgnoringSocketBindingGroupInclude$str() {
        return "WFLYDC0001: 'socket-binding-group' %1$s の子の 'include' を無視します。";
    }
    @Override
    protected String interruptedAwaitingFinalResponse2$str() {
        return "WFLYDC0003: ホスト %2$s にあるサーバー %1$s からの最終レスポンスの待機が中断されました。操作をキャンセルするようリモートプロセスが通知されました";
    }
    @Override
    protected String caughtExceptionAwaitingFinalResponse2$str() {
        return "WFLYDC0004: ホスト %2$s にあるサーバー %1$s からの最終レスポンスの待機時に例外が検出されました。";
    }
    @Override
    protected String interruptedAwaitingFinalResponse1$str() {
        return "WFLYDC0005: ホスト %1$s からの最終レスポンスの待機が中断されました。操作をキャンセルするようリモートプロセスが通知されました";
    }
    @Override
    protected String caughtExceptionAwaitingFinalResponse1$str() {
        return "WFLYDC0006: ホスト %1$s からの最終レスポンスを待機中に例外が検出されました。";
    }
    @Override
    protected String caughtExceptionClosingInputStream$str() {
        return "WFLYDC0007: 入力ストリームを終了中に例外が検出されました。";
    }
    @Override
    protected String domainModelChangedOnReConnect$str() {
        return "WFLYDC0008: ドメインモデルが再接続時に変更されました。変更を有効するには、以下のサーバーを再起動する必要があります: %1$s";
    }
    @Override
    protected String caughtExceptionWaitingForTask$str() {
        return "WFLYDC0009: タスク %3$s の待機中に %1$s が %2$s を検出しました。タスクをキャンセルしています";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYDC0011: デプロイメント %2$s のデプロイメントコンテンツリポジトリーにはハッシュ %1$s があるデプロイメントコンテンツがありません。この Host Controller は ADMIN-ONLY モードで起動しているため、管理者がこの問題を修正できるように起動は続行されます。Host Controller が ADMIN-ONLY モードでない場合、これは致命的な起動障害となります。";
    }
    @Override
    protected String failedToSetServerInRestartRequireState$str() {
        return "WFLYDC0012: サーバー (%1$s) を再起動が必要な状態に設定できませんでした。";
    }
    @Override
    protected String slaveControllerCannotAcceptOtherSlaves$str() {
        return "WFLYDC0013: リモートホストの登録は、セカンダリーホストコントローラーではサポート対象外です";
    }
    @Override
    protected String adminOnlyModeCannotAcceptSlaves$str() {
        return "WFLYDC0014: プライマリーホストコントローラーは、現在の稼働モードが '%1$s' であるため、セカンダリーホストコントローラーを登録できません。";
    }
    @Override
    protected String slaveAlreadyRegistered$str() {
        return "WFLYDC0015: '%1$s' という名前の登録済みホストがあります。";
    }
    @Override
    protected String requiredChildIsMissing$str() {
        return "WFLYDC0016: %1$s には %2$s がありません: %3$s";
    }
    @Override
    protected String unrecognizedChildren$str() {
        return "WFLYDC0017: %1$s は %2$s のみを子として認識します: %3$s";
    }
    @Override
    protected String inSeriesIsMissingGroups$str() {
        return "WFLYDC0018: in-series にグループがありません: %1$s";
    }
    @Override
    protected String serverGroupExpectsSingleChild$str() {
        return "WFLYDC0019: server-group は 1 つの子を想定します: %1$s";
    }
    @Override
    protected String unexpectedInSeriesGroup$str() {
        return "WFLYDC0020: グループの 1 つは server-group と concurrent-groups のいずれも定義しません: %1$s";
    }
    @Override
    protected String unexplainedFailure$str() {
        return "WFLYDC0021: 不明なエラー";
    }
    @Override
    protected String operationFailedOrRolledBack$str() {
        return "WFLYDC0022: 操作に失敗しました。あるいは全サーバー上でロールバックされました。";
    }
    @Override
    protected String interruptedAwaitingResultFromServer$str() {
        return "WFLYDC0023: サーバー %1$s からの結果待ち中に中断されました。";
    }
    @Override
    protected String exceptionAwaitingResultFromServer$str() {
        return "WFLYDC0024: サーバー %1$s から結果を取得する際の例外: %2$s";
    }
    @Override
    protected String invalidRolloutPlan2$str() {
        return "WFLYDC0025: ロールアウトプランは無効です。%1$s はノード %2$s の有効な子ではありません。";
    }
    @Override
    protected String invalidRolloutPlan1$str() {
        return "WFLYDC0026: ロールアウトプランは無効です。このロールアウトプランに反映されないサーバーグループ %1$s もプラン操作の影響をを受けます。";
    }
    @Override
    protected String invalidRolloutPlanGroupAlreadyExists$str() {
        return "WFLYDC0027: ロールアウトプランは無効です。サーバーグループ %1$s はこのプランに複数回登場します。";
    }
    @Override
    protected String invalidRolloutPlanRange$str() {
        return "WFLYDC0028: ロールアウトプランは無効です。サーバーグループ %1$s の %2$s の値は %3$s ですが、値は 0 から 100 の間でなければなりません。";
    }
    @Override
    protected String invalidRolloutPlanLess$str() {
        return "WFLYDC0029: ロールアウトプランは無効です。サーバーグループ %1$s の %2$s の値は %3$s ですが、値を 0 未満にすることはできません。";
    }
    @Override
    protected String interruptedAwaitingResultFromHost$str() {
        return "WFLYDC0030: ホスト %1$s からの結果の待機中に中断されました。";
    }
    @Override
    protected String masterDomainControllerOnlyOperation$str() {
        return "WFLYDC0032: アドレス %2$s に対する操作 %1$s はドメインコントローラーでのみ処理可能です。このホストはドメインコントローラーではありません。";
    }
    @Override
    protected String invalidOperationTargetHost$str() {
        return "WFLYDC0033: 操作はホスト %1$s を対象としますが、このホストは登録されていません。";
    }
    @Override
    protected String caughtExceptionStoringDeploymentContent$str() {
        return "WFLYDC0034: デプロイメントコンテンツの保存時に %1$s を検出しました -- %2$s";
    }
    @Override
    protected String unexpectedInitialPathKey$str() {
        return "WFLYDC0035: 予期せぬ初期のパスキー %1$s";
    }
    @Override
    protected String nullStream$str() {
        return "WFLYDC0036: インデックス %1$d の Null ストリーム。";
    }
    @Override
    protected String invalidByteStream$str() {
        return "WFLYDC0037: バイトストリームは無効です。";
    }
    @Override
    protected String invalidUrlStream$str() {
        return "WFLYDC0038: url ストリームは無効です。";
    }
    @Override
    protected String as7431$str() {
        return "WFLYDC0039: 現在対応しているのはコンテンツのうち 1 つのみです。(AS7-431)";
    }
    @Override
    protected String noDeploymentContentWithHash$str() {
        return "WFLYDC0040: デプロイメントコンテンツリポジトリーにハッシュ %1$s があるデプロイメントコンテンツはありません。";
    }
    @Override
    protected String slaveCannotAcceptUploads$str() {
        return "WFLYDC0041: セカンダリーホストコントローラーは、デプロイメントコンテンツのアップロードを受け付けることができません。";
    }
    @Override
    protected String noDeploymentContentWithName$str() {
        return "WFLYDC0042: %1$s という名前のデプロイメントは見つかりませんでした。";
    }
    @Override
    protected String cannotRemoveDeploymentInUse$str() {
        return "WFLYDC0043: サーバーグループ %2$s によって使用されているため、ドメインからデプロイメント %1$s を削除できません。";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYDC0044: 無効な '%1$s' 値: %2$d、最大インデックスは %3$d です。";
    }
    @Override
    protected String invalidUrl$str() {
        return "WFLYDC0045: %1$s は有効な URL ではありません -- %2$s";
    }
    @Override
    protected String errorObtainingUrlStream$str() {
        return "WFLYDC0046: URL %1$s から入力ストリームの取得エラー -- %2$s";
    }
    @Override
    protected String invalidContentDeclaration$str() {
        return "WFLYDC0047: コンテンツの宣言は無効です。";
    }
    @Override
    protected String cannotUseSameValueForParameters$str() {
        return "WFLYDC0049: パラメーター %2$s と %3$s に同じ値がある %1$s を使用できません。%4$s を使用して同じコンテンツを再度デプロイするか、%5$s を使用してコンテンツを同じ名前の新しいバージョンに置き換えてください。";
    }
    @Override
    protected String deploymentAlreadyStarted$str() {
        return "WFLYDC0050: デプロイメント %1$s はすでに開始されています。";
    }
    @Override
    protected String unknown$str() {
        return "WFLYDC0051: 不明な %1$s %2$s";
    }
    @Override
    protected String unknownServerGroup$str() {
        return "WFLYDC0052: 不明なサーバーグループ %1$s";
    }
    @Override
    protected String unknownServer$str() {
        return "WFLYDC0053: 不明なサーバー %1$s";
    }
    @Override
    protected String invalidCode$str() {
        return "WFLYDC0054: 無効なコード %1$d";
    }
    @Override
    protected String deploymentHashNotFoundInRepository$str() {
        return "WFLYDC0055: レポジトリーにはハッシュ %1$s があるデプロイメントが含まれていません。";
    }
    @Override
    protected String expectedOnlyOneDeployment$str() {
        return "WFLYDC0056: 1 つのデプロイメントのみが予想されましたが、%1$d 個のデプロイメントが見つかりました。";
    }
    @Override
    protected String noProfileCalled$str() {
        return "WFLYDC0057: 呼び出されたプロファイルはありません: %1$s";
    }
    @Override
    protected String noDeploymentContentWithHashAtBoot$str() {
        return "WFLYDC0058: デプロイメント %2$s のデプロイメントコンテンツリポジトリーに、ハッシュ %1$s があるデプロイメントコンテンツがありません。これは致命的な起動エラーです。この問題を解決するには、--admin-only スイッチセットでの再起動、CLI を使用した不足しているコンテンツのインストール、または設定からの削除を行うか、xml 設定ファイルからデプロイメントを削除して再起動します。";
    }
    @Override
    protected String failedToLoadModule$str() {
        return "WFLYDC0059: モジュール '%1$s' のロードに失敗しました。";
    }
    @Override
    protected String invalidJSFSlotValue$str() {
        return "WFLYDC0060: 無効な Jakarta Server Faces スロット値: '%1$s'。ホストコントローラーはデフォルトとは異なる Jakarta Server Faces スロット値を使用できません。このリソースは、そのホストで無視されます";
    }
    @Override
    protected String unknownAttributesFromSubsystemVersion$str() {
        return "WFLYDC0061: サブシステム '%2$s' のモデルバージョン '%3$s' から属性は認識されないため、操作 '%1$s' に失敗します: %4$s";
    }
    @Override
    protected String noSocketBindingGroupCalled$str() {
        return "WFLYDC0062: %1$s という名前の socket-binding-group はありません";
    }
    @Override
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYDC0063: サーバーグループ %3$s 上には、同じランタイム名 %2$s を持つ %1$s というデプロイメントがすでに存在します";
    }
    @Override
    protected String cannotRemoveUsedServerGroup$str() {
        return "WFLYDC0064: サーバー %2$s によって使用されているため、サーバーグループ %1$s を削除できません。";
    }
    @Override
    protected String unsupportedWildcardOperation$str() {
        return "WFLYDC0065: ワイルドカードは複合操作の一部としてサポートされません。";
    }
    @Override
    protected String failedToSendMessage$str() {
        return "WFLYDC0066: メッセージの送信に失敗しました: %1$s";
    }
    @Override
    protected String failedToSendResponseHeader$str() {
        return "WFLYDC0067: 応答ヘッダーの送信に失敗しました: %1$s";
    }
    @Override
    protected String registrationTaskGotInterrupted$str() {
        return "WFLYDC0068: ホスト登録タスクが中断されました";
    }
    @Override
    protected String registrationTaskFailed$str() {
        return "WFLYDC0069: ホスト登録タスクが失敗しました: %1$s";
    }
    @Override
    protected String interruptedAwaitingPreparedResponse$str() {
        return "WFLYDC0070: サーバーが準備した応答の待機中に %1$s が中断されました -- サーバー %2$s のアップデートをキャンセルしています";
    }
    @Override
    protected String interruptedAwaitingHostPreparedResponse$str() {
        return "WFLYDC0071: ホストが準備した応答の待機中に中断されました -- ホスト %1$s のアップデートをキャンセルしています";
    }
    @Override
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYDC0072: アップロードしたデプロイメントコンテンツを読み取り中に IOException を検出しました。";
    }
    @Override
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYDC0073: %1$s デプロイメントは再デプロイされ、デプロイメントのコンテンツは削除されません。再起動する必要があります。";
    }
    @Override
    protected String operationFailedOrRolledBackWithCause$str() {
        return "WFLYDC0074: 操作に失敗しました。あるいは全サーバー上でロールバックされました。サーバーの障害:";
    }
    @Override
    protected String missingExtensions$str() {
        return "WFLYDC0075: 足りない拡張があるため、モデルを同期化できません: %1$s";
    }
    @Override
    protected String duplicateProfileInclude$str() {
        return "WFLYDC0076: 複製にプロファイル '%1$s' が含まれています";
    }
    @Override
    protected String duplicateSocketBindingGroupInclude$str() {
        return "WFLYDC0077: 複製にソケットバインディンググループ '%1$s' が含まれています";
    }
    @Override
    protected String cloneOperationNotSupportedOnHost$str() {
        return "WFLYDC0078: ホスト '%1$s' ではプロファイルクローン操作が使用できません。プロファイルクローン操作をサポートしない旧式のセカンダリーホストが含まれるドメインで使用できるようにするには、次のいずれかを行う必要があります。 a) モデルバージョンが 4.0.0 未満である旧式のセカンダリーホストすべてがクローンされたプロファイルと 'to-profile' パラメーターで指定されたプロファイルを無視するようにします。 b) ドメインコントローラーが管理者専用モードになるようリロードし、クローンを実行した後にドメインコントローラーが通常モードに戻るようリロードします。セカンダリーホストをリロードする必要があるかどうかを確認します。";
    }
    @Override
    protected String timedOutAwaitingHostPreparedResponses$str() {
        return "WFLYDC0079: ホスト %2$s から送信されるホストが準備した応答を %1$d ミリ秒待った後、タイムアウトしました -- ホスト %3$s のアップデートをキャンセルしています";
    }
    @Override
    protected String timedOutAwaitingHostPreparedResponse$str() {
        return "WFLYDC0080: ホストが準備した応答を %1$d ミリ秒待った後、タイムアウトしました -- リモートホスト %2$s が操作をキャンセルする通知を受け取りました。";
    }
    @Override
    protected String timedOutAwaitingFinalResponse2$str() {
        return "WFLYDC0081: ホスト %2$s からの最終応答を %1$d ミリ秒待った後、タイムアウトしました -- リモートプロセスが操作をキャンセルする通知を受け取りました。";
    }
    @Override
    protected String timedOutAwaitingPreparedResponse$str() {
        return "WFLYDC0082: サーバーが準備した応答を %2$d ミリ秒待った後、%1$s がタイムアウトしました -- サーバー %3$s のアップデートをキャンセルしています。";
    }
    @Override
    protected String timedOutAwaitingFinalResponse3$str() {
        return "WFLYDC0083: ホスト %3$s でサーバー %2$s からの最終応答を %1$d ミリ秒待った後、タイムアウトしました -- リモートプロセスは操作をキャンセルする通知を受け取りました。";
    }
    @Override
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYDC0084: 自己充足的なサーバーでデプロイメントを展開できません";
    }
    @Override
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYDC0085: 管理されていないデプロイメントを展開できません";
    }
    @Override
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYDC0086: すでに展開されたデプロイメントを展開できません";
    }
    @Override
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYDC0087: すでにデプロイされたデプロイメントを展開できません";
    }
    @Override
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYDC0088: 自己充足的なサーバーでデプロイメントにコンテンツを追加できません";
    }
    @Override
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYDC0089: 未管理のデプロイメントにコンテンツを追加できません";
    }
    @Override
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYDC0090: 展開されていないデプロイメントにコンテンツを追加できません";
    }
    @Override
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYDC0091: 自己充足的なサーバーでデプロイメントからコンテンツを削除できません";
    }
    @Override
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYDC0092: 未管理のデプロイメントからコンテンツを削除できません";
    }
    @Override
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYDC0093: 展開されていないデプロイメントからコンテンツを削除できません";
    }
    @Override
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYDC0094: 自己充足的なサーバーでデプロイメントからコンテンツを読み取ることができません";
    }
    @Override
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYDC0095: 未管理のデプロイメントからコンテンツを読み取ることができません";
    }
    @Override
    protected String cannotReadContentFromUnexplodedDeployment$str() {
        return "WFLYDC0096: 展開されていないデプロイメントからコンテンツを読み取ることができません";
    }
    @Override
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYDC0097: 展開されていないデプロイメントのサブデプロイメントを展開できません";
    }
    @Override
    protected String serverManagementUnavailableDuringBoot$str() {
        return "WFLYDC0098: 次のサーバー %1$s が起動中です。現在、リモート管理操作は実行できません。";
    }
}
