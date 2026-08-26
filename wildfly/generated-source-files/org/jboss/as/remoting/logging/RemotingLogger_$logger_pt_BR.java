package org.jboss.as.remoting.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:48+0200")
public class RemotingLogger_$logger_pt_BR extends RemotingLogger_$logger_pt implements RemotingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RemotingLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYRMT0029: O uso de reinos de segurança em tempo de execução não é compatível.";
    }
    @Override
    protected String endpointEmpty$str() {
        return "WFLYRMT0006: O ponto de extremidade é nulo";
    }
    @Override
    protected String invalidQOPV$str() {
        return "WFLYRMT0016: Valor QOP inválido: %1$s";
    }
    @Override
    protected String addingIOSubsystem$str() {
        return "WFLYRMT0024: O subsistema remoto está presente mas nenhum subsistema de E/S foi encontrado. Um subsistema de E/S não era exigido quando o esquema remoto '%1$s' era atual, mas agora é. Portanto, um subsistema padrão está sendo adicionado.";
    }
    @Override
    protected String illegalStrength$str() {
        return "WFLYRMT0020: String de intensidade '%1$s' inválida fornecida";
    }
    @Override
    protected String failedToObtainSSLContext$str() {
        return "WFLYRMT0027: Falha ao obter SSLContext";
    }
    @Override
    protected String couldNotStart$str() {
        return "WFLYRMT0005: Falha ao iniciar o serviço";
    }
    @Override
    protected String couldNotRemoveResource$str() {
        return "WFLYRMT0025: Não foi possível remover %1$s pois o JMX o utiliza o como ponto de extremidade remoto";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYRMT0028: Opção '%1$s' inválida.";
    }
    @Override
    protected String couldNotCreateURI$str() {
        return "WFLYRMT0018: Não foi possível criar um URI válido %1$s -- %2$s";
    }
    @Override
    protected String couldNotStartChanelListener$str() {
        return "WFLYRMT0002: Não foi possível iniciar o ouvinte do canal";
    }
    @Override
    protected String couldNotBindToSocket$str() {
        return "WFLYRMT0004: %1$s";
    }
    @Override
    protected String warningOnWorkerChange$str() {
        return "WFLYRMT0026: A mudança do trabalhador para “%1$s” no remoto pode exigir a mesma mudança nos recursos vinculados, dependendo do remoto e da definição de ouvintes http(s).";
    }
    @Override
    protected String listeningOnSocket$str() {
        return "WFLYRMT0001: Escutando no %1$s";
    }
    @Override
    protected String workerConfigurationIgnored$str() {
        return "WFLYRMT0022: A configuração do trabalhador não é mais utilizada, por favor, use a configuração do trabalhador do endpoint";
    }
    @Override
    protected String upgradeRequestMissingKey$str() {
        return "WFLYRMT0021: Sec-JbossRemoting-Key header ausente para solicitação de atualização HTTP";
    }
    @Override
    protected String workerThreadsEndpointConfigurationChoiceRequired$str() {
        return "WFLYRMT0023: Somente uma configuração '%1$s' ou '%2$s' é permitida";
    }
    @Override
    protected String invalidStrength$str() {
        return "WFLYRMT0017: Valor de intensidade inválido: %1$s";
    }
}
