package org.jboss.as.logging.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:28+0200")
public class LoggingLogger_$logger_pt_BR extends LoggingLogger_$logger_pt implements LoggingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public LoggingLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidPropertyAttribute$str() {
        return "WFLYLOG0007: Não foi possível configurar o atributo %1$s, pois ele não é um valor de propriedade configurável.";
    }
    @Override
    protected String perDeploymentPropertyDeprecated$str() {
        return "WFLYLOG0015: A propriedade de implementação para registro em log (%1$s) tornou-se obsoleta. Use o atributo %2$s para ativar/desativar o registro em log para implantação.";
    }
    @Override
    protected String loggerNotFound$str() {
        return "WFLYLOG0035: Agente de log '%1$s' não foi encontrado.";
    }
    @Override
    protected String unresolvablePathExpressions$str() {
        return "WFLYLOG0090: As seguintes expressões de caminho não puderam ser resolvidas durante a tentativa de determinar arquivos de log disponíveis para leitura: %1$s";
    }
    @Override
    protected String replacingNamedHandler$str() {
        return "WFLYLOG0012: Substituindo o manipulador '%1$s' durante a operação de adição. O tipo de manipulador ou o nome do módulo é diferente da configuração inicial.";
    }
    @Override
    protected String formatterNotFound$str() {
        return "WFLYLOG0061: O formatador '%1$s' não foi encontrado";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYLOG0006: Falha ao encerrar o recurso %1$s";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYLOG0082: O sufixo (%1$s) não pode conter segundos ou milésimos de segundos.";
    }
    @Override
    protected String invalidEscapeFoundInFilterExpression$str() {
        return "WFLYLOG0071: Foi encontrado um escape inválido na sequência da expressão do filtro";
    }
    @Override
    protected String pathManagerServiceNotStarted$str() {
        return "WFLYLOG0008: O serviço gerenciador do caminho não parece ter sido iniciado. Quaisquer alterações podem ser perdidas como resultado disto.";
    }
    @Override
    protected String deploymentNameNotFound$str() {
        return "WFLYLOG0086: Não foi possível determinar o nome da implantação a partir do endereço %1$s.";
    }
    @Override
    protected String handlerAttachedToHandlers$str() {
        return "WFLYLOG0044: O manipulador %1$s está anexado aos seguintes manipuladores e não pode ser removido; %2$s";
    }
    @Override
    protected String handlerAttachedToLoggers$str() {
        return "WFLYLOG0045: O manipulador %1$s está anexado aos seguintes agentes de log e não pode ser removido; %2$s";
    }
    @Override
    protected String invalidExceptionOutputType$str() {
        return "WFLYLOG0091: O tipo de saída de exceção %1$s é inválido.";
    }
    @Override
    protected String expectedString$str() {
        return "WFLYLOG0074: A próxima sequência esperada na expressão do filtro";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYLOG0041: O sufixo (%1$s) é inválido. Ele deve ser um formato de data válido.";
    }
    @Override
    protected String loggingProfileNotFound$str() {
        return "WFLYLOG0010: O perfil de registro em log '%1$s' foi especificado para implantação '%2$s', mas não foi encontrado. Usando a configuração do registro em log do sistema.";
    }
    @Override
    protected String unknownLogManager$str() {
        return "WFLYLOG0089: A verificação do gerenciador de logs foi ignorada e a propriedade do sistema do gerenciador de logs, \"java.util.logging.manager\", não parece estar definida como \"org.jboss.logmanager.LogManager\". O valor atual é \"%1$s\". Alguns comportamentos da saída autenticada como MDC e NDC podem não funcionar como esperado.";
    }
    @Override
    protected String truncatedFilterExpression$str() {
        return "WFLYLOG0070: Sequência de expressão do filtro truncada";
    }
    @Override
    protected String unsupportedMethod$str() {
        return "WFLYLOG0050: O método %1$s na classe %2$s não é compatível";
    }
    @Override
    protected String failedToReadLogFile$str() {
        return "WFLYLOG0079: Falha ao ler o arquivo de log '%1$s'";
    }
    @Override
    protected String expected2$str() {
        return "WFLYLOG0075: '%1$s' ou '%2$s' esperados a seguir na expressão do filtro";
    }
    @Override
    protected String cannotLoadModule$str() {
        return "WFLYLOG0019: Não foi possível carregar o módulo '%1$s' para %2$s '%3$s'";
    }
    @Override
    protected String perLoggingDeploymentIgnored$str() {
        return "WFLYLOG0016: A propriedade de implantação para registro em log (%1$s) está sendo ignorada porque o atributo %2$s foi definido para ignorar arquivos de configuração na implantação %3$s.";
    }
    @Override
    protected String classNotFound$str() {
        return "WFLYLOG0021: A classe '%1$s' não foi encontrada.";
    }
    @Override
    protected String invalidRelativeTo$str() {
        return "WFLYLOG0039: O caminho absoluto (%1$s) não foi especificado para o relative-to.";
    }
    @Override
    protected String errorDeterminingChildrenExist$str() {
        return "WFLYLOG0088: Não foi possível determinar se %1$s tem recursos filhos.";
    }
    @Override
    protected String failedToConfigureSslContext$str() {
        return "WFLYLOG0093: Falha ao configurar o contexto SSL para %1$s %2$s.";
    }
    @Override
    protected String unexpectedEnd$str() {
        return "WFLYLOG0076: Término inesperado da expressão do filtro";
    }
    @Override
    protected String invalidLogFile$str() {
        return "WFLYLOG0083: O caminho '%1$s' é um diretório e não pode ser usado como um arquivo de log.";
    }
    @Override
    protected String logFileNotFound$str() {
        return "WFLYLOG0080: O arquivo '%1$s' não foi encontrado e não pode ser encontrado no diretório %2$s.";
    }
    @Override
    protected String invalidLogLevel$str() {
        return "WFLYLOG0026: O nível de log %1$s é inválido.";
    }
    @Override
    protected String filterNotFound$str() {
        return "WFLYLOG0072: O filtro '%1$s' não foi encontrado";
    }
    @Override
    protected String invalidFilterName$str() {
        return "WFLYLOG0097: O nome %1$s não pode ser usado como um nome de filtro porque contém um caractere inválido %2$s";
    }
    @Override
    protected String usageOfLog4j1Config$str() {
        return "WFLYLOG0100: O uso de um arquivo de configuração log4j (%1$s) foi encontrado na implantação %2$s. O suporte aos arquivos de configuração log4j em implantações foi depreciado e será removido em uma lançamento futuro.";
    }
    @Override
    protected String invalidOverflowAction$str() {
        return "WFLYLOG0027: A ação excedente %1$s é inválida.";
    }
    @Override
    protected String handlerAlreadyDefined$str() {
        return "WFLYLOG0023: O manipulador %1$s já foi determinado.";
    }
    @Override
    protected String expected1$str() {
        return "WFLYLOG0075: '%1$s' é esperado a seguir na expressão do filtro";
    }
    @Override
    protected String cannotRegisterResourceOfType$str() {
        return "WFLYLOG0084: Os recursos do tipo %1$s não podem ser registrados";
    }
    @Override
    protected String failedToConfigureLogging$str() {
        return "WFLYLOG0042: Falha ao configurar o registro em log usando o arquivo de configuração '%1$s'.";
    }
    @Override
    protected String failedToWriteConfigurationFile$str() {
        return "WFLYLOG0051: Falha ao gravar o arquivo de configuração %1$s";
    }
    @Override
    protected String cannotAddHandlerToSelf$str() {
        return "WFLYLOG0046: Não foi possível adicionar o manipulador (%1$s) e ele mesmo";
    }
    @Override
    protected String expectedIdentifier$str() {
        return "WFLYLOG0073: O próximo identificador esperado na expressão do filtro";
    }
    @Override
    protected String errorProcessingLogDirectory$str() {
        return "WFLYLOG0087: Falha ao processar diretório de registro em log %1$s. Os arquivos de log não podem ser listados.";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYLOG0028: Tamanho inválido %1$s";
    }
    @Override
    protected String handlerClosed$str() {
        return "WFLYLOG0047: O manuseador está encerrado. Não é possível encerrar o manuseador";
    }
    @Override
    protected String reservedFilterName$str() {
        return "WFLYLOG0095: O nome %1$s não pode ser usado como um nome de filtro, pois é um nome de filtro reservado. Os nomes reservados são: %2$s";
    }
    @Override
    protected String handlerConfigurationNotFound$str() {
        return "WFLYLOG0048: A configuração para o manipulador '%1$s' não pode ser encontrada.";
    }
    @Override
    protected String replacingConfigurator$str() {
        return "WFLYLOG0013: Uma classe de configurador, '%1$s', não é um configurador e será substituída.";
    }
    @Override
    protected String logContextNotRemoved$str() {
        return "WFLYLOG0014: O contexto de log (%1$s) não pode ser removido para a implantação %2$s";
    }
    @Override
    protected String invalidFilter$str() {
        return "WFLYLOG0025: O filtro %1$s é inválido";
    }
    @Override
    protected String illegalFormatterName$str() {
        return "WFLYLOG0094: O nome do formatador não pode terminar com '-wfcore-pattern-formatter'";
    }
    @Override
    protected String invalidFilterNameStart$str() {
        return "WFLYLOG0096: O nome %1$s não pode ser usado como um nome de filtro porque começa com um caractere inválido %2$s";
    }
    @Override
    protected String extensionNotInitialized$str() {
        return "WFLYLOG0078: O subsistema do registro em log requer o gerenciador de log a ser org.jboss.logmanager.LogManager. O subsistema não foi inicializado e não pode ser usado. Para usar o Gerenciador de Log do JBoss você precisa adicionar o \"java.util.logging.manager\" da propriedade do sistema e configurá-lo para \"org.jboss.logmanager.LogManager\"";
    }
    @Override
    protected String julConfigurationFileFound$str() {
        return "WFLYLOG0011: O arquivo de configuração em '%1$s' parece ser um arquivo de configuração J.U.L. O gerenciador do log não permite esse tipo de arquivo de configuração.";
    }
    @Override
    protected String errorProcessingLoggingConfiguration$str() {
        return "WFLYLOG0043: Ocorreu um erro enquanto buscando por arquivos de configuração de registro de log.";
    }
    @Override
    protected String usageOfAppender$str() {
        return "WFLYLOG0099: Uso de um anexador log4j (%1$s) encontrado em um custom-handler. O suporte para o uso de anexadores como manipuladores personalizados foi depreciado e será removido em um lançamento futuro.";
    }
    @Override
    protected String loggerConfigurationNotFound$str() {
        return "WFLYLOG0049: A configuração para o agente de log '%1$s' não pode ser encontrada.";
    }
    @Override
    protected String readNotAllowed$str() {
        return "WFLYLOG0081: Não há permissão para ler o arquivo '%1$s'.";
    }
    @Override
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYLOG0085: Os recursos do tipo %1$s não podem ser removidos";
    }
    @Override
    protected String invalidType$str() {
        return "WFLYLOG0092: Tipo inválido encontrado. Esperava-se %1$s, mas foi encontrado %2$s.";
    }
}
