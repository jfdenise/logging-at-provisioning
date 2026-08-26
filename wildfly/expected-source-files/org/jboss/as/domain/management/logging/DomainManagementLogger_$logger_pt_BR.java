package org.jboss.as.domain.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:18+0200")
public class DomainManagementLogger_$logger_pt_BR extends DomainManagementLogger_$logger_pt implements DomainManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DomainManagementLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String userAndPasswordWarning$str() {
        return "WFLYDM0001: Arquivo de propriedades definido pelo usuário e senha default. Isto será fácil de adivinhar.";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYDM0017: Não foi possível carregar as propriedades";
    }
    @Override
    protected String userNotFoundInDirectory$str() {
        return "WFLYDM0020: O usuário '%1$s' não foi encontrado no diretório.";
    }
    @Override
    protected String noConsoleAvailable$str() {
        return "WFLYDM0021: Nenhum java.io.Console disponível para interagir com o usuário.";
    }
    @Override
    protected String propertiesFileNotFound$str() {
        return "WFLYDM0023: Não foram encontrados arquivos %1$s.";
    }
    @Override
    protected String enterNewUserDetails$str() {
        return "Insira os detalhes do novo usuário.";
    }
    @Override
    protected String realmPrompt$str() {
        return "Realm (%1$s)";
    }
    @Override
    protected String usernamePrompt0$str() {
        return "Nome do usuário";
    }
    @Override
    protected String usernamePrompt1$str() {
        return "Nome do usuário (%1$s)";
    }
    @Override
    protected String noUsernameExiting$str() {
        return "WFLYDM0024: Nenhum Nome do Usuário inserido, encerrando.";
    }
    @Override
    protected String passwordPrompt$str() {
        return "Senha";
    }
    @Override
    protected String noPasswordExiting$str() {
        return "WFLYDM0025: Nenhuma Senha inserida, encerrando.";
    }
    @Override
    protected String passwordConfirmationPrompt$str() {
        return "Insira novamente a Senha";
    }
    @Override
    protected String passwordMisMatch$str() {
        return "WFLYDM0026: As senhas não coincidem.";
    }
    @Override
    protected String usernameNotAlphaNumeric$str() {
        return "WFLYDM0028: O nome de usuário deve ser somente alfanumérico, com a exceção dos seguintes símbolos aceitos: (%1$s)";
    }
    @Override
    protected String aboutToAddUser$str() {
        return "Prestes a adicionar o usuário '%1$s' ao realm '%2$s'";
    }
    @Override
    protected String isCorrectPrompt$str() {
        return "Isto está correto?";
    }
    @Override
    protected String usernameEasyToGuess$str() {
        return "O nome de usuário '%1$s' é fácil de adivinhar";
    }
    @Override
    protected String sureToAddUser$str() {
        return "Tem certeza de que quer adicionar o usuário '%1$s' sim/não?";
    }
    @Override
    protected String invalidConfirmationResponse$str() {
        return "WFLYDM0029: Resposta inválida. (As respostas válidas são %1$s e %2$s)";
    }
    @Override
    protected String addedUser$str() {
        return "Usuário '%1$s' adicionado ao arquivo '%2$s'";
    }
    @Override
    protected String unableToAddUser$str() {
        return "WFLYDM0030: Não foi possível adicionar o usuário %1$s devido ao erro %2$s";
    }
    @Override
    protected String unableToLoadUsers$str() {
        return "WFLYDM0031: Não foi possível adicionar usuários de carga de %1$s devido ao erro %2$s";
    }
    @Override
    protected String errorHeader$str() {
        return "Erro";
    }
    @Override
    protected String yesNo$str() {
        return "sim/não?";
    }
    @Override
    protected String multipleAuthenticationMechanismsDefined$str() {
        return "WFLYDM0033: A configuração para o realm de segurança '%1$s' inclui nome do usuário/senha múltiplos baseados nos mecanismos de autenticação (%2$s). Somente um é permitido";
    }
    @Override
    protected String operationFailedOneOfRequired$str() {
        return "WFLYDM0034: É necessário '%1$s' ou '%2$s'.";
    }
    @Override
    protected String operationFailedOnlyOneOfRequired$str() {
        return "WFLYDM0035: É necessário somente '%1$s' ou '%2$s'.";
    }
    @Override
    protected String noSecurityContextEstablished$str() {
        return "WFLYDM0037: Nenhum contexto de segurança foi estabelecido.";
    }
    @Override
    protected String filePrompt$str() {
        return "Qual o tipo de usuário você deseja adicionar? %n a) Usuário de Gerenciamento (mgmt-users.properties) %n b) Usuário do Aplicativo (application-users.properties)";
    }
    @Override
    protected String groupsPrompt$str() {
        return "Quais os grupos você deseja que este usuário pertença? (Por favor insira uma lista separada por vírgula, ou deixe em branco para nenhum grupo)";
    }
    @Override
    protected String addedGroups$str() {
        return "Usuário '%1$s' adicionado com os grupos %2$s ao arquivo '%3$s'";
    }
    @Override
    protected String invalidChoiceResponse$str() {
        return "WFLYDM0039: Resposta inválida. (As respostas válidas são A, a, B, ou b)";
    }
    @Override
    protected String aboutToUpdateEnabledUser$str() {
        return "Usuário '%1$s' já existente e ativado, você gostaria de ... %n a) Atualizar a senha e funções do usuário existente %n b) Desativar o usuário existente %n c) Digitar um novo nome de usuário";
    }
    @Override
    protected String aboutToUpdateDisabledUser$str() {
        return "Usuário '%1$s' já existente e desativo, você gostaria de... %n a) Atualizar a senha e funções existente %n b) Ativar o usuário existente %n c) Digitar um novo nome de usuário";
    }
    @Override
    protected String updateUser$str() {
        return "Usuário '%1$s' atualizado  para o arquivo '%2$s'";
    }
    @Override
    protected String unableToUpdateUser$str() {
        return "WFLYDM0040: Não foi possível atualizar o usuário para %1$s devido ao erro %2$s";
    }
    @Override
    protected String updatedGroups$str() {
        return "Usuário '%1$s' atualizado com os grupos %2$s para o arquivo '%3$s'";
    }
    @Override
    protected String invalidLocalUser$str() {
        return "WFLYDM0041: O usuário '%1$s' não é permitido em uma autenticação local.";
    }
    @Override
    protected String multipleCallbackHandlerForMechanism$str() {
        return "WFLYDM0042: CallbackHandlerServices múltiplos para o mesmo mecanismo (%1$s)";
    }
    @Override
    protected String noCallbackHandlerForMechanism$str() {
        return "WFLYDM0043: Nenhum CallbackHandler disponível para o mecanismo %1$s no realm %2$s";
    }
    @Override
    protected String noPlugInProvidersLoaded$str() {
        return "WFLYDM0044: Nenhum plugin encontrado nos provedores para o nome do módulo %1$s";
    }
    @Override
    protected String unableToLoadPlugInProviders$str() {
        return "WFLYDM0045: Não é possível carregar o plugin para o módulo %1$s devido ao erro (%2$s)";
    }
    @Override
    protected String noAuthenticationPlugInFound$str() {
        return "WFLYDM0046: Nenhuma autenticação de plugin encontrada para o nome %1$s";
    }
    @Override
    protected String unableToInitialisePlugIn$str() {
        return "WFLYDM0047: Não foi possível inicializar o plugin %1$s devido ao erro %2$s";
    }
    @Override
    protected String passwordNotStrongEnough$str() {
        return "WFLYDM0048: A senha não é segura o suficiente, é '%1$s'. Ela deve ser pelo menos '%2$s'.";
    }
    @Override
    protected String passwordMustNotBeEqual$str() {
        return "WFLYDM0049: A senha não pode ser igual a '%1$s', esse valor é restrito.";
    }
    @Override
    protected String passwordMustHaveDigit$str() {
        return "WFLYDM0050: A senha deve ter pelo menos um dígito %1$d.";
    }
    @Override
    protected String passwordMustHaveSymbol$str() {
        return "WFLYDM0051: A senha deve ter pelo menos um símbolo %1$s que não seja alfanumérico.";
    }
    @Override
    protected String passwordMustHaveAlpha$str() {
        return "WFLYDM0052: A senha deve ter pelo menos um caractere alfanumérico %1$d.";
    }
    @Override
    protected String passwordNotLongEnough$str() {
        return "WFLYDM0053: A senha deve ter pelo menos '%1$s' caracteres!";
    }
    @Override
    protected String unableToLoadKeyTrustFile$str() {
        return "WFLYDM0054: Não foi possível carregar o arquivo trust da chave.";
    }
    @Override
    protected String unableToOperateOnTrustStore$str() {
        return "WFLYDM0055: Não foi possível operar no store trust.";
    }
    @Override
    protected String unableToCreateDelegateTrustManager$str() {
        return "WFLYDM0056: Não foi possível criar o gerenciador trust de delegação.";
    }
    @Override
    protected String onlyOneSyslogHandlerProtocol$str() {
        return "WFLYDM0057: O manipulador syslog só pode conter um protocolo %1$s";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYDM0058: Não existe um manipulador chamado '%1$s'";
    }
    @Override
    protected String sysLogProtocolAlreadyConfigured$str() {
        return "WFLYDM0059: Já existe um protocolo configurado para o manipulador syslog no %1$s";
    }
    @Override
    protected String noSyslogProtocol$str() {
        return "WFLYDM0060: Não foi gerado nenhum protocolo syslog";
    }
    @Override
    protected String noFormatterCalled$str() {
        return "WFLYDM0061: Não há formatador chamado '%1$s'";
    }
    @Override
    protected String cannotRemoveReferencedFormatter$str() {
        return "WFLYDM0062: Não foi possível remover o formatador, ele continua sendo referenciado pelo manipulador '%1$s'";
    }
    @Override
    protected String handlerAlreadyExists$str() {
        return "WFLYDM0063: Os nomes do manipulador devem ser únicos. Já existe um manipulador chamado '%1$s' em %2$s";
    }
    @Override
    protected String multipleRealmsDetected$str() {
        return "WFLYDM0064: Foram identificados nomes de realm diferentes ('%1$s' e '%2$s') lendo arquivos de propriedades de usuário. Todos os realms devem ser iguais.";
    }
    @Override
    protected String userRealmNotMatchDiscovered$str() {
        return "WFLYDM0065: O nome de realm fornecido pelo usuário '%1$s' não coincide com o nome de realm encontrado pelo(s) arquivo(s) de propriedade '%2$s'.";
    }
    @Override
    protected String groupPropertiesButNoUserProperties$str() {
        return "WFLYDM0066: O arquivo do grupo de propriedade '%1$s' foi especificado, no entanto, nenhuma das propriedades do usuário foram especificadas.";
    }
    @Override
    protected String realmMustBeSpecified$str() {
        return "WFLYDM0067: O nome de realm deve ser especificado.";
    }
    @Override
    protected String inconsistentRbacConfiguration$str() {
        return "WFLYDM0068: A(s) operação(ões) resultariam no controle de acesso baseado na função sendo habilitada, porém impossibilitam os usuários autenticado a obterem funções.";
    }
    @Override
    protected String inconsistentRbacRuntimeState$str() {
        return "WFLYDM0069: A configuração do mapeamento da função no runtime é inconsistente, o servidor deve ser reiniciado.";
    }
    @Override
    protected String invalidChoiceUpdateUserResponse$str() {
        return "WFLYDM0070: Resposta inválida. (As respostas válidas são A, a, B, b, C ou c)";
    }
    @Override
    protected String duplicateIncludeExclude$str() {
        return "WFLYDM0071: A função '%1$s' já contém um '%2$s' para type=%3$s, name=%4$s, realm=%5$s.";
    }
    @Override
    protected String multipleAuthorizationConfigurationsDefined$str() {
        return "WFLYDM0072: A configuração para o realm de segurança '%1$s' inclui configurações de autorização múltiplas (%2$s). Somente uma é permitida";
    }
    @Override
    protected String multipleUsernameToDnConfigurationsDefined$str() {
        return "WFLYDM0073: A configuração para o realm de segurança '%1$s' inclui recursos username-to-dn múltiplos no recurso authorization=ldap (%2$s). Somente um é permitido";
    }
    @Override
    protected String noGroupSearchDefined$str() {
        return "WFLYDM0074: A configuração para o realm de segurança '%1$s' não contém nenhum recurso group-search no recurso authorization=ldap.";
    }
    @Override
    protected String multipleGroupSearchConfigurationsDefined$str() {
        return "WFLYDM0075: A configuração para o realm de segurança '%1$s' inclui recursos group-search múltiplos no recurso authorization=ldap (%2$s). Somente um é permitido";
    }
    @Override
    protected String invalidRoleName$str() {
        return "WFLYDM0076: O nome da função '%1$s' não é uma função padrão válida.";
    }
    @Override
    protected String invalidRoleNameDomain$str() {
        return "WFLYDM0077: O nome da função '%1$s' não é uma função padrão válida e não é uma função com escopo de host ou uma função com escopo de grupo do servidor.";
    }
    @Override
    protected String roleMappingRemaining$str() {
        return "WFLYDM0078: A função com escopo '%1$s' não pode ser removida, pois o mapeamento de função continua existindo.";
    }
    @Override
    protected String duplicateScopedRole$str() {
        return "WFLYDM0079: %1$s já existe com o nome '%2$s'";
    }
    @Override
    protected String scopedRoleStandardName$str() {
        return "WFLYDM0080: O nome '%1$s' está em conflito com o nome de função padrão '%2$s' - a comparação não diferencia maiúsculas de minúsculas.";
    }
    @Override
    protected String badBaseRole$str() {
        return "WFLYDM0081: A função base '%1$s' não é uma das funções padrão para o provedor de autorização atual.";
    }
    @Override
    protected String passwordUsernameMatchError$str() {
        return "WFLYDM0082: A senha deve ser diferente à senha do nome do usuário";
    }
    @Override
    protected String noKey$str() {
        return "WFLYDM0083: A KeyStore %1$s não contém chaves.";
    }
    @Override
    protected String aliasNotKey$str() {
        return "WFLYDM0084: O alias '%1$s' especificado não é uma chave. Os aliases válidos são %2$s";
    }
    @Override
    protected String aliasNotFound$str() {
        return "WFLYDM0085: O alias '%1$s' especificado não existe na KeyStore. Os aliases válidos são %2$s";
    }
    @Override
    protected String keyStoreNotFound$str() {
        return "WFLYDM0086: A KeyStore não pode ser encontrada em %1$s";
    }
    @Override
    protected String multipleCacheConfigurationsDefined$str() {
        return "WFLYDM0087: A configuração para o realm de segurança '%1$s' inclui definições de cache múltiplas na mesma posição hierárquica. Somente uma é permitida";
    }
    @Override
    protected String usernameNotLoaded$str() {
        return "WFLYDM0088: Não foi possível carregar nome de usuário para o nome de usuário '%1$s' fornecido";
    }
    @Override
    protected String noNonProgressingOperationFound$str() {
        return "WFLYDM0089: Não foi encontrada nenhuma operação realizando o bloqueio de gravação de execução da operação por mais de [%1$d] segundos";
    }
    @Override
    protected String invalidKeytab$str() {
        return "WFLYDM0090: Caminho Keytab inválido";
    }
    @Override
    protected String subjectIdentityLoggedOut$str() {
        return "WFLYDM0091: A saída já foi chamada nesta SubjectIdentity.";
    }
    @Override
    protected String unableToObtainTGT$str() {
        return "WFLYDM0092: Não foi possível obter o Kerberos TGT";
    }
    @Override
    protected String keytabLoginFailed$str() {
        return "WFLYDM0093: Falha ao fazer login usando o Keytab como '%1$s' principal para lidar com a solicitação para o host '%2$s'";
    }
    @Override
    protected String kerberosWithoutKeytab$str() {
        return "WFLYDM0094: O Kerberos é habilitado para autenticação no realm de segurança '%1$s', mas nenhum Keytab foi adicionado ao server-identity.";
    }
    @Override
    protected String noCipherSuitesInCommon$str() {
        return "WFLYDM0095: Nenhum pacote de criptografia em comum, supported=(%1$s), requested=(%2$s)";
    }
    @Override
    protected String noProtocolsInCommon$str() {
        return "WFLYDM0096: Nenhum protocolo em comum, supported=(%1$s), requested=(%2$s)";
    }
    @Override
    protected String passwordShouldNotBeEqual$str() {
        return "WFLYDM0097: A senha não deve ser igual a '%1$s', este valor é restrito.";
    }
    @Override
    protected String passwordUsernameShouldNotMatch$str() {
        return "WFLYDM0098: A senha deve ser diferente da senha do nome do usuário";
    }
    @Override
    protected String passwordShouldHaveXCharacters$str() {
        return "WFLYDM0099: A senha deve ter pelo menos '%1$s' caracteres!";
    }
    @Override
    protected String passwordShouldHaveAlpha$str() {
        return "WFLYDM0100: A senha deve ter pelo menos %1$d caractere(s) alfanumérico(s).";
    }
    @Override
    protected String passwordShouldHaveDigit$str() {
        return "WFLYDM0101: A senha deve ter pelo menos %1$d dígito(s).";
    }
    @Override
    protected String passwordShouldHaveSymbol$str() {
        return "WFLYDM0102: A senha deve ter pelo menos %1$s símbolos que não sejam alfanuméricos.";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYDM0103: Tamanho inválido %1$s";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYDM0104: O sufixo (%1$s) não pode conter segundos ou milésimos de segundos.";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYDM0105: O sufixo (%1$s) é inválido. Ele deve ser um formato de data válido.";
    }
    @Override
    protected String filePermissionsProblemsFound$str() {
        return "WFLYDM0106: Foram encontrados problemas de permissão ao tentar atualizar o arquivo %1$s.";
    }
    @Override
    protected String domainRolloutNotProgressing$str() {
        return "WFLYDM0107: A operação “%1$s” está executando o bloqueio de gravação da execução da operação por mais de [%2$d] segundos, mas ela é parte da distribuição de uma operação em todo o domínio com a domain-uuid “%3$s” que tem outras operações que também não estão progredindo. Suas IDs são: %4$s. Recomenda-se cancelar a operação no controlador do domínio.";
    }
    @Override
    protected String unsupportedResource$str() {
        return "WFLYDM0108: Recurso '%1$s' não compatível";
    }
    @Override
    protected String keyTabFileNotFound$str() {
        return "WFLYDM0109: O arquivo Keytab '%1$s' não existe.";
    }
    @Override
    protected String unableToLoadSimpleNameForGroup$str() {
        return "WFLYDM0110: Não foi possível carregar um nome simples para o grupo '%1$s'";
    }
    @Override
    protected String keystoreWillBeCreated$str() {
        return "WFLYDM0111: Armazenamento de chaves %1$s não encontrado. Ele será gerado automaticamente no primeiro uso com um certificado autoassinado para o host %2$s";
    }
    @Override
    protected String failedToGenerateSelfSignedCertificate$str() {
        return "WFLYDM0112: Falha ao gerar o certificado autoassinado";
    }
    @Override
    protected String keystoreHasBeenCreated$str() {
        return "WFLYDM0113: Certificado autoassinado gerado em %1$s. Observe que certificados autoassinados não são seguros e devem ser usados somente para testes. Não use este certificado auto-assinado na produção.%nSHA-1 A impressão digital da chave gerada é %2$s%nSHA-256. A impressão digital da chave gerada é %3$s";
    }
    @Override
    protected String failedToCreateLazyInitSSLContext$str() {
        return "WFLYDM0114: Falha ao iniciar lentamente (lazy) contexto SSL";
    }
    @Override
    protected String removedBrokenResource$str() {
        return "WFLYDM0135: O recurso %1$s não estava funcionando corretamente e foi removido.";
    }
    @Override
    protected String noSubjectIdentityForProtocolAndHost$str() {
        return "WFLYDM0139: Nenhum SubjectIdentity encontrado para %1$s/%2$s.";
    }
    @Override
    protected String usingDeprecatedSystemProperty$str() {
        return "WFLYDM0140: A propriedade de sistema \"%1$s\" está obsoleta e não deve ser usada. Em seu lugar, use a configuração do modelo de gerenciamento.";
    }
    @Override
    protected String legacyMechanismsAreNotSupported$str() {
        return "WFLYDM0142: Os mecanismos a seguir configurados no servidor (%1$s) não são compatíveis com o realm '%2$s'.";
    }
    @Override
    protected String invalidSensitiveClassificationAttribute$str() {
        return "WFLYDM0143: Atributo de classificação sensível inválido '%1$s'";
    }
    @Override
    protected String imcompatibleConfiguredRequiresAttributeValue$str() {
        return "WFLYDM0144: A restrição de sensibilidade %1$s contém um valor de atributo incompatível com outras restrições de classificação sensíveis.";
    }
    @Override
    protected String securityRealmsUnsupported$str() {
        return "WFLYDM0145: Os reinos de segurança não são mais compatíveis, remova-os da configuração.";
    }
    @Override
    protected String outboundConnectionsUnsupported$str() {
        return "WFLYDM0146: As conexões de saída não são mais compatíveis, remova-as da configuração.";
    }
    @Override
    protected String passwordUsernameMustMatchInfo$str() {
        return "A senha deve ser diferente à senha do nome do usuário";
    }
    @Override
    protected String passwordUsernameShouldMatchInfo$str() {
        return "A senha deve ser diferente da senha do nome do usuário";
    }
    @Override
    protected String passwordMustNotEqualInfo$str() {
        return "A senha não deve ser um dos seguintes valores restritos: {%1$s}";
    }
    @Override
    protected String passwordShouldNotEqualInfo$str() {
        return "A senha não deve ser um dos seguintes valores restritos: {%1$s}";
    }
    @Override
    protected String passwordLengthInfo$str() {
        return "%1$s caracteres";
    }
    @Override
    protected String passwordMustHaveAlphaInfo$str() {
        return "%1$d caractere(s) alfabético(s)";
    }
    @Override
    protected String passwordMustHaveDigitInfo$str() {
        return "%1$d dígito(s)";
    }
    @Override
    protected String passwordMustHaveSymbolInfo$str() {
        return "%1$s simbolo(s) não alfanumérico(s)";
    }
    @Override
    protected String passwordMustContainInfo$str() {
        return "A senha deve conter pelo menos %1$s";
    }
    @Override
    protected String passwordShouldContainInfo$str() {
        return "A senha deve conter pelo menos %1$s";
    }
    @Override
    protected String sureToSetPassword$str() {
        return "Você tem certeza que deseja usar a senha inserida sim/não?";
    }
    @Override
    protected String usageDescription$str() {
        return "O script add-user é uma ferramenta para adicionar novos usuários aos arquivos de propriedades para autenticações prontas. Pode ser utilizado em ManagementRealm e AplicationRealm.";
    }
    @Override
    protected String argUsage$str() {
        return "Uso: ./add-user.sh [args...]%nonde argumentos incluem:";
    }
    @Override
    protected String argApplicationUsers$str() {
        return "Caso configurado adiciona um usuário de aplicativo ao invés de um usuário de gerenciamento";
    }
    @Override
    protected String argDomainConfigDirUsers$str() {
        return "Define a localização do diretório de configuração domain.";
    }
    @Override
    protected String argServerConfigDirUsers$str() {
        return "Define a localização do diretório de configuração do servidor.";
    }
    @Override
    protected String argUserProperties$str() {
        return "O nome do arquivo do arquivo de propriedades do usuário que pode ser o caminho absoluto.";
    }
    @Override
    protected String argGroupProperties$str() {
        return "O nome do arquivo do arquivo das propriedades de grupo que podem ser o caminho absoluto. (Caso as propriedades do grupo for especificado, então as propriedades do usuário DEVEM ser especificadas também.";
    }
    @Override
    protected String argPassword$str() {
        return "A senha do usuário. Ela será verificada em relação às solicitações da senha definida com a configuração add-user.properties";
    }
    @Override
    protected String argUser$str() {
        return "Nome do usuário";
    }
    @Override
    protected String argRealm$str() {
        return "O nome do realm usado para segurança das interfaces de gerenciamento (o default é \"ManagementRealm\")";
    }
    @Override
    protected String argSilent$str() {
        return "Ativa o modo silencioso (nenhuma saída ao console)";
    }
    @Override
    protected String argRole$str() {
        return "Lista separada por vírgula das funções para o usuário.";
    }
    @Override
    protected String argGroup$str() {
        return "Lista separada por vírgula dos grupos para o usuário.";
    }
    @Override
    protected String argEnable$str() {
        return "Ativar o usuário";
    }
    @Override
    protected String argDisable$str() {
        return "Desativar o usuário";
    }
    @Override
    protected String argConfirmWarning$str() {
        return "Confirmar automaticamente avisos no modo interativo";
    }
    @Override
    protected String argHelp$str() {
        return "Display esta mensagem e sai";
    }
    @Override
    protected String yes$str() {
        return "sim";
    }
    @Override
    protected String shortYes$str() {
        return "s";
    }
    @Override
    protected String no$str() {
        return "não";
    }
    @Override
    protected String shortNo$str() {
        return "n";
    }
    @Override
    protected String alternativeRealm$str() {
        return "O nome de realm fornecido deve coincidir com o nome usado pela configuração do servidor que, por padrão, seria '%1$s'";
    }
    @Override
    protected String realmConfirmation$str() {
        return "Tem certeza de que deseja configurar o realm como '%1$s'";
    }
    @Override
    protected String passwordRequirements$str() {
        return "Segue abaixo as solicitações da senha. Para modificar essas restrições, edite o arquivo de configuração add-user.properties.";
    }
    @Override
    protected String passwordRecommendations$str() {
        return "As recomendações estão listadas abaixo. Para modificar essas restrições, edite o arquivo de configuração add-user.properties.";
    }
    @Override
    protected String userSuppliedRealm$str() {
        return "Usando realm '%1$s' conforme especificado na linha de comando.";
    }
    @Override
    protected String discoveredRealm$str() {
        return "Usando realm '%1$s' conforme descoberto a partir dos arquivos de propriedades existentes.";
    }
    @Override
    protected String multipleRealmDeclarations$str() {
        return "O arquivo de propriedades dos usuários '%1$s' contém declarações de nome de realm múltiplas";
    }
    @Override
    protected String callbackHandlerNotInitialized$str() {
        return "O manipulador de retorno de chamada não foi inicializado para o servidor de domínio %1$s.";
    }
    @Override
    protected String unableToObtainCredential$str() {
        return "Não foi possível obter a credencial para o servidor %1$s";
    }
}
