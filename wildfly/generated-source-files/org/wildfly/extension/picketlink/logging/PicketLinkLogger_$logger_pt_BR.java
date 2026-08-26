package org.wildfly.extension.picketlink.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:45+0200")
public class PicketLinkLogger_$logger_pt_BR extends PicketLinkLogger_$logger_pt implements PicketLinkLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PicketLinkLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String requiredAlternativeAttributes$str() {
        return "WFLYPL0016: [%1$s] necessita um dos atributos gerados [%2$s].";
    }
    @Override
    protected String cannotMigrateNonEmptyConfiguration$str() {
        return "WFLYPL0107: Não é possível migrar a configuração do subsistema não vazio picketlink-federation.";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYPL0106: A migração falhou, veja resultados para mais detalhes. ";
    }
    @Override
    protected String boundToJndi$str() {
        return "WFLYPL0003: Vínculo [%1$s] para [%2$s]";
    }
    @Override
    protected String couldNotLoadClass$str() {
        return "WFLYPL0009: Não foi possível carregar a classe [%1$s].";
    }
    @Override
    protected String attributeNoLongerSupported$str() {
        return "WFLYPL0012: O atributo [%1$s] não é mais compatível.";
    }
    @Override
    protected String invalidChildTypeOccurrence$str() {
        return "WFLYPL0013: [%1$s] pode ter apenas [%2$d] filho do tipo [%3$s].";
    }
    @Override
    protected String typeAlreadyDefined$str() {
        return "WFLYPL0017: O tipo [%1$s] já foi definido.";
    }
    @Override
    protected String requiredAttribute$str() {
        return "WFLYPL0015: Atributo necessário [%1$s] para [%2$s].";
    }
    @Override
    protected String federationHandlerTypeNotProvided$str() {
        return "WFLYPL0101: Nenhum tipo fornecido para o manuseador. Você deve especificar um nome de classe ou código.";
    }
    @Override
    protected String typeNotProvided$str() {
        return "WFLYPL0010: Nenhum tipo fornecido ao %1$s. Você deve especificar o nome da classe ou código.";
    }
    @Override
    protected String requiredChild$str() {
        return "WFLYPL0019: [%1$s] necessita de filho [%2$s].";
    }
    @Override
    protected String idmNoSupportedTypesDefined$str() {
        return "WFLYPL0056: Foi fornecido um tipo não suportado.";
    }
    @Override
    protected String idmNoIdentityConfigurationProvided$str() {
        return "WFLYPL0054: Você deve fornecer pelo menos uma configuração de identidade.";
    }
    @Override
    protected String idmNoIdentityStoreProvided$str() {
        return "WFLYPL0055: Você deve fornecer pelo menos um armazenamento de identidade para a configuração da identidade [%1$s].";
    }
    @Override
    protected String invalidAlternativeAttributeOccurrence$str() {
        return "WFLYPL0014: Atribuito inválido de definição [%1$s] para [%2$s]. Apenas um dos seguintes atributos são permitidos: [%3$s].";
    }
    @Override
    protected String emptyResource$str() {
        return "WFLYPL0018: [%1$s] não pode ser vazio.";
    }
    @Override
    protected String idmLdapNoMappingDefined$str() {
        return "WFLYPL0057: Nenhum mapeamento foi definido.";
    }
    @Override
    protected String moduleCouldNotLoad$str() {
        return "WFLYPL0007: Não foi possível carregar o módulo %1$s";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYPL0105: A operação de migração não pode ser executada: o servidor deve estar em modo admin-only";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYPL0001: Ativação do subsystem PicketLink %1$s";
    }
}
