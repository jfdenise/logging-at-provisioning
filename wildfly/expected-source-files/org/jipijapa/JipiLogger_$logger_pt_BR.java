package org.jipijapa;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:36+0200")
public class JipiLogger_$logger_pt_BR extends JipiLogger_$logger_pt implements JipiLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JipiLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadEntityClass$str() {
        return "JIPI020200: Não foi possível carregar a classe '%1$s' da entidade, ignorando este erro e continuando com a implantação do aplicativo";
    }
    @Override
    protected String cannotChangeInputStream$str() {
        return "JIPI020201: Não foi possível alterar a referência do fluxo de entrada.";
    }
    @Override
    protected String emptyParameter$str() {
        return "JIPI020202: O parâmetro %1$s está vazio";
    }
    @Override
    protected String missingPersistenceUnitMetadata$str() {
        return "JIPI020203: Falta o PersistenceUnitMetadata (o thead local não foi configurado)";
    }
    @Override
    protected String notYetImplemented$str() {
        return "JIPI020204: Não foi implantado ainda";
    }
    @Override
    protected String nullVar$str() {
        return "JIPI020205: O parâmetro %1$s é nulo";
    }
    @Override
    protected String cannotOpenVFSStream$str() {
        return "JIPI020250: Não foi possível abrir VirtualFile baseado InputStream %1$s";
    }
    @Override
    protected String uriSyntaxException$str() {
        return "JIPI020251: Erro de sintaxe de URI";
    }
    @Override
    protected String cannotUseSecondLevelCache$str() {
        return "JIPI020252: cache de segundo nível não integrado - %1$s";
    }
}
