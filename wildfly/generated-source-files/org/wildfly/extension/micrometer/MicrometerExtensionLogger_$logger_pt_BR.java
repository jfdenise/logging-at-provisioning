package org.wildfly.extension.micrometer;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:43+0200")
public class MicrometerExtensionLogger_$logger_pt_BR extends MicrometerExtensionLogger_$logger_pt implements MicrometerExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicrometerExtensionLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMMTREXT0001: Ativando o subsistema Micrometer";
    }
    @Override
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMMTREXT0008: Falha ao inicializar as métricas de JMX MBeans";
    }
    @Override
    protected String unsupportedMetricType$str() {
        return "WFLYMMTREXT0009: Um tipo de métrica não compatível foi encontrado: %1$s";
    }
    @Override
    protected String noCdiDeployment$str() {
        return "WFLYMMTREXT0003: A implantação não tem os contextos de Jakarta e a injeção de dependência habilitados. Ignorando a integração do Micrometer.";
    }
    @Override
    protected String unableToConvertAttribute$str() {
        return "WFLYMMTREXT0006: Não é possível converter o atributo %1$s em %2$sem valor duplo.";
    }
    @Override
    protected String malformedName$str() {
        return "WFLYMMTREXT0007: Nome malformado.";
    }
    @Override
    protected String notActivatingSubsystem$str() {
        return "WFLYMMTREXT0010: Não ativamdo o subsistema Micrometer";
    }
    @Override
    protected String noOpRegistryChosen$str() {
        return "WFLYMMTREXT0011: O Micrometer foi habilitado, mas nenhum ponto de extremidade foi configurado. Um registro de métricas No-op foi configurado.";
    }
    @Override
    protected String unableToReadAttribute$str() {
        return "WFLYMMTREXT0005: Não é possível ler o atributo %1$s em %2$s: %3$s.";
    }
    @Override
    protected String processingDeployment$str() {
        return "WFLYMMTREXT0002: O subsistema Micrometer está processando a implantação";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMMTREXT0004: A implantação %1$s requer o uso da funcionalidade '%2$s', mas esta não está registada no momento";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMMTREXT0012: Sistemas de métricas adicionais descobertos durante a configuração do Micrometer:%1$s. Consulte o guia de administração para obter mais informações.";
    }
}
