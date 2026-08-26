package org.wildfly.core.jar.runtime._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:32:41+0200")
public class BootableJarLogger_$logger_pt_BR extends BootableJarLogger_$logger_pt implements BootableJarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BootableJarLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String shuttingDown$str() {
        return "WFLYJAR0001: Encerramento";
    }
    @Override
    protected String serverStopped$str() {
        return "WFLYJAR0002: Servidor interrompido, encerrando";
    }
    @Override
    protected String serverNotStopped$str() {
        return "WFLYJAR0003: Servidor ainda não interrompido, esperando";
    }
    @Override
    protected String nullController$str() {
        return "WFLYJAR0004: Cliente controlador nulo, encerrando";
    }
    @Override
    protected String unexpectedExceptionWhileShuttingDown$str() {
        return "WFLYJAR0005: Ocorreu uma exceção inesperada durante o desligamento do servidor";
    }
    @Override
    protected String installDeployment$str() {
        return "WFLYJAR0006: %1$s implantado no servidor";
    }
    @Override
    protected String advertiseInstall$str() {
        return "WFLYJAR0007: Servidor e aplicativo instalados em %1$s; levou %2$s ms";
    }
    @Override
    protected String advertiseOptions$str() {
        return "WFLYJAR0008: Opções do servidor: %1$s";
    }
    @Override
    protected String deletingHome$str() {
        return "WFLYJAR0009: Excluindo %1$s diretório";
    }
    @Override
    protected String deploymentAlreadyExist$str() {
        return "WFLYJAR0010: Não é um JAR hollow, a implantação já existe";
    }
    @Override
    protected String unknownArgument$str() {
        return "WFLYJAR0011: Argumento %1$s desconhecido";
    }
    @Override
    protected String notExistingFile$str() {
        return "WFLYJAR0012: O arquivo %1$s não existe";
    }
    @Override
    protected String invalidArgument$str() {
        return "WFLYJAR0013: Argumento %1$s inválido, nenhum valor fornecido";
    }
    @Override
    protected String processIsStopping$str() {
        return "WFLYJAR0014: O servidor está sendo interrompido e as invocações no ModelControllerClient não estão disponíveis";
    }
    @Override
    protected String processIsReloading$str() {
        return "WFLYJAR0015: O servidor está recarregando e as invocações no ModelControllerClient ainda não estão disponíveis";
    }
    @Override
    protected String processIsStopped$str() {
        return "WFLYJAR0016: O servidor foi interrompido e as invocações no ModelControllerClient não estão disponíveis";
    }
    @Override
    protected String cannotStartServer$str() {
        return "WFLYJAR0017: Não foi possível iniciar o servidor";
    }
    @Override
    protected String moduleLoaderError$str() {
        return "WFLYJAR0018: Não foi possível carregar o módulo %1$s a partir de %2$s";
    }
    @Override
    protected String cantRestartServer$str() {
        return "WFLYJAR0019: Não é possível reiniciar o servidor, encerrando";
    }
    @Override
    protected String cantDelete$str() {
        return "WFLYJAR0020: Não é possível apagar %1$s. Exceção %2$s";
    }
    @Override
    protected String cantRegisterModuleMBeans$str() {
        return "WFLYJAR0021: Não é possível registrar MBeans dos módulos do JBoss, %1$s";
    }
    @Override
    protected String pidFileAlreadyExists$str() {
        return "WFLYJAR0022: O arquivo PID %1$s já existe. Isso pode fazer com que o diretório de instalação \"%2$s\" não seja devidamente apagado.";
    }
    @Override
    protected String failedToStartCleanupProcess$str() {
        return "WFLYJAR0023: Falha ao iniciar o processador de limpeza. Isso pode fazer com que o diretório de instalação \"%1$s\" não seja devidamente apagado.";
    }
    @Override
    protected String cleanupTimeout$str() {
        return "WFLYJAR0024: O contêiner não foi devidamente desligado dentro de %1$ds. Isso pode fazer com que o diretório de instalação \"%2$s\" não seja devidamente apagado.";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "Determina o jboss.bind.address da propriedade do sistema ao valor gerado";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "Determinar o jboss.bind.address.<interface> da propriedade do sistema para valor gerado";
    }
    @Override
    protected String argSystem$str() {
        return "Determina a propriedade do sistema";
    }
    @Override
    protected String argHelp$str() {
        return "Display esta mensagem e sai";
    }
    @Override
    protected String argProperties$str() {
        return "Carrega as propriedades a partir do url gerado";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "Determina o jboss.default.multicast.address da propriedade do sistema ao valor gerado";
    }
    @Override
    protected String argVersion$str() {
        return "Imprime a versão e encerra";
    }
    @Override
    protected String argSecurityManager$str() {
        return "Ativar o SecurityManager";
    }
    @Override
    protected String argStability$str() {
        return "Executa o servidor usando um nível de estabilidade específico. Valores possíveis:%1$s, Padrão = %2$s";
    }
    @Override
    protected String argSecurityProperty$str() {
        return "Determina a propriedade de segurança";
    }
    @Override
    protected String argDeployment$str() {
        return "Caminho para o artefato de implantação (war, jar, ear ou diretório de implantação expandido) para implantar no jar hollow";
    }
    @Override
    protected String argInstallation$str() {
        return "Caminho para o diretório onde o servidor é instalado. Por padrão, o servidor é instalado no diretório TEMP.";
    }
    @Override
    protected String argDisplayGalleonConfig$str() {
        return "Mostrar o conteúdo da configuração do Galleon utilizado para compilar este JAR inicializável";
    }
    @Override
    protected String argCliScript$str() {
        return "Caminho para um script CLI a ser executado ao iniciar o JAR inicializável";
    }
    @Override
    protected String securityProviderFailed$str() {
        return "WFLYJAR0025: Falha ao inicializar um provedor de segurança. Motivo: %1$s";
    }
}
