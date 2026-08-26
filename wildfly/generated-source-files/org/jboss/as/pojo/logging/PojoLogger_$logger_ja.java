package org.jboss.as.pojo.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:46+0200")
public class PojoLogger_$logger_ja extends PojoLogger_$logger implements PojoLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PojoLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String nullFactoryMethod$str() {
        return "WFLYPOJO0015: factory メソッドは null です。";
    }
    @Override
    protected String unknownType$str() {
        return "WFLYPOJO0025: 不明な型: %1$s";
    }
    @Override
    protected String cannotDetermineType$str() {
        return "WFLYPOJO0039: 型を判別できません - 設定に関する情報が不十分です!";
    }
    @Override
    protected String methodNotFound$str() {
        return "WFLYPOJO0032: クラス %3$s のメソッドが見つかりません %1$s%2$s ";
    }
    @Override
    protected String ambiguousMatch1$str() {
        return "WFLYPOJO0035: あいまいな一致 %1$s";
    }
    @Override
    protected String invokingCallback$str() {
        return "WFLYPOJO0003: コールバックの呼び出しエラー: %1$s";
    }
    @Override
    protected String wrongTypeSize$str() {
        return "WFLYPOJO0029: 不正な型サイズ。パラメーターと一致しません。";
    }
    @Override
    protected String tooDynamicFromFactory$str() {
        return "WFLYPOJO0012: 動的であるためファクトリから注入された型を判定できません。";
    }
    @Override
    protected String missingValue$str() {
        return "WFLYPOJO0021: 値がありません。";
    }
    @Override
    protected String nullBeanInfo$str() {
        return "WFLYPOJO0016: bean 情報は null です。";
    }
    @Override
    protected String nullOrEmptyDependency$str() {
        return "WFLYPOJO0020: null あるいは空の依存性";
    }
    @Override
    protected String missingBeanInfo$str() {
        return "WFLYPOJO0028: bean 情報がありません。bean のクラス属性を設定してください: %1$s";
    }
    @Override
    protected String tooDynamicFromDependency$str() {
        return "WFLYPOJO0013: 動的であるため依存性から注入された型を判定できません。";
    }
    @Override
    protected String ambiguousMatch3$str() {
        return "WFLYPOJO0036: クラス %3$s の名前 %2$s に対する %1$s はあいまいな一致です。";
    }
    @Override
    protected String fieldNotFound$str() {
        return "WFLYPOJO0037: クラス %2$s のフィールドが見つかりません %1$s ";
    }
    @Override
    protected String illegalParameterLength$str() {
        return "WFLYPOJO0026: 不正なパラメーター長: %1$s";
    }
    @Override
    protected String nullOrEmptyAlias$str() {
        return "WFLYPOJO0019: null あるいは空のエイリアス";
    }
    @Override
    protected String ctorNotFound$str() {
        return "WFLYPOJO0031: そのようなコンストラクターはありません: クラス %2$s に対する %1$s";
    }
    @Override
    protected String getterNotFound$str() {
        return "WFLYPOJO0033: そのような getter はありません: クラス %2$s の %1$s";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYPOJO0008: POJO xml [ %1$s ] の解析に失敗しました。";
    }
    @Override
    protected String noModuleFound$str() {
        return "WFLYPOJO0006: %1$s のモジュール割り当てを取得できませんでした。";
    }
    @Override
    protected String errorAtUncallback$str() {
        return "WFLYPOJO0005: uncallback の呼び出しエラー: %1$s";
    }
    @Override
    protected String nullMethodName$str() {
        return "WFLYPOJO0024: メソッド名は null です。";
    }
    @Override
    protected String nullClassInfo$str() {
        return "WFLYPOJO0030: ClassInfo は null です。";
    }
    @Override
    protected String nullValue$str() {
        return "WFLYPOJO0022: null 値";
    }
    @Override
    protected String oldNamespace$str() {
        return "WFLYPOJO0001: レガシーの bean/pojo 名前空間: %1$s - xml 機能の一部がない可能性があります (例外の可能性)";
    }
    @Override
    protected String ignoreUninstallError$str() {
        return "WFLYPOJO0002: ターゲットのアンインストールの動作を無視します: %1$s";
    }
    @Override
    protected String errorAtIncallback$str() {
        return "WFLYPOJO0004: incallback の呼び出しエラー: %1$s";
    }
    @Override
    protected String parsingException$str() {
        return "WFLYPOJO0038: POJO 記述子ファイルの解析中の例外: %1$s";
    }
    @Override
    protected String missingReflectionIndex$str() {
        return "WFLYPOJO0007: %1$s のデプロイメント反映インデックスがありません。";
    }
    @Override
    protected String cannotInstantiateCollection$str() {
        return "WFLYPOJO0010: 新規コレクションインスタンスをインスタンス化できません。";
    }
    @Override
    protected String cannotInstantiateMap$str() {
        return "WFLYPOJO0011: 新規マップインスタンスをインスタンス化できません。";
    }
    @Override
    protected String notValueConfig$str() {
        return "WFLYPOJO0014: 以前のノードは value config ではありません: %1$s";
    }
    @Override
    protected String invalidMatchSize$str() {
        return "WFLYPOJO0017: 型インスタンス一致の数が無効です: %1$s、型: %2$s";
    }
    @Override
    protected String setterNotFound$str() {
        return "WFLYPOJO0034: そのような setter はありません: クラス %2$s の %1$s";
    }
    @Override
    protected String cannotDetermineInjectedType$str() {
        return "WFLYPOJO0018: インジェクトした型を判断できません: %1$s、クラス属性 (あれば) を設定してみてください。";
    }
    @Override
    protected String nullName$str() {
        return "WFLYPOJO0023: null 名";
    }
    @Override
    protected String missingFactoryMethod$str() {
        return "WFLYPOJO0027: ctor 設定のファクトリメソッドがありません: %1$s";
    }
}
