package org.jboss.as.jmx.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.management.AttributeNotFoundException;
import javax.management.openmbean.OpenType;
import javax.management.Attribute;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Map.Entry;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.util.List;
import org.jboss.msc.service.StartException;
import javax.management.JMRuntimeException;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
import javax.management.ReflectionException;
import javax.annotation.processing.Generated;
import java.util.Hashtable;
import javax.management.NotCompliantMBeanException;
import javax.management.InstanceNotFoundException;
import java.lang.Error;
import javax.management.InvalidAttributeValueException;
import java.lang.Exception;
import javax.management.ObjectName;
import javax.management.OperationsException;
import org.jboss.as.controller.PathAddress;
import java.lang.Throwable;
import javax.management.MBeanException;
import org.jboss.dmr.ModelType;
import java.lang.Object;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:23+0200")
public class JmxLogger_$logger extends DelegatingBasicLogger implements JmxLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = JmxLogger_$logger.class.getName();
    public JmxLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void cannotUnregisterObject() {
        super.log.logf(FQCN, WARN, null, cannotUnregisterObject$str());
    }
    protected String cannotUnregisterObject$str() {
        return "WFLYJMX0004: No ObjectName available to unregister";
    }
    @Override
    public final void unregistrationFailure(final Throwable arg0, final ObjectName arg1) {
        super.log.logf(FQCN, ERROR, arg0, unregistrationFailure$str(), arg1);
    }
    protected String unregistrationFailure$str() {
        return "WFLYJMX0005: Failed to unregister [%s]";
    }
    @Override
    public final void jmxConnectorNotSupported() {
        super.log.logf(FQCN, WARN, null, jmxConnectorNotSupported$str());
    }
    protected String jmxConnectorNotSupported$str() {
        return "WFLYJMX0006: <jmx-connector/> is no longer supporting. <remoting-connector/> should be used instead to allow remote connections via JBoss Remoting.";
    }
    protected String compositeEntryTypeName$str() {
        return "entry";
    }
    @Override
    public final String compositeEntryTypeName() {
        return String.format(getLoggingLocale(), compositeEntryTypeName$str());
    }
    protected String compositeEntryTypeDescription$str() {
        return "An entry";
    }
    @Override
    public final String compositeEntryTypeDescription() {
        return String.format(getLoggingLocale(), compositeEntryTypeDescription$str());
    }
    protected String compositeEntryKeyDescription$str() {
        return "The key";
    }
    @Override
    public final String compositeEntryKeyDescription() {
        return String.format(getLoggingLocale(), compositeEntryKeyDescription$str());
    }
    protected String compositeEntryValueDescription$str() {
        return "The value";
    }
    @Override
    public final String compositeEntryValueDescription() {
        return String.format(getLoggingLocale(), compositeEntryValueDescription$str());
    }
    protected String compositeMapName$str() {
        return "A map";
    }
    @Override
    public final String compositeMapName() {
        return String.format(getLoggingLocale(), compositeMapName$str());
    }
    protected String compositeMapDescription$str() {
        return "The map is indexed by 'key'";
    }
    @Override
    public final String compositeMapDescription() {
        return String.format(getLoggingLocale(), compositeMapDescription$str());
    }
    protected String complexCompositeEntryTypeName$str() {
        return "Complex type";
    }
    @Override
    public final String complexCompositeEntryTypeName() {
        return String.format(getLoggingLocale(), complexCompositeEntryTypeName$str());
    }
    protected String complexCompositeEntryTypeDescription$str() {
        return "A complex type";
    }
    @Override
    public final String complexCompositeEntryTypeDescription() {
        return String.format(getLoggingLocale(), complexCompositeEntryTypeDescription$str());
    }
    protected String descriptorMBeanExpressionSupportFalse$str() {
        return "This mbean does not support expressions for attributes or operation parameters, even when supported by the underlying model. Instead the resolved attribute is returned, and the real typed value must be used when writing attributes/invoking operations.";
    }
    @Override
    public final String descriptorMBeanExpressionSupportFalse() {
        return String.format(getLoggingLocale(), descriptorMBeanExpressionSupportFalse$str());
    }
    protected String descriptorMBeanExpressionSupportTrue$str() {
        return "This mbean supports raw expressions for attributes and operation parameters where supported by the underlying model. If no expression is used, the string representation is converted into the real attribute value.";
    }
    @Override
    public final String descriptorMBeanExpressionSupportTrue() {
        return String.format(getLoggingLocale(), descriptorMBeanExpressionSupportTrue$str());
    }
    protected String descriptorAlternateMBeanExpressions$str() {
        return "To be able to set and read expressions go to %s";
    }
    @Override
    public final String descriptorAlternateMBeanExpressions(final ObjectName arg0) {
        return String.format(getLoggingLocale(), descriptorAlternateMBeanExpressions$str(), arg0);
    }
    protected String descriptorAlternateMBeanLegacy$str() {
        return "To read resolved values and to write typed attributes and use typed operation parameters go to %s";
    }
    @Override
    public final String descriptorAlternateMBeanLegacy(final ObjectName arg0) {
        return String.format(getLoggingLocale(), descriptorAlternateMBeanLegacy$str(), arg0);
    }
    protected String descriptorAttributeExpressionsAllowedTrue$str() {
        return "This attribute supports expressions";
    }
    @Override
    public final String descriptorAttributeExpressionsAllowedTrue() {
        return String.format(getLoggingLocale(), descriptorAttributeExpressionsAllowedTrue$str());
    }
    protected String descriptorAttributeExpressionsAllowedFalse$str() {
        return "This attribute does not support expressions";
    }
    @Override
    public final String descriptorAttributeExpressionsAllowedFalse() {
        return String.format(getLoggingLocale(), descriptorAttributeExpressionsAllowedFalse$str());
    }
    protected String propertyCompositeType$str() {
        return "A composite type representing a property";
    }
    @Override
    public final String propertyCompositeType() {
        return String.format(getLoggingLocale(), propertyCompositeType$str());
    }
    protected String propertyName$str() {
        return "The property name";
    }
    @Override
    public final String propertyName() {
        return String.format(getLoggingLocale(), propertyName$str());
    }
    protected String propertyValue$str() {
        return "The property value";
    }
    @Override
    public final String propertyValue() {
        return String.format(getLoggingLocale(), propertyValue$str());
    }
    protected String attributeNotFound$str() {
        return "WFLYJMX0007: Could not find any attribute matching: %s";
    }
    @Override
    public final AttributeNotFoundException attributeNotFound(final String arg0) {
        final AttributeNotFoundException result = new AttributeNotFoundException(String.format(getLoggingLocale(), attributeNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String attributeNotWritable$str() {
        return "WFLYJMX0008: Attribute %s is not writable";
    }
    @Override
    public final AttributeNotFoundException attributeNotWritable(final Attribute arg0) {
        final AttributeNotFoundException result = new AttributeNotFoundException(String.format(getLoggingLocale(), attributeNotWritable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreateObjectName$str() {
        return "WFLYJMX0009: Could not create ObjectName for address %s from string %s";
    }
    @Override
    public final RuntimeException cannotCreateObjectName(final Throwable arg0, final PathAddress arg1, final String arg2) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotCreateObjectName$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotSetAttribute$str() {
        return "WFLYJMX0010: Could not set %s";
    }
    @Override
    public final ReflectionException cannotSetAttribute(final Exception arg0, final String arg1) {
        final ReflectionException result = new ReflectionException(arg0, String.format(getLoggingLocale(), cannotSetAttribute$str(), arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String differentLengths$str() {
        return "WFLYJMX0012: %s and %s have different lengths";
    }
    @Override
    public final IllegalArgumentException differentLengths(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), differentLengths$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidAttributeType$str() {
        return "WFLYJMX0013: Bad type for '%s'";
    }
    @Override
    public final InvalidAttributeValueException invalidAttributeType(final Throwable arg0, final String arg1) {
        final InvalidAttributeValueException result = new InvalidAttributeValueException(String.format(getLoggingLocale(), invalidAttributeType$str(), arg1));
        result.initCause(arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidKey$str() {
        return "WFLYJMX0014: Invalid key %s for %s";
    }
    @Override
    public final IllegalArgumentException invalidKey(final List<?> arg0, final Entry<?, Object> arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidKey$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidObjectName2$str() {
        return "WFLYJMX0015: Invalid ObjectName: %s; %s";
    }
    @Override
    public final Error invalidObjectName(final String arg0, final String arg1) {
        final Error result = new Error(String.format(getLoggingLocale(), invalidObjectName2$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidObjectName3$str() {
        return "WFLYJMX0015: Invalid ObjectName: %s,%s; %s";
    }
    @Override
    public final Error invalidObjectName(final String arg0, final Hashtable<String, String> arg1, final String arg2) {
        final Error result = new Error(String.format(getLoggingLocale(), invalidObjectName3$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidObjectName4$str() {
        return "WFLYJMX0015: Invalid ObjectName: %s,%s,%s; %s";
    }
    @Override
    public final Error invalidObjectName(final String arg0, final String arg1, final String arg2, final String arg3) {
        final Error result = new Error(String.format(getLoggingLocale(), invalidObjectName4$str(), arg0, arg1, arg2, arg3));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mbeanNotFound$str() {
        return "WFLYJMX0017: No MBean found with name %s";
    }
    @Override
    public final InstanceNotFoundException mbeanNotFound(final ObjectName arg0) {
        final InstanceNotFoundException result = new InstanceNotFoundException(String.format(getLoggingLocale(), mbeanNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mbeanRegistrationFailed$str() {
        return "WFLYJMX0018: Failed to register mbean [%s]";
    }
    @Override
    public final StartException mbeanRegistrationFailed(final Throwable arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), mbeanRegistrationFailed$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noOperationCalled1$str() {
        return "WFLYJMX0019: No operation called '%s'";
    }
    @Override
    public final InstanceNotFoundException noOperationCalled(final String arg0) {
        final InstanceNotFoundException result = new InstanceNotFoundException(String.format(getLoggingLocale(), noOperationCalled1$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noOperationCalled2$str() {
        return "WFLYJMX0020: No operation called '%s' at %s";
    }
    @Override
    public final MBeanException noOperationCalled(final Exception arg0, final String arg1, final PathAddress arg2) {
        final MBeanException result = new MBeanException(arg0, String.format(getLoggingLocale(), noOperationCalled2$str(), arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String registrationNotFound$str() {
        return "WFLYJMX0022: No registration found for path address %s";
    }
    @Override
    public final InstanceNotFoundException registrationNotFound(final PathAddress arg0) {
        final InstanceNotFoundException result = new InstanceNotFoundException(String.format(getLoggingLocale(), registrationNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownType$str() {
        return "WFLYJMX0024: Unknown type %s";
    }
    @Override
    public final RuntimeException unknownType(final ModelType arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unknownType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownValue$str() {
        return "WFLYJMX0025: Unknown value %s";
    }
    @Override
    public final IllegalArgumentException unknownValue(final Object arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownValue$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wildcardNameParameterRequired$str() {
        return "WFLYJMX0026: Need the name parameter for wildcard add";
    }
    @Override
    public final IllegalStateException wildcardNameParameterRequired() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), wildcardNameParameterRequired$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownDomain$str() {
        return "WFLYJMX0029: Unknown domain: %s";
    }
    @Override
    public final IllegalArgumentException unknownDomain(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownDomain$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String expressionCannotBeConvertedIntoTargeteType$str() {
        return "WFLYJMX0030: Expression can not be converted into target type %s";
    }
    @Override
    public final IllegalArgumentException expressionCannotBeConvertedIntoTargeteType(final OpenType<?> arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), expressionCannotBeConvertedIntoTargeteType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownChild$str() {
        return "WFLYJMX0031: Unknown child %s";
    }
    @Override
    public final IllegalArgumentException unknownChild(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownChild$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String objectNameCantBeNull$str() {
        return "WFLYJMX0032: ObjectName cannot be null";
    }
    @Override
    public final IllegalArgumentException objectNameCantBeNull() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), objectNameCantBeNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noHandlerCalled$str() {
        return "WFLYJMX0036: There is no handler called '%s'";
    }
    @Override
    public final IllegalStateException noHandlerCalled(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noHandlerCalled$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unauthorized$str() {
        return "WFLYJMX0037: Unauthorized access";
    }
    @Override
    public final JMRuntimeException unauthorized() {
        final JMRuntimeException result = new JMRuntimeException(String.format(getLoggingLocale(), unauthorized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAuthorizedToWriteAttribute$str() {
        return "WFLYJMX0038: Not authorized to write attribute: '%s'";
    }
    @Override
    public final JMRuntimeException notAuthorizedToWriteAttribute(final String arg0) {
        final JMRuntimeException result = new JMRuntimeException(String.format(getLoggingLocale(), notAuthorizedToWriteAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAuthorizedToReadAttribute$str() {
        return "WFLYJMX0039: Not authorized to read attribute: '%s'";
    }
    @Override
    public final JMRuntimeException notAuthorizedToReadAttribute(final String arg0) {
        final JMRuntimeException result = new JMRuntimeException(String.format(getLoggingLocale(), notAuthorizedToReadAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAuthorizedToExecuteOperation$str() {
        return "WFLYJMX0040: Not authorized to invoke operation: '%s'";
    }
    @Override
    public final JMRuntimeException notAuthorizedToExecuteOperation(final String arg0) {
        final JMRuntimeException result = new JMRuntimeException(String.format(getLoggingLocale(), notAuthorizedToExecuteOperation$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreateMBeansInReservedDomain$str() {
        return "WFLYJMX0041: You can't create mbeans under the reserved domain '%s'";
    }
    @Override
    public final NotCompliantMBeanException cannotCreateMBeansInReservedDomain(final String arg0) {
        final NotCompliantMBeanException result = new NotCompliantMBeanException(String.format(getLoggingLocale(), cannotCreateMBeansInReservedDomain$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String dontKnowHowToDeserialize$str() {
        return "WFLYJMX0042: Don't know how to deserialize";
    }
    @Override
    public final OperationsException dontKnowHowToDeserialize() {
        final OperationsException result = new OperationsException(String.format(getLoggingLocale(), dontKnowHowToDeserialize$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedMethod$str() {
        return "WFLYJMX0043: %s is not supported";
    }
    @Override
    public final UnsupportedOperationException unsupportedMethod(final String arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), unsupportedMethod$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRegisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0044: You can't register mbeans under the reserved domain '%s'";
    }
    @Override
    public final String cannotRegisterMBeansUnderReservedDomain(final String arg0) {
        return String.format(getLoggingLocale(), cannotRegisterMBeansUnderReservedDomain$str(), arg0);
    }
    protected String cannotUnregisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0045: You can't unregister mbeans under the reserved domain '%s'";
    }
    @Override
    public final String cannotUnregisterMBeansUnderReservedDomain(final String arg0) {
        return String.format(getLoggingLocale(), cannotUnregisterMBeansUnderReservedDomain$str(), arg0);
    }
    protected String badDomainInCalculatedObjectNameException$str() {
        return "WFLYJMX0046: The ObjectName coming from MBeanRegistration.preRegister() '%s' is in a reserved JMX domain";
    }
    @Override
    public final IllegalArgumentException badDomainInCalculatedObjectNameException(final ObjectName arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), badDomainInCalculatedObjectNameException$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void errorUnregisteringMBeanWithBadCalculatedName(final Exception arg0, final ObjectName arg1) {
        super.log.logf(FQCN, ERROR, arg0, errorUnregisteringMBeanWithBadCalculatedName$str(), arg1);
    }
    protected String errorUnregisteringMBeanWithBadCalculatedName$str() {
        return "WFLYJMX0047: An error happened unregistering the '%s' MBean registered in a reserved JMX domain";
    }
    protected String addNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0048: Add notification listener using ObjectName %s is not supported";
    }
    @Override
    public final UnsupportedOperationException addNotificationListerWithObjectNameNotSupported(final ObjectName arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), addNotificationListerWithObjectNameNotSupported$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String removeNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0049: Remove notification listener using ObjectName %s is not supported";
    }
    @Override
    public final UnsupportedOperationException removeNotificationListerWithObjectNameNotSupported(final ObjectName arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), removeNotificationListerWithObjectNameNotSupported$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String addNotificationListenerNotAllowed$str() {
        return "WFLYJMX0050: Add notification listener using ObjectName %s is not supported";
    }
    @Override
    public final UnsupportedOperationException addNotificationListenerNotAllowed(final ObjectName arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), addNotificationListenerNotAllowed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String removeNotificationListenerNotAllowed$str() {
        return "WFLYJMX0051: Remove notification listener using ObjectName %s is not supported";
    }
    @Override
    public final UnsupportedOperationException removeNotificationListenerNotAllowed(final ObjectName arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), removeNotificationListenerNotAllowed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
