package org.jboss.as.server.deployment.scanner.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:17+0200")
public class DeploymentScannerLogger_$logger_pt_BR extends DeploymentScannerLogger_$logger_pt implements DeploymentScannerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentScannerLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotDeleteDeploymentProgressMarker$str() {
        return "WFLYDS0001: Não foi possível excluir o arquivo marcador de progresso de implantação %1$s";
    }
    @Override
    protected String cannotRemoveDeploymentMarker$str() {
        return "WFLYDS0002: Não foi possível remover o arquivo marcador de implantação incorreta %1$s";
    }
    @Override
    protected String deploymentNotFound$str() {
        return "WFLYDS0003: A implantação de '%1$s' foi solicitada, mas não está presente";
    }
    @Override
    protected String deploymentTriggered$str() {
        return "WFLYDS0004: Encontrado %1$s no diretório da implantação. Crie um arquivo chamado %1$s%2$s para aplicar o trigger na implantação";
    }
    @Override
    protected String errorWritingDeploymentMarker$str() {
        return "WFLYDS0005: Foi observada uma exceção ao gravar o arquivo marcador de implantação %1$s";
    }
    @Override
    protected String explodedAutoDeploymentContentWarning$str() {
        return "WFLYDS0006: O comportamento de implantação confiável não é viável quando a implantação automática do conteúdo expandido estiver ativada (ou seja, a implantação sem uso de arquivos marcadores \"%1$s\"). A configuração de implantação automática do conteúdo expandido não é recomendada em nenhuma situação onde houver necessidade de confiabilidade. Recomenda-se configurar o %2$s do scanner de implantação como \"false\".";
    }
    @Override
    protected String explodedDeploymentContentDeleted$str() {
        return "WFLYDS0007: O scanner de implantação descobriu que o conteúdo para a implantação destacada %1$s foi deletada, porém a implantação/desimplantação automática para implantações destacadas não está ativada. Além disso, o arquivo marcador %1$s%2$s para essa implantação não foi removido. Como resultado, a implantação não foi desimplantada, mas os recursos necessários pela implantação podem ter sido deletados e podem ocorrer erros de aplicação. Recomenda-se a exclusão do arquivo doo marcador %1$s%2$s para aplicar o trigger na desimplantação.";
    }
    @Override
    protected String failedCheckingZipFile$str() {
        return "WFLYDS0008: Falha ao verificar se %1$s era um zip completo";
    }
    @Override
    protected String fileSystemDeploymentFailed$str() {
        return "WFLYDS0009: Falha no serviço de implantação do sistema do arquivos";
    }
    @Override
    protected String incompleteContent$str() {
        return "WFLYDS0010: A verificação encontrou conteúdo do arquivo copiado incompleto para a implantação %1$s. As alterações da implantação não serão processadas até que todos os conteúdos estejam completos.";
    }
    @Override
    protected String invalidExplodedDeploymentDirectory$str() {
        return "WFLYDS0011: O scanner de implantação encontrou um diretório de nome %1$s que não estava dentro de um diretório cujo nome encerra com .ear, .jar, .rar, .sar ou .war. Isto é provavelmente o resultado da descompactação de um arquivo diretamente dentro do diretório %2$s, que é um erro do usuário. O diretório %1$s não será escaneado para implantações, mas é possível que o scanner encontre outros arquivos a partir do arquivo descompactado e tente implantá-los, levando a erros.";
    }
    @Override
    protected String scanException$str() {
        return "WFLYDS0012: A verificação de %1$s lançou uma exceção";
    }
    @Override
    protected String started$str() {
        return "WFLYDS0013: Foi iniciado %1$s para o diretório %2$s";
    }
    @Override
    protected String unsafeAutoDeploy$str() {
        return "WFLYDS0014: A verificação encontrou conteúdo configurado para a implantação automática que não pôde ser implantado automaticamente. Consulte os detalhes acima. As alterações da implantação não serão processadas até que todo o conteúdo problemático seja removido ou até que seja definido se é indicado ou não fazer a implantação através de um %1$s ou arquivo marcador %2$s. As implantações problemáticas são %3$s";
    }
    @Override
    protected String reattemptingFailedDeployment$str() {
        return "WFLYDS0015: A nova tentativa implantação de %1$s falhou";
    }
    @Override
    protected String failedCheckingXMLFile$str() {
        return "WFLYDS0016: Falha ao verificar se %1$s era um XML completo";
    }
    @Override
    protected String initialScanFailed$str() {
        return "WFLYDS0017: A varredura inicial de implantação falhou";
    }
    @Override
    protected String scannerDeploymentUndeployedButNotByScanner$str() {
        return "WFLYDS0018: A implantação %1$s foi implantada anteriormente por este scanner, mas foi desimplantada por outra ferramenta de gerenciamento. O arquivo marcador %2$s foi adicionado para gravar este fato.";
    }
    @Override
    protected String scannerDeploymentRemovedButNotByScanner$str() {
        return "WFLYDS0019: A implantação %1$s foi implantada anteriormente por este scanner, mas foi removida da lista da implantação do servidor por outra ferramenta de gerenciamento. O arquivo marcador %2$s foi adicionado para gravar este fato.";
    }
    @Override
    protected String deploymentContentIncomplete$str() {
        return "WFLYDS0021: O %1$s do conteúdo de implantação parece estar incompleto e não está progredindo para a conclusão. Esse conteúdo não pode ser implantado automaticamente.%2$s";
    }
    @Override
    protected String deploymentTimeout$str() {
        return "WFLYDS0022: A resposta da operação da implantação não foi recebida dentro do período de tempo limite permitido [%1$d segundos]. Verifique o arquivo de configuração do servidor e os registros do servidor para entender melhor o status da implantação.";
    }
    @Override
    protected String invalidZipFileFormat$str() {
        return "WFLYDS0025: O arquivo %1$s não pôde ser verificado, pois ele não inicia com a assinatura do cabeçalho do arquivo local no formato de arquivo ZIP";
    }
    @Override
    protected String invalidZip64FileFormat$str() {
        return "WFLYDS0026: O arquivo %1$s não pode ser verificado, pois está usando o formato ZIP64, que não é compatível";
    }
    @Override
    protected String previousContentDeployed$str() {
        return "Uma versão anterior desse conteúdo foi implantada e continua implantada.";
    }
    @Override
    protected String unsafeAutoDeploy2$str() {
        return "WFLYDS0030: O arquivo %2$s foi configurado para implantação automática, porém não foi possível implantá-lo automaticamente com segurança. O motivo de não ser possível implantar o arquivo automaticamente foi: %1$s. Crie um arquivo chamado %2$s%3$s para ativar a implantação desse arquivo";
    }
    @Override
    protected String deploymentScannerNotForDomainMode$str() {
        return "WFLYDS0031: A extensão com o 'org.jboss.as.deployment-scanner' do módulo não pode ser instalada num domain controller. Por favor remova-a e qualquer subsistema referenciado à mesma";
    }
    @Override
    protected String cannotListDirectoryFiles$str() {
        return "WFLYDS0032: Falha ao listar arquivos no diretório %1$s. Verifique se os conteúdos do diretório são legíveis.";
    }
    @Override
    protected String scannerDeploymentRedeployedButNotByScanner$str() {
        return "WFLYDS0033: A implantação %1$s foi desimplantada anteriormente por este scanner, mas foi reimplantada por outra ferramenta de gerenciamento. O arquivo marcador %2$s foi removido para gravar este fato.";
    }
    @Override
    protected String failedStatusSynchronization$str() {
        return "WFLYDS0034: Falha no status de sincronização da implantação %1$s.";
    }
    @Override
    protected String invalidXmlFileFound$str() {
        return "WFLYDS0035: O scanner encontrou %1$s, que não está bem-formado na lineNumber: %2$s, columnNumber: %3$s. O arquivo foi copiado incompleto durante o escaneamento ou está incorreto.";
    }
    @Override
    protected String deployModelOperationFailed$str() {
        return "WFLYDS0036: A operação do modelo de implantação falhou. %1$s";
    }
    @Override
    protected String directoryIsNonexistent$str() {
        return "WFLYDS0037: %1$s não existe";
    }
    @Override
    protected String isNotADirectory$str() {
        return "WFLYDS0038: %1$s não é um diretório";
    }
    @Override
    protected String directoryIsNotWritable$str() {
        return "WFLYDS0039: %1$s não é gravável";
    }
    @Override
    protected String pathEntryNotFound$str() {
        return "WFLYDS0040: Não foi possível encontrar a entrada do caminho relativo para %1$s";
    }
    @Override
    protected String directoryIsNotReadable$str() {
        return "WFLYDS0041: %1$s não é legível";
    }
    @Override
    protected String bootTimeScanFailed$str() {
        return "WFLYDS0042: A análise de tempo de inicialização falhou, pois o diretório de implementação não está acessível: %1$s";
    }
    @Override
    protected String scanFailed$str() {
        return "WFLYDS0043: A análise do diretório de implantação falhou, pois o diretório de implantação não está acessível: %1$s";
    }
}
