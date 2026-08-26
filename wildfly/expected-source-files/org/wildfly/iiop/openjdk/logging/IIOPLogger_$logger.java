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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:54:06+0200")
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
    public final void failedToFetchCSIv2Policy(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, failedToFetchCSIv2Policy$str());
    }
    protected String failedToFetchCSIv2Policy$str() {
        return "WFLYIIOP0002: Error fetching CSIv2Policy";
    }
    @Override
    public final void caughtExceptionEncodingGSSUPMechOID(final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, caughtExceptionEncodingGSSUPMechOID$str());
    }
    protected String caughtExceptionEncodingGSSUPMechOID$str() {
        return "WFLYIIOP0003: Caught exception while encoding GSSUPMechOID";
    }
    @Override
    public final void logInternalError(final Exception cause) {
        super.log.logf(FQCN, ERROR, cause, logInternalError$str());
    }
    protected String logInternalError$str() {
        return "WFLYIIOP0004: Internal error";
    }
    @Override
    public final void failedToCreateNamingContext(final Exception cause) {
        super.log.logf(FQCN, ERROR, cause, failedToCreateNamingContext$str());
    }
    protected String failedToCreateNamingContext$str() {
        return "WFLYIIOP0005: Failed to create CORBA naming context";
    }
    @Override
    public final void failedToUnbindObject(final Object name) {
        super.log.logf(FQCN, WARN, null, failedToUnbindObject$str(), name);
    }
    protected String failedToUnbindObject$str() {
        return "WFLYIIOP0006: Unbind failed for %s";
    }
    @Override
    public final void failedToObtainJSSEDomain(final String securityDomain) {
        super.log.logf(FQCN, ERROR, null, failedToObtainJSSEDomain$str(), securityDomain);
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
    public final void warnCouldNotDeactivateIRObject(final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, warnCouldNotDeactivateIRObject$str());
    }
    protected String warnCouldNotDeactivateIRObject$str() {
        return "WFLYIIOP0011: Could not deactivate IR object";
    }
    @Override
    public final void warnCouldNotDeactivateAnonIRObject(final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, warnCouldNotDeactivateAnonIRObject$str());
    }
    protected String warnCouldNotDeactivateAnonIRObject$str() {
        return "WFLYIIOP0012: Could not deactivate anonymous IR object";
    }
    protected String noSecurityDomainOrSSLContextsSpecified$str() {
        return "WFLYIIOP0013: SSL support has been enabled but no security domain or client/server SSL contexts have been specified";
    }
    @Override
    public final OperationFailedException noSecurityDomainOrSSLContextsSpecified() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSecurityDomainOrSSLContextsSpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String unexpectedException$str() {
        return "WFLYIIOP0014: Unexpected exception";
    }
    @Override
    public final RuntimeException unexpectedException(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unexpectedException$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedContextErrorInSASReply$str() {
        return "WFLYIIOP0015: Unexpected ContextError in SAS reply";
    }
    @Override
    public final NO_PERMISSION unexpectedContextErrorInSASReply(final int minorCode, final CompletionStatus status) {
        final NO_PERMISSION result = new NO_PERMISSION(String.format(getLoggingLocale(), unexpectedContextErrorInSASReply$str()), minorCode, status);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorParsingSASReply$str() {
        return "WFLYIIOP0016: Could not parse SAS reply: %s";
    }
    @Override
    public final MARSHAL errorParsingSASReply(final Exception e, final int minorCode, final CompletionStatus status) {
        final MARSHAL result = new MARSHAL(String.format(getLoggingLocale(), errorParsingSASReply$str(), e), minorCode, status);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorRegisteringSASCurrentInitRef$str() {
        return "WFLYIIOP0017: Could not register initial reference for SASCurrent";
    }
    @Override
    public final RuntimeException errorRegisteringSASCurrentInitRef(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorRegisteringSASCurrentInitRef$str()), cause);
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
    public final RuntimeException errorDecodingContextData(final String interceptorName, final Throwable e) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorDecodingContextData$str(), interceptorName), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalBatchSize$str() {
        return "WFLYIIOP0023: Batch size not numeric: %s";
    }
    @Override
    public final IllegalArgumentException illegalBatchSize(final String batch) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalBatchSize$str(), batch));
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
    public final ConfigurationException notANamingContext(final String name) {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), notANamingContext$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorConvertingIORToNamingCtx$str() {
        return "WFLYIIOP0028: Cannot convert IOR to NamingContext: %s";
    }
    @Override
    public final ConfigurationException errorConvertingIORToNamingCtx(final String ior) {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), errorConvertingIORToNamingCtx$str(), ior));
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
    public final NamingException invalidURLOrIOR(final String ior) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), invalidURLOrIOR$str(), ior));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidObjectReference$str() {
        return "WFLYIIOP0033: Invalid object reference:  %s";
    }
    @Override
    public final NamingException invalidObjectReference(final String ior) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), invalidObjectReference$str(), ior));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String urlDoesNotContainIOR$str() {
        return "WFLYIIOP0034: %s does not contain an IOR";
    }
    @Override
    public final ConfigurationException urlDoesNotContainIOR(final String url) {
        final ConfigurationException result = new ConfigurationException(String.format(getLoggingLocale(), urlDoesNotContainIOR$str(), url));
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
    public final InvalidNameException unescapedCharacter(final String cnString) {
        final InvalidNameException result = new InvalidNameException(String.format(getLoggingLocale(), unescapedCharacter$str(), cnString));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidEscapedCharacter$str() {
        return "WFLYIIOP0039: %s: Invalid character being escaped";
    }
    @Override
    public final InvalidNameException invalidEscapedCharacter(final String cnString) {
        final InvalidNameException result = new InvalidNameException(String.format(getLoggingLocale(), invalidEscapedCharacter$str(), cnString));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidURL$str() {
        return "WFLYIIOP0040: Invalid %s URL: %s";
    }
    @Override
    public final MalformedURLException invalidURL(final String protocol, final String url) {
        final MalformedURLException result = new MalformedURLException(String.format(getLoggingLocale(), invalidURL$str(), protocol, url));
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
    public final MalformedURLException invalidIIOPURLVersion(final String version) {
        final MalformedURLException result = new MalformedURLException(String.format(getLoggingLocale(), invalidIIOPURLVersion$str(), version));
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
    public final MalformedURLException invalidURIEncoding(final String encoding) {
        final MalformedURLException result = new MalformedURLException(String.format(getLoggingLocale(), invalidURIEncoding$str(), encoding));
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
    public final IOException errorObtainingKeyManagers(final String securityDomain) {
        final IOException result = new IOException(String.format(getLoggingLocale(), errorObtainingKeyManagers$str(), securityDomain));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToGetSSLContext$str() {
        return "WFLYIIOP0053: Failed to get SSL context";
    }
    @Override
    public final IOException failedToGetSSLContext(final Throwable cause) {
        final IOException result = new IOException(String.format(getLoggingLocale(), failedToGetSSLContext$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToStartJBossCOSNaming$str() {
        return "WFLYIIOP0054: Failed to start the JBoss Corba Naming Service";
    }
    @Override
    public final StartException failedToStartJBossCOSNaming(final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToStartJBossCOSNaming$str()), cause);
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
    public final RuntimeException errorEncodingContext(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorEncodingContext$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorGettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0057: Exception getting slot in TxServerInterceptor";
    }
    @Override
    public final RuntimeException errorGettingSlotInTxInterceptor(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorGettingSlotInTxInterceptor$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorSettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0058: Exception setting slot in TxServerInterceptor";
    }
    @Override
    public final RuntimeException errorSettingSlotInTxInterceptor(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorSettingSlotInTxInterceptor$str()), cause);
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
    public final IllegalArgumentException badConstantType(final String type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), badConstantType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAnalyzeSpecialClass$str() {
        return "WFLYIIOP0061: Cannot analyze special class: %s";
    }
    @Override
    public final IllegalArgumentException cannotAnalyzeSpecialClass(final String type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotAnalyzeSpecialClass$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAnAccessor$str() {
        return "WFLYIIOP0062: Not an accessor: %s";
    }
    @Override
    public final IllegalArgumentException notAnAccessor(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAnAccessor$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAnClassOrInterface$str() {
        return "WFLYIIOP0063: Not a class or interface: %s";
    }
    @Override
    public final IllegalArgumentException notAnClassOrInterface(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAnClassOrInterface$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAnInterface$str() {
        return "WFLYIIOP0064: Class %s is not an interface";
    }
    @Override
    public final IllegalArgumentException notAnInterface(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAnInterface$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAPrimitive$str() {
        return "WFLYIIOP0065: Not a primitive type: %s";
    }
    @Override
    public final IllegalArgumentException notAPrimitive(final String type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAPrimitive$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badRMIIIOPConstantType$str() {
        return "WFLYIIOP0066: Field %s of interface %s is a constant, but it is not primitive or String";
    }
    @Override
    public final RMIIIOPViolationException badRMIIIOPConstantType(final String field, final String intface, final String section) {
        final RMIIIOPViolationException result = new RMIIIOPViolationException(String.format(getLoggingLocale(), badRMIIIOPConstantType$str(), field, intface), section);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badRMIIIOPExceptionType$str() {
        return "WFLYIIOP0067: Exception type %s must be a checked exception class";
    }
    @Override
    public final RMIIIOPViolationException badRMIIIOPExceptionType(final String type, final String section) {
        final RMIIIOPViolationException result = new RMIIIOPViolationException(String.format(getLoggingLocale(), badRMIIIOPExceptionType$str(), type), section);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badRMIIIOPMethodSignature$str() {
        return "WFLYIIOP0068: All interface methods must throw javax.rmi.RemoteException but method %s of interface %s does not";
    }
    @Override
    public final RMIIIOPViolationException badRMIIIOPMethodSignature(final String method, final String intface, final String section) {
        final RMIIIOPViolationException result = new RMIIIOPViolationException(String.format(getLoggingLocale(), badRMIIIOPMethodSignature$str(), method, intface), section);
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
    public final RuntimeException unavailableSHADigest(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unavailableSHADigest$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownPrimitiveType$str() {
        return "WFLYIIOP0072: Unknown primitive type: %s";
    }
    @Override
    public final RuntimeException unknownPrimitiveType(final String type) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unknownPrimitiveType$str(), type));
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
    public final RMIIIOPViolationException valueTypeCantImplementRemote(final String type, final String section) {
        final RMIIIOPViolationException result = new RMIIIOPViolationException(String.format(getLoggingLocale(), valueTypeCantImplementRemote$str(), type), section);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String valueTypeCantBeProxy$str() {
        return "WFLYIIOP0076: Value type %s cannot be a proxy or inner class";
    }
    @Override
    public final RMIIIOPViolationException valueTypeCantBeProxy(final String type) {
        final RMIIIOPViolationException result = new RMIIIOPViolationException(String.format(getLoggingLocale(), valueTypeCantBeProxy$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorLoadingClass$str() {
        return "WFLYIIOP0077: Error loading class %s";
    }
    @Override
    public final RuntimeException errorLoadingClass(final String type, final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorLoadingClass$str(), type), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noReadMethodInHelper$str() {
        return "WFLYIIOP0078: No read method in helper class %s";
    }
    @Override
    public final RuntimeException noReadMethodInHelper(final String type, final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), noReadMethodInHelper$str(), type), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noWriteMethodInHelper$str() {
        return "WFLYIIOP0079: No write method in helper class %s";
    }
    @Override
    public final RuntimeException noWriteMethodInHelper(final String type, final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), noWriteMethodInHelper$str(), type), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorUnmarshaling$str() {
        return "WFLYIIOP0080: Error unmarshaling %s";
    }
    @Override
    public final RuntimeException errorUnmarshaling(final Class<?> type, final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorUnmarshaling$str(), type), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorMarshaling$str() {
        return "WFLYIIOP0081: Error marshaling %s";
    }
    @Override
    public final RuntimeException errorMarshaling(final Class<?> type, final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorMarshaling$str(), type), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotObtainExceptionRepositoryID$str() {
        return "WFLYIIOP0082: Cannot obtain exception repository id for %s";
    }
    @Override
    public final RuntimeException cannotObtainExceptionRepositoryID(final String type, final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotObtainExceptionRepositoryID$str(), type), cause);
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
    public final RuntimeException badKindForTypeCode(final int kind) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), badKindForTypeCode$str(), kind));
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
    public final IRConstructionException badClassForConstant(final String className) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), badClassForConstant$str(), className));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownTypeCodeForClass$str() {
        return "WFLYIIOP0090: TypeCode for class %s is unknown";
    }
    @Override
    public final IRConstructionException unknownTypeCodeForClass(final String className) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), unknownTypeCodeForClass$str(), className));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateTypeCodeForClass$str() {
        return "WFLYIIOP0091: TypeCode for class %s already established";
    }
    @Override
    public final IRConstructionException duplicateTypeCodeForClass(final String className) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), duplicateTypeCodeForClass$str(), className));
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
    public final IRConstructionException classIsNotArray(final String className) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), classIsNotArray$str(), className));
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
    public final IRConstructionException badKindForSuperValueType(final String id) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), badKindForSuperValueType$str(), id));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorResolvingRefToImplementedInterface$str() {
        return "WFLYIIOP0096: ValueDef %s unable to resolve reference to implemented interface %s";
    }
    @Override
    public final IRConstructionException errorResolvingRefToImplementedInterface(final String id, final String intface) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), errorResolvingRefToImplementedInterface$str(), id, intface));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorResolvingRefToAbstractValuetype$str() {
        return "WFLYIIOP0097: ValueDef %s unable to resolve reference to abstract base valuetype %s";
    }
    @Override
    public final IRConstructionException errorResolvingRefToAbstractValuetype(final String id, final String valuetype) {
        final IRConstructionException result = new IRConstructionException(String.format(getLoggingLocale(), errorResolvingRefToAbstractValuetype$str(), id, valuetype));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorResolvingInitRef$str() {
        return "WFLYIIOP0098: Failed to resolve initial reference %s";
    }
    @Override
    public final StartException errorResolvingInitRef(final String refName, final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), errorResolvingInitRef$str(), refName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorCreatingPOAFromParent$str() {
        return "WFLYIIOP0099: Failed to create POA from parent";
    }
    @Override
    public final StartException errorCreatingPOAFromParent(final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), errorCreatingPOAFromParent$str()), cause);
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
    public final StartException errorActivatingPOA(final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), errorActivatingPOA$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String exceptionDestroingIterator$str() {
        return "WFLYIIOP0102: Caught exception destroying Iterator %s";
    }
    @Override
    public final INTERNAL exceptionDestroingIterator(final String cause) {
        final INTERNAL result = new INTERNAL(String.format(getLoggingLocale(), exceptionDestroingIterator$str(), cause));
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
    public final String inconsistentSupportedTransportConfig(final String transportAttributeName, final String suggested) {
        return String.format(getLoggingLocale(), inconsistentSupportedTransportConfig$str(), transportAttributeName, suggested);
    }
    protected String inconsistentUnsupportedTransportConfig$str() {
        return "WFLYIIOP0105: Inconsistent transport-config configuration: %s is not supported, please remove it or configure it to none value";
    }
    @Override
    public final String inconsistentUnsupportedTransportConfig(final String transportAttributeName) {
        return String.format(getLoggingLocale(), inconsistentUnsupportedTransportConfig$str(), transportAttributeName);
    }
    protected String inconsistentRequiredTransportConfig$str() {
        return "WFLYIIOP0106: Inconsistent transport-config configuration: %s is set to true, please configure %s as required";
    }
    @Override
    public final String inconsistentRequiredTransportConfig(final String requiredAttributeName, final String transportAttributeName) {
        return String.format(getLoggingLocale(), inconsistentRequiredTransportConfig$str(), requiredAttributeName, transportAttributeName);
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
    protected String sslPortWithoutSslConfiguration$str() {
        return "WFLYIIOP0111: SSL has not been configured but ssl-port property has been specified - the connection will use clear-text protocol";
    }
    @Override
    public final String sslPortWithoutSslConfiguration() {
        return String.format(getLoggingLocale(), sslPortWithoutSslConfiguration$str());
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
}
