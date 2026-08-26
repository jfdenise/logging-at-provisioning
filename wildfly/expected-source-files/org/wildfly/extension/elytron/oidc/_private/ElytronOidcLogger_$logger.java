package org.wildfly.extension.elytron.oidc._private;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.RuntimeException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:42+0200")
public class ElytronOidcLogger_$logger extends DelegatingBasicLogger implements ElytronOidcLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ElytronOidcLogger_$logger.class.getName();
    public ElytronOidcLogger_$logger(final Logger log) {
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
        return "WFLYOIDC0001: Activating WildFly Elytron OIDC Subsystem";
    }
    @Override
    public final void deploymentSecured(final String deploymentName) {
        super.log.logf(FQCN, INFO, null, deploymentSecured$str(), deploymentName);
    }
    protected String deploymentSecured$str() {
        return "WFLYOIDC0002: Elytron OIDC Client subsystem override for deployment '%s'";
    }
    protected String cannotRemoveCredential$str() {
        return "WFLYOIDC0003: Cannot remove credential. No credential defined for deployment '%s'";
    }
    @Override
    public final RuntimeException cannotRemoveCredential(final String deploymentName) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotRemoveCredential$str(), deploymentName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String cannotUpdateCredential$str() {
        return "WFLYOIDC0004: Cannot update credential. No credential defined for deployment '%s'";
    }
    @Override
    public final RuntimeException cannotUpdateCredential(final String deploymentName) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotUpdateCredential$str(), deploymentName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveRedirectRuntimeRule$str() {
        return "WFLYOIDC0005: Cannot remove redirect rewrite rule. No redirect rewrite defined for deployment '%s'";
    }
    @Override
    public final RuntimeException cannotRemoveRedirectRuntimeRule(final String deploymentName) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotRemoveRedirectRuntimeRule$str(), deploymentName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotUpdateRedirectRuntimeRule$str() {
        return "WFLYOIDC0006: Cannot update redirect rewrite. No redirect rewrite defined for deployment '%s'";
    }
    @Override
    public final RuntimeException cannotUpdateRedirectRuntimeRule(final String deploymentName) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotUpdateRedirectRuntimeRule$str(), deploymentName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String resourceOrClientIdMustBeConfigured$str() {
        return "WFLYOIDC0007: Must set 'resource' or 'client-id'";
    }
    @Override
    public final OperationFailedException resourceOrClientIdMustBeConfigured() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), resourceOrClientIdMustBeConfigured$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void disableTrustManagerSetToTrue() {
        super.log.logf(FQCN, WARN, null, disableTrustManagerSetToTrue$str());
    }
    protected String disableTrustManagerSetToTrue$str() {
        return "WFLYOIDC0008: The 'disable-trust-manager' attribute has been set to 'true' so no trust manager will be used when communicating with the OpenID provider over HTTPS. This value should always be set to 'false' in a production environment.";
    }
    protected String unsupportedAttribute$str() {
        return "WFLYOIDC0009: Oidc attribute '%s' is not supported with the current stability level.";
    }
    @Override
    public final DeploymentUnitProcessingException unsupportedAttribute(final String attributeName) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), unsupportedAttribute$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
