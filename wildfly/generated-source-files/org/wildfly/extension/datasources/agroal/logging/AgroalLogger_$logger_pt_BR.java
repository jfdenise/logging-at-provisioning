package org.wildfly.extension.datasources.agroal.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:11+0200")
public class AgroalLogger_$logger_pt_BR extends AgroalLogger_$logger_pt implements AgroalLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AgroalLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startedDataSource$str() {
        return "WFLYAG0101: Iniciada fonte de dados '%1$s' ligada a [%2$s]";
    }
    @Override
    protected String datasourceStartException$str() {
        return "WFLYAG0105: Exceção ao iniciar a fonte de dados '%1$s'";
    }
    @Override
    protected String driverLoaded$str() {
        return "WFLYAG0501: Classe %1$s carregada para o driver '%2$s'";
    }
    @Override
    protected String stoppedXADataSource$str() {
        return "WFLYAG0104: Interrompida fonte de dados-xa '%1$s'";
    }
    @Override
    protected String missingTransactionManager$str() {
        return "WFLYAG0109: Não foi possível iniciar a fonte de dados: o gerenciador de transações está ausente";
    }
    @Override
    protected String invalidConnectionProvider$str() {
        return "WFLYAG0107: Provedor de conexão inválido. Uma implementação java.sql.Driver ou javax.sql.DataSource é necessária. Corrija o connection-provider do driver";
    }
    @Override
    protected String missingAttributeInDatasourceMetadata$str() {
        return "WFLYAG0403: O elemento <data-source> deve fornecer o atributo '%1$s'";
    }
    @Override
    protected String loadModuleException$str() {
        return "WFLYAG0502: Falha ao carregar o módulo do driver '%1$s'";
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYAG0303: O nome JNDI precisa começar com java:/ ou java:jboss/";
    }
    @Override
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYAG0111: O CredentialSourceSupplier para a fonte de dados '%1$s' é inválido";
    }
    @Override
    protected String unknownDatasourceServiceType$str() {
        return "WFLYAG0301: Serviço de fonte de dados desconhecido do tipo: %1$s";
    }
    @Override
    protected String invalidDeploymentConnectionProvider$str() {
        return "WFLYAG0401: Provedor de conexão inválido. Uma implementação java.sql.Driver ou javax.sql.DataSource é necessária. Corrija o connection-provider do driver";
    }
    @Override
    protected String poolWarning$str() {
        return "WFLYAG0601: %1$s: %2$s";
    }
    @Override
    protected String invalidConnection$str() {
        return "WFLYAG0302: Conexão inválida em '%1$s'";
    }
    @Override
    protected String loadClassDeploymentException$str() {
        return "WFLYAG0402: Falha ao carregar a classe do provedor de conexão '%1$s'";
    }
    @Override
    protected String addingDeploymentProcessors$str() {
        return "WFLYAG0001: Adicionando processadores de implantação para anotações DataSourceDefinition e entradas de referência de recurso";
    }
    @Override
    protected String invalidXAConnectionProvider$str() {
        return "WFLYAG0108: Uma xa-datasource requer javax.sql.XADataSource como provedor de conexão. Corrija o connection-provider do driver";
    }
    @Override
    protected String flushOperation$str() {
        return "WFLYAG0201: Executando a operação de liberação, modo %1$s";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYAG0304: O nome JNDI não deve possuir “//” nem terminar com “/”";
    }
    @Override
    protected String xaDatasourceStartException$str() {
        return "WFLYAG0106: Exceção ao iniciar a fonte de dados-xa '%1$s'";
    }
    @Override
    protected String invalidAuthentication$str() {
        return "WFLYAG0110: Erro ao obter as credenciais do contexto de autenticação para a fonte de dados '%1$s'";
    }
    @Override
    protected String loadClassException$str() {
        return "WFLYAG0503: Falha ao carregar a classe do driver '%1$s'";
    }
    @Override
    protected String startedXADataSource$str() {
        return "WFLYAG0103: Iniciada fonte de dados-xa '%1$s’ ligada a [%2$s]";
    }
    @Override
    protected String stoppedDataSource$str() {
        return "WFLYAG0102: Interrompida fonte de dados '%1$s'";
    }
}
