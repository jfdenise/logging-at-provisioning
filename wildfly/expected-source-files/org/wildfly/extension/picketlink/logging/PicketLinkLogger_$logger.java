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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-22T10:38:59+0200")
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
    public final void activatingSubsystem(final String name) {
        super.log.logf(FQCN, INFO, null, activatingSubsystem$str(), name);
    }
    protected String activatingSubsystem$str() {
        return "WFLYPL0001: Activating PicketLink %s Subsystem";
    }
    @Override
    public final void boundToJndi(final String alias, final String jndiName) {
        super.log.logf(FQCN, INFO, null, boundToJndi$str(), alias, jndiName);
    }
    protected String boundToJndi$str() {
        return "WFLYPL0003: Bound [%s] to [%s]";
    }
    protected String moduleCouldNotLoad$str() {
        return "WFLYPL0007: Could not load module [%s].";
    }
    @Override
    public final RuntimeException moduleCouldNotLoad(final String s, final Throwable t) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), moduleCouldNotLoad$str(), s), t);
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
    public final RuntimeException couldNotLoadClass(final String mappingClass, final Throwable e) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotLoadClass$str(), mappingClass), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String typeNotProvided$str() {
        return "WFLYPL0010: No type provided for %s. You must specify a class-name or code.";
    }
    @Override
    public final OperationFailedException typeNotProvided(final String elementName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), typeNotProvided$str(), elementName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attributeNoLongerSupported$str() {
        return "WFLYPL0012: Attribute [%s] is not longer supported.";
    }
    @Override
    public final OperationFailedException attributeNoLongerSupported(final String attributeName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), attributeNoLongerSupported$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidChildTypeOccurrence$str() {
        return "WFLYPL0013: [%s] can only have [%d] child of type [%s].";
    }
    @Override
    public final OperationFailedException invalidChildTypeOccurrence(final String parentPathElement, final int maxOccurs, final String elementName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidChildTypeOccurrence$str(), parentPathElement, maxOccurs, elementName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidAlternativeAttributeOccurrence$str() {
        return "WFLYPL0014: Invalid attribute [%s] definition for [%s]. Only one of the following attributes are allowed: [%s].";
    }
    @Override
    public final OperationFailedException invalidAlternativeAttributeOccurrence(final String attributeName, final String pathElement, final String attributeNames) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidAlternativeAttributeOccurrence$str(), attributeName, pathElement, attributeNames));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredAttribute$str() {
        return "WFLYPL0015: Required attribute [%s] for [%s].";
    }
    @Override
    public final OperationFailedException requiredAttribute(final String attributeName, final String configuration) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), requiredAttribute$str(), attributeName, configuration));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredAlternativeAttributes$str() {
        return "WFLYPL0016: [%s] requires one of the given attributes [%s].";
    }
    @Override
    public final OperationFailedException requiredAlternativeAttributes(final String pathElement, final String attributeNames) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), requiredAlternativeAttributes$str(), pathElement, attributeNames));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String typeAlreadyDefined$str() {
        return "WFLYPL0017: Type [%s] already defined.";
    }
    @Override
    public final IllegalStateException typeAlreadyDefined(final String clazz) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), typeAlreadyDefined$str(), clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String emptyResource$str() {
        return "WFLYPL0018: [%s] can not be empty.";
    }
    @Override
    public final OperationFailedException emptyResource(final String parentPathElement) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), emptyResource$str(), parentPathElement));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredChild$str() {
        return "WFLYPL0019: [%s] requires child [%s].";
    }
    @Override
    public final OperationFailedException requiredChild(final String parentPathElement, final String childPathElement) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), requiredChild$str(), parentPathElement, childPathElement));
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
    public final OperationFailedException idmNoIdentityStoreProvided(final String identityConfiguration) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), idmNoIdentityStoreProvided$str(), identityConfiguration));
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
