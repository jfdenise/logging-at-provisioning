package org.jboss.as.patching.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:44+0200")
public class PatchLogger_$logger_pt_BR extends PatchLogger_$logger_pt implements PatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PatchLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String notADirectory$str() {
        return "Não é um diretório %1$s";
    }
    @Override
    protected String requiresPatch$str() {
        return "WFLYPAT0015: Exige o patch '%1$s'";
    }
    @Override
    protected String failedToDelete$str() {
        return "WFLYPAT0004: Falha ao excluir (%1$s)";
    }
    @Override
    protected String cliFailedToResolveDistribution$str() {
        return "Falha ao resolver o jboss.home.dir. Use o atributo --distribution para apontar a uma instalação válida";
    }
    @Override
    protected String patchIdFoundInMoreThanOneStream$str() {
        return "WFLYPAT0041: Patch %1$s encontrado em mais de um fluxo: %2$s e %3$s";
    }
    @Override
    protected String installationMissingLayer$str() {
        return "Não foi possível encontrar a camada '%1$s' no diretório %2$s";
    }
    @Override
    protected String failedToDeleteBackup$str() {
        return "WFLYPAT0049: Alguns arquivos de backup não foram removidos.";
    }
    @Override
    protected String entryOutsideOfPatchDirectory$str() {
        return "WFLYPAT0051: Arquivo zip inválido. Encontrei uma entrada que se resolva para um caminho fora do diretório de patch: %1$s";
    }
    @Override
    protected String cannotCopyFiles$str() {
        return "WFLYPAT0047: Não foi possível copiar arquivos de %1$s para %2$s: %3$s";
    }
    @Override
    protected String unrecognizedConditionFormat$str() {
        return "WFLYPAT0045: Formato de condição '%1$s' não reconhecido";
    }
    @Override
    protected String noSuchLayer$str() {
        return "WFLYPAT0013: Não há nenhuma camada instalada chamada %1$s";
    }
    @Override
    protected String patchTypesDontMatch$str() {
        return "os tipos de patch não coincidem";
    }
    @Override
    protected String alreadyApplied$str() {
        return "WFLYPAT0012: O patch '%1$s' foi aplicado";
    }
    @Override
    protected String detectedConflicts$str() {
        return "Conflitos detectados";
    }
    @Override
    protected String patchBundleIsEmpty$str() {
        return "WFLYPAT0042: O lote de patch está vazio";
    }
    @Override
    protected String contentItemTypeMissing$str() {
        return "WFLYPAT0043: O tipo de item de conteúdo está ausente em '%1$s'";
    }
    @Override
    protected String productVersionDidNotMatchInstalled$str() {
        return "WFLYPAT0039: A versão %1$s de %2$s solicitada não correspondeu à versão instalada %3$s";
    }
    @Override
    protected String patchNotFoundInHistory$str() {
        return "WFLYPAT0021: O patch '%1$s' não foi encontrado no histórico.";
    }
    @Override
    protected String cannotCreateDirectory$str() {
        return "WFLYPAT0005: Falha ao criar o diretório (%1$s)";
    }
    @Override
    protected String installationInvalidLayerConfiguration$str() {
        return "nenhum módulo associado ou repositório de pacote com a camada '%1$s'";
    }
    @Override
    protected String noPatchesApplied$str() {
        return "WFLYPAT0020: Não foi possível realizar a reversão. Nenhum dos patches aplicados.";
    }
    @Override
    protected String fileDoesNotExist$str() {
        return "WFLYPAT0008: O arquivo no caminho especificado pelo argumento %1$s não existe";
    }
    @Override
    protected String serverRequiresRestart$str() {
        return "WFLYPAT0024: Não foi possível aplicar ou reverter um patch quando o servidor estiver num estado restart-required.";
    }
    @Override
    protected String patchIsMissingFile$str() {
        return "WFLYPAT0028: Falta o arquivo %1$s no patch";
    }
    @Override
    protected String missingArtifact$str() {
        return "WFLYPAT0032: ausente: '%1$s'";
    }
    @Override
    protected String doesNotApply$str() {
        return "WFLYPAT0003: O patch não se aplica - esperava-se (%1$s), mas era (%2$s)";
    }
    @Override
    protected String layerNotFound$str() {
        return "WFLYPAT0030: Camada não encontrada %1$s";
    }
    @Override
    protected String incompatiblePatch$str() {
        return "WFLYPAT0016: O patch é incompatível com o patch '%1$s'";
    }
    @Override
    protected String deleteRollbackError$str() {
        return "WFLYPAT0048: Erro ao restaurar o arquivo[%1$s] - %2$s";
    }
    @Override
    protected String logPatchingInfo$str() {
        return "WFLYPAT0050: A ID de patch cumulativo de %1$s é %2$s, os patches únicos incluem: %3$s";
    }
    @Override
    protected String cannotDeleteFile$str() {
        return "WFLYPAT0001: Não foi possível excluir o arquivo %1$s";
    }
    @Override
    protected String illegalPatchName$str() {
        return "WFLYPAT0019: Nome de patch inválido '%1$s'";
    }
    @Override
    protected String invalidRollbackInformation$str() {
        return "informação de reversão inválida";
    }
    @Override
    protected String failedToResolvePatch$str() {
        return "WFLYPAT0014: Falha ao resolver um descritor de patch válido para %1$s %2$s";
    }
    @Override
    protected String failedToShowHistory$str() {
        return "WFLYPAT0023: Falha ao apresentar p histórico dos patches.";
    }
    @Override
    protected String fileIsNotReadable$str() {
        return "WFLYPAT0029: O arquivo não é legível %1$s";
    }
    @Override
    protected String failedToLoadIdentity$str() {
        return "WFLYPAT0025: falha ao carregar a informação de identidade";
    }
    @Override
    protected String failedToLoadInfo$str() {
        return "WFLYPAT0040: falha ao carregar informações %1$s";
    }
    @Override
    protected String cannotRenameFileDuringRestore$str() {
        return "WFLYPAT0037: Não é possível processar a restauração renomeando o arquivo %1$s";
    }
    @Override
    protected String wrongCopiedContent$str() {
        return "WFLYPAT0018: O conteúdo copiado não coincide com o hash esperado para o item: %1$s";
    }
    @Override
    protected String unsupportedContentType$str() {
        return "WFLYPAT0044: Tipo de conteúdo '%1$s' não compatível";
    }
    @Override
    protected String conflictsDetected$str() {
        return "WFLYPAT0017: Conflitos detectados";
    }
    @Override
    protected String cannotRenameFileDuringBackup$str() {
        return "WFLYPAT0036: Não é possível processar o backup renomeando o arquivo %1$s";
    }
    @Override
    protected String inconsistentArtifact$str() {
        return "WFLYPAT0033: estado inconsistente: '%1$s'";
    }
    @Override
    protected String cannotCopyFilesToTempDir$str() {
        return "WFLYPAT0046: Não foi possível copiar arquivos para o diretório temporário %1$s: %2$s. Observe que a opção '-Djava.io.tmpdir' pode ser usada para definir outro diretório temporário.";
    }
    @Override
    protected String noPatchHistory$str() {
        return "WFLYPAT0027: Nenhum histórico de patch %1$s";
    }
    @Override
    protected String cannotRenameFile$str() {
        return "WFLYPAT0035: Não foi possível renomear o arquivo %1$s";
    }
    @Override
    protected String failedToUndoChange$str() {
        return "WFLYPAT0031: falha ao desfazer a alteração para: '%1$s'";
    }
    @Override
    protected String cannotInvalidateZip$str() {
        return "WFLYPAT0002: Não foi possível invalidar %1$s";
    }
    @Override
    protected String installationNoLayersConfigFound$str() {
        return "Nenhum diretório de camadas encontrado em %1$s";
    }
    @Override
    protected String installationDuplicateLayer$str() {
        return "Duplicado %1$s '%2$s'";
    }
    @Override
    protected String cannotRollbackPatch$str() {
        return "WFLYPAT0011: Não foi possível reverter o patch (%1$s)";
    }
    @Override
    protected String noMorePatches$str() {
        return "WFLYPAT0026: Nenhum patch a mais";
    }
    @Override
    protected String duplicateElementPatchId$str() {
        return "WFLYPAT0038: Duplicar patch-id (%1$s) do elemento";
    }
    @Override
    protected String artifactInError$str() {
        return "WFLYPAT0034: em erro: '%1$s'";
    }
}
