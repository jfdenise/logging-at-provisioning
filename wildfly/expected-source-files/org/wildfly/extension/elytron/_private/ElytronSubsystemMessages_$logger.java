package org.wildfly.extension.elytron._private;

import java.util.Locale;
import java.security.Policy;
import java.lang.IllegalStateException;
import java.io.Serializable;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.ExpressionResolver.ExpressionResolutionUserException;
import org.wildfly.security.x500.cert.acme.AcmeException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import org.jboss.msc.service.StartException;
import java.lang.IllegalArgumentException;
import javax.annotation.processing.Generated;
import java.net.UnknownHostException;
import org.jboss.as.controller.OperationFailedException;
import java.io.IOException;
import java.security.KeyStoreException;
import org.jboss.as.controller.ExpressionResolver.ExpressionResolutionServerException;
import java.lang.Exception;
import javax.xml.stream.XMLStreamException;
import org.jboss.msc.service.ServiceName;
import org.jboss.msc.service.ServiceController.State;
import java.lang.Throwable;
import java.lang.Class;
import java.util.Arrays;
import java.security.NoSuchProviderException;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:27:14+0200")
public class ElytronSubsystemMessages_$logger extends DelegatingBasicLogger implements ElytronSubsystemMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ElytronSubsystemMessages_$logger.class.getName();
    public ElytronSubsystemMessages_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String duplicateRealmInjection$str() {
        return "WFLYELY00002: Can not inject the same realm '%s' in a single security domain.";
    }
    @Override
    public final OperationFailedException duplicateRealmInjection(final String realmName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), duplicateRealmInjection$str(), realmName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String operationAddressMissingKey$str() {
        return "WFLYELY00003: The operation did not contain an address with a value for '%s'.";
    }
    @Override
    public final IllegalArgumentException operationAddressMissingKey(final String key) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), operationAddressMissingKey$str(), key));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToStartService$str() {
        return "WFLYELY00004: Unable to start the service.";
    }
    @Override
    public final StartException unableToStartService(final Exception cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unableToStartService$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToAccessKeyStore$str() {
        return "WFLYELY00005: Unable to access KeyStore to complete the requested operation.";
    }
    @Override
    public final OperationFailedException unableToAccessKeyStore(final Exception cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToAccessKeyStore$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredServiceNotUp$str() {
        return "WFLYELY00007: The required service '%s' is not UP, it is currently '%s'.";
    }
    @Override
    public final OperationFailedException requiredServiceNotUp(final ServiceName serviceName, final State state) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), requiredServiceNotUp$str(), serviceName, state));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidOperationName$str() {
        return "WFLYELY00008: Invalid operation name '%s', expected one of '%s'";
    }
    @Override
    public final OperationFailedException invalidOperationName(final String actualName, final String... expectedNames) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidOperationName$str(), actualName, Arrays.toString(expectedNames)));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToCompleteOperation$str() {
        return "WFLYELY00009: Unable to complete operation. '%s'";
    }
    @Override
    public final RuntimeException unableToCompleteOperation(final Throwable cause, final String causeMessage) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unableToCompleteOperation$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cantSaveWithoutFile$str() {
        return "WFLYELY00010: Unable to save KeyStore - KeyStore file '%s' does not exist.";
    }
    @Override
    public final OperationFailedException cantSaveWithoutFile(final String file) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cantSaveWithoutFile$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSuitableProvider$str() {
        return "WFLYELY00012: No suitable provider found for type '%s'";
    }
    @Override
    public final StartException noSuitableProvider(final String type) {
        final StartException result = new StartException(String.format(getLoggingLocale(), noSuitableProvider$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String defaultRealmNotReferenced$str() {
        return "WFLYELY00013: The default-realm '%s' is not in the list of realms [%s] referenced by this domain.";
    }
    @Override
    public final OperationFailedException defaultRealmNotReferenced(final String defaultRealm, final String realms) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), defaultRealmNotReferenced$str(), defaultRealm, realms));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadPropertiesFiles$str() {
        return "WFLYELY00014: Unable to load the properties files required to start the properties file backed realm: Users file: '%s' Groups file: '%s'";
    }
    @Override
    public final StartException unableToLoadPropertiesFiles(final Exception cause, final String usersFile, final String groupsFile) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unableToLoadPropertiesFiles$str(), usersFile, groupsFile), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentNotConfigurable$str() {
        return "WFLYELY00015: The custom component implementation '%s' does not implement method initialize(Map<String, String>), however configuration has been supplied.";
    }
    @Override
    public final StartException componentNotConfigurable(final String className, final Exception cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), componentNotConfigurable$str(), className), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidRegularExpression$str() {
        return "WFLYELY00016: The supplied regular expression '%s' is invalid.";
    }
    @Override
    public final OperationFailedException invalidRegularExpression(final String pattern, final Exception cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidRegularExpression$str(), pattern), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String propertyFilesDoesNotExist$str() {
        return "WFLYELY00017: Property file referenced in properties-realm does not exist: %s";
    }
    @Override
    public final StartException propertyFilesDoesNotExist(final String file) {
        final StartException result = new StartException(String.format(getLoggingLocale(), propertyFilesDoesNotExist$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToCreateManagerFactory$str() {
        return "WFLYELY00018: Unable to create %s for algorithm '%s'.";
    }
    @Override
    public final StartException unableToCreateManagerFactory(final String type, final String algorithm) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unableToCreateManagerFactory$str(), type, algorithm));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noTypeFound$str() {
        return "WFLYELY00019: No '%s' found in injected value.";
    }
    @Override
    public final StartException noTypeFound(final String type) {
        final StartException result = new StartException(String.format(getLoggingLocale(), noTypeFound$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToReLoadPropertiesFiles$str() {
        return "WFLYELY00020: Unable to reload the properties files required to by the properties file backed realm.";
    }
    @Override
    public final OperationFailedException unableToReLoadPropertiesFiles(final Exception cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToReLoadPropertiesFiles$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String exceptionWhileCreatingPermission$str() {
        return "WFLYELY00021: Exception while creating the permission object for the permission mapping. Please check [class-name], [target-name] (name of permission) and [action] of [%s].";
    }
    @Override
    public final StartException exceptionWhileCreatingPermission(final String permissionClassName, final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), exceptionWhileCreatingPermission$str(), permissionClassName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyStoreFileNotExists$str() {
        return "WFLYELY00022: KeyStore file '%s' does not exist and required.";
    }
    @Override
    public final StartException keyStoreFileNotExists(final String file) {
        final StartException result = new StartException(String.format(getLoggingLocale(), keyStoreFileNotExists$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void keyStoreFileNotExistsButIgnored(final String file) {
        super.log.logf(FQCN, WARN, null, keyStoreFileNotExistsButIgnored$str(), file);
    }
    protected String keyStoreFileNotExistsButIgnored$str() {
        return "WFLYELY00023: KeyStore file '%s' does not exist. Used blank.";
    }
    @Override
    public final void certificateNotValid(final String alias, final Exception cause) {
        super.log.logf(FQCN, WARN, cause, certificateNotValid$str(), alias);
    }
    protected String certificateNotValid$str() {
        return "WFLYELY00024: Certificate [%s] in KeyStore is not valid";
    }
    protected String propertyFileIsInvalid$str() {
        return "WFLYELY00025: Referenced property file is invalid: %s";
    }
    @Override
    public final StartException propertyFileIsInvalid(final String message, final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), propertyFileIsInvalid$str(), message), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToObtainOidForX500Attribute$str() {
        return "WFLYELY00027: Unable to obtain OID for X.500 attribute '%s'";
    }
    @Override
    public final OperationFailedException unableToObtainOidForX500Attribute(final String attribute) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToObtainOidForX500Attribute$str(), attribute));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String x500AttributeMustBeDefined$str() {
        return "WFLYELY00028: The X.500 attribute must be defined by name or by OID";
    }
    @Override
    public final OperationFailedException x500AttributeMustBeDefined() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), x500AttributeMustBeDefined$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidURL$str() {
        return "WFLYELY00029: Failed to parse URL '%s'";
    }
    @Override
    public final OperationFailedException invalidURL(final String url, final Exception cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidURL$str(), url), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String realmDoesNotSupportCache$str() {
        return "WFLYELY00030: Realm '%s' does not support cache";
    }
    @Override
    public final StartException realmDoesNotSupportCache(final String realmName) {
        final StartException result = new StartException(String.format(getLoggingLocale(), realmDoesNotSupportCache$str(), realmName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToAccessCRL$str() {
        return "WFLYELY00031: Unable to access CRL file.";
    }
    @Override
    public final StartException unableToAccessCRL(final Exception cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unableToAccessCRL$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToReloadCRL$str() {
        return "WFLYELY00032: Unable to reload CRL file.";
    }
    @Override
    public final RuntimeException unableToReloadCRL(final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unableToReloadCRL$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToAccessEntryFromKeyStore$str() {
        return "WFLYELY00033: Unable to access entry [%s] from key store [%s].";
    }
    @Override
    public final RuntimeException unableToAccessEntryFromKeyStore(final String alias, final String keyStore) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unableToAccessEntryFromKeyStore$str(), alias, keyStore));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jdbcRealmOnlySingleKeyMapperAllowed$str() {
        return "WFLYELY00034: A principal query can only have a single key mapper";
    }
    @Override
    public final OperationFailedException jdbcRealmOnlySingleKeyMapperAllowed() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), jdbcRealmOnlySingleKeyMapperAllowed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadModule$str() {
        return "WFLYELY00035: Unable to load module '%s'.";
    }
    @Override
    public final OperationFailedException unableToLoadModule(final String module, final Exception cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToLoadModule$str(), module), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String realmRefererencedTwice$str() {
        return "WFLYELY00036: Security realm '%s' has been referenced twice in the same security domain.";
    }
    @Override
    public final OperationFailedException realmRefererencedTwice(final String realmName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), realmRefererencedTwice$str(), realmName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidTypeInjected$str() {
        return "WFLYELY00037: Injected value is not of '%s' type.";
    }
    @Override
    public final StartException invalidTypeInjected(final String type) {
        final StartException result = new StartException(String.format(getLoggingLocale(), invalidTypeInjected$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidPermissionClass$str() {
        return "WFLYELY00038: Could not load permission class '%s'";
    }
    @Override
    public final StartException invalidPermissionClass(final String className) {
        final StartException result = new StartException(String.format(getLoggingLocale(), invalidPermissionClass$str(), className));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToReloadCRLNotReloadable$str() {
        return "WFLYELY00039: Unable to reload CRL file - TrustManager is not reloadable";
    }
    @Override
    public final OperationFailedException unableToReloadCRLNotReloadable() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToReloadCRLNotReloadable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidPermissionModule$str() {
        return "WFLYELY00040: Unable to load the permission module '%s' for the permission mapping";
    }
    @Override
    public final StartException invalidPermissionModule(final String module, final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), invalidPermissionModule$str(), module), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToTransformTornAttribute$str() {
        return "WFLYELY00041: Unable to transform configuration to the target version - attribute '%s' is different from '%s'";
    }
    @Override
    public final String unableToTransformTornAttribute(final String attribute1, final String attribute2) {
        return String.format(getLoggingLocale(), unableToTransformTornAttribute$str(), attribute1, attribute2);
    }
    protected String unableToTransformMultipleRealms$str() {
        return "WFLYELY00042: Unable to transform multiple 'authorization-realms' to the single value";
    }
    @Override
    public final String unableToTransformMultipleRealms() {
        return String.format(getLoggingLocale(), unableToTransformMultipleRealms$str());
    }
    protected String cycleDetected$str() {
        return "WFLYELY00043: A cycle has been detected initialising the resources - %s";
    }
    @Override
    public final OperationFailedException cycleDetected(final String cycle) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cycleDetected$str(), cycle));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidServiceNameParent$str() {
        return "WFLYELY00044: Unexpected name of servicename's parent - %s";
    }
    @Override
    public final IllegalStateException invalidServiceNameParent(final String canonicalName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidServiceNameParent$str(), canonicalName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadCallbackhandlerFromProvidedModule$str() {
        return "WFLYELY00045: Failed to load CallbackHandler from the provided module.";
    }
    @Override
    public final IllegalStateException failedToLoadCallbackhandlerFromProvidedModule() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failedToLoadCallbackhandlerFromProvidedModule$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jaasFileDoesNotExist$str() {
        return "WFLYELY00046: Provided path '%s' to JAAS configuration file does not exist.";
    }
    @Override
    public final StartException jaasFileDoesNotExist(final String path) {
        final StartException result = new StartException(String.format(getLoggingLocale(), jaasFileDoesNotExist$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void ldapRealmDirectVerificationAndUserPasswordMapper() {
        super.log.logf(FQCN, WARN, null, ldapRealmDirectVerificationAndUserPasswordMapper$str());
    }
    protected String ldapRealmDirectVerificationAndUserPasswordMapper$str() {
        return "WFLYELY00047: LDAP Realm is configured to use direct-verification and user-password-mapper which is invalid configuration.";
    }
    protected String representationOfX500IsRequired$str() {
        return "WFLYELY00048: A string representation of an X.500 distinguished name is required: %s";
    }
    @Override
    public final IllegalArgumentException representationOfX500IsRequired(final String causeMessage) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), representationOfX500IsRequired$str(), causeMessage));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jaasEntryNotDefined$str() {
        return "WFLYELY00049: Entry is not defined.";
    }
    @Override
    public final StartException jaasEntryNotDefined() {
        final StartException result = new StartException(String.format(getLoggingLocale(), jaasEntryNotDefined$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cachedRealmServiceNotAvailable$str() {
        return "WFLYELY00050: The realm is not available. You can't flush the cache.";
    }
    @Override
    public final OperationFailedException cachedRealmServiceNotAvailable() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cachedRealmServiceNotAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String credentialStoreEntryTypeNotSupported$str() {
        return "WFLYELY00909: Credential store '%s' does not support given credential store entry type '%s'";
    }
    @Override
    public final OperationFailedException credentialStoreEntryTypeNotSupported(final String credentialStoreName, final String entryType) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), credentialStoreEntryTypeNotSupported$str(), credentialStoreName, entryType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyStorePasswordCannotBeResolved$str() {
        return "WFLYELY00910: Password cannot be resolved for key-store '%s'";
    }
    @Override
    public final IOException keyStorePasswordCannotBeResolved(final String path) {
        final IOException result = new IOException(String.format(getLoggingLocale(), keyStorePasswordCannotBeResolved$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String credentialStoreProtectionParameterCannotBeResolved$str() {
        return "WFLYELY00911: Credential store '%s' protection parameter cannot be resolved";
    }
    @Override
    public final IOException credentialStoreProtectionParameterCannotBeResolved(final String name) {
        final IOException result = new IOException(String.format(getLoggingLocale(), credentialStoreProtectionParameterCannotBeResolved$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String credentialAlreadyExists$str() {
        return "WFLYELY00913: Credential alias '%s' of credential type '%s' already exists in the store";
    }
    @Override
    public final OperationFailedException credentialAlreadyExists(final String alias, final String credentialType) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), credentialAlreadyExists$str(), alias, credentialType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String providerLoaderCannotSupplyProvider$str() {
        return "WFLYELY00914: Provider loader '%s' cannot supply Credential Store provider of type '%s'";
    }
    @Override
    public final NoSuchProviderException providerLoaderCannotSupplyProvider(final String providerLoader, final String type) {
        final NoSuchProviderException result = new NoSuchProviderException(String.format(getLoggingLocale(), providerLoaderCannotSupplyProvider$str(), providerLoader, type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String credentialCannotBeResolved$str() {
        return "WFLYELY00916: Credential cannot be resolved";
    }
    @Override
    public final IllegalStateException credentialCannotBeResolved() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), credentialCannotBeResolved$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String dirContextPasswordCannotBeResolved$str() {
        return "WFLYELY00917: Password cannot be resolved for dir-context";
    }
    @Override
    public final StartException dirContextPasswordCannotBeResolved(final Exception cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), dirContextPasswordCannotBeResolved$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String credentialDoesNotExist$str() {
        return "WFLYELY00920: Credential alias '%s' of credential type '%s' does not exist in the store";
    }
    @Override
    public final OperationFailedException credentialDoesNotExist(final String alias, final String credentialType) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), credentialDoesNotExist$str(), alias, credentialType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String filebasedKeystoreLocationMissing$str() {
        return "WFLYELY00921: Location parameter is not specified for filebased keystore type '%s'";
    }
    @Override
    public final OperationFailedException filebasedKeystoreLocationMissing(final String type) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), filebasedKeystoreLocationMissing$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String reloadDependantServices$str() {
        return "Reload dependent services which might already have cached the secret value";
    }
    @Override
    public final String reloadDependantServices() {
        return String.format(getLoggingLocale(), reloadDependantServices$str());
    }
    protected String updateDependantServices$str() {
        return "Update dependent resources as alias '%s' does not exist anymore";
    }
    @Override
    public final String updateDependantServices(final String alias) {
        return String.format(getLoggingLocale(), updateDependantServices$str(), alias);
    }
    protected String unableToLoadCredential$str() {
        return "WFLYELY00922: Unable to load credential from credential store.";
    }
    @Override
    public final ExpressionResolutionUserException unableToLoadCredential(final Throwable cause) {
        final ExpressionResolutionUserException result = new ExpressionResolutionUserException(String.format(getLoggingLocale(), unableToLoadCredential$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToEncryptClearText$str() {
        return "WFLYELY00923: Unable to encrypt the supplied clear text.";
    }
    @Override
    public final OperationFailedException unableToEncryptClearText(final Throwable cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToEncryptClearText$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToCreateCredentialStoreImmediately$str() {
        return "WFLYELY00924: Unable to create immediately available credential store.";
    }
    @Override
    public final OperationFailedException unableToCreateCredentialStoreImmediately(final Throwable cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToCreateCredentialStoreImmediately$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToReloadCredentialStore$str() {
        return "WFLYELY00925: Unable to reload the credential store.";
    }
    @Override
    public final OperationFailedException unableToReloadCredentialStore(final Throwable cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToReloadCredentialStore$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToInitialiseCredentialStore$str() {
        return "WFLYELY00926: Unable to initialize the credential store.";
    }
    @Override
    public final OperationFailedException unableToInitialiseCredentialStore(final Throwable cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToInitialiseCredentialStore$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String secretKeyOperationFailed$str() {
        return "WFLYELY00927: The secret key operation '%s' failed to complete due to '%s'.";
    }
    @Override
    public final OperationFailedException secretKeyOperationFailed(final String operationName, final String error, final Throwable cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), secretKeyOperationFailed$str(), operationName, error), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String identityAlreadyExists$str() {
        return "WFLYELY01000: Identity with name [%s] already exists.";
    }
    @Override
    public final OperationFailedException identityAlreadyExists(final String principalName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), identityAlreadyExists$str(), principalName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateIdentity$str() {
        return "WFLYELY01001: Could not create identity with name [%s].";
    }
    @Override
    public final RuntimeException couldNotCreateIdentity(final String principalName, final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotCreateIdentity$str(), principalName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String identityNotFound$str() {
        return "WFLYELY01002: Identity with name [%s] not found.";
    }
    @Override
    public final String identityNotFound(final String principalName) {
        return String.format(getLoggingLocale(), identityNotFound$str(), principalName);
    }
    protected String couldNotDeleteIdentity$str() {
        return "WFLYELY01003: Could not delete identity with name [%s].";
    }
    @Override
    public final RuntimeException couldNotDeleteIdentity(final String principalName, final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotDeleteIdentity$str(), principalName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String identityNotAuthorized$str() {
        return "WFLYELY01004: Identity with name [%s] not authorized.";
    }
    @Override
    public final String identityNotAuthorized(final String principalName) {
        return String.format(getLoggingLocale(), identityNotAuthorized$str(), principalName);
    }
    protected String couldNotReadIdentity2$str() {
        return "WFLYELY01005: Could not read identity [%s] from security domain [%s].";
    }
    @Override
    public final RuntimeException couldNotReadIdentity(final String principalName, final ServiceName domainServiceName, final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotReadIdentity2$str(), principalName, domainServiceName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotReadIdentity1$str() {
        return "WFLYELY01007: Could not read identity with name [%s].";
    }
    @Override
    public final RuntimeException couldNotReadIdentity(final String principalName, final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotReadIdentity1$str(), principalName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotObtainAuthorizationIdentity$str() {
        return "WFLYELY01008: Failed to obtain the authorization identity.";
    }
    @Override
    public final RuntimeException couldNotObtainAuthorizationIdentity(final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotObtainAuthorizationIdentity$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotAddAttribute$str() {
        return "WFLYELY01009: Failed to add attribute.";
    }
    @Override
    public final RuntimeException couldNotAddAttribute(final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotAddAttribute$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotRemoveAttribute$str() {
        return "WFLYELY01010: Failed to remove attribute.";
    }
    @Override
    public final RuntimeException couldNotRemoveAttribute(final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotRemoveAttribute$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreatePassword$str() {
        return "WFLYELY01011: Could not create password.";
    }
    @Override
    public final RuntimeException couldNotCreatePassword(final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotCreatePassword$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedPasswordType$str() {
        return "WFLYELY01012: Unexpected password type [%s].";
    }
    @Override
    public final OperationFailedException unexpectedPasswordType(final String passwordType) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unexpectedPasswordType$str(), passwordType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String patternRequiresCaptureGroup$str() {
        return "WFLYELY01013: Pattern [%s] requires a capture group";
    }
    @Override
    public final OperationFailedException patternRequiresCaptureGroup(final String pattern) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), patternRequiresCaptureGroup$str(), pattern));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidDefinition$str() {
        return "WFLYELY01014: Invalid [%s] definition. Only one of '%s' or '%s' can be set in one Object in the list of filters.";
    }
    @Override
    public final OperationFailedException invalidDefinition(final String property, final String filterNameOne, final String filterNameTwo) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidDefinition$str(), property, filterNameOne, filterNameTwo));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToPerformOutflow$str() {
        return "WFLYELY01015: Unable to perform automatic outflow for '%s'";
    }
    @Override
    public final IllegalStateException unableToPerformOutflow(final String identityName, final Exception cause) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToPerformOutflow$str(), identityName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverNotKnown$str() {
        return "WFLYELY01016: Server '%s' not known";
    }
    @Override
    public final OperationFailedException serverNotKnown(final String server, final UnknownHostException e) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), serverNotKnown$str(), server), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCipherSuiteFilter$str() {
        return "WFLYELY01017: Invalid value for cipher-suite-filter. %s";
    }
    @Override
    public final OperationFailedException invalidCipherSuiteFilter(final Throwable cause, final String causeMessage) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidCipherSuiteFilter$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidSize$str() {
        return "WFLYELY01018: Invalid size %s";
    }
    @Override
    public final OperationFailedException invalidSize(final String size) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidSize$str(), size));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String suffixContainsMillis$str() {
        return "WFLYELY01019: The suffix (%s) can not contain seconds or milliseconds.";
    }
    @Override
    public final OperationFailedException suffixContainsMillis(final String suffix) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), suffixContainsMillis$str(), suffix));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidSuffix$str() {
        return "WFLYELY01020: The suffix (%s) is invalid. A suffix must be a valid date format.";
    }
    @Override
    public final OperationFailedException invalidSuffix(final String suffix) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidSuffix$str(), suffix));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToSetPolicy$str() {
        return "WFLYELY01022: Failed to set policy [%s]";
    }
    @Override
    public final RuntimeException failedToSetPolicy(final Policy policy, final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToSetPolicy$str(), policy), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotFindPolicyProvider$str() {
        return "WFLYELY01023: Could not find policy provider with name [%s]";
    }
    @Override
    public final XMLStreamException cannotFindPolicyProvider(final String policyProvider, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), cannotFindPolicyProvider$str(), policyProvider), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToRegisterPolicyHandlers$str() {
        return "WFLYELY01024: Failed to register policy context handlers";
    }
    @Override
    public final RuntimeException failedToRegisterPolicyHandlers(final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToRegisterPolicyHandlers$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToCreatePolicy$str() {
        return "WFLYELY01025: Failed to create policy [%s]";
    }
    @Override
    public final RuntimeException failedToCreatePolicy(final String className, final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToCreatePolicy$str(), className), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void discardingUnusedPolicy(final String element, final String attr, final String name) {
        super.log.logf(FQCN, WARN, null, discardingUnusedPolicy$str(), element, attr, name);
    }
    protected String discardingUnusedPolicy$str() {
        return "WFLYELY01026: Element '%s' with attribute '%s' set to '%s' is unused. Since unused policy configurations can no longer be stored in the configuration model this item is being discarded.";
    }
    protected String keyPasswordCannotBeResolved$str() {
        return "WFLYELY01027: Key password cannot be resolved for key-store '%s'";
    }
    @Override
    public final IOException keyPasswordCannotBeResolved(final String path) {
        final IOException result = new IOException(String.format(getLoggingLocale(), keyPasswordCannotBeResolved$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidNotBefore$str() {
        return "WFLYELY01028: Invalid value for not-before. %s";
    }
    @Override
    public final OperationFailedException invalidNotBefore(final Throwable cause, final String causeMessage) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidNotBefore$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyStoreAliasDoesNotExist$str() {
        return "WFLYELY01029: Alias '%s' does not exist in KeyStore";
    }
    @Override
    public final OperationFailedException keyStoreAliasDoesNotExist(final String alias) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), keyStoreAliasDoesNotExist$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyStoreAliasDoesNotIdentifyPrivateKeyEntry$str() {
        return "WFLYELY01030: Alias '%s' does not identify a PrivateKeyEntry in KeyStore";
    }
    @Override
    public final OperationFailedException keyStoreAliasDoesNotIdentifyPrivateKeyEntry(final String alias) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), keyStoreAliasDoesNotIdentifyPrivateKeyEntry$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToObtainPrivateKey$str() {
        return "WFLYELY01031: Unable to obtain PrivateKey for alias '%s'";
    }
    @Override
    public final OperationFailedException unableToObtainPrivateKey(final String alias) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToObtainPrivateKey$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToObtainCertificate$str() {
        return "WFLYELY01032: Unable to obtain Certificate for alias '%s'";
    }
    @Override
    public final OperationFailedException unableToObtainCertificate(final String alias) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToObtainCertificate$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noCertificatesFoundInCertificateReply$str() {
        return "WFLYELY01033: No certificates found in certificate reply";
    }
    @Override
    public final OperationFailedException noCertificatesFoundInCertificateReply() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noCertificatesFoundInCertificateReply$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String publicKeyFromCertificateReplyDoesNotMatchKeyStore$str() {
        return "WFLYELY01034: Public key from certificate reply does not match public key from certificate in KeyStore";
    }
    @Override
    public final OperationFailedException publicKeyFromCertificateReplyDoesNotMatchKeyStore() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), publicKeyFromCertificateReplyDoesNotMatchKeyStore$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String certificateReplySameAsCertificateFromKeyStore$str() {
        return "WFLYELY01035: Certificate reply is the same as the certificate from PrivateKeyEntry in KeyStore";
    }
    @Override
    public final OperationFailedException certificateReplySameAsCertificateFromKeyStore() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), certificateReplySameAsCertificateFromKeyStore$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyStoreAliasAlreadyExists$str() {
        return "WFLYELY01036: Alias '%s' already exists in KeyStore";
    }
    @Override
    public final OperationFailedException keyStoreAliasAlreadyExists(final String alias) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), keyStoreAliasAlreadyExists$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String topMostCertificateFromCertificateReplyNotTrusted$str() {
        return "WFLYELY01037: Top-most certificate from certificate reply is not trusted. Inspect the certificate carefully and if it is valid, execute import-certificate again with validate set to false.";
    }
    @Override
    public final OperationFailedException topMostCertificateFromCertificateReplyNotTrusted() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), topMostCertificateFromCertificateReplyNotTrusted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String trustedCertificateAlreadyInKeyStore$str() {
        return "WFLYELY01038: Trusted certificate is already in KeyStore under alias '%s'";
    }
    @Override
    public final OperationFailedException trustedCertificateAlreadyInKeyStore(final String alias) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), trustedCertificateAlreadyInKeyStore$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String trustedCertificateAlreadyInCacertsKeyStore$str() {
        return "WFLYELY01039: Trusted certificate is already in cacerts KeyStore under alias '%s'";
    }
    @Override
    public final OperationFailedException trustedCertificateAlreadyInCacertsKeyStore(final String alias) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), trustedCertificateAlreadyInCacertsKeyStore$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToDetermineIfCertificateIsTrusted$str() {
        return "WFLYELY01040: Unable to determine if the certificate is trusted. Inspect the certificate carefully and if it is valid, execute import-certificate again with validate set to false.";
    }
    @Override
    public final OperationFailedException unableToDetermineIfCertificateIsTrusted() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToDetermineIfCertificateIsTrusted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String certificateFileDoesNotExist$str() {
        return "WFLYELY01041: Certificate file does not exist";
    }
    @Override
    public final OperationFailedException certificateFileDoesNotExist(final Exception cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), certificateFileDoesNotExist$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToObtainEntry$str() {
        return "WFLYELY01042: Unable to obtain Entry for alias '%s'";
    }
    @Override
    public final OperationFailedException unableToObtainEntry(final String alias) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToObtainEntry$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToCreateAccountWithCertificateAuthority$str() {
        return "WFLYELY01043: Unable to create an account with the certificate authority: %s";
    }
    @Override
    public final OperationFailedException unableToCreateAccountWithCertificateAuthority(final Exception cause, final String causeMessage) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToCreateAccountWithCertificateAuthority$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToChangeAccountKeyWithCertificateAuthority$str() {
        return "WFLYELY01044: Unable to change the account key associated with the certificate authority: %s";
    }
    @Override
    public final OperationFailedException unableToChangeAccountKeyWithCertificateAuthority(final Exception cause, final String causeMessage) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToChangeAccountKeyWithCertificateAuthority$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToDeactivateAccountWithCertificateAuthority$str() {
        return "WFLYELY01045: Unable to deactivate the account associated with the certificate authority: %s";
    }
    @Override
    public final OperationFailedException unableToDeactivateAccountWithCertificateAuthority(final Exception cause, final String causeMessage) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToDeactivateAccountWithCertificateAuthority$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToObtainCertificateAuthorityAccountCertificate$str() {
        return "WFLYELY01046: Unable to obtain certificate authority account Certificate for alias '%s'";
    }
    @Override
    public final StartException unableToObtainCertificateAuthorityAccountCertificate(final String alias) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unableToObtainCertificateAuthorityAccountCertificate$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToObtainCertificateAuthorityAccountPrivateKey$str() {
        return "WFLYELY01047: Unable to obtain certificate authority account PrivateKey for alias '%s'";
    }
    @Override
    public final StartException unableToObtainCertificateAuthorityAccountPrivateKey(final String alias) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unableToObtainCertificateAuthorityAccountPrivateKey$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToUpdateCertificateAuthorityAccountKeyStore$str() {
        return "WFLYELY01048: Unable to update certificate authority account key store: %s";
    }
    @Override
    public final OperationFailedException unableToUpdateCertificateAuthorityAccountKeyStore(final Exception cause, final String causeMessage) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToUpdateCertificateAuthorityAccountKeyStore$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToRespondToCertificateAuthorityChallenge$str() {
        return "WFLYELY01049: Unable to respond to challenge from certificate authority: %s";
    }
    @Override
    public final AcmeException unableToRespondToCertificateAuthorityChallenge(final Exception cause, final String causeMessage) {
        final AcmeException result = new AcmeException(String.format(getLoggingLocale(), unableToRespondToCertificateAuthorityChallenge$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCertificateAuthorityChallenge$str() {
        return "WFLYELY01050: Invalid certificate authority challenge";
    }
    @Override
    public final AcmeException invalidCertificateAuthorityChallenge() {
        final AcmeException result = new AcmeException(String.format(getLoggingLocale(), invalidCertificateAuthorityChallenge$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCertificateRevocationReason$str() {
        return "WFLYELY01051: Invalid certificate revocation reason '%s'";
    }
    @Override
    public final OperationFailedException invalidCertificateRevocationReason(final String reason) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidCertificateRevocationReason$str(), reason));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToInstatiateAcmeClientSpiImplementation$str() {
        return "WFLYELY01052: Unable to instantiate AcmeClientSpi implementation";
    }
    @Override
    public final IllegalStateException unableToInstatiateAcmeClientSpiImplementation() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToInstatiateAcmeClientSpiImplementation$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToUpdateAccountWithCertificateAuthority$str() {
        return "WFLYELY01053: Unable to update the account with the certificate authority: %s";
    }
    @Override
    public final OperationFailedException unableToUpdateAccountWithCertificateAuthority(final Exception cause, final String causeMessage) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToUpdateAccountWithCertificateAuthority$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToGetCertificateAuthorityMetadata$str() {
        return "WFLYELY01054: Unable to get the metadata associated with the certificate authority: %s";
    }
    @Override
    public final OperationFailedException unableToGetCertificateAuthorityMetadata(final Exception cause, final String causeMessage) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToGetCertificateAuthorityMetadata$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidKeySize$str() {
        return "WFLYELY01055: Invalid key size: %d";
    }
    @Override
    public final OperationFailedException invalidKeySize(final int keySize) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidKeySize$str(), keySize));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String certificateAuthorityAccountAlreadyExists$str() {
        return "WFLYELY01056: A certificate authority account with this account key already exists. To update the contact information associated with this existing account, use %s. To change the key associated with this existing account, use %s.";
    }
    @Override
    public final OperationFailedException certificateAuthorityAccountAlreadyExists(final String updateAccount, final String changeAccountKey) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), certificateAuthorityAccountAlreadyExists$str(), updateAccount, changeAccountKey));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToCreateServerAuthModule$str() {
        return "WFLYELY01057: Failed to create ServerAuthModule [%s] using module '%s'";
    }
    @Override
    public final RuntimeException failedToCreateServerAuthModule(final String className, final String module, final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToCreateServerAuthModule$str(), className, module), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParsePEMPublicKey$str() {
        return "WFLYELY01058: Failed to parse PEM public key with kid: %s";
    }
    @Override
    public final OperationFailedException failedToParsePEMPublicKey(final String kid) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToParsePEMPublicKey$str(), kid));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToDetectKeyStore$str() {
        return "WFLYELY01059: Unable to detect KeyStore '%s'";
    }
    @Override
    public final StartException unableToDetectKeyStore(final String path) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unableToDetectKeyStore$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String filelessKeyStoreMissingType$str() {
        return "WFLYELY01060: Fileless KeyStore needs to have a defined type.";
    }
    @Override
    public final OperationFailedException filelessKeyStoreMissingType() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), filelessKeyStoreMissingType$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidHostContextMapValue$str() {
        return "WFLYELY01061: Invalid value of host context map: '%s' is not valid hostname pattern.";
    }
    @Override
    public final OperationFailedException invalidHostContextMapValue(final String hostname) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidHostContextMapValue$str(), hostname));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidAttributeValue$str() {
        return "WFLYELY01062: Value for attribute '%s' is invalid.";
    }
    @Override
    public final OperationFailedException invalidAttributeValue(final String attributeName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidAttributeValue$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String letsEncryptNameNotAllowed$str() {
        return "WFLYELY01063: LetsEncrypt certificate authority is configured by default.";
    }
    @Override
    public final OperationFailedException letsEncryptNameNotAllowed() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), letsEncryptNameNotAllowed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadResponderCert$str() {
        return "WFLYELY01064: Failed to load OCSP responder certificate '%s'.";
    }
    @Override
    public final StartException failedToLoadResponderCert(final String alias, final Exception exception) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToLoadResponderCert$str(), alias), exception);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleMaximumCertPathDefinitions$str() {
        return "WFLYELY01065: Multiple maximum-cert-path definitions found.";
    }
    @Override
    public final OperationFailedException multipleMaximumCertPathDefinitions() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), multipleMaximumCertPathDefinitions$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCipherSuiteNames$str() {
        return "WFLYELY01066: Invalid value for cipher-suite-names. %s";
    }
    @Override
    public final OperationFailedException invalidCipherSuiteNames(final Throwable cause, final String causeMessage) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidCipherSuiteNames$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidRegex$str() {
        return "WFLYELY01067: Value '%s' is not valid regex.";
    }
    @Override
    public final OperationFailedException invalidRegex(final String regex) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidRegex$str(), regex));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicatePolicyContextHandler$str() {
        return "WFLYELY01068: Duplicate PolicyContextHandler found for key '%s'.";
    }
    @Override
    public final IllegalStateException duplicatePolicyContextHandler(final String key) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), duplicatePolicyContextHandler$str(), key));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidImplementationLoaded$str() {
        return "WFLYELY01069: Invalid %s loaded, expected %s but received %s.";
    }
    @Override
    public final IllegalStateException invalidImplementationLoaded(final String type, final String expected, final String actual) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidImplementationLoaded$str(), type, expected, actual));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadModuleRuntime$str() {
        return "WFLYELY01079: Unable to load module '%s'.";
    }
    @Override
    public final RuntimeException unableToLoadModuleRuntime(final String module, final Exception cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unableToLoadModuleRuntime$str(), module), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nonexistingKeyStoreMissingType$str() {
        return "WFLYELY01080: Non existing key store needs to have defined type.";
    }
    @Override
    public final OperationFailedException nonexistingKeyStoreMissingType() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), nonexistingKeyStoreMissingType$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLazilyInitKeyManager$str() {
        return "WFLYELY01081: Failed to lazily initialize key manager";
    }
    @Override
    public final RuntimeException failedToLazilyInitKeyManager(final Exception e) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToLazilyInitKeyManager$str()), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToStoreGeneratedSelfSignedCertificate$str() {
        return "WFLYELY01082: Failed to store generated self-signed certificate";
    }
    @Override
    public final RuntimeException failedToStoreGeneratedSelfSignedCertificate(final Exception e) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToStoreGeneratedSelfSignedCertificate$str()), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noTypeFoundForLazyInitKeyManager$str() {
        return "WFLYELY01083: No '%s' found in injected value.";
    }
    @Override
    public final RuntimeException noTypeFoundForLazyInitKeyManager(final String type) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), noTypeFoundForLazyInitKeyManager$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void selfSignedCertificateWillBeCreated(final String file, final String host) {
        super.log.logf(FQCN, WARN, null, selfSignedCertificateWillBeCreated$str(), file, host);
    }
    protected String selfSignedCertificateWillBeCreated$str() {
        return "WFLYELY01084: KeyStore %s not found, it will be auto-generated on first use with a self-signed certificate for host %s";
    }
    @Override
    public final void selfSignedCertificateHasBeenCreated(final String file, final String sha1, final String sha256) {
        super.log.logf(FQCN, WARN, null, selfSignedCertificateHasBeenCreated$str(), file, sha1, sha256);
    }
    protected String selfSignedCertificateHasBeenCreated$str() {
        return "WFLYELY01085: Generated self-signed certificate at %s. Please note that self-signed certificates are not secure and should only be used for testing purposes. Do not use this self-signed certificate in production.\nSHA-1 fingerprint of the generated key is %s\nSHA-256 fingerprint of the generated key is %s";
    }
    protected String unableToEnableJaccSupport$str() {
        return "WFLYELY01086: Unable to initialize Elytron JACC support while legacy JACC support is enabled.";
    }
    @Override
    public final IllegalStateException unableToEnableJaccSupport() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToEnableJaccSupport$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String hostContextMapHostnameContainsCaret$str() {
        return "WFLYELY01087: Hostname in SNI mapping cannot contain ^ character.";
    }
    @Override
    public final OperationFailedException hostContextMapHostnameContainsCaret() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), hostContextMapHostnameContainsCaret$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingCertificateAuthorityChallenge$str() {
        return "WFLYELY01088: Missing certificate authority challenge";
    }
    @Override
    public final AcmeException missingCertificateAuthorityChallenge() {
        final AcmeException result = new AcmeException(String.format(getLoggingLocale(), missingCertificateAuthorityChallenge$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidEncodingName$str() {
        return "WFLYELY01089: Invalid file encoding '%s'.";
    }
    @Override
    public final OperationFailedException invalidEncodingName(final String encoding) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidEncodingName$str(), encoding));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void noAllowedJkuValuesSpecifiedForTokenRealm(final String realmName, final String systemPropertyName) {
        super.log.logf(FQCN, WARN, null, noAllowedJkuValuesSpecifiedForTokenRealm$str(), realmName, systemPropertyName);
    }
    protected String noAllowedJkuValuesSpecifiedForTokenRealm$str() {
        return "WFLYELY01090: Allowed jku values haven't been specified for token realm '%s'. Token validation will fail if the token contains a 'jku' header parameter. The allowed jku values can be specified as a space separated string using the '%s' system property.";
    }
    protected String noResolverSpecifiedAndNoDefault$str() {
        return "WFLYELY01200: The name of the resolver to use was not specified and no default-resolver has been defined.";
    }
    @Override
    public final OperationFailedException noResolverSpecifiedAndNoDefault() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noResolverSpecifiedAndNoDefault$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noResolverWithSpecifiedName$str() {
        return "WFLYELY01201: No expression resolver has been defined with the name '%s'.";
    }
    @Override
    public final OperationFailedException noResolverWithSpecifiedName(final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noResolverWithSpecifiedName$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cycleDetectedInitialisingExpressionResolver$str() {
        return "WFLYELY01202: A cycle has been detected initialising the expression resolver for '%s' and '%s'.";
    }
    @Override
    public final ExpressionResolutionUserException cycleDetectedInitialisingExpressionResolver(final String firstExpression, final String secondExpression) {
        final ExpressionResolutionUserException result = new ExpressionResolutionUserException(String.format(getLoggingLocale(), cycleDetectedInitialisingExpressionResolver$str(), firstExpression, secondExpression));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String expressionResolverInitialisationAlreadyFailed$str() {
        return "WFLYELY01203: Expression resolver initialisation has already failed.";
    }
    @Override
    public final ExpressionResolutionUserException expressionResolverInitialisationAlreadyFailed(final Throwable cause) {
        final ExpressionResolutionUserException result = new ExpressionResolutionUserException(String.format(getLoggingLocale(), expressionResolverInitialisationAlreadyFailed$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String expressionResolutionWithoutResolver$str() {
        return "WFLYELY01204: The expression '%s' does not specify a resolver and no default is defined.";
    }
    @Override
    public final ExpressionResolutionUserException expressionResolutionWithoutResolver(final String expression) {
        final ExpressionResolutionUserException result = new ExpressionResolutionUserException(String.format(getLoggingLocale(), expressionResolutionWithoutResolver$str(), expression));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidResolver$str() {
        return "WFLYELY01205: The expression '%s' specifies a resolver configuration which does not exist.";
    }
    @Override
    public final ExpressionResolutionUserException invalidResolver(final String expression) {
        final ExpressionResolutionUserException result = new ExpressionResolutionUserException(String.format(getLoggingLocale(), invalidResolver$str(), expression));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToDecryptExpression$str() {
        return "WFLYELY01206: Unable to decrypt expression '%s'.";
    }
    @Override
    public final ExpressionResolutionUserException unableToDecryptExpression(final String expression, final Throwable cause) {
        final ExpressionResolutionUserException result = new ExpressionResolutionUserException(String.format(getLoggingLocale(), unableToDecryptExpression$str(), expression), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String modelStageResolutionNotSupported$str() {
        return "WFLYELY01207: Resolution of credential store expressions is not supported in the MODEL stage of operation execution.";
    }
    @Override
    public final ExpressionResolutionServerException modelStageResolutionNotSupported(final IllegalStateException cause) {
        final ExpressionResolutionServerException result = new ExpressionResolutionServerException(String.format(getLoggingLocale(), modelStageResolutionNotSupported$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToResolveCredentialStore$str() {
        return "WFLYELY01208: Unable to resolve CredentialStore %s -- %s";
    }
    @Override
    public final ExpressionResolutionServerException unableToResolveCredentialStore(final String storeName, final String details, final Exception cause) {
        final ExpressionResolutionServerException result = new ExpressionResolutionServerException(String.format(getLoggingLocale(), unableToResolveCredentialStore$str(), storeName, details), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToInitializeCredentialStore$str() {
        return "WFLYELY01209: Unable to initialize CredentialStore %s -- %s";
    }
    @Override
    public final ExpressionResolutionUserException unableToInitializeCredentialStore(final String storeName, final String details, final Exception cause) {
        final ExpressionResolutionUserException result = new ExpressionResolutionUserException(String.format(getLoggingLocale(), unableToInitializeCredentialStore$str(), storeName, details), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalNonManagementInitialization$str() {
        return "WFLYELY01210: Initialisation of an %s without an active management OperationContext is not allowed.";
    }
    @Override
    public final ExpressionResolutionServerException illegalNonManagementInitialization(final Class<?> initialzingClass) {
        final ExpressionResolutionServerException result = new ExpressionResolutionServerException(String.format(getLoggingLocale(), illegalNonManagementInitialization$str(), initialzingClass));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadCredentialStore$str() {
        return "WFLYELY01211: Unable to load the credential store.";
    }
    @Override
    public final OperationFailedException unableToLoadCredentialStore(final Throwable cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToLoadCredentialStore$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingPrivateKey$str() {
        return "WFLYELY01212: KeyStore does not contain a PrivateKey for KeyStore: [%s] and alias: [%s].";
    }
    @Override
    public final StartException missingPrivateKey(final String keyStore, final String alias) {
        final StartException result = new StartException(String.format(getLoggingLocale(), missingPrivateKey$str(), keyStore, alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingPublicKey$str() {
        return "WFLYELY01213: KeyStore does not contain a PublicKey for KeyStore: [%s] and alias: [%s].";
    }
    @Override
    public final StartException missingPublicKey(final String keyStore, final String alias) {
        final StartException result = new StartException(String.format(getLoggingLocale(), missingPublicKey$str(), keyStore, alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToVerifyIntegrity$str() {
        return "WFLYELY01214: Unable to verify the integrity of the filesystem realm: %s";
    }
    @Override
    public final OperationFailedException unableToVerifyIntegrity(final Exception cause, final String causeMessage) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToVerifyIntegrity$str(), causeMessage), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String filesystemMissingKeypair$str() {
        return "WFLYELY01215: Filesystem realm is missing key pair configuration, integrity checking is not enabled";
    }
    @Override
    public final OperationFailedException filesystemMissingKeypair() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), filesystemMissingKeypair$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToGetKeyStorePassword$str() {
        return "WFLYELY01216: Filesystem realm is unable to obtain key store password";
    }
    @Override
    public final RuntimeException unableToGetKeyStorePassword() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unableToGetKeyStorePassword$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String filesystemIntegrityInvalid$str() {
        return "WFLYELY01217: Realm verification failed, invalid signatures for the identities: %s";
    }
    @Override
    public final OperationFailedException filesystemIntegrityInvalid(final String identities) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), filesystemIntegrityInvalid$str(), identities));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyStoreMissingAlias$str() {
        return "WFLYELY01218: Keystore used by filesystem realm does not contain the alias: %s";
    }
    @Override
    public final KeyStoreException keyStoreMissingAlias(final String alias) {
        final KeyStoreException result = new KeyStoreException(String.format(getLoggingLocale(), keyStoreMissingAlias$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String addKeypairToInitializedFilesystemRealm$str() {
        return "WFLYELY01219: Integrity keypair cannot be added to non-empty filesystem realm after initialization. To upgrade a filesystem realm, use Elytron Tool command `filesystem-realm-integrity`";
    }
    @Override
    public final OperationFailedException addKeypairToInitializedFilesystemRealm() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), addKeypairToInitializedFilesystemRealm$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String addSecretKeyToInitializedFilesystemRealm$str() {
        return "WFLYELY01220: Encryption secret key cannot be added to non-empty filesystem realm after initialization. To upgrade a filesystem realm, use Elytron Tool command `filesystem-realm-encrypt`";
    }
    @Override
    public final OperationFailedException addSecretKeyToInitializedFilesystemRealm() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), addSecretKeyToInitializedFilesystemRealm$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToObtainDynamicSSLContext$str() {
        return "WFLYELY01221: Unable to obtain DynamicSSLContext from the provided authentication context";
    }
    @Override
    public final RuntimeException unableToObtainDynamicSSLContext() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unableToObtainDynamicSSLContext$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
