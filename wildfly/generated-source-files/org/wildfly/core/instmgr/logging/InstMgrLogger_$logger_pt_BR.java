package org.wildfly.core.instmgr.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:21+0200")
public class InstMgrLogger_$logger_pt_BR extends InstMgrLogger_$logger_pt implements InstMgrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InstMgrLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String noChannelRepositoriesDefined$str() {
        return "WFLYIM0005: Nenhum repositório foi definido no canal '%1$s'.";
    }
    @Override
    protected String invalidChannelManifestURL$str() {
        return "WFLYIM0010: A URL do manifesto '%1$s' para o canal '%2$s' é inválida.";
    }
    @Override
    protected String invalidManifestGAOnly$str() {
        return "WFLYIM0016: As coordenadas do manifesto maven para '%1$s' são inválidas. As coordenadas maven esperadas para esse manifesto são GA (GroupId:ArtifactId).";
    }
    @Override
    protected String noResolveLocalCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0022: 'no-resolve-local-cache' e 'use-default-local-cache' são mutuamente exclusivos (especifique apenas um).";
    }
    @Override
    protected String invalidZipEntry$str() {
        return "A estrutura de diretórios e arquivos no arquivo .zip é inválida. O diretório '%1$s' não pode ser encontrado como uma entrada de segundo nível no arquivo .zip extraído.";
    }
    @Override
    protected String localCacheWithNoResolveLocalCache$str() {
        return "WFLYIM0011: Você não pode usar a opção \"local-cache\" quando a opção \"no-resolve-local-cache\" estiver ativada.";
    }
    @Override
    protected String noChannelRepositoryURLDefined$str() {
        return "WFLYIM0006: O repositório '%1$s' no canal não tem sua URL definida.";
    }
    @Override
    protected String mavenRepoFileWithRepositories$str() {
        return "WFLYIM0012: Você não pode usar a opção \"maven-repo-file\" com a opção \"repositories\" porque elas são mutuamente exclusivas.";
    }
    @Override
    protected String provisioningChannels$str() {
        return "WFLYIM0023: A instalação foi provisionada usando as seguintes versões de canal: '%1$s'";
    }
    @Override
    protected String invalidChannelRepositoryURL$str() {
        return "WFLYIM0007: A URL do repositório '%1$s' para o canal '%2$s' é inválida.";
    }
    @Override
    protected String failedToFindInstallationChannels$str() {
        return "WFLYIM0025: Não é possível relatar canais de instalação: '%1$s'";
    }
    @Override
    protected String failedToCreateInstallationManager$str() {
        return "WFLYIM0024: Não é possível relatar o status da instalação. Não é possível criar um InstallationManager para o caminho '%1$s': '%2$s'";
    }
    @Override
    protected String noChannelRepositoryIDDefined$str() {
        return "WFLYIM0008: O repositório '%1$s' no canal não tem sua ID definida.";
    }
    @Override
    protected String missingChannelName$str() {
        return "WFLYIM0004: O nome do canal é obrigatório.";
    }
    @Override
    protected String channelNameNotFound$str() {
        return "WFLYIM0015: Não é possível encontrar o canal com o nome '%1$s'.";
    }
    @Override
    protected String invalidRepositoryURL$str() {
        return "WFLYIM0013: Formato inválido para a URL do repositório: '%1$s'";
    }
    @Override
    protected String localCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0021: Você não poderá usar a opção 'local-cache' quando a opção 'use-default-local-cache' estiver habilitada.";
    }
    @Override
    protected String operationCancelled$str() {
        return "WFLYIM0019: A operação foi cancelada.";
    }
    @Override
    protected String noCustomPatchFound$str() {
        return "WFLYIM0020: Não foram encontrados patches personalizados instalados para as coordenadas maven do manifesto especificado: '%1$s'";
    }
    @Override
    protected String invalidManifestGAV$str() {
        return "WFLYIM0017: As coordenadas do manifesto maven para '%1$s' são inválidas. As coordenadas maven esperadas para esse manifesto são GAV (GroupId:ArtifactId:Version), em que Version é opcional.";
    }
    @Override
    protected String workDirWithMavenRepoFileOrRepositories$str() {
        return "WFLYIM0014: Você não pode usar a opção \"work-dir\" com as opções \"repositories\" ou \"maven-repo-file\" porque elas são mutuamente exclusivas.";
    }
    @Override
    protected String installationManagerServiceDown$str() {
        return "WFLYIM0018: O serviço Installation Manager está inativo.";
    }
    @Override
    protected String unexpectedArtifactChange$str() {
        return "WFLYIM0002: Alteração de status inválida encontrada para o artefato: '%1$s'";
    }
    @Override
    protected String unexpectedConfigurationChange$str() {
        return "WFLYIM0003: Alteração de status inválida encontrada para a alteração de configuração: '%1$s'";
    }
    @Override
    protected String zipEntryOutsideOfTarget$str() {
        return "A entrada zip %1$s está fora do diretório de destino %2$s.";
    }
    @Override
    protected String serverAlreadyPrepared$str() {
        return "WFLYIM0001: Há uma instalação preparada e pronta para ser aplicada. A instalação atual preparada pode ser descartada com a operação 'clean'.";
    }
    @Override
    protected String invalidChannelManifestGAV$str() {
        return "WFLYIM0009: A coordenada GAV manifestada '%1$s' para o canal '%2$s' é inválida.";
    }
}
