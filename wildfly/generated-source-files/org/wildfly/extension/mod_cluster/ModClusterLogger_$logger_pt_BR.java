package org.wildfly.extension.mod_cluster;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:41+0200")
public class ModClusterLogger_$logger_pt_BR extends ModClusterLogger_$logger_pt implements ModClusterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ModClusterLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String ignoredAttribute$str() {
        return "WFLYMODCLS0026: O atributo “%1$s” do elemento “%2$s” não é mais compatível e será ignorado.";
    }
    @Override
    protected String errorLoadingModuleForCustomMetric$str() {
        return "WFLYMODCLS0023: Erro ao carregar o módulo '%1$s' a partir do qual a métrica personalizada é carregada.";
    }
    @Override
    protected String ignoredElement$str() {
        return "WFLYMODCLS0025: O elemento “%1$s” não é mais compatível e será ignorado.";
    }
    @Override
    protected String multicastInterfaceNotAvailable$str() {
        return "WFLYMODCLS0004: O Mod_cluster requer Anunciante, poré, a interface Multicast não está disponível.";
    }
    @Override
    protected String errorAddingMetrics$str() {
        return "WFLYMODCLS0001: Erro ao adicionar métricas.";
    }
    @Override
    protected String contextOrHostNotFound$str() {
        return "WFLYMODCLS0011: Host virtual '%1$s' ou contexto '%2$s' não encontrado.";
    }
    @Override
    protected String excludedContextsUseSlashInsteadROOT$str() {
        return "WFLYMODCLS0021: O valor \"ROOT\" para excluded-contexts foi preterido. Para excluir o contexto raiz, use \"/\" em seu lugar.";
    }
    @Override
    protected String excludedContextsWrongFormat$str() {
        return "WFLYMODCLS0019: '%1$s' não é um valor válido para excluded-contexts.";
    }
    @Override
    protected String errorApplyingMetricProperties$str() {
        return "WFLYMODCLS0006: Erro ao aplicar as propriedades para carregamento da classe métrica '%1$s'. A métrica não será carregada.";
    }
    @Override
    protected String usingSimpleLoadProvider$str() {
        return "WFLYMODCLS0005: Nenhum provedor de fator de balanceamento de carregamento de mod_cluster especificado para o proxy '%1$s'!. Usando o provedor de fator de carregamento com fator constante de “1”.";
    }
}
