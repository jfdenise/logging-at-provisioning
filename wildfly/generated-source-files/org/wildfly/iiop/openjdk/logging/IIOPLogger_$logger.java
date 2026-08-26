package org.wildfly.iiop.openjdk.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import java.net.MalformedURLException;
import org.jboss.logging.DelegatingBasicLogger;
import org.wildfly.iiop.openjdk.rmi.ir.IRConstructionException;
import java.lang.String;
import org.jboss.logging.Logger;
import org.omg.CORBA.BAD_INV_ORDER;
import java.lang.RuntimeException;
import javax.naming.InvalidNameException;
import javax.naming.ConfigurationException;
import org.jboss.logging.BasicLogger;
import org.omg.CORBA.CompletionStatus;
import org.omg.CORBA.INTERNAL;
import javax.naming.NamingException;
import org.jboss.msc.service.StartException;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
import org.omg.CORBA.NO_PERMISSION;
import javax.annotation.processing.Generated;
import org.jboss.as.controller.OperationFailedException;
import org.omg.CORBA.MARSHAL;
import java.io.IOException;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import org.wildfly.iiop.openjdk.rmi.RMIIIOPViolationException;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:20+0200")
public class IIOPLogger_$logger extends DelegatingBasicLogger implements IIOPLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = IIOPLogger_$logger.class.getName();
    public IIOPLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void activatingSubsystem() {
        super.log.logf(FQCN, INFO, null, activatingSubsystem$str());
    }
    protected String activatingSubsystem$str() {
        return "WFLYIIOP0001: Activating IIOP Subsystem";
    }
    @Override
    public final void failedToFetchCSIv2Policy(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToFetchCSIv2Policy$str());
    }
    protected String failedToFetchCSIv2Policy$str() {
        return "WFLYIIOP0002: Error fetching CSIv2Policy";
    }
    @Override
    public final void caughtExceptionEncodingGSSUPMechOID(final Throwable arg0) {
        super.log.logf(FQCN, WARN, arg0, caughtExceptionEncodingGSSUPMechOID$str());
    }
    protected String caughtExceptionEncodingGSSUPMechOID$str() {
        return "WFLYIIOP0003: Caught exception while encoding GSSUPMechOID";
    }
    @Override
    public final void logInternalError(final Exception arg0) {
        super.log.logf(FQCN, ERROR, arg0, logInternalError$str());
    }
    protected String logInternalError$str() {
        return "WFLYIIOP0004: Internal error";
    }
    @Override
    public final void failedToCreateNamingContext(final Exception arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToCreateNamingContext$str());
    }
    protected String failedToCreateNamingContext$str() {
        return "WFLYIIOP0005: Failed to create CORBA naming context";
    }
    @Override
    public final void failedToUnbindObject(final Object arg0) {
        super.log.logf(FQCN, WARN, null, failedToUnbindObject$str(), arg0);
    }
    protected String failedToUnbindObject$str() {
        return "WFLYIIOP0006: Unbind failed for %s";
    }
    @Override
    public final void failedToObtainJSSEDomain(final String arg0) {
        super.log.logf(FQCN, ERROR, null, failedToObtainJSSEDomain$str(), arg0);
    }
    protected String failedToObtainJSSEDomain$str() {
        return "WFLYIIOP0007: Failed to obtain JSSE security domain with name %s";
    }
    @Override
    public final void corbaNamingServiceStarted() {
        super.log.logf(FQCN, INFO, null, corbaNamingServiceStarted$str());
    }
    protected String corbaNamingServiceStarted$str() {
        return "WFLYIIOP0008: CORBA Naming Service started";
    }
    @Override
    public final void corbaORBServiceStarted() {
        super.log.logf(FQCN, INFO, null, corbaORBServiceStarted$str());
    }
    protected String corbaORBServiceStarted$str() {
        return "WFLYIIOP0009: CORBA ORB Service started";
    }
    @Override
    public final void warnClassDescDoesNotConformToSpec() {
        super.log.logf(FQCN, WARN, null, warnClassDescDoesNotConformToSpec$str());
    }
    protected String warnClassDescDoesNotConformToSpec$str() {
        return "WFLYIIOP0010: Compatibility problem: Class javax.rmi.CORBA.ClassDesc does not conform to the Java(TM) Language to IDL Mapping Specification (01-06-07), section 1.3.5.11";
    }
    @Override
    public final void warnCouldNotDeactivateIRObject(final Throwable arg0) {
        super.log.logf(FQCN, WARN, arg0, warnCouldNotDeactivateIRObject$str());
    }
    protected String warnCouldNotDeactivateIRObject$str() {
        return "WFLYIIOP0011: Could not deactivate IR object";
    }
    @Override
    public final void warnCouldNotDeactivateAnonIRObject(final Throwable arg0) {
        super.log.logf(FQCN, WARN, arg0, warnCouldNotDeactivateAnonIRObject$str());
    }
    protected String warnCouldNotDeactivateAnonIRObject$str() {
        return "WFLYIIOP0012: Could not deactivate anonymous IR object";
    }
    protected String noSSLContextsSpecified$str() {
        return "WFLYIIOP0013: SSL support has been enabled but neither client nor server SSL contexts have been specified";
    }
    @Override
    public final OperationFailedException noSSLContextsSpecified() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSSLContextsSpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String unexpectedException$str() {
        return "WFLYIIOP0014: Unexpected exception";
    }
    @Override
    public final RuntimeException unexpectedException(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unexpectedException$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedContextErrorInSASReply$str() {
        return "WFLYIIOP0015: Unexpected ContextError in SAS reply";
    }
    @Override
    public final NO_PERMISSION unexpectedContextErrorInSASReply(final int arg0, final CompletionStatus arg1) {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), unexpectedContextErrorInSASReply$str()), arg0, arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorParsingSASReply$str() {
        return "WFLYIIOP0016: Could not parse SAS reply: %s";
    }
    @Override
    public final MARSHAL errorParsingSASReply(final Exception arg0, final int arg1, final CompletionStatus arg2) {
        final MARSHAL result = new MARSHAL(String.format(getLoggingLocale(), errorParsingSASReply$str(), arg0), arg1, arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorRegisteringSASCurrentInitRef$str() {
        return "WFLYIIOP0017: Could not register initial reference for SASCurrent";
    }
    @Override
    public final RuntimeException errorRegisteringSASCurrentInitRef(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorRegisteringSASCurrentInitRef$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingSASContext$str() {
        return "WFLYIIOP0018: SAS context does not exist";
    }
    @Override
    public final NO_PERMISSION missingSASContext() {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), missingSASContext$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorDecodingInitContextToken$str() {
        return "WFLYIIOP0019: Could not decode initial context token";
    }
    @Override
    public final NO_PERMISSION errorDecodingInitContextToken() {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), errorDecodingInitContextToken$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorDecodingTargetInContextToken$str() {
        return "WFLYIIOP0020: Could not decode target name in initial context token";
    }
    @Override
    public final NO_PERMISSION errorDecodingTargetInContextToken() {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), errorDecodingTargetInContextToken$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorDecodingPrincipalName$str() {
        return "WFLYIIOP0021: Could not decode incoming principal name";
    }
    @Override
    public final NO_PERMISSION errorDecodingPrincipalName() {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), errorDecodingPrincipalName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorDecodingContextData$str() {
        return "WFLYIIOP0022: Exception decoding context data in %s";
    }
    @Override
    public final RuntimeException errorDecodingContextData(final String arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorDecodingContextData$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalBatchSize$str() {
        return "WFLYIIOP0023: Batch size not numeric: %s";
    }
    @Override
    public final IllegalArgumentException illegalBatchSize(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalBatchSize$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorGettingBindingList$str() {
        return "WFLYIIOP0024: Error getting binding list";
    }
    @Override
    public final NamingException errorGettingBindingList() {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), errorGettingBindingList$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorGeneratingObjectViaFactory$str() {
        return "WFLYIIOP0025: Error generating object via object factory";
    }
    @Override
    public final NamingException errorGeneratingObjectViaFactory() {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), errorGeneratingObjectViaFactory$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorConstructingCNCtx$str() {
        return "WFLYIIOP0026: Error constructing context: either ORB or NamingContext must be supplied";
    }
    @Override
    public final ConfigurationException errorConstructingCNCtx() {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), errorConstructingCNCtx$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notANamingContext$str() {
        return "WFLYIIOP0027: %s does not name a NamingContext";
    }
    @Override
    public final ConfigurationException notANamingContext(final String arg0) {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), notANamingContext$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorConvertingIORToNamingCtx$str() {
        return "WFLYIIOP0028: Cannot convert IOR to NamingContext: %s";
    }
    @Override
    public final ConfigurationException errorConvertingIORToNamingCtx(final String arg0) {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), errorConvertingIORToNamingCtx$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorResolvingNSInitRef$str() {
        return "WFLYIIOP0029: ORB.resolve_initial_references(\"NameService\") does not return a NamingContext";
    }
    @Override
    public final ConfigurationException errorResolvingNSInitRef() {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), errorResolvingNSInitRef$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cosNamingNotRegisteredCorrectly$str() {
        return "WFLYIIOP0030: COS Name Service not registered with ORB under the name 'NameService'";
    }
    @Override
    public final NamingException cosNamingNotRegisteredCorrectly() {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), cosNamingNotRegisteredCorrectly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorConnectingToORB$str() {
        return "WFLYIIOP0031: Cannot connect to ORB";
    }
    @Override
    public final NamingException errorConnectingToORB() {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), errorConnectingToORB$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidURLOrIOR$str() {
        return "WFLYIIOP0032: Invalid IOR or URL: %s";
    }
    @Override
    public final NamingException invalidURLOrIOR(final String arg0) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), invalidURLOrIOR$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidObjectReference$str() {
        return "WFLYIIOP0033: Invalid object reference:  %s";
    }
    @Override
    public final NamingException invalidObjectReference(final String arg0) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), invalidObjectReference$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String urlDoesNotContainIOR$str() {
        return "WFLYIIOP0034: %s does not contain an IOR";
    }
    @Override
    public final ConfigurationException urlDoesNotContainIOR(final String arg0) {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), urlDoesNotContainIOR$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notACorbaObject$str() {
        return "WFLYIIOP0035: Only instances of org.omg.CORBA.Object can be bound";
    }
    @Override
    public final IllegalArgumentException notACorbaObject() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notACorbaObject$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noReferenceFound$str() {
        return "WFLYIIOP0036: No object reference bound for specified name";
    }
    @Override
    public final NamingException noReferenceFound() {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), noReferenceFound$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidEmptyName$str() {
        return "WFLYIIOP0037: Invalid empty name";
    }
    @Override
    public final InvalidNameException invalidEmptyName() {
        final InvalidNameException result = new InvalidNameException(String.format(getLoggingLocale(), invalidEmptyName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unescapedCharacter$str() {
        return "WFLYIIOP0038: %s: unescaped \\ at end of component";
    }
    @Override
    public final InvalidNameException unescapedCharacter(final String arg0) {
        final InvalidNameException result = new InvalidNameException(String.format(getLoggingLocale(), unescapedCharacter$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidEscapedCharacter$str() {
        return "WFLYIIOP0039: %s: Invalid character being escaped";
    }
    @Override
    public final InvalidNameException invalidEscapedCharacter(final String arg0) {
        final InvalidNameException result = new InvalidNameException(String.format(getLoggingLocale(), invalidEscapedCharacter$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidURL$str() {
        return "WFLYIIOP0040: Invalid %s URL: %s";
    }
    @Override
    public final MalformedURLException invalidURL(final String arg0, final String arg1) {
        final MalformedURLException result = new MalformedURLException(String.format(getLoggingLocale(), invalidURL$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String problemInvokingPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0041: Problem with PortableRemoteObject.toStub(); object not exported or stub not found";
    }
    @Override
    public final ConfigurationException problemInvokingPortableRemoteObjectToStub() {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), problemInvokingPortableRemoteObjectToStub$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInvokePortableRemoteObjectToStub$str() {
        return "WFLYIIOP0042: Cannot invoke javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote)";
    }
    @Override
    public final ConfigurationException cannotInvokePortableRemoteObjectToStub() {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), cannotInvokePortableRemoteObjectToStub$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noMethodDefForPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0043: No method definition for javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote)";
    }
    @Override
    public final IllegalStateException noMethodDefForPortableRemoteObjectToStub() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noMethodDefForPortableRemoteObjectToStub$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String problemInvokingStubConnect$str() {
        return "WFLYIIOP0044: Problem invoking javax.rmi.CORBA.Stub.connect()";
    }
    @Override
    public final ConfigurationException problemInvokingStubConnect() {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), problemInvokingStubConnect$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInvokeStubConnect$str() {
        return "WFLYIIOP0045: Cannot invoke javax.rmi.CORBA.Stub.connect()";
    }
    @Override
    public final ConfigurationException cannotInvokeStubConnect() {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), cannotInvokeStubConnect$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noMethodDefForStubConnect$str() {
        return "WFLYIIOP0046: No method definition for javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB)";
    }
    @Override
    public final IllegalStateException noMethodDefForStubConnect() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noMethodDefForStubConnect$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidIIOPURLVersion$str() {
        return "WFLYIIOP0047: Invalid IIOP URL version: %s";
    }
    @Override
    public final MalformedURLException invalidIIOPURLVersion(final String arg0) {
        final MalformedURLException result = new MalformedURLException(String.format(getLoggingLocale(), invalidIIOPURLVersion$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unavailableRMIPackages$str() {
        return "WFLYIIOP0048: javax.rmi packages not available";
    }
    @Override
    public final ConfigurationException unavailableRMIPackages() {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), unavailableRMIPackages$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unavailableISOLatin1Decoder$str() {
        return "WFLYIIOP0049: ISO-Latin-1 decoder unavailable";
    }
    @Override
    public final MalformedURLException unavailableISOLatin1Decoder() {
        final MalformedURLException result = new MalformedURLException(String.format(getLoggingLocale(), unavailableISOLatin1Decoder$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidURIEncoding$str() {
        return "WFLYIIOP0050: Invalid URI encoding: %s";
    }
    @Override
    public final MalformedURLException invalidURIEncoding(final String arg0) {
        final MalformedURLException result = new MalformedURLException(String.format(getLoggingLocale(), invalidURIEncoding$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLookupJSSEDomain$str() {
        return "WFLYIIOP0051: Error configuring domain socket factory: failed to lookup JSSE security domain";
    }
    @Override
    public final ConfigurationException failedToLookupJSSEDomain() {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), failedToLookupJSSEDomain$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorObtainingKeyManagers$str() {
        return "WFLYIIOP0052: keyManager[] is null for security domain %s";
    }
    @Override
    public final IOException errorObtainingKeyManagers(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), errorObtainingKeyManagers$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToGetSSLContext$str() {
        return "WFLYIIOP0053: Failed to get SSL context";
    }
    @Override
    public final IOException failedToGetSSLContext(final Throwable arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), failedToGetSSLContext$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToStartJBossCOSNaming$str() {
        return "WFLYIIOP0054: Failed to start the JBoss Corba Naming Service";
    }
    @Override
    public final StartException failedToStartJBossCOSNaming(final Throwable arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToStartJBossCOSNaming$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String foreignTransaction$str() {
        return "WFLYIIOP0055: Foreign Transaction";
    }
    @Override
    public final UnsupportedOperationException foreignTransaction() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), foreignTransaction$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorEncodingContext$str() {
        return "WFLYIIOP0056: Exception raised during encoding";
    }
    @Override
    public final RuntimeException errorEncodingContext(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorEncodingContext$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorGettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0057: Exception getting slot in TxServerInterceptor";
    }
    @Override
    public final RuntimeException errorGettingSlotInTxInterceptor(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorGettingSlotInTxInterceptor$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorSettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0058: Exception setting slot in TxServerInterceptor";
    }
    @Override
    public final RuntimeException errorSettingSlotInTxInterceptor(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorSettingSlotInTxInterceptor$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAnalyzeNullClass$str() {
        return "WFLYIIOP0059: Cannot analyze a null class";
    }
    @Override
    public final IllegalArgumentException cannotAnalyzeNullClass() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotAnalyzeNullClass$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badConstantType$str() {
        return "WFLYIIOP0060: Bad type for a constant: %s";
    }
    @Override
    public final IllegalArgumentException badConstantType(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), badConstantType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAnalyzeSpecialClass$str() {
        return "WFLYIIOP0061: Cannot analyze special class: %s";
    }
    @Override
    public final IllegalArgumentException cannotAnalyzeSpecialClass(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotAnalyzeSpecialClass$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAnAccessor$str() {
        return "WFLYIIOP0062: Not an accessor: %s";
    }
    @Override
    public final IllegalArgumentException notAnAccessor(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAnAccessor$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAnClassOrInterface$str() {
        return "WFLYIIOP0063: Not a class or interface: %s";
    }
    @Override
    public final IllegalArgumentException notAnClassOrInterface(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAnClassOrInterface$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAnInterface$str() {
        return "WFLYIIOP0064: Class %s is not an interface";
    }
    @Override
    public final IllegalArgumentException notAnInterface(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAnInterface$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAPrimitive$str() {
        return "WFLYIIOP0065: Not a primitive type: %s";
    }
    @Override
    public final IllegalArgumentException notAPrimitive(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAPrimitive$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badRMIIIOPConstantType$str() {
        return "WFLYIIOP0066: Field %s of interface %s is a constant, but it is not primitive or String";
    }
    @Override
    public final RMIIIOPViolationException badRMIIIOPConstantType(final String arg0, final String arg1, final String arg2) {
        final RMIIIOPViolationException result = new RMIIIOPViolationException(String.format(getLoggingLocale(), badRMIIIOPConstantType$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badRMIIIOPExceptionType$str() {
        return "WFLYIIOP0067: Exception type %s must be a checked exception class";
    }
    @Override
    public final RMIIIOPViolationException badRMIIIOPExceptionType(final String arg0, final String arg1) {
        final RMIIIOPViolationException result = new RMIIIOPViolationException(String.format(getLoggingLocale(), badRMIIIOPExceptionType$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badRMIIIOPMethodSignature$str() {
        return "WFLYIIOP0068: All interface methods must throw javax.rmi.RemoteException but method %s of interface %s does not";
    }
    @Override
    public final RMIIIOPViolationException badRMIIIOPMethodSignature(final String arg0, final String arg1, final String arg2) {
        final RMIIIOPViolationException result = new RMIIIOPViolationException(String.format(getLoggingLocale(), badRMIIIOPMethodSignature$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nameCannotBeNullEmptyOrQualified$str() {
        return "WFLYIIOP0069: Name cannot be null, empty or qualified";
    }
    @Override
    public final IllegalArgumentException nameCannotBeNullEmptyOrQualified() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nameCannotBeNullEmptyOrQualified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String primitivesHaveNoIRIds$str() {
        return "WFLYIIOP0070: Primitive types have no IR IDs";
    }
    @Override
    public final IllegalArgumentException primitivesHaveNoIRIds() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), primitivesHaveNoIRIds$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unavailableSHADigest$str() {
        return "WFLYIIOP0071: No SHA message digest available";
    }
    @Override
    public final RuntimeException unavailableSHADigest(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unavailableSHADigest$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownPrimitiveType$str() {
        return "WFLYIIOP0072: Unknown primitive type: %s";
    }
    @Override
    public final RuntimeException unknownPrimitiveType(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unknownPrimitiveType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAnalyzeStringType$str() {
        return "WFLYIIOP0073: Cannot analyze java.lang.String: it is a special case";
    }
    @Override
    public final IllegalArgumentException cannotAnalyzeStringType() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotAnalyzeStringType$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAnalyzeClassType$str() {
        return "WFLYIIOP0074: Cannot analyze java.lang.Class: it is a special case";
    }
    @Override
    public final IllegalArgumentException cannotAnalyzeClassType() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotAnalyzeClassType$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String valueTypeCantImplementRemote$str() {
        return "WFLYIIOP0075: Value type %s cannot implement java.rmi.Remote";
    }
    @Override
    public final RMIIIOPViolationException valueTypeCantImplementRemote(final String arg0, final String arg1) {
        final RMIIIOPViolationException result = new RMIIIOPViolationException(String.format(getLoggingLocale(), valueTypeCantImplementRemote$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String valueTypeCantBeProxy$str() {
        return "WFLYIIOP0076: Value type %s cannot be a proxy or inner class";
    }
    @Override
    public final RMIIIOPViolationException valueTypeCantBeProxy(final String arg0) {
        final RMIIIOPViolationException result = new RMIIIOPViolationException(String.format(getLoggingLocale(), valueTypeCantBeProxy$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorLoadingClass$str() {
        return "WFLYIIOP0077: Error loading class %s";
    }
    @Override
    public final RuntimeException errorLoadingClass(final String arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorLoadingClass$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noReadMethodInHelper$str() {
        return "WFLYIIOP0078: No read method in helper class %s";
    }
    @Override
    public final RuntimeException noReadMethodInHelper(final String arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), noReadMethodInHelper$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noWriteMethodInHelper$str() {
        return "WFLYIIOP0079: No write method in helper class %s";
    }
    @Override
    public final RuntimeException noWriteMethodInHelper(final String arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), noWriteMethodInHelper$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorUnmarshaling$str() {
        return "WFLYIIOP0080: Error unmarshaling %s";
    }
    @Override
    public final RuntimeException errorUnmarshaling(final Class<?> arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorUnmarshaling$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorMarshaling$str() {
        return "WFLYIIOP0081: Error marshaling %s";
    }
    @Override
    public final RuntimeException errorMarshaling(final Class<?> arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorMarshaling$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotObtainExceptionRepositoryID$str() {
        return "WFLYIIOP0082: Cannot obtain exception repository id for %s";
    }
    @Override
    public final RuntimeException cannotObtainExceptionRepositoryID(final String arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotObtainExceptionRepositoryID$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorMashalingParams$str() {
        return "WFLYIIOP0083: Cannot marshal parameter: unexpected number of parameters";
    }
    @Override
    public final RuntimeException errorMashalingParams() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorMashalingParams$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotChangeRMIIIOPMapping$str() {
        return "WFLYIIOP0084: Cannot change RMI/IIOP mapping";
    }
    @Override
    public final BAD_INV_ORDER cannotChangeRMIIIOPMapping() {
        final BAD_INV_ORDER result = new BAD_INV_ORDER(String.format(getLoggingLocale(), cannotChangeRMIIIOPMapping$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badKindForTypeCode$str() {
        return "WFLYIIOP0085: Bad kind %d for TypeCode";
    }
    @Override
    public final RuntimeException badKindForTypeCode(final int arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), badKindForTypeCode$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wrongInterfaceRepository$str() {
        return "WFLYIIOP0086: Wrong interface repository";
    }
    @Override
    public final IRConstructionException wrongInterfaceRepository() {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), wrongInterfaceRepository$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateRepositoryName$str() {
        return "WFLYIIOP0087: Duplicate repository name";
    }
    @Override
    public final IRConstructionException duplicateRepositoryName() {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), duplicateRepositoryName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidNullClass$str() {
        return "WFLYIIOP0088: Invalid null class";
    }
    @Override
    public final IllegalArgumentException invalidNullClass() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidNullClass$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badClassForConstant$str() {
        return "WFLYIIOP0089: Bad class %s for a constant";
    }
    @Override
    public final IRConstructionException badClassForConstant(final String arg0) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), badClassForConstant$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownTypeCodeForClass$str() {
        return "WFLYIIOP0090: TypeCode for class %s is unknown";
    }
    @Override
    public final IRConstructionException unknownTypeCodeForClass(final String arg0) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), unknownTypeCodeForClass$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateTypeCodeForClass$str() {
        return "WFLYIIOP0091: TypeCode for class %s already established";
    }
    @Override
    public final IRConstructionException duplicateTypeCodeForClass(final String arg0) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), duplicateTypeCodeForClass$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String collisionWhileCreatingPackage$str() {
        return "WFLYIIOP0092: Name collision while creating package";
    }
    @Override
    public final IRConstructionException collisionWhileCreatingPackage() {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), collisionWhileCreatingPackage$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String classIsNotArray$str() {
        return "WFLYIIOP0093: Class %s is not an array class";
    }
    @Override
    public final IRConstructionException classIsNotArray(final String arg0) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), classIsNotArray$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotDestroyRMIIIOPMapping$str() {
        return "WFLYIIOP0094: Cannot destroy RMI/IIOP mapping";
    }
    @Override
    public final BAD_INV_ORDER cannotDestroyRMIIIOPMapping() {
        final BAD_INV_ORDER result = new BAD_INV_ORDER(String.format(getLoggingLocale(), cannotDestroyRMIIIOPMapping$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badKindForSuperValueType$str() {
        return "WFLYIIOP0095: Bad kind for super valuetype of %s";
    }
    @Override
    public final IRConstructionException badKindForSuperValueType(final String arg0) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), badKindForSuperValueType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorResolvingRefToImplementedInterface$str() {
        return "WFLYIIOP0096: ValueDef %s unable to resolve reference to implemented interface %s";
    }
    @Override
    public final IRConstructionException errorResolvingRefToImplementedInterface(final String arg0, final String arg1) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), errorResolvingRefToImplementedInterface$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorResolvingRefToAbstractValuetype$str() {
        return "WFLYIIOP0097: ValueDef %s unable to resolve reference to abstract base valuetype %s";
    }
    @Override
    public final IRConstructionException errorResolvingRefToAbstractValuetype(final String arg0, final String arg1) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), errorResolvingRefToAbstractValuetype$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorResolvingInitRef$str() {
        return "WFLYIIOP0098: Failed to resolve initial reference %s";
    }
    @Override
    public final StartException errorResolvingInitRef(final String arg0, final Throwable arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), errorResolvingInitRef$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorCreatingPOAFromParent$str() {
        return "WFLYIIOP0099: Failed to create POA from parent";
    }
    @Override
    public final StartException errorCreatingPOAFromParent(final Throwable arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), errorCreatingPOAFromParent$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidPOACreationArgs$str() {
        return "WFLYIIOP0100: Unable to instantiate POA: either the running ORB or the parent POA must be specified";
    }
    @Override
    public final StartException invalidPOACreationArgs() {
        final StartException result = new StartException(String.format(getLoggingLocale(), invalidPOACreationArgs$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorActivatingPOA$str() {
        return "WFLYIIOP0101: Failed to activate POA";
    }
    @Override
    public final StartException errorActivatingPOA(final Throwable arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), errorActivatingPOA$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String exceptionDestroingIterator$str() {
        return "WFLYIIOP0102: Caught exception destroying Iterator %s";
    }
    @Override
    public final INTERNAL exceptionDestroingIterator(final String arg0) {
        final INTERNAL result = new INTERNAL(String.format(getLoggingLocale(), exceptionDestroingIterator$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String sslNotConfigured$str() {
        return "WFLYIIOP0103: IOR settings imply ssl connections usage, but secure connections have not been configured";
    }
    @Override
    public final OperationFailedException sslNotConfigured() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), sslNotConfigured$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String inconsistentSupportedTransportConfig$str() {
        return "WFLYIIOP0104: Inconsistent transport-config configuration: %s is supported, please configure it to %s value";
    }
    @Override
    public final String inconsistentSupportedTransportConfig(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), inconsistentSupportedTransportConfig$str(), arg0, arg1);
    }
    protected String inconsistentUnsupportedTransportConfig$str() {
        return "WFLYIIOP0105: Inconsistent transport-config configuration: %s is not supported, please remove it or configure it to none value";
    }
    @Override
    public final String inconsistentUnsupportedTransportConfig(final String arg0) {
        return String.format(getLoggingLocale(), inconsistentUnsupportedTransportConfig$str(), arg0);
    }
    protected String inconsistentRequiredTransportConfig$str() {
        return "WFLYIIOP0106: Inconsistent transport-config configuration: %s is set to true, please configure %s as required";
    }
    @Override
    public final String inconsistentRequiredTransportConfig(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), inconsistentRequiredTransportConfig$str(), arg0, arg1);
    }
    @Override
    public final void cannotCreateSSLSocket() {
        super.log.logf(FQCN, WARN, null, cannotCreateSSLSocket$str());
    }
    protected String cannotCreateSSLSocket$str() {
        return "WFLYIIOP0109: SSL socket is required by server but secure connections have not been configured";
    }
    protected String serverDoesNotSupportSsl$str() {
        return "WFLYIIOP0110: Client requires SSL but server does not support it";
    }
    @Override
    public final IllegalStateException serverDoesNotSupportSsl() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serverDoesNotSupportSsl$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ineffectiveAuthenticationContextConfiguration$str() {
        return "WFLYIIOP0113: Authentication context has been defined but it is ineffective because the security initializer is not set to 'elytron'";
    }
    @Override
    public final OperationFailedException ineffectiveAuthenticationContextConfiguration() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), ineffectiveAuthenticationContextConfiguration$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String elytronInitializerNotSupportedInPreviousVersions$str() {
        return "WFLYIIOP0114: Elytron security initializer not supported in previous iiop-openjdk versions and can't be converted";
    }
    @Override
    public final String elytronInitializerNotSupportedInPreviousVersions() {
        return String.format(getLoggingLocale(), elytronInitializerNotSupportedInPreviousVersions$str());
    }
    protected String noSocketBindingsConfigured$str() {
        return "WFLYIIOP0115: No IIOP socket bindings have been configured";
    }
    @Override
    public final IllegalStateException noSocketBindingsConfigured() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noSocketBindingsConfigured$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void wontUseCleartextSocket() {
        super.log.logf(FQCN, WARN, null, wontUseCleartextSocket$str());
    }
    protected String wontUseCleartextSocket$str() {
        return "WFLYIIOP0117: CLEARTEXT in IIOP subsystem won't be used because server-requires-ssl parameter have been set to true";
    }
    protected String legacySecurityUnsupported$str() {
        return "WFLYIIOP0118: Legacy security is no longer supported.";
    }
    @Override
    public final IllegalStateException legacySecurityUnsupported() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), legacySecurityUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYIIOP0119: The use of security realms at runtime is unsupported.";
    }
    @Override
    public final OperationFailedException runtimeSecurityRealmUnsupported() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), runtimeSecurityRealmUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String runtimeSecurityDomainUnsupported$str() {
        return "WFLYIIOP0120: The use of security domains at runtime is unsupported.";
    }
    @Override
    public final OperationFailedException runtimeSecurityDomainUnsupported() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), runtimeSecurityDomainUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverSSLNotConfiguredRuntime$str() {
        return "WFLYIIOP0121: Cannot create server SSL socket: authentication context not configured.";
    }
    @Override
    public final IOException serverSSLNotConfiguredRuntime() {
        final IOException result = new IOException(String.format(getLoggingLocale(), serverSSLNotConfiguredRuntime$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String clientSSLNotConfiguredRuntime$str() {
        return "WFLYIIOP0122: Cannot create client SSL socket: authentication context not configured.";
    }
    @Override
    public final IOException clientSSLNotConfiguredRuntime() {
        final IOException result = new IOException(String.format(getLoggingLocale(), clientSSLNotConfiguredRuntime$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverSSLNotConfigured$str() {
        return "WFLYIIOP0123: Server requires SSL but server authentication context is not defined";
    }
    @Override
    public final OperationFailedException serverSSLNotConfigured() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), serverSSLNotConfigured$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String clientSSLNotConfigured$str() {
        return "WFLYIIOP0124: Client requires SSL but client authentication context is not defined";
    }
    @Override
    public final OperationFailedException clientSSLNotConfigured() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), clientSSLNotConfigured$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverSSLPortWithoutSslConfiguration$str() {
        return "WFLYIIOP0125: Server SSL has not been configured but ssl-port property has been specified - inbound connections will use only clear-text protocol";
    }
    @Override
    public final String serverSSLPortWithoutSslConfiguration() {
        return String.format(getLoggingLocale(), serverSSLPortWithoutSslConfiguration$str());
    }
    protected String clientSSLPortWithoutSslConfiguration$str() {
        return "WFLYIIOP0126: Client SSL has not been configured but ssl-port property has been specified - outbound connections will use only clear-text protocol";
    }
    @Override
    public final String clientSSLPortWithoutSslConfiguration() {
        return String.format(getLoggingLocale(), clientSSLPortWithoutSslConfiguration$str());
    }
    protected String inconsistentSSLContextDefinition$str() {
        return "WFLYIIOP0127: Either the 'client-ssl-context' attribute is undefined and 'server-ssl-context' is not, or vice versa; on servers running previous versions either both must be defined or both must be undefined.";
    }
    @Override
    public final String inconsistentSSLContextDefinition() {
        return String.format(getLoggingLocale(), inconsistentSSLContextDefinition$str());
    }
    protected String noUsernameProvided$str() {
        return "WFLYIIOP0130: No username provided - naming service requires authentication";
    }
    @Override
    public final NO_PERMISSION noUsernameProvided() {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), noUsernameProvided$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String sasCurrentNotAvailable$str() {
        return "WFLYIIOP0131: SASCurrent not available - naming service requires CSIv2 security configuration";
    }
    @Override
    public final NO_PERMISSION sasCurrentNotAvailable() {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), sasCurrentNotAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String securityDomainNotAvailable$str() {
        return "WFLYIIOP0132: SecurityDomain not available - naming service requires Elytron security domain";
    }
    @Override
    public final NO_PERMISSION securityDomainNotAvailable() {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), securityDomainNotAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String authenticationFailed$str() {
        return "WFLYIIOP0133: Authentication failed for user '%s'";
    }
    @Override
    public final NO_PERMISSION authenticationFailed(final String arg0) {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), authenticationFailed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String authorizationFailed$str() {
        return "WFLYIIOP0134: Authorization failed for user '%s'";
    }
    @Override
    public final NO_PERMISSION authorizationFailed(final String arg0) {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), authorizationFailed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String authenticationException$str() {
        return "WFLYIIOP0135: Authentication exception";
    }
    @Override
    public final NO_PERMISSION authenticationException(final Exception arg0) {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), authenticationException$str()));
        result.initCause(arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void tokenLengthExceedsMaximum(final int arg0, final int arg1) {
        super.log.logf(FQCN, WARN, null, tokenLengthExceedsMaximum$str(), arg0, arg1);
    }
    protected String tokenLengthExceedsMaximum$str() {
        return "WFLYIIOP0136: Token length %d exceeds maximum allowed size %d";
    }
    @Override
    public final void invalidComputedTokenLength(final int arg0) {
        super.log.logf(FQCN, WARN, null, invalidComputedTokenLength$str(), arg0);
    }
    protected String invalidComputedTokenLength$str() {
        return "WFLYIIOP0137: Computed token length %d is invalid";
    }
    @Override
    public final void mechanismOidLengthExceedsMaximum(final int arg0, final int arg1) {
        super.log.logf(FQCN, WARN, null, mechanismOidLengthExceedsMaximum$str(), arg0, arg1);
    }
    protected String mechanismOidLengthExceedsMaximum$str() {
        return "WFLYIIOP0138: Mechanism OID length %d exceeds maximum %d";
    }
    @Override
    public final void mechanismOidLengthMismatch() {
        super.log.logf(FQCN, WARN, null, mechanismOidLengthMismatch$str());
    }
    protected String mechanismOidLengthMismatch$str() {
        return "WFLYIIOP0139: Mechanism OID length mismatch";
    }
    @Override
    public final void nameLengthExceedsMaximum(final int arg0, final int arg1) {
        super.log.logf(FQCN, WARN, null, nameLengthExceedsMaximum$str(), arg0, arg1);
    }
    protected String nameLengthExceedsMaximum$str() {
        return "WFLYIIOP0140: Name length %d exceeds maximum %d";
    }
}
