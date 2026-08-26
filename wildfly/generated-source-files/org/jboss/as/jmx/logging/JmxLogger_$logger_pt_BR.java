package org.jboss.as.jmx.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:23+0200")
public class JmxLogger_$logger_pt_BR extends JmxLogger_$logger_pt implements JmxLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JmxLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String attributeNotWritable$str() {
        return "WFLYJMX0008: O atributo %1$s não é gravável";
    }
    @Override
    protected String cannotUnregisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0045: Você não pode cancelar o registro mbeans no domínio reservado '%1$s'";
    }
    @Override
    protected String unknownChild$str() {
        return "WFLYJMX0031: Filho desconhecido %1$s";
    }
    @Override
    protected String unsupportedMethod$str() {
        return "WFLYJMX0043: %1$s não é compatível";
    }
    @Override
    protected String notAuthorizedToExecuteOperation$str() {
        return "WFLYJMX0040: Sem autorização para invocar a operação: '%1$s'";
    }
    @Override
    protected String errorUnregisteringMBeanWithBadCalculatedName$str() {
        return "WFLYJMX0047: Ocorreu um erro ao cancelar registro do MBean '%1$s' registrado em um domínio JMX reservado";
    }
    @Override
    protected String differentLengths$str() {
        return "WFLYJMX0012: %1$s e %2$s têm comprimentos diferentes";
    }
    @Override
    protected String cannotSetAttribute$str() {
        return "WFLYJMX0010: Não foi possível configurar %1$s";
    }
    @Override
    protected String removeNotificationListenerNotAllowed$str() {
        return "WFLYJMX0051: Não há suporte para remover o ouvinte de notificação usando o ObjectName %1$s";
    }
    @Override
    protected String descriptorMBeanExpressionSupportFalse$str() {
        return "Este mbean não suporta as expressões para os atributos ou parâmetros de operações, mesmo quando suportado pelo modelo subjacente. Ao invés do atributo resolvido ser retornado e o valor real digitado deve ser usado quando gravando as operações de atributos/invocação.";
    }
    @Override
    protected String registrationNotFound$str() {
        return "WFLYJMX0022: Nenhum registro encontrado para o endereço do caminho %1$s";
    }
    @Override
    protected String notAuthorizedToWriteAttribute$str() {
        return "WFLYJMX0038: Sem autorização para gravar o atributo: '%1$s'";
    }
    @Override
    protected String descriptorAlternateMBeanLegacy$str() {
        return "Acesse %1$s para ler valores resolvidos, gravar atributos digitados e usar parâmetros de operação digitados";
    }
    @Override
    protected String descriptorAttributeExpressionsAllowedFalse$str() {
        return "Esse atributo não suporta expressões";
    }
    @Override
    protected String cannotCreateObjectName$str() {
        return "WFLYJMX0009: Não foi possível criar o ObjectName para o endereço %1$s a partir da string %2$s";
    }
    @Override
    protected String objectNameCantBeNull$str() {
        return "WFLYJMX0032: O ObjectName não pode ser nulo";
    }
    @Override
    protected String attributeNotFound$str() {
        return "WFLYJMX0007: Não foi possível encontrar atributos correspondentes: %1$s";
    }
    @Override
    protected String compositeEntryValueDescription$str() {
        return "O valor";
    }
    @Override
    protected String dontKnowHowToDeserialize$str() {
        return "WFLYJMX0042: São sabe como desserializar";
    }
    @Override
    protected String compositeEntryTypeDescription$str() {
        return "A entrada";
    }
    @Override
    protected String descriptorAttributeExpressionsAllowedTrue$str() {
        return "Esse atributo suporta expressões";
    }
    @Override
    protected String cannotRegisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0044: Você não pode registrar mbeans no domínio reservado '%1$s'";
    }
    @Override
    protected String noOperationCalled1$str() {
        return "WFLYJMX0019: Nenhuma operação chamada '%1$s'";
    }
    @Override
    protected String descriptorMBeanExpressionSupportTrue$str() {
        return "Esses mbean suportam as expressões brutas para atributos e parâmetros de operação onde suportados pelo modelo adjacente. Caso nenhuma expressão for usada, a representação da sequência é convertida ao valor real do atributo.";
    }
    @Override
    protected String propertyValue$str() {
        return "O valor da propriedade";
    }
    @Override
    protected String invalidAttributeType$str() {
        return "WFLYJMX0013: Tipo de '%1$s' incorreto";
    }
    @Override
    protected String mbeanNotFound$str() {
        return "WFLYJMX0017: Nenhum Mbean encontrado com o nome %1$s";
    }
    @Override
    protected String noOperationCalled2$str() {
        return "WFLYJMX0020: Nenhuma operação chamada '%1$s' em '%2$s'";
    }
    @Override
    protected String unknownValue$str() {
        return "WFLYJMX0025: Valor desconhecido %1$s";
    }
    @Override
    protected String addNotificationListenerNotAllowed$str() {
        return "WFLYJMX0050: Não há suporte para adicionar o ouvinte de notificação usando o ObjectName %1$s";
    }
    @Override
    protected String compositeEntryTypeName$str() {
        return "entrada";
    }
    @Override
    protected String unknownType$str() {
        return "WFLYJMX0024: Tipo desconhecido %1$s";
    }
    @Override
    protected String cannotCreateMBeansInReservedDomain$str() {
        return "WFLYJMX0041: Você não pode criar mbeans no domínio reservado '%1$s'";
    }
    @Override
    protected String compositeEntryKeyDescription$str() {
        return "A tecla";
    }
    @Override
    protected String compositeMapDescription$str() {
        return "O mapa é indexado";
    }
    @Override
    protected String complexCompositeEntryTypeName$str() {
        return "Tipo complexo";
    }
    @Override
    protected String unknownDomain$str() {
        return "WFLYJMX0029: Domínio desconhecido: %1$s";
    }
    @Override
    protected String badDomainInCalculatedObjectNameException$str() {
        return "WFLYJMX0046: O ObjectName vindo a partir de MBeanRegistration.preRegister() '%1$s' está em um domínio JMX reservado";
    }
    @Override
    protected String invalidKey$str() {
        return "WFLYJMX0014: Chave %1$s inválida para %2$s";
    }
    @Override
    protected String mbeanRegistrationFailed$str() {
        return "WFLYJMX0018: Falha ao registrar o mbean [%1$s]";
    }
    @Override
    protected String invalidObjectName3$str() {
        return "WFLYJMX0015: ObjectName inválido: %1$s,%2$s; %3$s";
    }
    @Override
    protected String expressionCannotBeConvertedIntoTargeteType$str() {
        return "WFLYJMX0030: A expressão não pode ser convertida no tipo de destino %1$s";
    }
    @Override
    protected String jmxConnectorNotSupported$str() {
        return "WFLYJMX0006: O <jmx-connector/> não é mais compatível. O <remoting-connector/> deve ser usado no lugar para permitir as conexões remotas com o JBoss Remoting.";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYJMX0037: Acesso não autorizado";
    }
    @Override
    protected String notAuthorizedToReadAttribute$str() {
        return "WFLYJMX0039: Sem autorização para ler o atributo: '%1$s'";
    }
    @Override
    protected String cannotUnregisterObject$str() {
        return "WFLYJMX0004: Não há ObjectName disponível para cancelamento do registro";
    }
    @Override
    protected String invalidObjectName2$str() {
        return "WFLYJMX0015: ObjectName inválido: %1$s; %2$s";
    }
    @Override
    protected String removeNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0049: Não há suporte para remover o ouvinte de notificação usando o ObjectName %1$s";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYJMX0036: Não existe um manipulador chamado '%1$s'";
    }
    @Override
    protected String descriptorAlternateMBeanExpressions$str() {
        return "Para poder configurar e ler expressões, acesse %1$s";
    }
    @Override
    protected String propertyCompositeType$str() {
        return "O tipo de composição representando uma propriedade";
    }
    @Override
    protected String wildcardNameParameterRequired$str() {
        return "WFLYJMX0026: Necessita de parâmetro de nome para adicionar o curinga";
    }
    @Override
    protected String propertyName$str() {
        return "O nome da propriedade";
    }
    @Override
    protected String complexCompositeEntryTypeDescription$str() {
        return "O tipo complexo";
    }
    @Override
    protected String invalidObjectName4$str() {
        return "WFLYJMX0015: ObjectName inválido: %1$s,%2$s,%3$s; %4$s";
    }
    @Override
    protected String compositeMapName$str() {
        return "O mapa";
    }
    @Override
    protected String addNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0048: Não há suporte para adicionar o ouvinte de notificação usando o ObjectName %1$s";
    }
    @Override
    protected String unregistrationFailure$str() {
        return "WFLYJMX0005: Falha ao cancelar o registro [%1$s]";
    }
}
