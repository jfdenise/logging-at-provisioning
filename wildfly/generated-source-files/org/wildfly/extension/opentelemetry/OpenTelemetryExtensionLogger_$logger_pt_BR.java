package org.wildfly.extension.opentelemetry;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:44+0200")
public class OpenTelemetryExtensionLogger_$logger_pt_BR extends OpenTelemetryExtensionLogger_$logger_pt implements OpenTelemetryExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public OpenTelemetryExtensionLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYOTELEXT0014: Sistemas de métricas adicionais descobertos durante a configuração do OpenTelemetry: %1$s. Consulte o guia de administração para obter mais informações.";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYOTELEXT0001: Ativação do subsistema OpenTelemetry";
    }
    @Override
    protected String jaegerIsNoLongerSupported$str() {
        return "WFLYOTELEXT0013: O exportador \"jaeger\" não é mais compatível. Atualize o sistema para usar otlp.";
    }
    @Override
    protected String unsupportedSampler$str() {
        return "WFLYOTELEXT0011: Valor não reconhecido para o amostrador: '%1$s'.";
    }
    @Override
    protected String errorResolvingTelemetry$str() {
        return "WFLYOTELEXT0005: Erro resolvendo a instância de OpenTelemetry.";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYOTELEXT0004: A implantação %1$s requer o uso da funcionalidade '%2$s', mas esta não está registada no momento";
    }
    @Override
    protected String unsupportedExporter$str() {
        return "WFLYOTELEXT0008: Um exportador sem suporte foi especificado: “%1$s”.";
    }
    @Override
    protected String invalidRatio$str() {
        return "WFLYOTELEXT0012: Proporção inválida. Deve estar entre 0,0 e 1,0";
    }
    @Override
    protected String unsupportedSpanProcessor$str() {
        return "WFLYOTELEXT0010: Não há suporte para o processador de span especificado: “%1$s”.";
    }
    @Override
    protected String errorResolvingTracer$str() {
        return "WFLYOTELEXT0009: Erro na resolução do rastreador.";
    }
}
