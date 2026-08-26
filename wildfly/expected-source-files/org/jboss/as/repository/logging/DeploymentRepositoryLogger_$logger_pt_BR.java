package org.jboss.as.repository.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:21+0200")
public class DeploymentRepositoryLogger_$logger_pt_BR extends DeploymentRepositoryLogger_$logger_pt implements DeploymentRepositoryLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentRepositoryLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String contentAdded$str() {
        return "WFLYDR0001: Conteúdo adicionado no local %1$s";
    }
    @Override
    protected String contentRemoved$str() {
        return "WFLYDR0002: Conteúdo removido do local %1$s";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYDR0003: Não foi possível excluir o arquivo temporário %1$s. Será excluído na saída";
    }
    @Override
    protected String cannotCreateDirectory$str() {
        return "WFLYDR0004: Não foi possível criar o diretório %1$s";
    }
    @Override
    protected String cannotObtainSha1$str() {
        return "WFLYDR0005: Não foi possível obter SHA-1 %1$s";
    }
    @Override
    protected String directoryNotWritable$str() {
        return "WFLYDR0006: O diretório %1$s não é gravável";
    }
    @Override
    protected String notADirectory$str() {
        return "WFLYDR0007: %1$s não é um diretório";
    }
    @Override
    protected String obsoleteContentCleaned$str() {
        return "WFLYDR0009: O conteúdo %1$s é obsoleto e será removido";
    }
    @Override
    protected String contentDeletionError$str() {
        return "WFLYDR0010: Não foi possível excluir o conteúdo %1$s";
    }
    @Override
    protected String localContentListError$str() {
        return "WFLYDR0011: Não foi possível listar arquivos de diretório para %1$s";
    }
    @Override
    protected String hashingError$str() {
        return "WFLYDR0012: Não é possível utilizar hash no conteúdo de implementação atual %1$s";
    }
    @Override
    protected String forbiddenPath$str() {
        return "WFLYDR0013: Acesso negado ao conteúdo em %1$s na implementação";
    }
    @Override
    protected String couldNotDeleteDeployment$str() {
        return "WFLYDR0014: Erro ao remover implementação %1$s";
    }
    @Override
    protected String notAnArchive$str() {
        return "WFLYDR0015: %1$s não é um arquivo compactado";
    }
    @Override
    protected String archiveNotFound$str() {
        return "WFLYDR0016: O arquivo compactado %1$s não foi encontrado";
    }
    @Override
    protected String contentExploded$str() {
        return "WFLYDR0017: Conteúdo expandido no local %1$s";
    }
    @Override
    protected String errorExplodingContent$str() {
        return "WFLYDR0018: Erro ao expandir conteúdo para %1$s";
    }
    @Override
    protected String errorLockingDeployment$str() {
        return "WFLYDR0019: A implantação está bloqueada por outra operação";
    }
    @Override
    protected String errorAccessingDeployment$str() {
        return "WFLYDR0020: Erro ao acessar arquivos da implementação";
    }
    @Override
    protected String errorUpdatingDeployment$str() {
        return "WFLYDR0021: Erro ao atualizar o conteúdo da implantação expandida";
    }
    @Override
    protected String errorCopyingDeployment$str() {
        return "WFLYDR0022: Erro ao copiar arquivos de implantação expandida para %1$s";
    }
    @Override
    protected String cannotDeleteFile$str() {
        return "WFLYDR0023: Erro ao remover arquivo %1$s";
    }
    @Override
    protected String cannotCopyFile$str() {
        return "WFLYDR0024: Erro ao copiar arquivo %1$s";
    }
}
