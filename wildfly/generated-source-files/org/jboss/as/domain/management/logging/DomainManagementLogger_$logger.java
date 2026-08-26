package org.jboss.as.domain.management.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.RuntimeException;
import org.jboss.as.controller.PathElement;
import org.jboss.logging.BasicLogger;
import org.jboss.msc.service.StartException;
import javax.naming.NamingException;
import java.lang.IllegalArgumentException;
import javax.annotation.processing.Generated;
import java.security.GeneralSecurityException;
import org.jboss.as.controller.OperationFailedException;
import java.io.IOException;
import java.lang.Exception;
import org.jboss.as.domain.management.security.password.PasswordValidationException;
import javax.xml.stream.XMLStreamException;
import org.jboss.as.controller.PathAddress;
import java.lang.Throwable;
import javax.security.auth.login.LoginException;
import java.util.Collection;
import java.util.Arrays;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:14+0200")
public class DomainManagementLogger_$logger extends DelegatingBasicLogger implements DomainManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = DomainManagementLogger_$logger.class.getName();
    public DomainManagementLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void userAndPasswordWarning() {
        super.log.logf(FQCN, WARN, null, userAndPasswordWarning$str());
    }
    protected String userAndPasswordWarning$str() {
        return "WFLYDM0001: Properties file defined with default user and password, this will be easy to guess.";
    }
    protected String unableToLoadProperties$str() {
        return "WFLYDM0017: Unable to load properties";
    }
    @Override
    public final StartException unableToLoadProperties(final Throwable arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unableToLoadProperties$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String userNotFoundInDirectory$str() {
        return "WFLYDM0020: User '%s' not found in directory.";
    }
    @Override
    public final NamingException userNotFoundInDirectory(final String arg0) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), userNotFoundInDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noConsoleAvailable$str() {
        return "WFLYDM0021: No java.io.Console available to interact with user.";
    }
    @Override
    public final IllegalStateException noConsoleAvailable() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noConsoleAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String propertiesFileNotFound$str() {
        return "WFLYDM0023: No %s files found.";
    }
    @Override
    public final String propertiesFileNotFound(final String arg0) {
        return String.format(getLoggingLocale(), propertiesFileNotFound$str(), arg0);
    }
    protected String enterNewUserDetails$str() {
        return "Enter the details of the new user to add.";
    }
    @Override
    public final String enterNewUserDetails() {
        return String.format(getLoggingLocale(), enterNewUserDetails$str());
    }
    protected String realmPrompt$str() {
        return "Realm (%s)";
    }
    @Override
    public final String realmPrompt(final String arg0) {
        return String.format(getLoggingLocale(), realmPrompt$str(), arg0);
    }
    protected String usernamePrompt0$str() {
        return "Username";
    }
    @Override
    public final String usernamePrompt() {
        return String.format(getLoggingLocale(), usernamePrompt0$str());
    }
    protected String usernamePrompt1$str() {
        return "Username (%s)";
    }
    @Override
    public final String usernamePrompt(final String arg0) {
        return String.format(getLoggingLocale(), usernamePrompt1$str(), arg0);
    }
    protected String noUsernameExiting$str() {
        return "WFLYDM0024: No Username entered, exiting.";
    }
    @Override
    public final String noUsernameExiting() {
        return String.format(getLoggingLocale(), noUsernameExiting$str());
    }
    protected String passwordPrompt$str() {
        return "Password";
    }
    @Override
    public final String passwordPrompt() {
        return String.format(getLoggingLocale(), passwordPrompt$str());
    }
    protected String noPasswordExiting$str() {
        return "WFLYDM0025: No Password entered, exiting.";
    }
    @Override
    public final String noPasswordExiting() {
        return String.format(getLoggingLocale(), noPasswordExiting$str());
    }
    protected String passwordConfirmationPrompt$str() {
        return "Re-enter Password";
    }
    @Override
    public final String passwordConfirmationPrompt() {
        return String.format(getLoggingLocale(), passwordConfirmationPrompt$str());
    }
    protected String passwordMisMatch$str() {
        return "WFLYDM0026: The passwords do not match.";
    }
    @Override
    public final String passwordMisMatch() {
        return String.format(getLoggingLocale(), passwordMisMatch$str());
    }
    protected String usernameNotAlphaNumeric$str() {
        return "WFLYDM0028: Username must be alphanumeric with the exception of the following accepted symbols (%s)";
    }
    @Override
    public final String usernameNotAlphaNumeric(final String arg0) {
        return String.format(getLoggingLocale(), usernameNotAlphaNumeric$str(), arg0);
    }
    protected String aboutToAddUser$str() {
        return "About to add user '%s' for realm '%s'";
    }
    @Override
    public final String aboutToAddUser(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), aboutToAddUser$str(), arg0, arg1);
    }
    protected String isCorrectPrompt$str() {
        return "Is this correct";
    }
    @Override
    public final String isCorrectPrompt() {
        return String.format(getLoggingLocale(), isCorrectPrompt$str());
    }
    protected String usernameEasyToGuess$str() {
        return "The username '%s' is easy to guess";
    }
    @Override
    public final String usernameEasyToGuess(final String arg0) {
        return String.format(getLoggingLocale(), usernameEasyToGuess$str(), arg0);
    }
    protected String sureToAddUser$str() {
        return "Are you sure you want to add user '%s' yes/no?";
    }
    @Override
    public final String sureToAddUser(final String arg0) {
        return String.format(getLoggingLocale(), sureToAddUser$str(), arg0);
    }
    protected String invalidConfirmationResponse$str() {
        return "WFLYDM0029: Invalid response. (Valid responses are %s and %s)";
    }
    @Override
    public final String invalidConfirmationResponse(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), invalidConfirmationResponse$str(), arg0, arg1);
    }
    protected String addedUser$str() {
        return "Added user '%s' to file '%s'";
    }
    @Override
    public final String addedUser(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), addedUser$str(), arg0, arg1);
    }
    protected String unableToAddUser$str() {
        return "WFLYDM0030: Unable to add user to %s due to error %s";
    }
    @Override
    public final String unableToAddUser(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), unableToAddUser$str(), arg0, arg1);
    }
    protected String unableToLoadUsers$str() {
        return "WFLYDM0031: Unable to add load users from %s due to error %s";
    }
    @Override
    public final String unableToLoadUsers(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), unableToLoadUsers$str(), arg0, arg1);
    }
    protected String errorHeader$str() {
        return "Error";
    }
    @Override
    public final String errorHeader() {
        return String.format(getLoggingLocale(), errorHeader$str());
    }
    protected String yesNo$str() {
        return "yes/no?";
    }
    @Override
    public final String yesNo() {
        return String.format(getLoggingLocale(), yesNo$str());
    }
    protected String multipleAuthenticationMechanismsDefined$str() {
        return "WFLYDM0033: Configuration for security realm '%s' includes multiple username/password based authentication mechanisms (%s). Only one is allowed";
    }
    @Override
    public final OperationFailedException multipleAuthenticationMechanismsDefined(final String arg0, final Set<String> arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), multipleAuthenticationMechanismsDefined$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationFailedOneOfRequired$str() {
        return "WFLYDM0034: One of '%s' or '%s' required.";
    }
    @Override
    public final OperationFailedException operationFailedOneOfRequired(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), operationFailedOneOfRequired$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationFailedOnlyOneOfRequired$str() {
        return "WFLYDM0035: Only one of '%s' or '%s' is required.";
    }
    @Override
    public final OperationFailedException operationFailedOnlyOneOfRequired(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), operationFailedOnlyOneOfRequired$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSecurityContextEstablished$str() {
        return "WFLYDM0037: No security context has been established.";
    }
    @Override
    public final String noSecurityContextEstablished() {
        return String.format(getLoggingLocale(), noSecurityContextEstablished$str());
    }
    protected String filePrompt$str() {
        return "What type of user do you wish to add? %n a) Management User (mgmt-users.properties) %n b) Application User (application-users.properties)";
    }
    @Override
    public final String filePrompt() {
        return String.format(getLoggingLocale(), filePrompt$str());
    }
    protected String groupsPrompt$str() {
        return "What groups do you want this user to belong to? (Please enter a comma separated list, or leave blank for none)";
    }
    @Override
    public final String groupsPrompt() {
        return String.format(getLoggingLocale(), groupsPrompt$str());
    }
    protected String addedGroups$str() {
        return "Added user '%s' with groups %s to file '%s'";
    }
    @Override
    public final String addedGroups(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), addedGroups$str(), arg0, arg1, arg2);
    }
    protected String invalidChoiceResponse$str() {
        return "WFLYDM0039: Invalid response. (Valid responses are A, a, B, or b)";
    }
    @Override
    public final String invalidChoiceResponse() {
        return String.format(getLoggingLocale(), invalidChoiceResponse$str());
    }
    protected String aboutToUpdateEnabledUser$str() {
        return "User '%s' already exists and is enabled, would you like to... %n a) Update the existing user password and roles %n b) Disable the existing user %n c) Type a new username";
    }
    @Override
    public final String aboutToUpdateEnabledUser(final String arg0) {
        return String.format(getLoggingLocale(), aboutToUpdateEnabledUser$str(), arg0);
    }
    protected String aboutToUpdateDisabledUser$str() {
        return "User '%s' already exists and is disabled, would you like to... %n a) Update the existing user password and roles %n b) Enable the existing user %n c) Type a new username";
    }
    @Override
    public final String aboutToUpdateDisabledUser(final String arg0) {
        return String.format(getLoggingLocale(), aboutToUpdateDisabledUser$str(), arg0);
    }
    protected String updateUser$str() {
        return "Updated user '%s' to file '%s'";
    }
    @Override
    public final String updateUser(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), updateUser$str(), arg0, arg1);
    }
    protected String unableToUpdateUser$str() {
        return "WFLYDM0040: Unable to update user to %s due to error %s";
    }
    @Override
    public final String unableToUpdateUser(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), unableToUpdateUser$str(), arg0, arg1);
    }
    protected String updatedGroups$str() {
        return "Updated user '%s' with groups %s to file '%s'";
    }
    @Override
    public final String updatedGroups(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), updatedGroups$str(), arg0, arg1, arg2);
    }
    protected String invalidLocalUser$str() {
        return "WFLYDM0041: The user '%s' is not allowed in a local authentication.";
    }
    @Override
    public final IOException invalidLocalUser(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidLocalUser$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleCallbackHandlerForMechanism$str() {
        return "WFLYDM0042: Multiple CallbackHandlerServices for the same mechanism (%s)";
    }
    @Override
    public final StartException multipleCallbackHandlerForMechanism(final String arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), multipleCallbackHandlerForMechanism$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noCallbackHandlerForMechanism$str() {
        return "WFLYDM0043: No CallbackHandler available for mechanism %s in realm %s";
    }
    @Override
    public final IllegalStateException noCallbackHandlerForMechanism(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noCallbackHandlerForMechanism$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noPlugInProvidersLoaded$str() {
        return "WFLYDM0044: No plug in providers found for module name %s";
    }
    @Override
    public final IllegalArgumentException noPlugInProvidersLoaded(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noPlugInProvidersLoaded$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadPlugInProviders$str() {
        return "WFLYDM0045: Unable to load plug-in for module %s due to error (%s)";
    }
    @Override
    public final IllegalArgumentException unableToLoadPlugInProviders(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unableToLoadPlugInProviders$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noAuthenticationPlugInFound$str() {
        return "WFLYDM0046: No authentication plug-in found for name %s";
    }
    @Override
    public final IllegalArgumentException noAuthenticationPlugInFound(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noAuthenticationPlugInFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToInitialisePlugIn$str() {
        return "WFLYDM0047: Unable to initialise plug-in %s due to error %s";
    }
    @Override
    public final IllegalStateException unableToInitialisePlugIn(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToInitialisePlugIn$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passwordNotStrongEnough$str() {
        return "WFLYDM0048: Password is not strong enough, it is '%s'. It should be at least '%s'.";
    }
    @Override
    public final String passwordNotStrongEnough(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), passwordNotStrongEnough$str(), arg0, arg1);
    }
    protected String passwordMustNotBeEqual$str() {
        return "WFLYDM0049: Password must not be equal to '%s', this value is restricted.";
    }
    @Override
    public final PasswordValidationException passwordMustNotBeEqual(final String arg0) {
        final PasswordValidationException result = new PasswordValidationException(String.format(getLoggingLocale(), passwordMustNotBeEqual$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passwordMustHaveDigit$str() {
        return "WFLYDM0050: Password must have at least %d digit.";
    }
    @Override
    public final String passwordMustHaveDigit(final int arg0) {
        return String.format(getLoggingLocale(), passwordMustHaveDigit$str(), arg0);
    }
    protected String passwordMustHaveSymbol$str() {
        return "WFLYDM0051: Password must have at least %s non-alphanumeric symbol.";
    }
    @Override
    public final String passwordMustHaveSymbol(final int arg0) {
        return String.format(getLoggingLocale(), passwordMustHaveSymbol$str(), arg0);
    }
    protected String passwordMustHaveAlpha$str() {
        return "WFLYDM0052: Password must have at least %d alphanumeric character.";
    }
    @Override
    public final String passwordMustHaveAlpha(final int arg0) {
        return String.format(getLoggingLocale(), passwordMustHaveAlpha$str(), arg0);
    }
    protected String passwordNotLongEnough$str() {
        return "WFLYDM0053: Password must have at least %s characters!";
    }
    @Override
    public final PasswordValidationException passwordNotLongEnough(final int arg0) {
        final PasswordValidationException result = new PasswordValidationException(String.format(getLoggingLocale(), passwordNotLongEnough$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadKeyTrustFile$str() {
        return "WFLYDM0054: Unable to load key trust file.";
    }
    @Override
    public final IllegalStateException unableToLoadKeyTrustFile(final Throwable arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToLoadKeyTrustFile$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToOperateOnTrustStore$str() {
        return "WFLYDM0055: Unable to operate on trust store.";
    }
    @Override
    public final IllegalStateException unableToOperateOnTrustStore(final GeneralSecurityException arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToOperateOnTrustStore$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToCreateDelegateTrustManager$str() {
        return "WFLYDM0056: Unable to create delegate trust manager.";
    }
    @Override
    public final IllegalStateException unableToCreateDelegateTrustManager() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToCreateDelegateTrustManager$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String onlyOneSyslogHandlerProtocol$str() {
        return "WFLYDM0057: The syslog-handler can only contain one protocol %s";
    }
    @Override
    public final XMLStreamException onlyOneSyslogHandlerProtocol(final Location arg0) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), onlyOneSyslogHandlerProtocol$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noHandlerCalled$str() {
        return "WFLYDM0058: There is no handler called '%s'";
    }
    @Override
    public final IllegalStateException noHandlerCalled(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noHandlerCalled$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String sysLogProtocolAlreadyConfigured$str() {
        return "WFLYDM0059: There is already a protocol configured for the syslog handler at %s";
    }
    @Override
    public final OperationFailedException sysLogProtocolAlreadyConfigured(final PathAddress arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), sysLogProtocolAlreadyConfigured$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSyslogProtocol$str() {
        return "WFLYDM0060: No syslog protocol was given";
    }
    @Override
    public final OperationFailedException noSyslogProtocol() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSyslogProtocol$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noFormatterCalled$str() {
        return "WFLYDM0061: There is no formatter called '%s'";
    }
    @Override
    public final OperationFailedException noFormatterCalled(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noFormatterCalled$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveReferencedFormatter$str() {
        return "WFLYDM0062: Can not remove formatter, it is still referenced by the handler '%s'";
    }
    @Override
    public final OperationFailedException cannotRemoveReferencedFormatter(final PathElement arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemoveReferencedFormatter$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String handlerAlreadyExists$str() {
        return "WFLYDM0063: Handler names must be unique. There is already a handler called '%s' at %s";
    }
    @Override
    public final OperationFailedException handlerAlreadyExists(final String arg0, final PathAddress arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), handlerAlreadyExists$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleRealmsDetected$str() {
        return "WFLYDM0064: Different realm names detected '%s', '%s' reading user property files, all realms must be equal.";
    }
    @Override
    public final String multipleRealmsDetected(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), multipleRealmsDetected$str(), arg0, arg1);
    }
    protected String userRealmNotMatchDiscovered$str() {
        return "WFLYDM0065: The user supplied realm name '%s' does not match the realm name discovered from the property file(s) '%s'.";
    }
    @Override
    public final String userRealmNotMatchDiscovered(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), userRealmNotMatchDiscovered$str(), arg0, arg1);
    }
    protected String groupPropertiesButNoUserProperties$str() {
        return "WFLYDM0066: A group properties file '%s' has been specified, however no user properties has been specified.";
    }
    @Override
    public final String groupPropertiesButNoUserProperties(final String arg0) {
        return String.format(getLoggingLocale(), groupPropertiesButNoUserProperties$str(), arg0);
    }
    protected String realmMustBeSpecified$str() {
        return "WFLYDM0067: A realm name must be specified.";
    }
    @Override
    public final String realmMustBeSpecified() {
        return String.format(getLoggingLocale(), realmMustBeSpecified$str());
    }
    protected String inconsistentRbacConfiguration$str() {
        return "WFLYDM0068: The current operation(s) would result in role based access control being enabled but leave it impossible for authenticated users to be assigned roles.";
    }
    @Override
    public final OperationFailedException inconsistentRbacConfiguration() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), inconsistentRbacConfiguration$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String inconsistentRbacRuntimeState$str() {
        return "WFLYDM0069: The runtime role mapping configuration is inconsistent, the server must be restarted.";
    }
    @Override
    public final OperationFailedException inconsistentRbacRuntimeState() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), inconsistentRbacRuntimeState$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidChoiceUpdateUserResponse$str() {
        return "WFLYDM0070: Invalid response. (Valid responses are A, a, B, b, C or c)";
    }
    @Override
    public final String invalidChoiceUpdateUserResponse() {
        return String.format(getLoggingLocale(), invalidChoiceUpdateUserResponse$str());
    }
    protected String duplicateIncludeExclude$str() {
        return "WFLYDM0071: Role '%s' already contains an %s for type=%s, name=%s, realm=%s.";
    }
    @Override
    public final OperationFailedException duplicateIncludeExclude(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), duplicateIncludeExclude$str(), arg0, arg1, arg2, arg3, arg4));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleAuthorizationConfigurationsDefined$str() {
        return "WFLYDM0072: Configuration for security realm '%s' includes multiple authorization configurations (%s). Only one is allowed";
    }
    @Override
    public final OperationFailedException multipleAuthorizationConfigurationsDefined(final String arg0, final Set<String> arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), multipleAuthorizationConfigurationsDefined$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleUsernameToDnConfigurationsDefined$str() {
        return "WFLYDM0073: Configuration for security realm '%s' includes multiple username-to-dn resources within the authorization=ldap resource (%s). Only one is allowed";
    }
    @Override
    public final OperationFailedException multipleUsernameToDnConfigurationsDefined(final String arg0, final Set<String> arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), multipleUsernameToDnConfigurationsDefined$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noGroupSearchDefined$str() {
        return "WFLYDM0074: Configuration for security realm '%s' does not contain any group-search resource within the authorization=ldap resource.";
    }
    @Override
    public final OperationFailedException noGroupSearchDefined(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noGroupSearchDefined$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleGroupSearchConfigurationsDefined$str() {
        return "WFLYDM0075: Configuration for security realm '%s' includes multiple group-search resources within the authorization=ldap resource (%s). Only one is allowed";
    }
    @Override
    public final OperationFailedException multipleGroupSearchConfigurationsDefined(final String arg0, final Set<String> arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), multipleGroupSearchConfigurationsDefined$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidRoleName$str() {
        return "WFLYDM0076: The role name '%s' is not a valid standard role.";
    }
    @Override
    public final OperationFailedException invalidRoleName(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidRoleName$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidRoleNameDomain$str() {
        return "WFLYDM0077: The role name '%s' is not a valid standard role and is not a host scoped role or a server group scoped role.";
    }
    @Override
    public final OperationFailedException invalidRoleNameDomain(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidRoleNameDomain$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String roleMappingRemaining$str() {
        return "WFLYDM0078: The scoped role '%s' can not be removed as a role mapping still exists.";
    }
    @Override
    public final OperationFailedException roleMappingRemaining(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), roleMappingRemaining$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateScopedRole$str() {
        return "WFLYDM0079: A %s already exists with name '%s'";
    }
    @Override
    public final OperationFailedException duplicateScopedRole(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), duplicateScopedRole$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String scopedRoleStandardName$str() {
        return "WFLYDM0080: The name '%s' conflicts with the standard role name of '%s' - comparison is case insensitive.";
    }
    @Override
    public final OperationFailedException scopedRoleStandardName(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), scopedRoleStandardName$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badBaseRole$str() {
        return "WFLYDM0081: The base-role '%s' is not one of the standard roles for the current authorization provider.";
    }
    @Override
    public final OperationFailedException badBaseRole(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), badBaseRole$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passwordUsernameMatchError$str() {
        return "WFLYDM0082: The password must be different from the username";
    }
    @Override
    public final PasswordValidationException passwordUsernameMatchError() {
        final PasswordValidationException result = new PasswordValidationException(String.format(getLoggingLocale(), passwordUsernameMatchError$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noKey$str() {
        return "WFLYDM0083: The KeyStore %s does not contain any keys.";
    }
    @Override
    public final StartException noKey(final String arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), noKey$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String aliasNotKey$str() {
        return "WFLYDM0084: The alias specified '%s' is not a Key, valid aliases are %s";
    }
    @Override
    public final StartException aliasNotKey(final String arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), aliasNotKey$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String aliasNotFound$str() {
        return "WFLYDM0085: The alias specified '%s' does not exist in the KeyStore, valid aliases are %s";
    }
    @Override
    public final StartException aliasNotFound(final String arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), aliasNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyStoreNotFound$str() {
        return "WFLYDM0086: The KeyStore can not be found at %s";
    }
    @Override
    public final StartException keyStoreNotFound(final String arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), keyStoreNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleCacheConfigurationsDefined$str() {
        return "WFLYDM0087: Configuration for security realm '%s' includes multiple cache definitions at the same position in the hierarchy. Only one is allowed";
    }
    @Override
    public final OperationFailedException multipleCacheConfigurationsDefined(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), multipleCacheConfigurationsDefined$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String usernameNotLoaded$str() {
        return "WFLYDM0088: Unable to load username for supplied username '%s'";
    }
    @Override
    public final NamingException usernameNotLoaded(final String arg0) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), usernameNotLoaded$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noNonProgressingOperationFound$str() {
        return "WFLYDM0089: No operation was found that has been holding the operation execution write lock for long than [%d] seconds";
    }
    @Override
    public final OperationFailedException noNonProgressingOperationFound(final long arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noNonProgressingOperationFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidKeytab$str() {
        return "WFLYDM0090: Invalid Keytab path";
    }
    @Override
    public final StartException invalidKeytab(final Exception arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), invalidKeytab$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String subjectIdentityLoggedOut$str() {
        return "WFLYDM0091: logout has already been called on this SubjectIdentity.";
    }
    @Override
    public final IllegalStateException subjectIdentityLoggedOut() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), subjectIdentityLoggedOut$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToObtainTGT$str() {
        return "WFLYDM0092: Unable to obtain Kerberos TGT";
    }
    @Override
    public final OperationFailedException unableToObtainTGT(final Exception arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToObtainTGT$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void keytabLoginFailed(final String arg0, final String arg1, final LoginException arg2) {
        super.log.logf(FQCN, ERROR, arg2, keytabLoginFailed$str(), arg0, arg1);
    }
    protected String keytabLoginFailed$str() {
        return "WFLYDM0093: Login failed using Keytab for principal '%s' to handle request for host '%s'";
    }
    protected String kerberosWithoutKeytab$str() {
        return "WFLYDM0094: Kerberos is enabled for authentication on security realm '%s' but no Keytab has been added to the server-identity.";
    }
    @Override
    public final OperationFailedException kerberosWithoutKeytab(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), kerberosWithoutKeytab$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noCipherSuitesInCommon$str() {
        return "WFLYDM0095: No cipher suites in common, supported=(%s), requested=(%s)";
    }
    @Override
    public final StartException noCipherSuitesInCommon(final String arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), noCipherSuitesInCommon$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noProtocolsInCommon$str() {
        return "WFLYDM0096: No protocols in common, supported=(%s), requested=(%s)";
    }
    @Override
    public final StartException noProtocolsInCommon(final String arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), noProtocolsInCommon$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passwordShouldNotBeEqual$str() {
        return "WFLYDM0097: Password should not be equal to '%s', this value is restricted.";
    }
    @Override
    public final PasswordValidationException passwordShouldNotBeEqual(final String arg0) {
        final PasswordValidationException result = new PasswordValidationException(String.format(getLoggingLocale(), passwordShouldNotBeEqual$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passwordUsernameShouldNotMatch$str() {
        return "WFLYDM0098: The password should be different from the username";
    }
    @Override
    public final PasswordValidationException passwordUsernameShouldNotMatch() {
        final PasswordValidationException result = new PasswordValidationException(String.format(getLoggingLocale(), passwordUsernameShouldNotMatch$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passwordShouldHaveXCharacters$str() {
        return "WFLYDM0099: Password should have at least %s characters!";
    }
    @Override
    public final PasswordValidationException passwordShouldHaveXCharacters(final int arg0) {
        final PasswordValidationException result = new PasswordValidationException(String.format(getLoggingLocale(), passwordShouldHaveXCharacters$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passwordShouldHaveAlpha$str() {
        return "WFLYDM0100: Password should have at least %d alphanumeric character.";
    }
    @Override
    public final String passwordShouldHaveAlpha(final int arg0) {
        return String.format(getLoggingLocale(), passwordShouldHaveAlpha$str(), arg0);
    }
    protected String passwordShouldHaveDigit$str() {
        return "WFLYDM0101: Password should have at least %d digit.";
    }
    @Override
    public final String passwordShouldHaveDigit(final int arg0) {
        return String.format(getLoggingLocale(), passwordShouldHaveDigit$str(), arg0);
    }
    protected String passwordShouldHaveSymbol$str() {
        return "WFLYDM0102: Password should have at least %s non-alphanumeric symbol.";
    }
    @Override
    public final String passwordShouldHaveSymbol(final int arg0) {
        return String.format(getLoggingLocale(), passwordShouldHaveSymbol$str(), arg0);
    }
    protected String invalidSize$str() {
        return "WFLYDM0103: Invalid size %s";
    }
    @Override
    public final OperationFailedException invalidSize(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidSize$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String suffixContainsMillis$str() {
        return "WFLYDM0104: The suffix (%s) can not contain seconds or milliseconds.";
    }
    @Override
    public final OperationFailedException suffixContainsMillis(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), suffixContainsMillis$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidSuffix$str() {
        return "WFLYDM0105: The suffix (%s) is invalid. A suffix must be a valid date format.";
    }
    @Override
    public final OperationFailedException invalidSuffix(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidSuffix$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String filePermissionsProblemsFound$str() {
        return "WFLYDM0106: File permissions problems found while attempting to update %s file.";
    }
    @Override
    public final String filePermissionsProblemsFound(final String arg0) {
        return String.format(getLoggingLocale(), filePermissionsProblemsFound$str(), arg0);
    }
    protected String domainRolloutNotProgressing$str() {
        return "WFLYDM0107: Operation '%s' has been holding the operation execution write lock for longer than [%d] seconds, but it is part of the rollout of a domain-wide operation with domain-uuid '%s' that has other operations that are alsonot progressing. Their ids are: %s. Cancellation of the operation on the domain controller is recommended.";
    }
    @Override
    public final OperationFailedException domainRolloutNotProgressing(final String arg0, final long arg1, final String arg2, final Collection arg3) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), domainRolloutNotProgressing$str(), arg0, arg1, arg2, arg3));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedResource$str() {
        return "WFLYDM0108: Unsupported resource '%s'";
    }
    @Override
    public final IllegalStateException unsupportedResource(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedResource$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyTabFileNotFound$str() {
        return "WFLYDM0109: The Keytab file '%s' does not exist.";
    }
    @Override
    public final StartException keyTabFileNotFound(final String arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), keyTabFileNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadSimpleNameForGroup$str() {
        return "WFLYDM0110: Unable to load a simple name for group '%s'";
    }
    @Override
    public final NamingException unableToLoadSimpleNameForGroup(final String arg0) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), unableToLoadSimpleNameForGroup$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void keystoreWillBeCreated(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, keystoreWillBeCreated$str(), arg0, arg1);
    }
    protected String keystoreWillBeCreated$str() {
        return "WFLYDM0111: Keystore %s not found, it will be auto-generated on first use with a self-signed certificate for host %s";
    }
    protected String failedToGenerateSelfSignedCertificate$str() {
        return "WFLYDM0112: Failed to generate self-signed certificate";
    }
    @Override
    public final RuntimeException failedToGenerateSelfSignedCertificate(final Exception arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToGenerateSelfSignedCertificate$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void keystoreHasBeenCreated(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, WARN, null, keystoreHasBeenCreated$str(), arg0, arg1, arg2);
    }
    protected String keystoreHasBeenCreated$str() {
        return "WFLYDM0113: Generated self-signed certificate at %s. Please note that self-signed certificates are not secure, and should only be used for testing purposes. Do not use this self-signed certificate in production.%nSHA-1 fingerprint of the generated key is %s%nSHA-256 fingerprint of the generated key is %s";
    }
    protected String failedToCreateLazyInitSSLContext$str() {
        return "WFLYDM0114: Failed to lazily initialize SSL context";
    }
    @Override
    public final RuntimeException failedToCreateLazyInitSSLContext(final Exception arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToCreateLazyInitSSLContext$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String removedBrokenResource$str() {
        return "WFLYDM0135: The resource %s wasn't working properly and has been removed.";
    }
    @Override
    public final String removedBrokenResource(final String arg0) {
        return String.format(getLoggingLocale(), removedBrokenResource$str(), arg0);
    }
    protected String noSubjectIdentityForProtocolAndHost$str() {
        return "WFLYDM0139: No SubjectIdentity found for %s/%s.";
    }
    @Override
    public final GeneralSecurityException noSubjectIdentityForProtocolAndHost(final String arg0, final String arg1) {
        final GeneralSecurityException result = new GeneralSecurityException(String.format(getLoggingLocale(), noSubjectIdentityForProtocolAndHost$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String usingDeprecatedSystemProperty$str() {
        return "WFLYDM0140: You shouldn't use the system property \"%s\" as it is deprecated. Use the management model configuration instead.";
    }
    @Override
    public final StartException usingDeprecatedSystemProperty(final String arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), usingDeprecatedSystemProperty$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacyMechanismsAreNotSupported$str() {
        return "WFLYDM0142: Following mechanisms configured on the server (%s) are not supported by the realm '%s'.";
    }
    @Override
    public final StartException legacyMechanismsAreNotSupported(final String arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), legacyMechanismsAreNotSupported$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidSensitiveClassificationAttribute$str() {
        return "WFLYDM0143: Invalid sensitive classification attribute '%s'";
    }
    @Override
    public final IllegalStateException invalidSensitiveClassificationAttribute(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidSensitiveClassificationAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String imcompatibleConfiguredRequiresAttributeValue$str() {
        return "WFLYDM0144: Sensitivity constraint %s contains imcompatible attribute value to other sensitive classification constraints.";
    }
    @Override
    public final OperationFailedException imcompatibleConfiguredRequiresAttributeValue(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), imcompatibleConfiguredRequiresAttributeValue$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String securityRealmsUnsupported$str() {
        return "WFLYDM0145: Security realms are no longer supported, please remove them from the configuration.";
    }
    @Override
    public final XMLStreamException securityRealmsUnsupported() {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), securityRealmsUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String outboundConnectionsUnsupported$str() {
        return "WFLYDM0146: Outbound connections are no longer supported, please remove them from the configuration.";
    }
    @Override
    public final XMLStreamException outboundConnectionsUnsupported() {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), outboundConnectionsUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passwordUsernameMustMatchInfo$str() {
        return "The password must be different from the username";
    }
    @Override
    public final String passwordUsernameMustMatchInfo() {
        return String.format(getLoggingLocale(), passwordUsernameMustMatchInfo$str());
    }
    protected String passwordUsernameShouldMatchInfo$str() {
        return "The password should be different from the username";
    }
    @Override
    public final String passwordUsernameShouldMatchInfo() {
        return String.format(getLoggingLocale(), passwordUsernameShouldMatchInfo$str());
    }
    protected String passwordMustNotEqualInfo$str() {
        return "The password must not be one of the following restricted values {%s}";
    }
    @Override
    public final String passwordMustNotEqualInfo(final String arg0) {
        return String.format(getLoggingLocale(), passwordMustNotEqualInfo$str(), arg0);
    }
    protected String passwordShouldNotEqualInfo$str() {
        return "The password should not be one of the following restricted values {%s}";
    }
    @Override
    public final String passwordShouldNotEqualInfo(final String arg0) {
        return String.format(getLoggingLocale(), passwordShouldNotEqualInfo$str(), arg0);
    }
    protected String passwordLengthInfo$str() {
        return "%s characters";
    }
    @Override
    public final String passwordLengthInfo(final int arg0) {
        return String.format(getLoggingLocale(), passwordLengthInfo$str(), arg0);
    }
    protected String passwordMustHaveAlphaInfo$str() {
        return "%d alphabetic character(s)";
    }
    @Override
    public final String passwordMustHaveAlphaInfo(final int arg0) {
        return String.format(getLoggingLocale(), passwordMustHaveAlphaInfo$str(), arg0);
    }
    protected String passwordMustHaveDigitInfo$str() {
        return "%d digit(s)";
    }
    @Override
    public final String passwordMustHaveDigitInfo(final int arg0) {
        return String.format(getLoggingLocale(), passwordMustHaveDigitInfo$str(), arg0);
    }
    protected String passwordMustHaveSymbolInfo$str() {
        return "%s non-alphanumeric symbol(s)";
    }
    @Override
    public final String passwordMustHaveSymbolInfo(final int arg0) {
        return String.format(getLoggingLocale(), passwordMustHaveSymbolInfo$str(), arg0);
    }
    protected String passwordMustContainInfo$str() {
        return "The password must contain at least %s";
    }
    @Override
    public final String passwordMustContainInfo(final String arg0) {
        return String.format(getLoggingLocale(), passwordMustContainInfo$str(), arg0);
    }
    protected String passwordShouldContainInfo$str() {
        return "The password should contain at least %s";
    }
    @Override
    public final String passwordShouldContainInfo(final String arg0) {
        return String.format(getLoggingLocale(), passwordShouldContainInfo$str(), arg0);
    }
    protected String sureToSetPassword$str() {
        return "Are you sure you want to use the password entered yes/no?";
    }
    @Override
    public final String sureToSetPassword() {
        return String.format(getLoggingLocale(), sureToSetPassword$str());
    }
    protected String usageDescription$str() {
        return "The add-user script is a utility for adding new users to the properties files for out-of-the-box authentication. It can be used to manage users in ManagementRealm and ApplicationRealm.";
    }
    @Override
    public final String usageDescription() {
        return String.format(getLoggingLocale(), usageDescription$str());
    }
    protected String argUsage$str() {
        return "Usage: ./add-user.sh [args...]%nwhere args include:";
    }
    @Override
    public final String argUsage() {
        return String.format(getLoggingLocale(), argUsage$str());
    }
    protected String argApplicationUsers$str() {
        return "If set add an application user instead of a management user";
    }
    @Override
    public final String argApplicationUsers() {
        return String.format(getLoggingLocale(), argApplicationUsers$str());
    }
    protected String argDomainConfigDirUsers$str() {
        return "Define the location of the domain config directory.";
    }
    @Override
    public final String argDomainConfigDirUsers() {
        return String.format(getLoggingLocale(), argDomainConfigDirUsers$str());
    }
    protected String argServerConfigDirUsers$str() {
        return "Define the location of the server config directory.";
    }
    @Override
    public final String argServerConfigDirUsers() {
        return String.format(getLoggingLocale(), argServerConfigDirUsers$str());
    }
    protected String argUserProperties$str() {
        return "The file name of the user properties file which can be an absolute path.";
    }
    @Override
    public final String argUserProperties() {
        return String.format(getLoggingLocale(), argUserProperties$str());
    }
    protected String argGroupProperties$str() {
        return "The file name of the group properties file which can be an absolute path. (If group properties is specified then user properties MUST also be specified).";
    }
    @Override
    public final String argGroupProperties() {
        return String.format(getLoggingLocale(), argGroupProperties$str());
    }
    protected String argPassword$str() {
        return "Password of the user, this will be checked against the password requirements defined within the add-user.properties configuration";
    }
    @Override
    public final String argPassword() {
        return String.format(getLoggingLocale(), argPassword$str());
    }
    protected String argUser$str() {
        return "Name of the user";
    }
    @Override
    public final String argUser() {
        return String.format(getLoggingLocale(), argUser$str());
    }
    protected String argRealm$str() {
        return "Name of the realm used to secure the management interfaces (default is \"ManagementRealm\")";
    }
    @Override
    public final String argRealm() {
        return String.format(getLoggingLocale(), argRealm$str());
    }
    protected String argSilent$str() {
        return "Activate the silent mode (no output to the console)";
    }
    @Override
    public final String argSilent() {
        return String.format(getLoggingLocale(), argSilent$str());
    }
    protected String argRole$str() {
        return "Comma-separated list of roles for the user.";
    }
    @Override
    public final String argRole() {
        return String.format(getLoggingLocale(), argRole$str());
    }
    protected String argGroup$str() {
        return "Comma-separated list of groups for the user.";
    }
    @Override
    public final String argGroup() {
        return String.format(getLoggingLocale(), argGroup$str());
    }
    protected String argEnable$str() {
        return "Enable the user";
    }
    @Override
    public final String argEnable() {
        return String.format(getLoggingLocale(), argEnable$str());
    }
    protected String argDisable$str() {
        return "Disable the user";
    }
    @Override
    public final String argDisable() {
        return String.format(getLoggingLocale(), argDisable$str());
    }
    protected String argConfirmWarning$str() {
        return "Automatically confirm warning in interactive mode";
    }
    @Override
    public final String argConfirmWarning() {
        return String.format(getLoggingLocale(), argConfirmWarning$str());
    }
    protected String argHelp$str() {
        return "Display this message and exit";
    }
    @Override
    public final String argHelp() {
        return String.format(getLoggingLocale(), argHelp$str());
    }
    protected String yes$str() {
        return "yes";
    }
    @Override
    public final String yes() {
        return String.format(getLoggingLocale(), yes$str());
    }
    protected String shortYes$str() {
        return "y";
    }
    @Override
    public final String shortYes() {
        return String.format(getLoggingLocale(), shortYes$str());
    }
    protected String no$str() {
        return "no";
    }
    @Override
    public final String no() {
        return String.format(getLoggingLocale(), no$str());
    }
    protected String shortNo$str() {
        return "n";
    }
    @Override
    public final String shortNo() {
        return String.format(getLoggingLocale(), shortNo$str());
    }
    protected String alternativeRealm$str() {
        return "The realm name supplied must match the name used by the server configuration which by default would be '%s'";
    }
    @Override
    public final String alternativeRealm(final String arg0) {
        return String.format(getLoggingLocale(), alternativeRealm$str(), arg0);
    }
    protected String realmConfirmation$str() {
        return "Are you sure you want to set the realm to '%s'";
    }
    @Override
    public final String realmConfirmation(final String arg0) {
        return String.format(getLoggingLocale(), realmConfirmation$str(), arg0);
    }
    protected String passwordRequirements$str() {
        return "Password requirements are listed below. To modify these restrictions edit the add-user.properties configuration file.";
    }
    @Override
    public final String passwordRequirements() {
        return String.format(getLoggingLocale(), passwordRequirements$str());
    }
    protected String passwordRecommendations$str() {
        return "Password recommendations are listed below. To modify these restrictions edit the add-user.properties configuration file.";
    }
    @Override
    public final String passwordRecommendations() {
        return String.format(getLoggingLocale(), passwordRecommendations$str());
    }
    protected String userSuppliedRealm$str() {
        return "Using realm '%s' as specified on the command line.";
    }
    @Override
    public final String userSuppliedRealm(final String arg0) {
        return String.format(getLoggingLocale(), userSuppliedRealm$str(), arg0);
    }
    protected String discoveredRealm$str() {
        return "Using realm '%s' as discovered from the existing property files.";
    }
    @Override
    public final String discoveredRealm(final String arg0) {
        return String.format(getLoggingLocale(), discoveredRealm$str(), arg0);
    }
    protected String multipleRealmDeclarations$str() {
        return "Users properties file '%s' contains multiple realm name declarations";
    }
    @Override
    public final IOException multipleRealmDeclarations(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), multipleRealmDeclarations$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String callbackHandlerNotInitialized$str() {
        return "The callback handler is not initialized for domain server %s.";
    }
    @Override
    public final IllegalStateException callbackHandlerNotInitialized(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), callbackHandlerNotInitialized$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToObtainCredential$str() {
        return "Unable to obtain credential for server %s";
    }
    @Override
    public final IllegalStateException unableToObtainCredential(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToObtainCredential$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
