package org.jboss.as.jpa.messages;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:25+0200")
public class JpaLogger_$logger_ja extends JpaLogger_$logger implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String relativePathNotFound$str() {
        return "WFLYJPA0058: 相対パスが見つかりませんでした: %1$s";
    }
    @Override
    protected String cannotCloseTransactionContainerEntityManger$str() {
        return "WFLYJPA0017: コンテナーが管理するエンティティマネージャーを閉じることができるのはコンテナーのみです (トランザクション／呼び出し時に自動消去され、所有コンポーネントを終了すると終了)。";
    }
    @Override
    protected String badSynchronizationTypeCombination$str() {
        return "WFLYJPA0064: Jakarta Transactions トランザクションにはすでに 'SynchronizationType.UNSYNCHRONIZED' 永続コンテキスト(EntityManager) が結合されていますが、現在 'SynchronizationType.SYNCHRONIZED' があるコンポーネントが使用されています。呼び差し元コンポーネントコードを変更して永続コンテキスト (EntityManager) をトランザクションに結合するか、呼び差し先コンポーネントコードを変更して'SynchronizationType.UNSYNCHRONIZED' を使用するようにしてください。JPA 仕様 2.1 の 7.6.4.1 を参照してください。スコープ指定永続ユニット名=%1$s。";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYJPA0040: %1$s の解析に失敗しました";
    }
    @Override
    protected String cannotUseExtendedPersistenceTransaction$str() {
        return "WFLYJPA0030: SFSB 呼び出しコールスタックで拡張永続コンテキストが見つかりましたが、トランザクションにはすでにトランザクションコンテキストが関連付けられているため、利用できません。アプリケーションコードを変更することでこれを回避できます。拡張永続コンテキストか、トランザクションコンテキストを削除してください。JPA 仕様 2.0 のセクション 7.6.3.1 を参照してください。スコープ指定永続ユニット名=%1$s、トランザクションにすでにある永続コンテキスト=%2$s、拡張永続コンテキスト=%3$s";
    }
    @Override
    protected String persistenceProviderNotFound$str() {
        return "WFLYJPA0057: PersistenceProvider '%1$s' は見つかりません。";
    }
    @Override
    protected String invalidPersistenceUnitName$str() {
        return "WFLYJPA0043: 永続ユニット名 (%1$s) には不正な文字 '%2$s' が含まれています。";
    }
    @Override
    protected String noPUnitNameSpecifiedAndMultiplePersistenceUnits$str() {
        return "WFLYJPA0061: 永続 unitName が指定されておらず、%1$d 件の永続ユニット定義がアプリケーションデプロイメント %2$s に存在します。アプリケーションデプロイメントの永続ユニット定義を 1 つだけにするか、永続ユニットへの各参照に対して unitName を指定するようにしてください。";
    }
    @Override
    protected String unexpectedStatisticsProblem$str() {
        return "WFLYJPA0012: 統計の収集で予期せぬ問題が発生しました";
    }
    @Override
    protected String cannotGetSessionFactory$str() {
        return "WFLYJPA0020: Hibernate セッションファクトリをエンティティマネージャーから取得できませんでした。";
    }
    @Override
    protected String illegalCallOnCloseMethod$str() {
        return "WFLYJPA0075: 注入された管理対象の EntityManager からこのメソッドを呼び出すことは不正です";
    }
    @Override
    protected String differentSearchModuleDependencies$str() {
        return "WFLYJPA0071: デプロイメント '%1$s' は複数の Hibernate Search モジュール名を指定しました ('%2$s','%3$s')";
    }
    @Override
    protected String duplicatePersistenceUnitDefinition$str() {
        return "WFLYJPA0001: アプリケーションで %1$s に関する永続ユニット定義が重複しています。重複している persistence.xml の 1 つをアプリケーションから削除してください。アプリケーションデプロイメントは使用される %2$s からの persistence.xml 定義で継続されます。%3$s からの persistence.xml は無視されます。";
    }
    @Override
    protected String setterMethodOnlyAnnotation$str() {
        return "WFLYJPA0059: %1$s インジェクションターゲットは無効です。setter メソッドのみが許可されます: %2$s";
    }
    @Override
    protected String failedToStopPUService$str() {
        return "WFLYJPA0007: 永続ユニットサービス %1$s を停止できませんでした。";
    }
    @Override
    protected String failedToAddPersistenceUnit$str() {
        return "WFLYJPA0038: %1$s へ永続ユニットサービスを追加できませんでした。";
    }
    @Override
    protected String transactionRequired$str() {
        return "WFLYJPA0060: この操作を実行するにはトランザクションが必要です (トランザクションあるいは拡張永続コンテキストをお使いください)。";
    }
    @Override
    protected String resourcesOfTypeCannotBeRegistered$str() {
        return "WFLYJPA0065: タイプ %1$s のリソースは登録できません";
    }
    @Override
    protected String stoppingService$str() {
        return "WFLYJPA0004: %1$s サービス '%2$s' を停止します。";
    }
    @Override
    protected String cannotCreateAdapter$str() {
        return "WFLYJPA0018: アダプタークラス '%1$s' のインスタンスを作成できませんでした。";
    }
    @Override
    protected String readingPersistenceXml$str() {
        return "WFLYJPA0002: %1$s の persistence.xml を読み込みます。";
    }
    @Override
    protected String errorGettingTransaction$str() {
        return "WFLYJPA0036: トランザクションと現在のスレッドを関連付けている途中でエラーが発生しました: %1$s";
    }
    @Override
    protected String cannotDeployApp$str() {
        return "WFLYJPA0019: アプリケーションにパッケージされている永続プロバイダー '%1$s' をデプロイできませんでした。";
    }
    @Override
    protected String failedToGetAdapter$str() {
        return "WFLYJPA0037: 永続プロバイダー '%1$s' に対しアダプターを取得するのに失敗しました。";
    }
    @Override
    protected String startingPersistenceUnitService$str() {
        return "WFLYJPA0010: 永続ユニット (2 つのフェーズのフェーズ %1$d) サービス '%2$s' を開始しています";
    }
    @Override
    protected String cannotLoadPersistenceProviderIntegratorModule$str() {
        return "WFLYJPA0074: %1$s の永続プロバイダーインテグレーターモジュールのロードエラー";
    }
    @Override
    protected String invalidScopedName$str() {
        return "WFLYJPA0044: jboss.as.jpa.scopedname のヒント (%1$s) に不正な '%2$s' 文字が含まれています";
    }
    @Override
    protected String persistenceProviderAdaptorModuleLoadError$str() {
        return "WFLYJPA0069: 永続プロバイダーアダプターモジュールロードエラー %1$s";
    }
    @Override
    protected String classloaderHasMultipleAdapters$str() {
        return "WFLYJPA0067: クラスローダー '%1$s' には複数の Persistence プロバイダーアダプターがあります";
    }
    @Override
    protected String couldNotCreateInstanceProvider$str() {
        return "WFLYJPA0062: 永続プロバイダークラス %1$s のインスタンスを作成できませんでした。";
    }
    @Override
    protected String cannotInjectResourceLocalEntityManager$str() {
        return "WFLYJPA0021: @PersistenceContext を使い、RESOURCE_LOCAL コンテナーが管理する EntityManagers を注入できません。";
    }
    @Override
    protected String xpcOnlyFromSFSB$str() {
        return "WFLYJPA0070: コンテナー管理の拡張永続コンテキストはステートフルセッション Bean のスコープ内でのみ起動できます (永続ユニット '%1$s')。";
    }
    @Override
    protected String cannotLoadFromJpa$str() {
        return "WFLYJPA0025: Jakarta Persistence モジュールクラスローダーから %1$s をロードできませんでした";
    }
    @Override
    protected String cannotLoadPersistenceProviderModule$str() {
        return "WFLYJPA0027: 永続プロバイダーのロードエラー %1$s (クラス %2$s)";
    }
    @Override
    protected String persistenceUnitNotFound2$str() {
        return "WFLYJPA0033: %2$s で %1$s という名前の永続ユニットが見つかりません。";
    }
    @Override
    protected String multipleAdapters$str() {
        return "WFLYJPA0048: 永続プロバイダーアダプターモジュール (%1$s) には複数のアダプターがあります。";
    }
    @Override
    protected String startingService$str() {
        return "WFLYJPA0003: %1$s サービス '%2$s' を開始します。";
    }
    @Override
    protected String classLevelAnnotationParameterRequired$str() {
        return "WFLYJPA0032: クラス %2$s のクラスレベル %1$s アノテーションは %3$s を提供する必要があります";
    }
    @Override
    protected String errorPreloadingDefaultProvider$str() {
        return "WFLYJPA0006: デフォルトの永続プロバイダーモジュールをロードできませんでした。 ";
    }
    @Override
    protected String stoppingPersistenceUnitService$str() {
        return "WFLYJPA0011: 永続ユニット (2 つのフェーズのフェーズ %1$d) サービス '%2$s' を停止しています";
    }
    @Override
    protected String cannotCloseContainerManagedEntityManager$str() {
        return "WFLYJPA0015: コンテナーが管理するエンティティマネージャーを閉じることができるのはコンテナーのみです (@remove メソッドが SFSB で呼び出された場合に発生します)。";
    }
    @Override
    protected String resourcesOfTypeCannotBeRemoved$str() {
        return "WFLYJPA0066: タイプ %1$s のリソースは削除できません";
    }
    @Override
    protected String persistenceUnitNotFound3$str() {
        return "WFLYJPA0034: %3$s で %1$s#%2$s という名前の永続ユニットが見つかりません。";
    }
    @Override
    protected String referenceCountedEntityManagerNegativeCount$str() {
        return "WFLYJPA0063: 内部エラー。拡張永続コンテキスト (%2$s) に関連するステートフルセッション Bean (%1$d) の数を負の値にすることはできません。";
    }
    @Override
    protected String invalidClassFormat$str() {
        return "WFLYJPA0073: クラス %1$s のバイトコード書き換え (変換) に失敗しました";
    }
    @Override
    protected String nullParameter$str() {
        return "WFLYJPA0053: 内部 %1$s エラー、null %2$s が渡されました";
    }
    @Override
    protected String cannotSpecifyBoth$str() {
        return "WFLYJPA0029: %6$s に対し、%5$s の %1$s (%2$s) と %3$s (%4$s) の両方を指定できません。";
    }
    @Override
    protected String childNotFound$str() {
        return "WFLYJPA0031: %2$s で子の '%1$s' を見つけることができませんでした。";
    }
}
