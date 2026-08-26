package org.wildfly.extension.batch.jberet._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:10+0200")
public class BatchLogger_$logger_pt_BR extends BatchLogger_$logger_pt implements BatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BatchLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorProcessingBatchJobsDir$str() {
        return "WFLYBATCH000001: Erro ao processar o diretório META-INF/ batch-jobs. ";
    }
    @Override
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYBATCH000002: Os recursos do tipo %1$s não podem ser removidos";
    }
    @Override
    protected String couldNotFindDeploymentName$str() {
        return "WFLYBATCH000003: Não foi possível encontrar uma implementação de nome: %1$s";
    }
    @Override
    protected String jobOperatorServiceStopped$str() {
        return "WFLYBATCH000004: O serviço JobOperatorService foi interrompido e não pode ser executar operações.";
    }
    @Override
    protected String noSuchJobException$str() {
        return "WFLYBATCH000005: O nome de tarefa '%1$s' não foi encontrado para a implementação. ";
    }
    @Override
    protected String couldNotFindJobXml$str() {
        return "WFLYBATCH000006: Não foi possível encontrar o arquivo XML da tarefa na implantação: %1$s";
    }
    @Override
    protected String invalidJobXmlFile$str() {
        return "WFLYBATCH000007: Falha ao processar o arquivo XML da tarefa%1$s. Tentar executar esta tarefa pode resultar em erros. ";
    }
    @Override
    protected String emptyJobRepositoryElement$str() {
        return "WFLYBATCH000008: Encontrado elemento de repositório de tarefa vazio em descritor de implementação. Utilizando o repositório de tarefas padrão para implementação %1$s. ";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYBATCH000009: Os recursos filhos indexados podem ser registrados somente se o recurso primário suportar filhos ordenados. O primário de '%1$s' não está indexado.";
    }
    @Override
    protected String failedToCreateJobRepository$str() {
        return "WFLYBATCH000011: Falha ao criar repositório de tarefas %1$s";
    }
    @Override
    protected String multipleJobRepositoriesFound$str() {
        return "WFLYBATCH000013: Somente um repositório de tarefas pode ser definido no descritor jboss-all.xml, O primeiro repositório de tarefas será utilizado.";
    }
    @Override
    protected String stoppingJob$str() {
        return "WFLYBATCH000014: Interrompendo a execução %1$d de %2$s para implementação %3$s";
    }
    @Override
    protected String stoppingJobFailed$str() {
        return "WFLYBATCH000015: Falha ao interromper a execução %1$d para tarefa %2$s na implementação %3$s";
    }
    @Override
    protected String failedRestartingJob$str() {
        return "WFLYBATCH000016: Falha ao reiniciar a execução %1$d para tarefa %2$s na implementação %3$s";
    }
    @Override
    protected String restartingJob$str() {
        return "WFLYBATCH000017: Reiniciando tarefa de lotes %1$s previamente interrompida. Id de execução anterior %2$d. Nova id de execução %3$d. ";
    }
    @Override
    protected String noBatchEnvironmentFound$str() {
        return "WFLYBATCH000019: Nenhum ambiente de lote foi encontrado para o carregador de classe: %1$s";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYBATCH000020: Permissão negada. O usuário %1$s não tem permissões %2$s.";
    }
    @Override
    protected String duplicateVirtualFile$str() {
        return "WFLYBATCH000021: Arquivo virtual duplicado %1$s.";
    }
}
