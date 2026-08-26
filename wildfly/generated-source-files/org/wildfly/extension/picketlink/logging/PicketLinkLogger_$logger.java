package org.wildfly.extension.picketlink.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.RuntimeException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.Throwable;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:45+0200")
public class PicketLinkLogger_$logger extends DelegatingBasicLogger implements PicketLinkLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = PicketLinkLogger_$logger.class.getName();
    public PicketLinkLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void activatingSubsystem(final String arg0) {
        super.log.logf(FQCN, INFO, null, activatingSubsystem$str(), arg0);
    }
    protected String activatingSubsystem$str() {
        return "WFLYPL0001: Activating PicketLink %s Subsystem";
    }
    @Override
    public final void boundToJndi(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, boundToJndi$str(), arg0, arg1);
    }
    protected String boundToJndi$str() {
        return "WFLYPL0003: Bound [%s] to [%s]";
    }
    protected String moduleCouldNotLoad$str() {
        return "WFLYPL0007: Could not load module [%s].";
    }
    @Override
    public final RuntimeException moduleCouldNotLoad(final String arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), moduleCouldNotLoad$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String couldNotLoadClass$str() {
        return "WFLYPL0009: Could not load class [%s].";
    }
    @Override
    public final RuntimeException couldNotLoadClass(final String arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotLoadClass$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String typeNotProvided$str() {
        return "WFLYPL0010: No type provided for %s. You must specify a class-name or code.";
    }
    @Override
    public final OperationFailedException typeNotProvided(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), typeNotProvided$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attributeNoLongerSupported$str() {
        return "WFLYPL0012: Attribute [%s] is not longer supported.";
    }
    @Override
    public final OperationFailedException attributeNoLongerSupported(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), attributeNoLongerSupported$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidChildTypeOccurrence$str() {
        return "WFLYPL0013: [%s] can only have [%d] child of type [%s].";
    }
    @Override
    public final OperationFailedException invalidChildTypeOccurrence(final String arg0, final int arg1, final String arg2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidChildTypeOccurrence$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidAlternativeAttributeOccurrence$str() {
        return "WFLYPL0014: Invalid attribute [%s] definition for [%s]. Only one of the following attributes are allowed: [%s].";
    }
    @Override
    public final OperationFailedException invalidAlternativeAttributeOccurrence(final String arg0, final String arg1, final String arg2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidAlternativeAttributeOccurrence$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredAttribute$str() {
        return "WFLYPL0015: Required attribute [%s] for [%s].";
    }
    @Override
    public final OperationFailedException requiredAttribute(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), requiredAttribute$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredAlternativeAttributes$str() {
        return "WFLYPL0016: [%s] requires one of the given attributes [%s].";
    }
    @Override
    public final OperationFailedException requiredAlternativeAttributes(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), requiredAlternativeAttributes$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String typeAlreadyDefined$str() {
        return "WFLYPL0017: Type [%s] already defined.";
    }
    @Override
    public final IllegalStateException typeAlreadyDefined(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), typeAlreadyDefined$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String emptyResource$str() {
        return "WFLYPL0018: [%s] can not be empty.";
    }
    @Override
    public final OperationFailedException emptyResource(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), emptyResource$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredChild$str() {
        return "WFLYPL0019: [%s] requires child [%s].";
    }
    @Override
    public final OperationFailedException requiredChild(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), requiredChild$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String idmNoIdentityConfigurationProvided$str() {
        return "WFLYPL0054: You must provide at least one identity configuration.";
    }
    @Override
    public final OperationFailedException idmNoIdentityConfigurationProvided() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), idmNoIdentityConfigurationProvided$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String idmNoIdentityStoreProvided$str() {
        return "WFLYPL0055: You must provide at least one identity store for identity configuration [%s].";
    }
    @Override
    public final OperationFailedException idmNoIdentityStoreProvided(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), idmNoIdentityStoreProvided$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String idmNoSupportedTypesDefined$str() {
        return "WFLYPL0056: No supported type provided.";
    }
    @Override
    public final OperationFailedException idmNoSupportedTypesDefined() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), idmNoSupportedTypesDefined$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String idmLdapNoMappingDefined$str() {
        return "WFLYPL0057: No mapping was defined.";
    }
    @Override
    public final OperationFailedException idmLdapNoMappingDefined() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), idmLdapNoMappingDefined$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String federationHandlerTypeNotProvided$str() {
        return "WFLYPL0101: No type provided for the handler. You must specify a class-name or code.";
    }
    @Override
    public final OperationFailedException federationHandlerTypeNotProvided() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), federationHandlerTypeNotProvided$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYPL0105: The migrate operation can not be performed: the server must be in admin-only mode";
    }
    @Override
    public final OperationFailedException migrateOperationAllowedOnlyInAdminOnly() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), migrateOperationAllowedOnlyInAdminOnly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String migrationFailed$str() {
        return "WFLYPL0106: Migration failed, see results for more details.";
    }
    @Override
    public final String migrationFailed() {
        return String.format(getLoggingLocale(), migrationFailed$str());
    }
    protected String cannotMigrateNonEmptyConfiguration$str() {
        return "WFLYPL0107: Cannot migrate non-empty picketlink-federation subsystem configuration.";
    }
    @Override
    public final OperationFailedException cannotMigrateNonEmptyConfiguration() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotMigrateNonEmptyConfiguration$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
