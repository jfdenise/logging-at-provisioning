package org.jboss.as.ejb3.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:16+0200")
public class EjbLogger_$logger_ja extends EjbLogger_$logger implements EjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EjbLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToCreateOptionForProperty$str() {
        return "WFLYEJB0050: %2$s が原因でプロパティー %1$s の解析に失敗しました";
    }
    @Override
    protected String beanWithRemoteAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0082: Bean %1$s は @Remote アノテーションを指定していますが、インターフェース 1 つを実装しません。";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYEJB0085: %1$s 解析中の例外";
    }
    @Override
    protected String removeMethodIsNull$str() {
        return "WFLYEJB0235: @Remove メソッド識別子は null を取ることができません";
    }
    @Override
    protected String failToCallgetRollbackOnlyAfterTxcompleted$str() {
        return "WFLYEJB0175: トランザクション完了後、getRollbackOnly() は利用できません。(EJBTHREE-1445)";
    }
    @Override
    protected String methodNameIsNull$str() {
        return "WFLYEJB0170: メソッド名は null を取ることができません";
    }
    @Override
    protected String invalidEjbEntityTimeout$str() {
        return "WFLYEJB0272: Jakarta Enterprise Beans %1$s エンティティー Bean %2$s は TimedObject を実装しましたが、ノテーションあるいはデプロイメント記述子のどちらかで指定された異なる timeout メソッドが存在します";
    }
    @Override
    protected String cannotBeApplicationExceptionBecauseNotAnExceptionType$str() {
        return "WFLYEJB0079: [Enterprise Beans 3.1 spec, section 14.1.1] クラス: %1$s は java.lang.Exception 型ではないため、アプリケーション例外としてマーク付けできません。";
    }
    @Override
    protected String unknownResourceAdapter$str() {
        return "WFLYEJB0199: リソースアダプター名 %1$s で登録されているリソースアダプターはありません。";
    }
    @Override
    protected String noComponentAvailableForAddress$str() {
        return "WFLYEJB0369: アドレス %1$s に利用できる Jakarta Enterprise Beans コンポーネントがありません";
    }
    @Override
    protected String cannotBuildIndexForServerInterceptor$str() {
        return "WFLYEJB0511: サーバーインターセプタークラス %1$s のリフレクションインデックスをビルドできません。";
    }
    @Override
    protected String scheduleExpressionDateFromTimerPersistenceInvalid$str() {
        return "WFLYEJB0495: 無効であるため、タイマー ID %1$s のスケジュールされた式に対する永続化開始日および終了日を無視します: %2$s 。";
    }
    @Override
    protected String transactionInUnexpectedState$str() {
        return "WFLYEJB0448: トランザクション '%1$s' は想定外の状態です (%2$s)";
    }
    @Override
    protected String mdbClassCannotBeAnInterface$str() {
        return "WFLYEJB0120: [Enterprise Beans 3.1 spec, section 5.6.2] メッセージ駆動型 bean 実装クラスはインターフェースにしてはいけません。%1$s はインターフェースであるため、メッセージ駆動型 bean として認められません";
    }
    @Override
    protected String failToInvokeTimeout$str() {
        return "WFLYEJB0343: メソッド %1$s は timeout メソッドではないため、timeout メソッドを呼び出すことができません";
    }
    @Override
    protected String defaultInterceptorsNotSpecifyOrder$str() {
        return "WFLYEJB0414: デフォルトのインターセプターは ejb-jar.xml で <interceptor-order> 要素を指定できません";
    }
    @Override
    protected String failedToPersistTimerOnStartup$str() {
        return "WFLYEJB0497: 起動時にタイマー %1$s を永続化できませんでした。これは、他のクラスターメンバーが同じ変更を行ったためである可能性が高く、操作には影響しないはずです。";
    }
    @Override
    protected String cannotDeactivateHomeServant$str() {
        return "WFLYEJB0146: ホームサーバントを非アクティベートできません";
    }
    @Override
    protected String failToCallgetRollbackOnly$str() {
        return "WFLYEJB0173: Enterprise Beans 3.1 FR 13.6.1: コンテナーが管理するトランザクション境界を持つ bean のみが getRollbackOnly を利用できます。";
    }
    @Override
    protected String failToLookupStrippedJNDI$str() {
        return "WFLYEJB0181: コンテキスト: %2$s で jndi 名: %1$s をルックアップできませんでした。";
    }
    @Override
    protected String suspensionComplete$str() {
        return "WFLYEJB0493: Jakarta Enterprise Beans サブシステムの一時停止が完了しました";
    }
    @Override
    protected String failedToCreateSessionForStatefulBean$str() {
        return "WFLYEJB0423: ステートフル Bean %1$s のセッションを作成できませんでした";
    }
    @Override
    protected String unknownComponentDescriptionType$str() {
        return "WFLYEJB0365: 不明な Jakarta Enterprise Beans コンポーネントの説明タイプ %1$s";
    }
    @Override
    protected String failedToRefreshTimers$str() {
        return "WFLYEJB0456: %1$s に対してタイマーをリフレッシュできませんでした";
    }
    @Override
    protected String failToLinkToEmptySecurityRole$str() {
        return "WFLYEJB0194: null あるいは空のセキュリティロールへリンクできません: %1$s";
    }
    @Override
    protected String invalidScheduleExpressionType$str() {
        return "WFLYEJB0291: 無効な値: %1$s 、 %2$s は型 %3$s の値をサポートしないためです";
    }
    @Override
    protected String transactionAlreadyRolledBack$str() {
        return "WFLYEJB0447: トランザクション '%1$s' はすでにロールバックされました";
    }
    @Override
    protected String ejbMustNotBeInnerClass$str() {
        return "WFLYEJB0128: %1$s 型の Jakarta Enterprise Beans %2$s は、内部クラスにはできません";
    }
    @Override
    protected String deploymentRemoveListenerException$str() {
        return "WFLYEJB0142: デプロイメント削除リスナー呼び出しの例外";
    }
    @Override
    protected String failedToGetStatus$str() {
        return "WFLYEJB0157: 状態を取得できませんでした";
    }
    @Override
    protected String timerIsActive$str() {
        return "WFLYEJB0446: タイマー %1$s はすでにアクティブです。";
    }
    @Override
    protected String failureDuringLoadOfClusterNodeSelector$str() {
        return "WFLYEJB0049: クラスター %1$s に対し、クラスターノードセレクター %2$s のインスタンスを作成できませんでした。";
    }
    @Override
    protected String skipOverlappingInvokeTimeout$str() {
        return "WFLYEJB0043: タイマー %1$s の以前の実行はまだ進行中です。この重複するスケジュールされた実行を %2$s でスキップします。";
    }
    @Override
    protected String timerNotRunning$str() {
        return "WFLYEJB0489: トランザクションが起動できなかったため %1$s はトランザクションとして実行されていません";
    }
    @Override
    protected String failProcessInvocation$str() {
        return "WFLYEJB0363: %1$s は view クラス %3$s のメソッド %2$s を処理できません。想定されるview メソッドは view クラス %5$s の %4$s です。";
    }
    @Override
    protected String wrongTransactionIsolationConfiguredForTimer$str() {
        return "WFLYEJB0460: タイマーが 1 度のみ実行されるようにするため、トランザクションの分離は READ_COMMITTED と同等またはより厳格でなければなりません";
    }
    @Override
    protected String nextExpirationIsNull$str() {
        return "WFLYEJB0017: 次の有効期限は null です。タイマー %1$S に設定されているタスクはありません。";
    }
    @Override
    protected String invalidTimerNotCalendarBaseTimer$str() {
        return "WFLYEJB0329: タイマー %1$s は暦ベースのタイマーではありません";
    }
    @Override
    protected String notStatefulSessionBean$str() {
        return "WFLYEJB0053: %1$s はアプリケーション %2$s 、モジュール %3$s、distinct-name %4$s のステートフルセッション Bean ではありません。";
    }
    @Override
    protected String invalidComponentState$str() {
        return "WFLYEJB0370: アドレス %1$s の Jakarta Enterprise Beans コンポーネントは %n の状態の %2$s です。また、%3$s の状態である必要があります";
    }
    @Override
    protected String componentIsShuttingDown$str() {
        return "WFLYEJB0421: コンポーネントが終了中であるため、呼び出しを処理できません";
    }
    @Override
    protected String annotationApplicableOnlyForMethods$str() {
        return "WFLYEJB0057: %1$s アノテーションはメソッドターゲットのみで有効です";
    }
    @Override
    protected String invokerIsNull$str() {
        return "WFLYEJB0303: 呼び出し元は null を取ることができません";
    }
    @Override
    protected String unknownTxAttributeOnInvocation$str() {
        return "WFLYEJB0061: 呼び出し %2$s のトランザクション属性 %1$s が不明です";
    }
    @Override
    protected String failedToCreateDeploymentNodeSelector$str() {
        return "WFLYEJB0125: デプロイメントノードセレクター %1$s のインスタンスを作成できませんでした。";
    }
    @Override
    protected String cannotCall$str() {
        return "WFLYEJB0376: %2$s あるいは %3$s 経由で呼び出す場合 %1$s を呼び出すことはできません";
    }
    @Override
    protected String groupCreationContextAlreadyExists$str() {
        return "WFLYEJB0404: グループ作成コンテキストはすでに存在します";
    }
    @Override
    protected String timerInvocationFailed$str() {
        return "WFLYEJB0468: タイマー呼び出しに失敗しました";
    }
    @Override
    protected String failedToActivateMdb$str() {
        return "WFLYEJB0501: MDB %1$s のアクティベートに失敗しました";
    }
    @Override
    protected String passivationFailed$str() {
        return "WFLYEJB0400: %1$s のパッシベートに失敗しました。";
    }
    @Override
    protected String beanWithLocalAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0083: Bean %1$s は @Local アノテーションを指定していますが、インターフェース 1 つを実装しません。";
    }
    @Override
    protected String couldNotFindClassLoaderForStub$str() {
        return "WFLYEJB0382: スタブ %1$s に対する ClassLoader を判断することができませんでした";
    }
    @Override
    protected String duplicateCacheEntry$str() {
        return "WFLYEJB0397: %1$s はすでにキャッシュ内に存在します。";
    }
    @Override
    protected String failToRestoreTimersForObjectId$str() {
        return "WFLYEJB0031: %1$s のタイマーをリストアできませんでした。";
    }
    @Override
    protected String failToCreateDirectoryForPersistTimers$str() {
        return "WFLYEJB0032: Jakarta Enterprise Beans タイマーを永続化するためのディレクトリー %1$s を作成できませんでした。";
    }
    @Override
    protected String failToAddClassToLocalView$str() {
        return "WFLYEJB0220: [Enterprise Beans 3.1 spec, section 4.9.7] - bean: %2$s に対しリモートビューとしてマークされているため、ビュークラス: %1$s をローカルビューとして追加できません";
    }
    @Override
    protected String failToUpgradeToWriteLock$str() {
        return "WFLYEJB0238: Enterprise Beans 3.1 PFD2 4.8.5.1.1 読み取りロックから書き込みロックにアップグレードすることは許可されていません";
    }
    @Override
    protected String failedToAnalyzeRemoteInterface$str() {
        return "WFLYEJB0084: %1$s のリモートインターフェースを分析できませんでした。";
    }
    @Override
    protected String viewNotFound$str() {
        return "WFLYEJB0051: Jakarta Enterprise Beans %2$s のビュー %1$s が見つかりませんでした";
    }
    @Override
    protected String failToFindMethodWithParameterTypes$str() {
        return "WFLYEJB0261: ejb-jar.xml で参照されるパラメーター型 %3$s を持つメソッド %1$s.%2$s が見つかりませんでした。";
    }
    @Override
    protected String beanHomeInterfaceIsNull$str() {
        return "WFLYEJB0171: Bean %1$s には Home インターフェースがありません。";
    }
    @Override
    protected String invalidComponentType$str() {
        return "WFLYEJB0356: Jakarta Enterprise Beans コンポーネントタイプ %1$s はプールをサポートしません";
    }
    @Override
    protected String failToGetEjbComponent$str() {
        return "WFLYEJB0276: EJBComponent は現在の呼び出しコンテキスト %1$s に設定されていませんでした。";
    }
    @Override
    protected String profileAndRemotingEjbReceiversUsedTogether$str() {
        return "WFLYEJB0465: 無効なクライアント記述子設定: 'profile' および 'remoting-ejb-receivers' を一緒に使用することはできません";
    }
    @Override
    protected String ejbNotFoundInDeployment$str() {
        return "WFLYEJB0056: 一致するデプロイメントに Jakarta Enterprise Beans が見つかりませんでした: %1$s";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForBean$str() {
        return "WFLYEJB0412: @Clustered アノテーションをクラス %3$s の %2$s Bean に使用できないため、%1$s は失敗しました。";
    }
    @Override
    protected String concurrentAccessTimeoutException$str() {
        return "WFLYEJB0241: Enterprise Beans 3.1 PFD2 4.8.5.5.1 %1$s で同時アクセスタイムアウトが発生 - %2$s 内でロックを取得できませんでした";
    }
    @Override
    protected String componentInstanceNotAvailable$str() {
        return "WFLYEJB0225: コンポーネントインスタンスは、呼び出し: %1$s では利用できません。";
    }
    @Override
    protected String statefulSessionIdIsNull$str() {
        return "WFLYEJB0234: ステートフルコンポーネント: %1$s に対してセッション id が設定されていません。";
    }
    @Override
    protected String cannotUnregisterEJBHomeFromCobra$str() {
        return "WFLYEJB0145: CORBA ネーミングサービスより EJBHome の登録を解除できません";
    }
    @Override
    protected String setRollbackOnlyFailed$str() {
        return "WFLYEJB0005: ロールバックのみの設定に失敗しました; 無視します";
    }
    @Override
    protected String moreThanOneMethodWithSameNameOnComponent$str() {
        return "WFLYEJB0096: %2$s に %1$s という名前のメソッドが複数見つかりました。";
    }
    @Override
    protected String txPresentForNeverTxAttribute$str() {
        return "WFLYEJB0063: 未呼び出し中のサーバーで存在するトランザクション (Enterprise Beans 3 13.6.2.6)";
    }
    @Override
    protected String noJNDIBindingsForSessionBean$str() {
        return "WFLYEJB0111: ビューが公開されていないため、Jakarta Enterprise Beans %1$s に jndi バインディングが作成されません";
    }
    @Override
    protected String componentIsNull$str() {
        return "WFLYEJB0239: %1$s は null を取ることができません。";
    }
    @Override
    protected String databaseDialectNotConfiguredOrDetected$str() {
        return "WFLYEJB0462: タイマーサービスの database-data-store データベース属性は設定されておらず、接続メタデータまたは JDBC ドライバー名から検出されません。";
    }
    @Override
    protected String lockAcquisitionInterrupted$str() {
        return "WFLYEJB0394: %1$s でロックの取得に失敗しました。";
    }
    @Override
    protected String failToReadTimerInformation$str() {
        return "WFLYEJB0026: Jakarta Enterprise Beans コンポーネント %1$s のタイマー情報を読み込めません";
    }
    @Override
    protected String dynamicStubCreationFailed$str() {
        return "WFLYEJB0037: クラス %1$s に対する、動的なスタブ作成に失敗しました。";
    }
    @Override
    protected String clusteredAnnotationNotYetImplementedForSingletonBean$str() {
        return "WFLYEJB0411: @Clustered アノテーションはシングルトン Jakarta Enterprise Beans への対応はしていません。%2$s bean はクラス %3$s で @Clustered が付けられているため、%1$s は失敗しました";
    }
    @Override
    protected String timerInvocationRolledBack$str() {
        return "WFLYEJB0110: タイマーの呼び出しに失敗しました。トランザクションがロールバックされました";
    }
    @Override
    protected String failToCallEjbCreateForHomeInterface$str() {
        return "WFLYEJB0275: Jakarta Enterprise Beans %2$s のホームインターフェースメソッド %1$s に対応する ejbCreate あるいは @Init メソッドを解決できませんでした";
    }
    @Override
    protected String illegalCallToEjbHomeRemove$str() {
        return "WFLYEJB0073: セッション bean で EJBHome.remove(Object) への呼び出しは不正です";
    }
    @Override
    protected String failToCallBusinessOnNonePublicMethod$str() {
        return "WFLYEJB0224: ビジネスメソッド %1$s ではありません。Jakarta Enterprise Beans ではパブリックでないメソッドを呼び出さないでください";
    }
    @Override
    protected String ejbMustBePublicClass$str() {
        return "WFLYEJB0129: %1$s 型の Jakarta Enterprise Beans %2$s は public を宣言する必要があります";
    }
    @Override
    protected String failToLookupJNDI$str() {
        return "WFLYEJB0179: jndi 名をルックアップできませんでした: %1$s";
    }
    @Override
    protected String couldNotFindViewMethodOnEjb$str() {
        return "WFLYEJB0384: Jakarta Enterprise Beans クラス %3$s で ビュー %1$s からメソッド %2$s が見つかりませんでした";
    }
    @Override
    protected String moreThanOneEjbFound4$str() {
        return "WFLYEJB0407: バインディング %3$s に対し、インターフェース型 '%1$s' と名前 '%2$s' を持つ 1 つ以上の Jakarta Enterprise Beans が見つかりました。発見: %4$s";
    }
    @Override
    protected String incorrectEJBLocatorForBean$str() {
        return "WFLYEJB0099: 提供されるロケーター %1$s は Jakarta Enterprise Beans %2$s 用にありませんでした";
    }
    @Override
    protected String businessInterfaceIsNull$str() {
        return "WFLYEJB0221: ビジネスインターフェース型は null を取ることができません。";
    }
    @Override
    protected String sessionBeanClassCannotBeAnInterface$str() {
        return "WFLYEJB0118: [Enterprise Beans 3.1 spec, section 4.9.2] セッション bean 実装クラスはインターフェースにしてはいけません。%1$s はインターフェースであるため、セッション bean として認められません";
    }
    @Override
    protected String failedToAcquirePermit$str() {
        return "WFLYEJB0378: %1$s %2$s 内で権限の取得に失敗しました";
    }
    @Override
    protected String cannotCallGetPKOnSessionBean$str() {
        return "WFLYEJB0075: セッション bean で getPrimaryKey を呼び出しできません";
    }
    @Override
    protected String missingCacheEntry$str() {
        return "WFLYEJB0398: キャッシュに%1$s はありません。";
    }
    @Override
    protected String couldNotWriteMethodInvocation$str() {
        return "WFLYEJB0150: appname %3$s modulename %4$s distinctname %5$s に対する %2$s という名称の Bean 上におけるメソッド %1$s のメソッド呼び出しエラーを書き込みできませんでした。原因:";
    }
    @Override
    protected String viewInterfaceCannotBeNull$str() {
        return "WFLYEJB0065: view インターフェースは null にできません";
    }
    @Override
    protected String exceptionRunningTimerTask$str() {
        return "WFLYEJB0164: Jakarta Enterprise Beans %2$s のタイマー %1$s に対するタイマータスク実行の例外";
    }
    @Override
    protected String failToCloseFile$str() {
        return "WFLYEJB0030: ファイルの終了エラー ";
    }
    @Override
    protected String rmiRemoteExceptionCannotBeApplicationException$str() {
        return "WFLYEJB0080: [Enterprise Beans 3.1 spec, section 14.1.1] 例外クラス: %1$s は java.rmi.RemoteException 型であるため、アプリケーション例外としてマーク付けできません。";
    }
    @Override
    protected String multipleMethodReferencedInEjbJarXml$str() {
        return "WFLYEJB0260: ejb-jar.xml で参照されるクラス %2$s で 1つ以上のメソッド %1$s が見つかりました。パラメーター型を指定してあいまいさを解決してください。";
    }
    @Override
    protected String ejbNotExposedOverIIOP$str() {
        return "WFLYEJB0036: Jakarta Enterprise Beans Bean %1$s は、IIOP 経由で公開されていないため、スタブに置き換えられません";
    }
    @Override
    protected String invalidTimerHandlersForPersistentTimers$str() {
        return "WFLYEJB0327: %1$s タイマーハンドルは永続タイマーに対してのみ利用できます。";
    }
    @Override
    protected String couldNotDetermineLocalInterfaceFromLocalHome$str() {
        return "WFLYEJB0438: ローカルホームインターフェース %1$s からBean %2$s のローカルインターフェースを判断できませんでした";
    }
    @Override
    protected String onlySetterMethodsAllowedToHaveEJBAnnotation$str() {
        return "WFLYEJB0090: @EJB インジェクションターゲット %1$s は無効です。setter メソッドのみ許可されます。";
    }
    @Override
    protected String mustOnlyBeSingleContainerTransactionElementWithWildcard$str() {
        return "WFLYEJB0454: ejb-name が * の <container-transaction> では 1 つのインスタンスのみが存在可能です。";
    }
    @Override
    protected String acquireSemaphoreInterrupted$str() {
        return "WFLYEJB0379: セマフォの取得が中断されました";
    }
    @Override
    protected String cannotLoadServerInterceptorModule$str() {
        return "WFLYEJB0514: サーバーインターセプターモジュール %1$s をロードできません。";
    }
    @Override
    protected String timerUpdateFailedAndRollbackNotPossible$str() {
        return "WFLYEJB0461: アップデートタイマーが失敗し、トランザクションをロールバックできませんでした!";
    }
    @Override
    protected String deploymentAddListenerException$str() {
        return "WFLYEJB0141: デプロイメント追加リスナー呼び出しの例外";
    }
    @Override
    protected String timerFileStoreDirNotExist$str() {
        return "WFLYEJB0345: タイマーファイルストアディレクトリー %1$s は存在しません。";
    }
    @Override
    protected String paramCannotBeNull$str() {
        return "WFLYEJB0416: %1$s は null を取ることができません";
    }
    @Override
    protected String failedToObtainSSLContext$str() {
        return "WFLYEJB0494: SSLContext の取得に失敗しました";
    }
    @Override
    protected String failedToLookupORB$str() {
        return "WFLYEJB0100: java:comp/ORB のルックアップに失敗しました";
    }
    @Override
    protected String failToLoadComponentClass$str() {
        return "WFLYEJB0262: コンポーネント %1$s のコンポーネントクラスをロードできませんでした";
    }
    @Override
    protected String entityBeansAreNotSupported$str() {
        return "WFLYEJB0450: エンティティー Bean はサポート対象外になりました。Bean %1$s をデプロイできません。";
    }
    @Override
    protected String multipleCreateMethod$str() {
        return "WFLYEJB0267: ホーム %1$s に異なる戻り型を持つ複数の create* メソッドがあるため、対応する暗黙の EJB 2.x ローカルインターフェースの型を判断できませんでした (EJB 3.1 21.4.5 参照) %n";
    }
    @Override
    protected String txRequiredForInvocation$str() {
        return "WFLYEJB0062: 呼び出し %1$s にはトランザクションが必要です。";
    }
    @Override
    protected String couldNotDetermineEjbRefForInjectionTarget$str() {
        return "WFLYEJB0088: インジェクションターゲット %2$s の ejb-ref %1$s 型を判断できませんでした。";
    }
    @Override
    protected String jndiBindings$str() {
        return "WFLYEJB0473: デプロイメントユニット '%2$s'の '%1$s' という名前のセッション Bean の JNDI バインディングは次のとおりです:%3$s";
    }
    @Override
    protected String activationConfigPropertyIgnored$str() {
        return "WFLYEJB0006: リソースアダプターで許可されないため、ActivationConfigProperty %1$s は無視されます: %2$s";
    }
    @Override
    protected String nameAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0091: @EJB 属性 'name' がクラスレベルのアノテーションには必要です。クラス: %1$s";
    }
    @Override
    protected String failToMergeData$str() {
        return "WFLYEJB0264: %1$s に対するデータをマージできませんでした";
    }
    @Override
    protected String beanComponentMissingEjbObject$str() {
        return "WFLYEJB0222: Bean %1$s には %2$s がありません。";
    }
    @Override
    protected String failToCallSetRollbackOnlyOnNoneCMB$str() {
        return "WFLYEJB0182: Enterprise Beans 3.1 FR 13.6.1: コンテナーが管理するトランザクション境界を持つ bean のみが setRollbackOnly を利用できます。";
    }
    @Override
    protected String failToFindMethodInEjbJarXml$str() {
        return "WFLYEJB0259: ejb-jar.xml で参照されるメソッド %1$s.%2$s が見つかりませんでした。";
    }
    @Override
    protected String ejbMethodMustNotBeFinalNorStatic$str() {
        return "WFLYEJB0131: Jakarta Enterprise Beans %1$s には final または static メソッド (%2$s) を含めることはできません";
    }
    @Override
    protected String setRollbackOnlyNotAllowedForSupportsTxAttr$str() {
        return "WFLYEJB0074: Enterprise Beans 3.1 FR 13.6.2.8 setRollbackOnly は SUPPORTS トランザクション属性と使用できません。";
    }
    @Override
    protected String rmiIiopVoliation$str() {
        return "WFLYEJB0471: RMI/IIOP 違反: %1$s%n";
    }
    @Override
    protected String mdbOnMessageMethodCantBeFinal$str() {
        return "WFLYEJB0503: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] メッセージ駆動型 Bean の 'onMessage' メソッドは final にできません (MDB: %1$s)。";
    }
    @Override
    protected String defaultInterceptorClassNotListed$str() {
        return "WFLYEJB0010: デフォルトのインターセプタークラス %1$s は ejb-jar.xml の <interceptors> セクションにリストされていないので適用されません。";
    }
    @Override
    protected String EjbJarConfigurationIsNull$str() {
        return "WFLYEJB0184: EjbJarConfiguration は null を取ることができません";
    }
    @Override
    protected String aroundTimeoutMethodExpectedWithInvocationContextParam$str() {
        return "WFLYEJB0058: @jakarta.interceptor.AroundTimeout アノテーションが付けられたクラス %2$s のメソッド %1$s は jakarta.interceptor.InvocationContext 型のパラメーターを 1 つ許可することが想定されます";
    }
    @Override
    protected String cannotBeginUserTransaction$str() {
        return "WFLYEJB0491: コンテナーが中断されたためトランザクション開始リクエストが拒否されました";
    }
    @Override
    protected String missingClassInAnnotation$str() {
        return "WFLYEJB0521: アノテーションで参照される一部のクラス: クラスの %1$s: %2$s がありません。";
    }
    @Override
    protected String couldNotDetermineRemoteInterfaceFromHome$str() {
        return "WFLYEJB0437: ホームインターフェース %1$s から Bean %2$s のリモートインターフェースを判断できませんでした";
    }
    @Override
    protected String couldNotCreateTable$str() {
        return "WFLYEJB0163: タイマー永続性のテーブルを作成できません";
    }
    @Override
    protected String timerNotFound$str() {
        return "WFLYEJB0526: タイマー %1$s は存在しません";
    }
    @Override
    protected String couldNotDetermineEjbLocalRefForInjectionTarget$str() {
        return "WFLYEJB0089: インジェクションターゲット %2$s の ejb-local-ref %1$s 型を判断できませんでした。";
    }
    @Override
    protected String componentNotInstanceOfSessionComponent$str() {
        return "WFLYEJB0236: コンポーネントクラス %2$s%n のコンポーネント %1$s は %3$s コンポーネントではありません。";
    }
    @Override
    protected String invocationOfMethodNotAllowed$str() {
        return "WFLYEJB0364: Bean %2$s のメソッド %1$s の呼び出しは許可されません";
    }
    @Override
    protected String failToLookupJNDINameSpace$str() {
        return "WFLYEJB0180: java:app、java:module、java:comp、あるいは java:global 名前空間に所属しないため、jndi 名: %1$s をルックアップできません。";
    }
    @Override
    protected String couldNotCreateCorbaObject$str() {
        return "WFLYEJB0098: %1$s の CORBA オブジェクトを作成できませんでした。";
    }
    @Override
    protected String unsupportedEJBReceiverProtocol$str() {
        return "WFLYEJB0536: サポートされていない EJB レシーバープロトコル %1$s";
    }
    @Override
    protected String invalidComponentConfiguration$str() {
        return "WFLYEJB0348: %1$s は Jakarta Enterprise Beans コンポーネントではありません";
    }
    @Override
    protected String reentrantSingletonCreation$str() {
        return "WFLYEJB0132: %1$s 型の Jakarta Enterprise Beans シングルトン %2$s の @PostConstruct メソッドが再帰的に呼び出されました";
    }
    @Override
    protected String invalidSecurityForDomainSet$str() {
        return "WFLYEJB0347: Jakarta Enterprise Beans %1$s はセキュリティーに対して有効化されますが、セキュリティードメインは設定されていません";
    }
    @Override
    protected String clusteredEJBsBoundToINADDRANY$str() {
        return "WFLYEJB0509: ノードのクラスター化 Jakarta Enterprise Beans: %1$s は INADDR_ANY (%2$s) にバインドされます。ワイルドカードのないサーバーバインドアドレスを使用するか、クライアントマッピングエントリーを Remoting コネクターの関連するソケットバインディングに追加します";
    }
    @Override
    protected String failToLoadAppExceptionClassInEjbJarXml$str() {
        return "WFLYEJB0271: ejb-jar.xml にアプリケーション例外クラス %1$s をロードできませんでした";
    }
    @Override
    protected String cannotRemoveWhileParticipatingInTransaction$str() {
        return "WFLYEJB0386: Jakarta Enterprise Beans 4.6.4 は、トランザクションに参加中に Enterprise Beans 2.x remove() メソッドを介して Jakarta Enterprise Beans を削除できません";
    }
    @Override
    protected String timerServiceWithIdNotRegistered$str() {
        return "WFLYEJB0338: timedObjectId %1$s を持つ Timerservice は登録されません";
    }
    @Override
    protected String failedToLoadViewClass$str() {
        return "WFLYEJB0087: ビュー %1$s をロードできませんでした。";
    }
    @Override
    protected String noAsynchronousInvocationInProgress$str() {
        return "WFLYEJB0244: 進行中の非同期呼び出しはありません";
    }
    @Override
    protected String mappedNameNotSupported$str() {
        return "WFLYEJB0525: Jakarta Enterprise Beans アノテーションの 'mappedName' はサポートされていません。Jakarta Enterprise Beans '%1$s' の '%2$s' の値は無視されます。";
    }
    @Override
    protected String mdbOnMessageMethodCantBePrivate$str() {
        return "WFLYEJB0504: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] メッセージ駆動型 Bean の 'onMessage' メソッドは private にできません (MDB: %1$s)。";
    }
    @Override
    protected String ejbMustNotBeFinalClass$str() {
        return "WFLYEJB0130: %1$s 型の Jakarta Enterprise Beans %2$s は final を宣言できません";
    }
    @Override
    protected String strictPoolDerivedFromCPUs$str() {
        return "WFLYEJB0482: 厳格なプール %1$s は、このホストの CPU 数から派生された %2$d の最大インスタンスサイズ (クラスごと) を使用しています。";
    }
    @Override
    protected String ejbJarConfigNotFound$str() {
        return "WFLYEJB0195: デプロイメントユニットで添付として、EjbJarConfiguration が見つかりませんでした: %1$s";
    }
    @Override
    protected String resourceAdapterRepositoryUnAvailable$str() {
        return "WFLYEJB0044: リソースアダプターリポジトリは利用できません";
    }
    @Override
    protected String invalidTransactionTypeForSfsbLifecycleMethod$str() {
        return "WFLYEJB0463: クラス %3$s の SFSB ライフサイクルメソッド %2$s での無効なトランザクション属性タイプ %1$s。 有効な型は REQUIRES_NEW および NOT_SUPPORTED です。メソッドは NOT_SUPPORTED として処理されます。";
    }
    @Override
    protected String exceptionCheckingIfTimerShouldRun$str() {
        return "WFLYEJB0502: 例外、タイマー %1$s が実行されるべきかをチェックしています";
    }
    @Override
    protected String wrongTxOnThread$str() {
        return "WFLYEJB0060: スレッドのトランザクションが正しくありません: %1$s が想定されましたが実際は %2$s でした";
    }
    @Override
    protected String unknownMessageListenerType$str() {
        return "WFLYEJB0383: リソースアダプター %2$s で型 %1$s のメッセージリスナーが見つかりませんでした";
    }
    @Override
    protected String unknownDeployment$str() {
        return "WFLYEJB0055: Jakarta Enterprise Beans に一致するデプロイメントはありません。%1$s";
    }
    @Override
    protected String skipInvokeTimeoutDuringRetry$str() {
        return "WFLYEJB0162: 以前実行したタイマー %1$s が再試行されています。%2$s の定期実行をスキップします。";
    }
    @Override
    protected String messageEndpointAlreadyReleasedISE$str() {
        return "WFLYEJB0535: メッセージエンドポイント %1$s はすでに解放されています";
    }
    @Override
    protected String failToLinkFromEmptySecurityRole$str() {
        return "WFLYEJB0193: null あるいは空のセキュリティロールからリンクできません: %1$s";
    }
    @Override
    protected String executorIsNull$str() {
        return "WFLYEJB0305: エグゼキューターは null を取ることができません";
    }
    @Override
    protected String sessionTypeNotSpecified$str() {
        return "WFLYEJB0413: <session-type> は Jakarta Enterprise Beans %1$s には指定されていません。これは ejb-jar.xml に存在する必要があります";
    }
    @Override
    protected String singletonCantImplementSessionBean$str() {
        return "WFLYEJB0515: [Jakarta Enterprise Beans 3.2 仕様のセクション 4.9.2] シングルトンセッション Bean は 'jakarta.ejb.SessionBean' インターフェースを実装できません。Bean '%1$s' 上のこのインターフェースは無視され、削除する必要があります。";
    }
    @Override
    protected String unexpectedErrorRolledBack$str() {
        return "WFLYEJB0457: 予期せぬエラー";
    }
    @Override
    protected String timerNotActive$str() {
        return "WFLYEJB0024: タイマーは有効でないため、タイマー再試行をスキップします: %1$s";
    }
    @Override
    protected String failedToRemoveManagementResources$str() {
        return "WFLYEJB0143: %1$s の管理リソースの削除に失敗しました -- %2$s";
    }
    @Override
    protected String inconsistentAttributeNotSupported$str() {
        return "WFLYEJB0451: 属性 '%1$s' は現在のバージョンのサーバーではサポートされません。値が '%2$s' と一致する場合のみ許可されます。";
    }
    @Override
    protected String couldNotFindEjbForLocatorIIOP$str() {
        return "WFLYEJB0035: ロケーター %1$s の Jakarta Enterprise Beans Bean が見つかりませんでした。Jakarta Enterprise Beans クライアントプロキシーは置き換えられません";
    }
    @Override
    protected String noComponentRegisteredForAddress$str() {
        return "WFLYEJB0368: アドレス %1$s 用に登録された Jakarta Enterprise Beans コンポーネントがありません";
    }
    @Override
    protected String unknownComponentType$str() {
        return "WFLYEJB0357: 不明な Jakarta Enterprise Beans コンポーネントタイプ %1$s";
    }
    @Override
    protected String invocationFailed0$str() {
        return "WFLYEJB0533: 呼び出しに失敗しました";
    }
    @Override
    protected String timerRetried$str() {
        return "WFLYEJB0021: タイマー: %1$s は再試行されます。";
    }
    @Override
    protected String mdbDeliveryStopped$str() {
        return "WFLYEJB0476: MDB の配信が停止されました: %1$s,%2$s";
    }
    @Override
    protected String invalidScheduleValue$str() {
        return "WFLYEJB0286: 無効なスケジュール %1$s 値: %2$s";
    }
    @Override
    protected String wrongReturnTypeForAsyncMethod$str() {
        return "WFLYEJB0270: 非同期メソッド %1$s はvoid あるいは Future を返しません";
    }
    @Override
    protected String invalidValuesRange$str() {
        return "WFLYEJB0294: 無効な値: %1$s 、有効な値は %2$s から %3$s までです";
    }
    @Override
    protected String moreThanOneEjbFound3$str() {
        return "WFLYEJB0408: バインディング %2$s に対し、インターフェース型 '%1$s' を持つ 1 つ以上の Jakarta Enterprise Beans が見つかりました。発見: %3$s";
    }
    @Override
    protected String lifecycleMethodNotAllowed$str() {
        return "WFLYEJB0374: %1$s はライフサイクルメソッドでは利用できません";
    }
    @Override
    protected String exceptionPersistTimerState$str() {
        return "WFLYEJB0508: %2$s が原因でタイマーの状態 %1$s の永続化に失敗しました。";
    }
    @Override
    protected String containerSuspended$str() {
        return "WFLYEJB0467: コンテナーが中断されたためリクエストが拒否されました";
    }
    @Override
    protected String typeSpecViolation$str() {
        return "WFLYEJB0517: [Jakarta Enterprise Beans 3.2 spec, section 4.1] クラス %1$s のスペック違反。Session Jakarta Enterprise Beans には、Stateful、Stateless、および Singleton のいずれかタイプのみを指定する必要があります。";
    }
    @Override
    protected String getTxManagerStatusFailed$str() {
        return "WFLYEJB0004: トランザクションマネージャーのステータスの取得に失敗しました; 無視します";
    }
    @Override
    protected String unknownEJBLocatorType$str() {
        return "WFLYEJB0097: 不明な Jakarta Enterprise Beans ロケータータイプ %1$s";
    }
    @Override
    protected String SecurityRolesIsNull$str() {
        return "WFLYEJB0185: セキュリティロールに null を設定することはできません";
    }
    @Override
    protected String sessionBeanClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0119: [Enterprise Beans 3.1 spec, section 4.9.2] セッション bean 実装クラスはabstract でも final でもなく public でなければなりません。%1$s はこの要件を満たさないため、セッション bean として認められません";
    }
    @Override
    protected String moduleNotAttachedToDeploymentUnit$str() {
        return "WFLYEJB0093: モジュールがデプロイメントユニット %1$s にアタッチされていません。";
    }
    @Override
    protected String failToRestoreTimers$str() {
        return "WFLYEJB0028: %1$s はディレクトリーではありません。タイマーをリストアできませんでした。";
    }
    @Override
    protected String twoEjbBindingsSpecifyAbsoluteOrder$str() {
        return "WFLYEJB0258: %1$s の 2 つの ejb-jar.xml バインディングは絶対順序を指定します。";
    }
    @Override
    protected String failToInvokeTimerServiceDoLifecycle$str() {
        return "WFLYEJB0325: シングルトン以外の EJB のライフサイクルコールバック時にタイマーサービスメソッドを呼び出すことができません";
    }
    @Override
    protected String cannotCallMethodInAfterCompletion$str() {
        return "WFLYEJB0388: afterCompletion の呼び出しでメソッド %1$s を呼び出すことができません。";
    }
    @Override
    protected String asymmetricCacheUsage$str() {
        return "WFLYEJB0445: キャッシュの非対称的な使用が検出されました";
    }
    @Override
    protected String cobraInterfaceRepository$str() {
        return "WFLYEJB0144: %1$s の CORBA インターフェースリポジトリ: %2$s";
    }
    @Override
    protected String failToLoadEjbClass$str() {
        return "WFLYEJB0265: Jakarta Enterprise Beans クラス %1$s をロードできませんでした";
    }
    @Override
    protected String wildcardContainerTransactionElementsMustHaveWildcardMethodName$str() {
        return "WFLYEJB0455: ワイルドカードの Jakarta Enterprise Beans 名 * を使用する <container-transaction> 要素は * というメソッド名のみを使用できます";
    }
    @Override
    protected String failToCallSetRollbackOnlyWithNoTx$str() {
        return "WFLYEJB0183: トランザクションなしで setRollbackOnly() は利用できません。";
    }
    @Override
    protected String cannotDeactivateBeanServant$str() {
        return "WFLYEJB0147: Bean サーバントを非アクティベートできません";
    }
    @Override
    protected String beanLocalHomeInterfaceIsNull$str() {
        return "WFLYEJB0172: Bean %1$s には Local Home インターフェースがありません。";
    }
    @Override
    protected String timerServiceIsNotActive$str() {
        return "WFLYEJB0139: タイマーサービスが無効になっています。サーバー設定の Jakarta Enterprise Beans セクションに <timer-service> エントリーを追加して、有効にしてください。";
    }
    @Override
    protected String stringParamCannotBeNullOrEmpty$str() {
        return "WFLYEJB0385: %1$s は null や空にすることはできません";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForMDB$str() {
        return "WFLYEJB0409: @Clustered アノテーションはメッセージ駆動型 bean とあわせて利用することができません。%2$s bean はクラス %3$s で @Clustered が付けられているため、%1$s は失敗しました";
    }
    @Override
    protected String exceptionRepositoryNotFound$str() {
        return "WFLYEJB0472: %1$s の例外リポジトリー id を取得できません: %n%2$s";
    }
    @Override
    protected String mdbOnMessageMethodCantBeStatic$str() {
        return "WFLYEJB0505: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] メッセージ駆動型 Bean の 'onMessage' メソッドは static にできません (MDB: %1$s)。";
    }
    @Override
    protected String failToInvokegetTimeoutMethod$str() {
        return "WFLYEJB0341: auto-timer でないタイマーで getTimeoutMethod を呼び出すことができません";
    }
    @Override
    protected String invalidTimerFileStoreDir$str() {
        return "WFLYEJB0346: タイマーファイルストアディレクトリー %1$s はディレクトリーではありません";
    }
    @Override
    protected String errorDuringRetryTimeout$str() {
        return "WFLYEJB0022: タイマー: %1$s のタイムアウト再試行中のエラー";
    }
    @Override
    protected String ejbNotFound2$str() {
        return "WFLYEJB0406: バインディング %2$s に対し、インターフェース型 '%1$s' を持つ Jakarta Enterprise Beans が見つかりませんでした";
    }
    @Override
    protected String incompatibleCaches$str() {
        return "WFLYEJB0399: ネスト化された階層で互換性のないキャッシュ実装";
    }
    @Override
    protected String defaultInterceptorsNotBindToMethod$str() {
        return "WFLYEJB0256: デフォルトのインターセプターは、ejb-jar.xml 内のメソッドのバインド先を指定できません";
    }
    @Override
    protected String bothMethodIntAndClassNameSet$str() {
        return "WFLYEJB0237: methodIntf と className の両方が %1$s に設定されています。";
    }
    @Override
    protected String duplicateSerializationGroupMember$str() {
        return "WFLYEJB0395: %1$s はすでにシリアライゼーショングループ %2$s のメンバーです。";
    }
    @Override
    protected String retryingTimeout$str() {
        return "WFLYEJB0023: タイマー: %1$s のタイムアウトを再試行中";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYEJB0469: インデックス化された子リソースは、順序付けされた子が親リソースによってサポートされる場合のみ登録できます。'%1$s' の親はインデックス化されていません。";
    }
    @Override
    protected String invocationNotApplicableForMethodInvocation$str() {
        return "WFLYEJB0240: メソッド呼び出しには適用できないため、呼び出しコンテキスト: %1$s を処理できません。";
    }
    @Override
    protected String messageEndpointAlreadyReleased$str() {
        return "WFLYEJB0102: メッセージエンドポイント %1$s はすでに解放されています。";
    }
    @Override
    protected String suspensionWaitingActiveTransactions$str() {
        return "WFLYEJB0492: Jakarta Enterprise Beans サブシステムの中断がアクティブなトラザクションを待っています。残り %1$d 個のトランザクション";
    }
    @Override
    protected String failedToRetrieveTimerInfo$str() {
        return "WFLYEJB0529: タイマー %1$s のデータベースから情報を取得できませんでした";
    }
    @Override
    protected String deprecatedAnnotation$str() {
        return "WFLYEJB0166: @%1$s アノテーションは廃止され、今後は無視されます。";
    }
    @Override
    protected String componentNotSetInInterceptor$str() {
        return "WFLYEJB0169: InterceptorContextにコンポーネントが設定されていません: %1$s";
    }
    @Override
    protected String localHomeNotAllow$str() {
        return "WFLYEJB0274: %1$s には Local Home は利用できません";
    }
    @Override
    protected String ejbBusinessMethodMustBePublic$str() {
        return "WFLYEJB0528: Jakarta Enterprise Beans ビジネスメソッド %1$s はパブリックである必要があります";
    }
    @Override
    protected String authenticationFailed$str() {
        return "WFLYEJB0534: 認証に失敗しました";
    }
    @Override
    protected String failedToInstallManagementResource$str() {
        return "WFLYEJB0086: %1$s の管理リソースをインストールできませんでした。";
    }
    @Override
    protected String poolNameCannotBeEmptyString$str() {
        return "WFLYEJB0419: Bean %1$s のプール名を空の文字列にすることはできません";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForEntityBean$str() {
        return "WFLYEJB0410: @Clustered アノテーションはエンティティー bean とあわせて利用することができません。%2$s bean はクラス %3$s で @Clustered が付けられているため、%1$s は失敗しました";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYEJB0530: デプロイメントは、サポート対象外になったレガシーセキュリティードメイン '%1$s' を使用するように設定されます。";
    }
    @Override
    protected String unknownDatabaseName$str() {
        return "WFLYEJB0532: 設定から検出されたデータベースは '%1$s' です。これが間違っている場合は、正しいデータベースを指定してください。";
    }
    @Override
    protected String timerPersistenceNotEnable$str() {
        return "WFLYEJB0016: タイマーの永続性が有効になっておらず、JVM の再起動後は永続タイマーの設定は引き継がれません";
    }
    @Override
    protected String failedToSetRollbackOnly$str() {
        return "WFLYEJB0064: ロールバックのみにトランザクションを設定できませんでした";
    }
    @Override
    protected String invalidFilterSpec$str() {
        return "WFLYEJB0519: アンマーシャリングフィルターの仕様 %1$s が無効です。仕様ではクラス名またはパッケージ名のマッチングパターンを記述する必要があります";
    }
    @Override
    protected String timerHasExpired$str() {
        return "WFLYEJB0330: タイマー %1$s の期限が切れています";
    }
    @Override
    protected String invalidTimerParameter$str() {
        return "WFLYEJB0306: 無効なタイマーパラメーター: %1$s = %2$s";
    }
    @Override
    protected String aroundTimeoutMethodMustReturnObjectType$str() {
        return "WFLYEJB0059: @jakarta.interceptor.AroundTimeout アノテーションが付けられたクラス %2$s のメソッド %1$s はオブジェクト型を返す必要があります";
    }
    @Override
    protected String invalidValueForSecondInScheduleExpression$str() {
        return "WFLYEJB0109: 秒に対して無効な値: %1$s";
    }
    @Override
    protected String ignoringException$str() {
        return "WFLYEJB0018: setRollbackOnly 中の例外を無視します";
    }
    @Override
    protected String discardingStatefulComponent$str() {
        return "WFLYEJB0007: 例外のためステートフルコンポーネントインスタンス: %1$s を破棄しています。";
    }
    @Override
    protected String timerCannotBeAdded$str() {
        return "WFLYEJB0524: タイマー%1$s は追加できません";
    }
    @Override
    protected String unknownOperations$str() {
        return "WFLYEJB0367: 不明な操作 %1$s";
    }
    @Override
    protected String passivationDirectoryCreationFailed$str() {
        return "WFLYEJB0402: パッシベーションディレクトリーの作成に失敗しました: %1$s";
    }
    @Override
    protected String failToLoadViewClassEjb$str() {
        return "WFLYEJB0349: ejb %1$s のビュークラスをロードできませんでした";
    }
    @Override
    protected String invocationFailed2$str() {
        return "WFLYEJB0034: Jakarta Enterprise Beans Invocation は、メソッド %2$s のコンポーネント %1$s で失敗しました";
    }
    @Override
    protected String ejbHasNoTimerMethods$str() {
        return "WFLYEJB0140: この Jakarta Enterprise Beans にはタイムアウトメソッドがありません";
    }
    @Override
    protected String cacheEntryNotInUse$str() {
        return "WFLYEJB0393: キャッシュエントリー %1$s は使用されていません。";
    }
    @Override
    protected String failedToProcessBusinessInterfaces$str() {
        return "WFLYEJB0466: Jakarta Enterprise Beans %1$s クラスのビジネスインターフェースの処理に失敗しました";
    }
    @Override
    protected String missingMdbDeliveryGroup$str() {
        return "WFLYEJB0477: MDB 配信グループがありません: %1$s";
    }
    @Override
    protected String serverInterceptorNoEmptyConstructor$str() {
        return "WFLYEJB0512: サーバーインターセプタークラス %1$s にはパラメーターコンストラクターがありません。";
    }
    @Override
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYEJB0490: 複数のセキュリティードメインはサポートされていません";
    }
    @Override
    protected String transactionPropagationNotSupported$str() {
        return "WFLYEJB0387: IIOP を使ったトランザクションの伝播には対応していません";
    }
    @Override
    protected String strictPoolDerivedFromWorkers$str() {
        return "WFLYEJB0481: 厳格なプール %1$s は、スレッドワーカープールのサイズから派生された %2$d の最大インスタンスサイズ (クラスごと) を使用しています。";
    }
    @Override
    protected String timerNotDeployed$str() {
        return "WFLYEJB0523: タイマー %1$s はデプロイされていません";
    }
    @Override
    protected String incompatibleSerializationGroup$str() {
        return "WFLYEJB0391: %1$s はシリアライゼーショングループ %2$s との互換がありません。";
    }
    @Override
    protected String currentComponentNotAEjb$str() {
        return "WFLYEJB0373: 現在のコンポーネントは Jakarta Enterprise Beans %1$s ではありません";
    }
    @Override
    protected String noNamespaceContextSelectorAvailable$str() {
        return "WFLYEJB0178: NamespaceContextSelector が利用できません。%1$s をルックアップできません。";
    }
    @Override
    protected String failToCallEjbRefByDependsOn$str() {
        return "WFLYEJB0269: %1$s コンポーネントの @DependsOn アノテーションによって参照される %2$s という複数の Jakarta Enterprise Beans: %3$s";
    }
    @Override
    protected String endpointUnAvailable$str() {
        return "WFLYEJB0046: メッセージ駆動型コンポーネント %1$s で利用できるエンドポイントがありません。";
    }
    @Override
    protected String roleNamesIsNull$str() {
        return "WFLYEJB0255: Bean %1$s の <security-role-ref>%n では <role-name> を null または空白にすることはできません。";
    }
    @Override
    protected String transactionNotComplete2$str() {
        return "WFLYEJB0159: BMT ステートフル Bean '%1$s' がユーザートランザクションを適切に完了しませんでした。状態=%2$s";
    }
    @Override
    protected String notAnObjectImpl$str() {
        return "WFLYEJB0101: %1$s は ObjectImpl ではありません。";
    }
    @Override
    protected String remappingCacheAttributes$str() {
        return "WFLYEJB0486: パラメーター 'default-clustered-sfsb-cache' はリソース '%1$s' の 'add' 操作に対して定義されました。このパラメーターは廃止され、以前の動作は属性 'default-sfsb-cache' に再マッピングされました。そのため、'default-sfsb-cache' 属性は '%2$s' に設定され、'default-sfsb-passivation-disabled-cache' 属性は '%3$s' に設定されました。";
    }
    @Override
    protected String missingSerializationGroupMember$str() {
        return "WFLYEJB0396: %1$s はシリアルライゼーショングループ %2$s のメンバーではありません。";
    }
    @Override
    protected String failToFindEjbRefByDependsOn$str() {
        return "WFLYEJB0268: %2$s の @DependsOn アノテーションによって参照される Jakarta Enterprise Beans %1$s が見つかりませんでした";
    }
    @Override
    protected String passivationPathNotADirectory$str() {
        return "WFLYEJB0403: パッシベーションディレクトリーの作成に失敗しました: %1$s";
    }
    @Override
    protected String unknownTimezoneId$str() {
        return "WFLYEJB0015: 不明なタイムゾーン id: %1$s がスケジュールの式で見つかりました。これを無視して、サーバーのタイムゾーン %2$s を使用します。";
    }
    @Override
    protected String failToCreateTimerFileStoreDir$str() {
        return "WFLYEJB0344: タイマーファイルストアディレクトリー %1$s を作成できませんでした";
    }
    @Override
    protected String defaultPoolExpressionCouldNotBeResolved$str() {
        return "WFLYEJB0522: デフォルトのプール名 %1$s は、その値から解決できませんでした: %2$s";
    }
    @Override
    protected String ejbMustHavePublicDefaultConstructor$str() {
        return "WFLYEJB0127: %1$s 型の Jakarta Enterprise Beans %2$s には、パブリックのデフォルトコンストラクターが必要です";
    }
    @Override
    protected String failToCallgetRollbackOnlyOnNoneTransaction$str() {
        return "WFLYEJB0174: トランザクションなしで getRollbackOnly() は利用できません。";
    }
    @Override
    protected String missingRunAsAnnotation$str() {
        return "WFLYEJB0510: @RunAsPrincipal をクラス %1$s として使用するときは @RunAs アノテーションが必要です。";
    }
    @Override
    protected String mdbClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0121: [Enterprise Beans 3.1 spec, section 5.6.2] メッセージ駆動型 bean 実装クラスは abstract でも final でもなく public でなければなりません。%1$s はこの要件を満たさないため、メッセージ駆動型 bean として認められません";
    }
    @Override
    protected String exceptionGeneratingSessionId$str() {
        return "WFLYEJB0151: 呼び出し %2$s を持つコンポーネント %1$s のセッション id 生成中に例外が発生しました";
    }
    @Override
    protected String deprecatedNamespace$str() {
        return "WFLYEJB0167: <%2$s xmlns=\"%1$s\"/> 要素は無視されます。";
    }
    @Override
    protected String invalidEjbComponent$str() {
        return "WFLYEJB0350: コンポーネントクラスが %2$s である %1$s という名前のコンポーネントは、Jakarta Enterprise Beans コンポーネントではありません";
    }
    @Override
    protected String failedToCreateEJBClientInterceptor$str() {
        return "WFLYEJB0496: Jakarta Enterprise Beans クライアントインターセプター %1$s のインスタンスを作成できませんでした";
    }
    @Override
    protected String logMDBStart$str() {
        return "WFLYEJB0042: '%2$s' リソースアダプターでメッセージ駆動型 Bean '%1$s' を開始しました。";
    }
    @Override
    protected String poolConfigIsEmpty$str() {
        return "WFLYEJB0218: PoolConfig は null あるいは空にすることはできません";
    }
    @Override
    protected String componentClassHasMultipleTimeoutAnnotations$str() {
        return "WFLYEJB0372: コンポーネントクラス %1$s には複数の @Timeout アノテーションがあります";
    }
    @Override
    protected String unauthorizedAccessToUserTransaction$str() {
        return "WFLYEJB0137: Bean 管理のトランザクション境界を持つセッションおよびメッセージ駆動型 Bean のみが UserTransaction へアクセスできます";
    }
    @Override
    protected String timerWasCanceled$str() {
        return "WFLYEJB0331: タイマー %1$s はキャンセルされました";
    }
    @Override
    protected String cannotCallMethod$str() {
        return "WFLYEJB0389: 状態が %2$s の場合 %1$s を呼び出しできません。";
    }
    @Override
    protected String transactionNotComplete1$str() {
        return "WFLYEJB0443: Enterprise Beans 3.1 FR 13.3.3: BMT bean %1$s はトランザクションを完了してから返されるべきです。";
    }
    @Override
    protected String timerIsNull$str() {
        return "WFLYEJB0326: タイマーは null を取ることができません";
    }
    @Override
    protected String noEjbContextAvailable$str() {
        return "WFLYEJB0420: Jakarta Enterprise Beans 呼び出しで有効なものがないため、EjbContext を利用できません";
    }
    @Override
    protected String ejb2xViewNotApplicableForSingletonBeans$str() {
        return "WFLYEJB0076: シングルトン Bean に Enterprise Beans 2.x ビューを含めることはできません";
    }
    @Override
    protected String beanInterfaceAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0092: @EJB 属性 'beanInterface' がクラスレベルのアノテーションに必要です。クラス: %1$s";
    }
    @Override
    protected String timerServiceMethodNotAllowedForSFSB$str() {
        return "WFLYEJB0449: Timerservice API はステートフルセッション bean %1$s では許可されません。";
    }
    @Override
    protected String timerReinstatementFailed$str() {
        return "WFLYEJB0161: タイマー '%1$s' (id=%2$s) を永続状態から回復できませんでした";
    }
    @Override
    protected String cacheEntryInUse$str() {
        return "WFLYEJB0392: キャッシュエントリー %1$s は使用中です。";
    }
    @Override
    protected String mdbDeliveryStarted$str() {
        return "WFLYEJB0475: MDB の配信が開始されました: %1$s,%2$s";
    }
    @Override
    protected String noSuchEndpointException$str() {
        return "WFLYEJB0045: リソースアダプター %1$s のエンドポイントが見つかりませんでした。";
    }
    @Override
    protected String ejbLocalObjectUnavailable$str() {
        return "WFLYEJB0078: Bean %1$s には EJBLocalObject がありません。";
    }
    @Override
    protected String getRollBackOnlyIsNotAllowWithSupportsAttribute$str() {
        return "WFLYEJB0223: Jakarta Enterprise Beans 3.1 FR 13.6.2.9 getRollbackOnly は SUPPORTS 属性と使用できません";
    }
    @Override
    protected String failToCompleteTaskBeforeTimeOut$str() {
        return "WFLYEJB0202: タスクは %1$s  %2$S で完了しませんでした";
    }
    @Override
    protected String unexpectedInvocationState$str() {
        return "WFLYEJB0487: 予期せぬ呼び出し状態 %1$s";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYEJB0366: 不明な属性 %1$s";
    }
    @Override
    protected String existingSerializationGroup$str() {
        return "WFLYEJB0390: %1$s はすでにシリアライゼーショングループ %2$s と関連付けられています。";
    }
    @Override
    protected String couldNotFindEjb$str() {
        return "WFLYEJB0168: ID %1$s の Jakarta Enterprise Beans が見つかりませんでした";
    }
    @Override
    protected String invalidTransactionTypeForMDB$str() {
        return "WFLYEJB0485: トランザクション型 %1$s は %3$s メッセージ駆動型 Bean の %2$s メソッドに指定されていません。NOT_SUPPORTED として処理されます。";
    }
    @Override
    protected String ejbNotFound3$str() {
        return "WFLYEJB0405: バインディング %3$s に対し、インターフェース型 '%1$s' と名前 '%2$s' を持つ Jakarta Enterprise Beans が見つかりませんでした";
    }
    @Override
    protected String mdbCantHaveFinalizeMethod$str() {
        return "WFLYEJB0506: [Jakarta Enterprise Beans 3.2 spec, section 5.6.2] メッセージ駆動型 Bean は 'finalize' メソッドを持つことができません (MDB: %1$s)";
    }
    @Override
    protected String invalidEjbLocalInterface$str() {
        return "WFLYEJB0273: %1$s には、Enterprise Beans 2.x ローカルインターフェースがありません";
    }
    @Override
    protected String unknownSessionBeanType$str() {
        return "WFLYEJB0095: 未知のセッション bean 型 %1$s";
    }
    @Override
    protected String invalidListValue$str() {
        return "WFLYEJB0292: リストの値には、一定の範囲内の値、あるいは個別値のみを含むことができます。無効な値: %1$s";
    }
    @Override
    protected String disableDefaultEjbPermissionsCannotBeTrue$str() {
        return "WFLYEJB0464: \"disable-default-ejb-permissions\" 属性が true に設定されていない可能性があります";
    }
    @Override
    protected String failedToLoadViewClassForComponent$str() {
        return "WFLYEJB0068: コンポーネント %1$s のビュークラスをロードできませんでした。";
    }
    @Override
    protected String notAllowedFromStatefulBeans$str() {
        return "WFLYEJB0377: ステートフル bean から %1$s はできません";
    }
    @Override
    protected String exceptionPersistPostTimerState$str() {
        return "WFLYEJB0507: タイマーの状態 %1$s の永続化に失敗しました。タイマーを手作業で復元する必要があります。";
    }
    @Override
    protected String mdbDoesNotImplementNorSpecifyMessageListener$str() {
        return "WFLYEJB0094: Enterprise Beans 3.1 FR 5.4.2 MessageDrivenBean %1$s は、インターフェースを 1 つ実装せず、メッセージリスナーインターフェースも指定しません。";
    }
    @Override
    protected String ejbJarConfigNotBeenSet$str() {
        return "WFLYEJB0214: EjbJarConfiguration は %1$s で設定されておらず、Jakarta Enterprise Beans %2$S に対してコンポーネント作成サービスを作成できません";
    }
    @Override
    protected String failedToRollback$str() {
        return "WFLYEJB0158: ロールバックできませんでした";
    }
    @Override
    protected String cannotResolveFilteredClass$str() {
        return "WFLYEJB0518: アンマーシャリングを行うためのクラス %1$s の解決の例外。拒否リストや許可リストに追加されていません";
    }
    @Override
    protected String errorInvokeTimeout$str() {
        return "WFLYEJB0020: タイマーのタイムアウト呼び出しエラー: %1$s";
    }
    @Override
    protected String methodNotImplemented$str() {
        return "WFLYEJB0206: まだ実装されていません";
    }
    @Override
    protected String unexpectedComponent$str() {
        return "WFLYEJB0213: 予期せぬコンポーネント: %1$s コンポーネントは %2$s を想定していました。";
    }
    @Override
    protected String mutuallyExclusiveAttributes$str() {
        return "WFLYEJB0483: 属性は相互に排他的です: %1$s, %2$s";
    }
    @Override
    protected String loadedPersistentTimerInTimeout$str() {
        return "WFLYEJB0480: Jakarta Enterprise Beans (%2$s) のロードされたタイマー (%1$s) とタイムアウトとしてマーク付けされたこのノード。元のタイムアウトが処理されていない可能性があります。正常なシャットダウンを行い、シャットダウンの前にタイムアウトタスクが終了するようにしてください。";
    }
    @Override
    protected String failedToPersistTimer$str() {
        return "WFLYEJB0453: タイマー %1$s の永続化に失敗しました";
    }
    @Override
    protected String serverInterceptorInvalidMethod$str() {
        return "WFLYEJB0513: %3$s アノテーションが付けられたサーバーインターセプター %2$s のメソッド %1$s には無効な署名があります。";
    }
    @Override
    protected String annotationOnlyAllowedOnClass$str() {
        return "WFLYEJB0081: %1$s アノテーションはクラスのみに使用できます。%2$s はクラスではありません。";
    }
    @Override
    protected String unknownChannelCreationOptionType$str() {
        return "WFLYEJB0436: 不明なチャネル作成オプションタイプ %1$s";
    }
    @Override
    protected String failureDuringEndpointDeactivation$str() {
        return "WFLYEJB0047: メッセージ駆動型コンポーネント %1$s のエンドポイントを非アクティブ化できませんでした。";
    }
    @Override
    protected String failToObtainLock$str() {
        return "WFLYEJB0228: Enterprise Beans 3.1 FR 4.3.14.1 %1$s で同時アクセスタイムアウトが発生 - %2$s %3$s 内でロックの取得ができませんでした";
    }
    @Override
    protected String unexpectedError$str() {
        return "WFLYEJB0442: 予期せぬエラー";
    }
    @Override
    protected String timerInvocationFailedDueToInvokerNotBeingStarted$str() {
        return "WFLYEJB0107: タイマーの呼び出しに失敗しました。インボーカーが開始されていません";
    }
    @Override
    protected String cannotReadStrictMaxPoolDerivedSize$str() {
        return "WFLYEJB0499: 派生したサイズを読み取りできません - サービス %1$s にアクセス不可能です";
    }
    @Override
    protected String taskWasCancelled$str() {
        return "WFLYEJB0203: タスクはキャンセルされました";
    }
    @Override
    protected String failToLoadDeclaringClassOfTimeOut$str() {
        return "WFLYEJB0342: timeout メソッドの宣言中のクラス: %1$s をロードできませんでした";
    }
    @Override
    protected String activationFailed$str() {
        return "WFLYEJB0401: %1$s のアクティベートに失敗しました。";
    }
    @Override
    protected String failedToMarshalEjbParameters$str() {
        return "WFLYEJB0054: Jakarta Enterprise Beans パラメーターのマーシャリングに失敗しました";
    }
    @Override
    protected String noMoreTimeoutForTimer$str() {
        return "WFLYEJB0328: タイマー %1$s にこれ以上タイムアウトはありません";
    }
    @Override
    protected String iiopBindings$str() {
        return "WFLYEJB0516: デプロイメントユニット '%2$s'の '%1$s' という名前のセッション Bean の IIOP バインディングは次のとおりです: %3$s";
    }
    @Override
    protected String failToObtainLockIllegalType$str() {
        return "WFLYEJB0242: コンポーネント %3$s の %2$s の不正なロック型 %1$s";
    }
    @Override
    protected String relativeResourceAdapterNameInStandaloneModule$str() {
        return "WFLYEJB0459: Bean %2$s が含まれるモジュール %1$s は ear にデプロイされませんが、相対形式のリソースアダプター名 '%3$s' を指定します。";
    }
    @Override
    protected String jndiNameCannotBeNull$str() {
        return "WFLYEJB0177: jndi 名はルックアップ時に null を取ることができません";
    }
    @Override
    protected String legacyClientMappingsRegistryProviderInUse$str() {
        return "WFLYEJB0531: %1$s のクライアントマッピングレジストリープロバイダーが見つかりません。静的設定に基づくレガシープロバイダーの使用";
    }
    @Override
    protected String connectorNotConfiguredForEJBClientInvocations$str() {
        return "WFLYEJB0527: リモーティングコネクター (アドレス %1$s、ポート %2$s) が EJB クライアント呼び出しに対して正しく設定されていません。EJB クライアント呼び出しを受信するには、コネクターを <remote/> 'connectors' 属性のリストに追加する必要があります";
    }
    @Override
    protected String asyncInvocationOnlyApplicableForSessionBeans$str() {
        return "WFLYEJB0052: セッション bean ではないコンポーネントの非同期ローカル呼び出しを実行できません";
    }
    @Override
    protected String componentViewNotAvailableInContext$str() {
        return "WFLYEJB0196: インターセプターコンテキスト: %1$s でComponentViewInstance は利用できません。";
    }
    @Override
    protected String multipleAnnotationsOnBean$str() {
        return "WFLYEJB0266: Bean %2$s では 1 つの %1$s メソッドのみ許容されます";
    }
    @Override
    protected String failToRestoreTimersFromFile$str() {
        return "WFLYEJB0029: %1$s からタイマーをリストアできませんでした。";
    }
    @Override
    protected String timerHandleIsNotActive$str() {
        return "WFLYEJB0339: タイマー ID が %1$s のハンドルのタイマー、timedObjectId %2$s はアクティブではありません";
    }
    @Override
    protected String logInconsistentAttributeNotSupported$str() {
        return "WFLYEJB0474: 属性 '%1$s' は現在のバージョンのサーバーではサポートされません。値が '%2$s' と一致する場合のみ許可されます。この属性は削除される必要があります。";
    }
}
