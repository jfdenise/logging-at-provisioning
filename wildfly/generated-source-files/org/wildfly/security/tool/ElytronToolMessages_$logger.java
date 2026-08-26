package org.wildfly.security.tool;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.apache.commons.cli.MissingArgumentException;
import java.io.FileNotFoundException;
import java.lang.String;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import org.jboss.logging.Logger;
import java.lang.Exception;
import java.lang.Integer;
import java.security.InvalidParameterException;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import org.apache.commons.cli.MissingOptionException;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:18+0200")
public class ElytronToolMessages_$logger extends DelegatingBasicLogger implements ElytronToolMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ElytronToolMessages_$logger.class.getName();
    public ElytronToolMessages_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String commandOrAliasNotFound$str() {
        return "Command or alias \"%s\" not found.";
    }
    @Override
    public final String commandOrAliasNotFound(final String arg0) {
        return String.format(getLoggingLocale(), commandOrAliasNotFound$str(), arg0);
    }
    protected String inputDataNotConfirmed$str() {
        return "Input data not confirmed. Exiting.";
    }
    @Override
    public final String inputDataNotConfirmed() {
        return String.format(getLoggingLocale(), inputDataNotConfirmed$str());
    }
    protected String cmdHelp$str() {
        return "%s %s";
    }
    @Override
    public final String cmdHelp(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), cmdHelp$str(), arg0, arg1);
    }
    protected String commandExecuteException$str() {
        return "Exception encountered executing the command:";
    }
    @Override
    public final String commandExecuteException() {
        return String.format(getLoggingLocale(), commandExecuteException$str());
    }
    protected String generalHelpTitle$str() {
        return "Printing general help message:";
    }
    @Override
    public final String generalHelpTitle() {
        return String.format(getLoggingLocale(), generalHelpTitle$str());
    }
    protected String cmdLineStoreLocationDesc$str() {
        return "Location of credential store storage file";
    }
    @Override
    public final String cmdLineStoreLocationDesc() {
        return String.format(getLoggingLocale(), cmdLineStoreLocationDesc$str());
    }
    protected String cmdLineCredentialStoreHelpHeader$str() {
        return "\"credential-store\" command is used to perform various operations on credential store.";
    }
    @Override
    public final String cmdLineCredentialStoreHelpHeader() {
        return String.format(getLoggingLocale(), cmdLineCredentialStoreHelpHeader$str());
    }
    protected String cmdLineImplementationPropertiesDesc$str() {
        return "Implementation properties for credential store type in form of \"prop1=value1; ... ;propN=valueN\" .%nSupported properties are dependent on credential store type%nKeyStoreCredentialStore (default implementation) supports following additional properties (all are optional):%nkeyStoreType - specifies the key store type to use (defaults to \"JCEKS\")%nkeyAlias - specifies the secret key alias within the key store to use for encrypt/decrypt of data in external storage (defaults to \"cs_key\")%nexternal - specifies whether to store data to external storage and encrypted by keyAlias key (defaults to \"false\")%ncryptoAlg - cryptographic algorithm name to be used to encrypt/decrypt entries at external storage \"external\" has to be set to \"true\"";
    }
    @Override
    public final String cmdLineImplementationPropertiesDesc() {
        return String.format(getLoggingLocale(), cmdLineImplementationPropertiesDesc$str());
    }
    protected String cmdLineCredentialStorePassword$str() {
        return "Password for credential store";
    }
    @Override
    public final String cmdLineCredentialStorePassword() {
        return String.format(getLoggingLocale(), cmdLineCredentialStorePassword$str());
    }
    protected String cmdLineKeyStorePassword$str() {
        return "Password for KeyStore. Can also be provided by console prompt.";
    }
    @Override
    public final String cmdLineKeyStorePassword() {
        return String.format(getLoggingLocale(), cmdLineKeyStorePassword$str());
    }
    protected String cmdLineKeyStorePasswordEnv$str() {
        return "Name of an environment variable from which to resolve the KeyStore password.";
    }
    @Override
    public final String cmdLineKeyStorePasswordEnv() {
        return String.format(getLoggingLocale(), cmdLineKeyStorePasswordEnv$str());
    }
    protected String cmdLineSaltDesc$str() {
        return "Salt to apply for final masked password of the credential store";
    }
    @Override
    public final String cmdLineSaltDesc() {
        return String.format(getLoggingLocale(), cmdLineSaltDesc$str());
    }
    protected String cmdLineIterationCountDesc$str() {
        return "Iteration count for final masked password of the credential store";
    }
    @Override
    public final String cmdLineIterationCountDesc() {
        return String.format(getLoggingLocale(), cmdLineIterationCountDesc$str());
    }
    protected String cmdLinePasswordCredentialValueDesc$str() {
        return "Password credential value";
    }
    @Override
    public final String cmdLinePasswordCredentialValueDesc() {
        return String.format(getLoggingLocale(), cmdLinePasswordCredentialValueDesc$str());
    }
    protected String cmdLineEntryDesc$str() {
        return "The alias of the existing password entry to encrypt";
    }
    @Override
    public final String cmdLineEntryDesc() {
        return String.format(getLoggingLocale(), cmdLineEntryDesc$str());
    }
    protected String cmdLineEntryTypeDesc$str() {
        return "Type of entry in credential store";
    }
    @Override
    public final String cmdLineEntryTypeDesc() {
        return String.format(getLoggingLocale(), cmdLineEntryTypeDesc$str());
    }
    protected String cmdLineOtherProvidersDesc$str() {
        return "Comma separated list of JCA provider names. Providers will be supplied to the credential store instance.%nEach provider must be installed through java.security file or through service loader from properly packaged jar file on classpath.";
    }
    @Override
    public final String cmdLineOtherProvidersDesc() {
        return String.format(getLoggingLocale(), cmdLineOtherProvidersDesc$str());
    }
    protected String cmdLineCustomCredentialStoreProviderDesc$str() {
        return "Provider name containing CredentialStoreSpi implementation.%nProvider must be installed through java.security file or through service loader from properly packaged jar file on classpath.";
    }
    @Override
    public final String cmdLineCustomCredentialStoreProviderDesc() {
        return String.format(getLoggingLocale(), cmdLineCustomCredentialStoreProviderDesc$str());
    }
    protected String cmdLineCreateCredentialStoreDesc$str() {
        return "* Create credential store";
    }
    @Override
    public final String cmdLineCreateCredentialStoreDesc() {
        return String.format(getLoggingLocale(), cmdLineCreateCredentialStoreDesc$str());
    }
    protected String cmdLineCredentialStoreTypeDesc$str() {
        return "Credential store type";
    }
    @Override
    public final String cmdLineCredentialStoreTypeDesc() {
        return String.format(getLoggingLocale(), cmdLineCredentialStoreTypeDesc$str());
    }
    protected String cmdLineAddAliasDesc$str() {
        return "* Add new alias to the credential store";
    }
    @Override
    public final String cmdLineAddAliasDesc() {
        return String.format(getLoggingLocale(), cmdLineAddAliasDesc$str());
    }
    protected String cmdLineRemoveAliasDesc$str() {
        return "* Remove alias from the credential store";
    }
    @Override
    public final String cmdLineRemoveAliasDesc() {
        return String.format(getLoggingLocale(), cmdLineRemoveAliasDesc$str());
    }
    protected String cmdLineCheckAliasDesc$str() {
        return "* Check if alias exists within the credential store";
    }
    @Override
    public final String cmdLineCheckAliasDesc() {
        return String.format(getLoggingLocale(), cmdLineCheckAliasDesc$str());
    }
    protected String cmdLineAliasesDesc$str() {
        return "* Display all aliases";
    }
    @Override
    public final String cmdLineAliasesDesc() {
        return String.format(getLoggingLocale(), cmdLineAliasesDesc$str());
    }
    protected String cmdLineAliasTypes$str() {
        return "* Display all types of stored credentials for given alias";
    }
    @Override
    public final String cmdLineAliasTypes() {
        return String.format(getLoggingLocale(), cmdLineAliasTypes$str());
    }
    protected String cmdLineGenerateKeyPairDesc$str() {
        return "Generate private and public key pair and store them as a KeyPairCredential";
    }
    @Override
    public final String cmdLineGenerateKeyPairDesc() {
        return String.format(getLoggingLocale(), cmdLineGenerateKeyPairDesc$str());
    }
    protected String cmdLineKeySizeDesc$str() {
        return "Size (number of bytes) of the keys when generating a KeyPairCredential.";
    }
    @Override
    public final String cmdLineKeySizeDesc() {
        return String.format(getLoggingLocale(), cmdLineKeySizeDesc$str());
    }
    protected String cmdLineKeyAlgorithmDesc$str() {
        return "Encryption algorithm to be used when generating a KeyPairCredential: RSA, DSA, or EC. Default RSA";
    }
    @Override
    public final String cmdLineKeyAlgorithmDesc() {
        return String.format(getLoggingLocale(), cmdLineKeyAlgorithmDesc$str());
    }
    protected String cmdLineExportPublicKeyDesc$str() {
        return "Prints the public key stored under a KeyPairCredential as Base64 encoded String, in OpenSSH format.";
    }
    @Override
    public final String cmdLineExportPublicKeyDesc() {
        return String.format(getLoggingLocale(), cmdLineExportPublicKeyDesc$str());
    }
    protected String cmdLineImportKeyPairDesc$str() {
        return "Import a KeyPairCredential into the credential store.";
    }
    @Override
    public final String cmdLineImportKeyPairDesc() {
        return String.format(getLoggingLocale(), cmdLineImportKeyPairDesc$str());
    }
    protected String cmdLinePrivateKeyLocationDesc$str() {
        return "The location of a file containing a private key.";
    }
    @Override
    public final String cmdLinePrivateKeyLocationDesc() {
        return String.format(getLoggingLocale(), cmdLinePrivateKeyLocationDesc$str());
    }
    protected String cmdLinePublicKeyLocationDesc$str() {
        return "The location of a file containing a public key.";
    }
    @Override
    public final String cmdLinePublicKeyLocationDesc() {
        return String.format(getLoggingLocale(), cmdLinePublicKeyLocationDesc$str());
    }
    protected String cmdLineKeyPassphraseDesc$str() {
        return "The passphrase used to decrypt the private key.";
    }
    @Override
    public final String cmdLineKeyPassphraseDesc() {
        return String.format(getLoggingLocale(), cmdLineKeyPassphraseDesc$str());
    }
    protected String cmdLinePrivateKeyStringDesc$str() {
        return "A private key specified as a String.";
    }
    @Override
    public final String cmdLinePrivateKeyStringDesc() {
        return String.format(getLoggingLocale(), cmdLinePrivateKeyStringDesc$str());
    }
    protected String cmdLinePublicKeyStringDesc$str() {
        return "A public key specified as a String.";
    }
    @Override
    public final String cmdLinePublicKeyStringDesc() {
        return String.format(getLoggingLocale(), cmdLinePublicKeyStringDesc$str());
    }
    protected String cmdLinePrintSummary$str() {
        return "Print summary, especially command how to create this credential store";
    }
    @Override
    public final String cmdLinePrintSummary() {
        return String.format(getLoggingLocale(), cmdLinePrintSummary$str());
    }
    protected String cmdLineHelp$str() {
        return "* Get help with usage of this command";
    }
    @Override
    public final String cmdLineHelp() {
        return String.format(getLoggingLocale(), cmdLineHelp$str());
    }
    protected String aliasExists$str() {
        return "Alias \"%s\" exists";
    }
    @Override
    public final String aliasExists(final String arg0) {
        return String.format(getLoggingLocale(), aliasExists$str(), arg0);
    }
    protected String aliasDoesNotExist1$str() {
        return "Alias \"%s\" does not exist";
    }
    @Override
    public final String aliasDoesNotExist(final String arg0) {
        return String.format(getLoggingLocale(), aliasDoesNotExist1$str(), arg0);
    }
    protected String aliasDoesNotExist2$str() {
        return "Alias \"%s\" of type \"%s\" does not exist";
    }
    @Override
    public final String aliasDoesNotExist(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), aliasDoesNotExist2$str(), arg0, arg1);
    }
    protected String aliasStored1$str() {
        return "Alias \"%s\" has been successfully stored";
    }
    @Override
    public final String aliasStored(final String arg0) {
        return String.format(getLoggingLocale(), aliasStored1$str(), arg0);
    }
    protected String aliasStored2$str() {
        return "Alias \"%s\" of type \"%s\" has been successfully stored";
    }
    @Override
    public final String aliasStored(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), aliasStored2$str(), arg0, arg1);
    }
    protected String aliasRemoved1$str() {
        return "Alias \"%s\" has been successfully removed";
    }
    @Override
    public final String aliasRemoved(final String arg0) {
        return String.format(getLoggingLocale(), aliasRemoved1$str(), arg0);
    }
    protected String aliasRemoved2$str() {
        return "Alias \"%s\" of type \"%s\" has been successfully removed";
    }
    @Override
    public final String aliasRemoved(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), aliasRemoved2$str(), arg0, arg1);
    }
    protected String commandSummary$str() {
        return "Credential store command summary:%n--------------------------------------%n%s";
    }
    @Override
    public final String commandSummary(final String arg0) {
        return String.format(getLoggingLocale(), commandSummary$str(), arg0);
    }
    protected String aliases$str() {
        return "Credential store contains following aliases: %s";
    }
    @Override
    public final String aliases(final String arg0) {
        return String.format(getLoggingLocale(), aliases$str(), arg0);
    }
    protected String noAliases$str() {
        return "Credential store contains no aliases";
    }
    @Override
    public final String noAliases() {
        return String.format(getLoggingLocale(), noAliases$str());
    }
    protected String actionToPerformNotDefined$str() {
        return "Action to perform on the credential store is not defined";
    }
    @Override
    public final Exception actionToPerformNotDefined() {
        final Exception result = new Exception(String.format(getLoggingLocale(), actionToPerformNotDefined$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String credentialStorePasswordPrompt$str() {
        return "Credential store password: ";
    }
    @Override
    public final String credentialStorePasswordPrompt() {
        return String.format(getLoggingLocale(), credentialStorePasswordPrompt$str());
    }
    protected String credentialStorePasswordPromptConfirm$str() {
        return "Confirm credential store password: ";
    }
    @Override
    public final String credentialStorePasswordPromptConfirm() {
        return String.format(getLoggingLocale(), credentialStorePasswordPromptConfirm$str());
    }
    protected String keyPassphrasePrompt$str() {
        return "Passphrase to be used to decrypt private key (can be nothing if no passphrase was used to encrypt the key): ";
    }
    @Override
    public final String keyPassphrasePrompt() {
        return String.format(getLoggingLocale(), keyPassphrasePrompt$str());
    }
    protected String keyPassphrasePromptConfirm$str() {
        return "Confirm passphrase to be used to decrypt private key (can be nothing if no passphrase was used to encrypt the key): ";
    }
    @Override
    public final String keyPassphrasePromptConfirm() {
        return String.format(getLoggingLocale(), keyPassphrasePromptConfirm$str());
    }
    protected String secretToStorePrompt$str() {
        return "Secret to store: ";
    }
    @Override
    public final String secretToStorePrompt() {
        return String.format(getLoggingLocale(), secretToStorePrompt$str());
    }
    protected String secretToStorePromptConfirm$str() {
        return "Confirm secret to store: ";
    }
    @Override
    public final String secretToStorePromptConfirm() {
        return String.format(getLoggingLocale(), secretToStorePromptConfirm$str());
    }
    protected String passwordCredentialNotClearText$str() {
        return "The retrieved PasswordCredential does not contain a ClearTextPassword";
    }
    @Override
    public final String passwordCredentialNotClearText() {
        return String.format(getLoggingLocale(), passwordCredentialNotClearText$str());
    }
    protected String cmdMaskHelpHeader$str() {
        return "\"mask\" command is used to get MASK- string encrypted using PBEWithMD5AndDES in PicketBox compatible way.";
    }
    @Override
    public final String cmdMaskHelpHeader() {
        return String.format(getLoggingLocale(), cmdMaskHelpHeader$str());
    }
    protected String cmdMaskSaltDesc$str() {
        return "Salt to apply to masked string";
    }
    @Override
    public final String cmdMaskSaltDesc() {
        return String.format(getLoggingLocale(), cmdMaskSaltDesc$str());
    }
    protected String cmdMaskIterationCountDesc$str() {
        return "Iteration count for masked string";
    }
    @Override
    public final String cmdMaskIterationCountDesc() {
        return String.format(getLoggingLocale(), cmdMaskIterationCountDesc$str());
    }
    protected String cmdMaskSecretDesc$str() {
        return "Secret to be encrypted";
    }
    @Override
    public final String cmdMaskSecretDesc() {
        return String.format(getLoggingLocale(), cmdMaskSecretDesc$str());
    }
    protected String saltNotSpecified$str() {
        return "ELYTOOL00006: Salt not specified.";
    }
    @Override
    public final MissingArgumentException saltNotSpecified() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), saltNotSpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidParameterMustBeIntBetween$str() {
        return "ELYTOOL00007: Invalid \"%s\" value. Must be an integer between %d and %d, inclusive";
    }
    @Override
    public final IllegalArgumentException invalidParameterMustBeIntBetween(final String arg0, final int arg1, final int arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidParameterMustBeIntBetween$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String secretNotSpecified$str() {
        return "Secret not specified.";
    }
    @Override
    public final MissingArgumentException secretNotSpecified() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), secretNotSpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cmdVaultHelpHeader$str() {
        return "\"vault\" command is used convert PicketBox Security Vault to credential store using default implementation (KeyStoreCredentialStore) or custom implementation set with the \"type\" option.";
    }
    @Override
    public final String cmdVaultHelpHeader() {
        return String.format(getLoggingLocale(), cmdVaultHelpHeader$str());
    }
    protected String cmdLineVaultKeyStoreURL$str() {
        return "Vault keystore URL (defaults to \"vault.keystore\")";
    }
    @Override
    public final String cmdLineVaultKeyStoreURL() {
        return String.format(getLoggingLocale(), cmdLineVaultKeyStoreURL$str());
    }
    protected String cmdLineVaultKeyStorePassword$str() {
        return "Vault keystore password:%n- used to open original vault key store%n- used as password for new converted credential store";
    }
    @Override
    public final String cmdLineVaultKeyStorePassword() {
        return String.format(getLoggingLocale(), cmdLineVaultKeyStorePassword$str());
    }
    protected String cmdLineVaultEncryptionDirectory$str() {
        return "Vault directory containing encrypted files (defaults to \"vault\")";
    }
    @Override
    public final String cmdLineVaultEncryptionDirectory() {
        return String.format(getLoggingLocale(), cmdLineVaultEncryptionDirectory$str());
    }
    protected String cmdVaultLineSalt$str() {
        return "8 character salt (defaults to \"12345678\")";
    }
    @Override
    public final String cmdVaultLineSalt() {
        return String.format(getLoggingLocale(), cmdVaultLineSalt$str());
    }
    protected String cmdLineVaultIterationCount$str() {
        return "Iteration count (defaults to \"23\")";
    }
    @Override
    public final String cmdLineVaultIterationCount() {
        return String.format(getLoggingLocale(), cmdLineVaultIterationCount$str());
    }
    protected String cmdLineVaultKeyStoreAlias$str() {
        return "Vault key alias within key store (defaults to \"vault\")";
    }
    @Override
    public final String cmdLineVaultKeyStoreAlias() {
        return String.format(getLoggingLocale(), cmdLineVaultKeyStoreAlias$str());
    }
    protected String cmdLineVaultCSParametersDesc$str() {
        return "Configuration parameters for credential store in form of: \"parameter1=value1; ... ;parameterN=valueN\"%nSupported parameters are dependent on credential store type%nGenerally supported parameters for default credential store implementation (all are optional):%ncreate - automatically creates credential store file (true/false)%nmodifiable - is the credential modifiable (true/false)%nlocation - file location of credential store%nkeyStoreType - specify the key store type to use";
    }
    @Override
    public final String cmdLineVaultCSParametersDesc() {
        return String.format(getLoggingLocale(), cmdLineVaultCSParametersDesc$str());
    }
    protected String vaultConversionSummary$str() {
        return "Vault Conversion summary:%n--------------------------------------%n%s%n--------------------------------------%n";
    }
    @Override
    public final String vaultConversionSummary(final String arg0) {
        return String.format(getLoggingLocale(), vaultConversionSummary$str(), arg0);
    }
    protected String conversionSuccessful$str() {
        return "Vault Conversion Successful%n";
    }
    @Override
    public final String conversionSuccessful() {
        return String.format(getLoggingLocale(), conversionSuccessful$str());
    }
    protected String cliCommandToNewCredentialStore$str() {
        return "CLI command to add new credential store:%n";
    }
    @Override
    public final String cliCommandToNewCredentialStore() {
        return String.format(getLoggingLocale(), cliCommandToNewCredentialStore$str());
    }
    protected String cliCommandBulkVaultCredentialStoreConversion$str() {
        return "* Bulk conversion with options listed in description file. All options have no default value and should be set in the file.%nAll options are required with the exceptions:%n - \"properties\" option%n - \"type\" option (defaults to \"KeyStoreCredentialStore\")%n - \"credential-store-provider\" option%n - \"other-providers\" option%n - \"salt\" and \"iteration\" options can be omitted when plain-text password is used%nEach set of options must start with the \"keystore\" option in the following format:%n keystore:<value>%nkeystore-password:<value>%nenc-dir:<value>%nsalt:<value>%niteration:<value>%nlocation:<value>%nalias:<value>%nproperties:<parameter1>=<value1>; ... ;<parameterN>=<valueN>%ntype:<value>%ncredential-store-provider:<value>%nother-providers:<value>";
    }
    @Override
    public final String cliCommandBulkVaultCredentialStoreConversion() {
        return String.format(getLoggingLocale(), cliCommandBulkVaultCredentialStoreConversion$str());
    }
    protected String cmdLineVaultPrintSummary$str() {
        return "Print summary of conversion";
    }
    @Override
    public final String cmdLineVaultPrintSummary() {
        return String.format(getLoggingLocale(), cmdLineVaultPrintSummary$str());
    }
    protected String cmdLineVaultCSTypeDesc$str() {
        return "Converted credential store type (defaults to \"KeyStoreCredentialStore\")";
    }
    @Override
    public final String cmdLineVaultCSTypeDesc() {
        return String.format(getLoggingLocale(), cmdLineVaultCSTypeDesc$str());
    }
    protected String cmdLineVaultCSLocationDesc$str() {
        return "Location of credential store storage file (defaults to \"converted-vault.cr-store\" in vault encryption directory)";
    }
    @Override
    public final String cmdLineVaultCSLocationDesc() {
        return String.format(getLoggingLocale(), cmdLineVaultCSLocationDesc$str());
    }
    protected String cannotLocateAdminKey$str() {
        return "ELYTOOL00008: Cannot locate admin key with alias \"%s\" or it is of improper type";
    }
    @Override
    public final RuntimeException cannotLocateAdminKey(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotLocateAdminKey$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotParseProps$str() {
        return "ELYTOOL00009: Cannot parse credential store implementation properties from supplied parameter";
    }
    @Override
    public final RuntimeException cannotParseProps() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotParseProps$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String vaultConvertedToCS$str() {
        return "Vault (enc-dir=\"%s\";keystore=\"%s\") converted to credential store \"%s\"";
    }
    @Override
    public final String vaultConvertedToCS(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), vaultConvertedToCS$str(), arg0, arg1, arg2);
    }
    protected String descriptorParseMissingColon$str() {
        return "ELYTOOL00010: Cannot parse conversion descriptor file \"%s\" missing colon at line %s";
    }
    @Override
    public final IOException descriptorParseMissingColon(final String arg0, final String arg1) {
        final IOException result = new IOException(String.format(getLoggingLocale(), descriptorParseMissingColon$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unrecognizedDescriptorAttribute$str() {
        return "ELYTOOL00011: Unrecognized descriptor attribute at line %s";
    }
    @Override
    public final IOException unrecognizedDescriptorAttribute(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), unrecognizedDescriptorAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bulkConversionProblem$str() {
        return "ELYTOOL00012: Problem converting vault (enc-dir=\"%s\";keystore=\"%s\")";
    }
    @Override
    public final Exception bulkConversionProblem(final String arg0, final String arg1, final Throwable arg2) {
        final Exception result = new Exception(String.format(getLoggingLocale(), bulkConversionProblem$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bulkConversionInvalidOption$str() {
        return "ELYTOOL00013: Invalid option \"%s\" when performing bulk conversion. Use bulk conversion descriptor file.";
    }
    @Override
    public final Exception bulkConversionInvalidOption(final String arg0) {
        final Exception result = new Exception(String.format(getLoggingLocale(), bulkConversionInvalidOption$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownEntryType$str() {
        return "ELYTOOL00014: Unknown entry-type \"%s\"";
    }
    @Override
    public final IllegalArgumentException unknownEntryType(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownEntryType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownProvider$str() {
        return "ELYTOOL00015: Unknown provider \"%s\"";
    }
    @Override
    public final IllegalArgumentException unknownProvider(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownProvider$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String credentialStoreCreated$str() {
        return "Credential Store has been successfully created";
    }
    @Override
    public final String credentialStoreCreated() {
        return String.format(getLoggingLocale(), credentialStoreCreated$str());
    }
    protected String optionNotSpecified$str() {
        return "ELYTOOL00016: Option \"%s\" is not specified.";
    }
    @Override
    public final MissingArgumentException optionNotSpecified(final String arg0) {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), optionNotSpecified$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateOptionSpecified$str() {
        return "ELYTOOL00017: Option \"%s\" specified more than once. Only the first occurrence will be used.";
    }
    @Override
    public final String duplicateOptionSpecified(final String arg0) {
        return String.format(getLoggingLocale(), duplicateOptionSpecified$str(), arg0);
    }
    protected String noArgumentOption$str() {
        return "ELYTOOL00018: Option \"%s\" does not expect any arguments.";
    }
    @Override
    public final MissingArgumentException noArgumentOption(final String arg0) {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), noArgumentOption$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String vaultPasswordPrompt$str() {
        return "Vault password: ";
    }
    @Override
    public final String vaultPasswordPrompt() {
        return String.format(getLoggingLocale(), vaultPasswordPrompt$str());
    }
    protected String vaultFileNotFound$str() {
        return "ELYTOOL00019: Encryption directory \"%s\" does not contain \"VAULT.dat\" file.";
    }
    @Override
    public final IllegalArgumentException vaultFileNotFound(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), vaultFileNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String maskSecretPrompt$str() {
        return "Mask secret: ";
    }
    @Override
    public final String maskSecretPrompt() {
        return String.format(getLoggingLocale(), maskSecretPrompt$str());
    }
    protected String maskSecretPromptConfirm$str() {
        return "Confirm mask secret: ";
    }
    @Override
    public final String maskSecretPromptConfirm() {
        return String.format(getLoggingLocale(), maskSecretPromptConfirm$str());
    }
    protected String cmdLineDebug$str() {
        return "Print stack trace when error occurs.";
    }
    @Override
    public final String cmdLineDebug() {
        return String.format(getLoggingLocale(), cmdLineDebug$str());
    }
    protected String commandExecuteExceptionNoDebug$str() {
        return "Exception encountered executing the command. Use option \"--debug\" for complete exception stack trace.";
    }
    @Override
    public final String commandExecuteExceptionNoDebug() {
        return String.format(getLoggingLocale(), commandExecuteExceptionNoDebug$str());
    }
    protected String undefinedAlias$str() {
        return "ELYTOOL00020: Alias was not defined.";
    }
    @Override
    public final MissingArgumentException undefinedAlias() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), undefinedAlias$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String undefinedOutputLocation$str() {
        return "ELYTOOL00021: Location of the output file was not defined.";
    }
    @Override
    public final MissingArgumentException undefinedOutputLocation() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), undefinedOutputLocation$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String undefinedEncryptionDirectory$str() {
        return "ELYTOOL00022: Encryption directory was not defined.";
    }
    @Override
    public final MissingArgumentException undefinedEncryptionDirectory() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), undefinedEncryptionDirectory$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String undefinedVaultPassword$str() {
        return "ELYTOOL00023: Vault password was not defined";
    }
    @Override
    public final MissingArgumentException undefinedVaultPassword() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), undefinedVaultPassword$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String undefinedKeystore$str() {
        return "ELYTOOL00024: Cannot parse conversion descriptor file \"%s\". No keystore specified.";
    }
    @Override
    public final IOException undefinedKeystore(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), undefinedKeystore$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String storageFileDoesNotExist$str() {
        return "ELYTOOL00025: Credential store storage file \"%s\" does not exist.";
    }
    @Override
    public final IllegalArgumentException storageFileDoesNotExist(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), storageFileDoesNotExist$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String storageFileExists$str() {
        return "ELYTOOL00026: Credential store storage file \"%s\" already exists.";
    }
    @Override
    public final IllegalArgumentException storageFileExists(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), storageFileExists$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wrongMaskedPasswordFormat$str() {
        return "ELYTOOL00027: Wrong masked password format. Expected format is \"MASK-<encoded payload>;<salt>;<iteration>\"";
    }
    @Override
    public final IllegalArgumentException wrongMaskedPasswordFormat() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), wrongMaskedPasswordFormat$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String filebasedKeystoreLocationMissing$str() {
        return "ELYTOOL00028: Location parameter is not specified for filebased keystore type '%s'";
    }
    @Override
    public final MissingArgumentException filebasedKeystoreLocationMissing(final String arg0) {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), filebasedKeystoreLocationMissing$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownKeyPairAlgorithm$str() {
        return "ELYTOOL00029: Key Pair Algorithm: '%s' is not supported.";
    }
    @Override
    public final NoSuchAlgorithmException unknownKeyPairAlgorithm(final String arg0) {
        final NoSuchAlgorithmException result = new NoSuchAlgorithmException(String.format(getLoggingLocale(), unknownKeyPairAlgorithm$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyFileDoesNotExist$str() {
        return "ELYTOOL00030: Key file '%s' does not exist.";
    }
    @Override
    public final IllegalArgumentException keyFileDoesNotExist(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), keyFileDoesNotExist$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noPrivateKeySpecified$str() {
        return "ELYTOOL00031: No private key specified for importing.";
    }
    @Override
    public final MissingArgumentException noPrivateKeySpecified() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), noPrivateKeySpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noPublicKeySpecified$str() {
        return "ELYTOOL00032: No public key specified for importing.";
    }
    @Override
    public final MissingArgumentException noPublicKeySpecified() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), noPublicKeySpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String xmlNoPemContent$str() {
        return "ELYTOOL00033: No PEM content found";
    }
    @Override
    public final MissingArgumentException xmlNoPemContent() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), xmlNoPemContent$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidKeySize$str() {
        return "ELYTOOL00034: Invalid keysize provided: %s";
    }
    @Override
    public final InvalidParameterException invalidKeySize(final String arg0) {
        final InvalidParameterException result = new InvalidParameterException(String.format(getLoggingLocale(), invalidKeySize$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String longOptionDescription$str() {
        return "In the message below, option '%s' refers to long option '%s'.";
    }
    @Override
    public final String longOptionDescription(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), longOptionDescription$str(), arg0, arg1);
    }
    protected String cmdFileSystemRealmHelpHeader$str() {
        return "\"filesystem-realm\" command is used to convert legacy properties files and scripts to an Elytron FileSystemRealm.";
    }
    @Override
    public final String cmdFileSystemRealmHelpHeader() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmHelpHeader$str());
    }
    protected String cmdFileSystemRealmUsersFileDesc$str() {
        return "The relative or absolute path to the users file.";
    }
    @Override
    public final String cmdFileSystemRealmUsersFileDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmUsersFileDesc$str());
    }
    protected String cmdFileSystemEncryptCredentialStoreDesc$str() {
        return "The relative or absolute path to the credential store file that contains the secret key.";
    }
    @Override
    public final String cmdFileSystemEncryptCredentialStoreDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptCredentialStoreDesc$str());
    }
    protected String cmdFileSystemEncryptSecretKeyDesc$str() {
        return "The alias of the secret key stored in the credential store file. Set to key by default";
    }
    @Override
    public final String cmdFileSystemEncryptSecretKeyDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptSecretKeyDesc$str());
    }
    protected String cmdFileSystemRealmEncryptPopulateDesc$str() {
        return "Whether or not the credential store should be populated with a Secret Key. Set to true by default.";
    }
    @Override
    public final String cmdFileSystemRealmEncryptPopulateDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmEncryptPopulateDesc$str());
    }
    protected String cmdFileSystemEncryptCreateCredentialStoreDesc$str() {
        return "Whether or not the credential store should be dynamically created if it doesn't exist. Set to true by default.";
    }
    @Override
    public final String cmdFileSystemEncryptCreateCredentialStoreDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptCreateCredentialStoreDesc$str());
    }
    protected String cmdFileSystemEncryptKeyStoreDesc$str() {
        return "The relative or absolute path to the KeyStore file that contains the key pair. Only %napplicable if the filesystem realm has integrity verification enabled.";
    }
    @Override
    public final String cmdFileSystemEncryptKeyStoreDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptKeyStoreDesc$str());
    }
    protected String cmdFileSystemEncryptKeyStoreTypeDesc$str() {
        return "The type of KeyStore to be used. Optional, only applicable if the filesystem %nrealm has integrity verification enabled.";
    }
    @Override
    public final String cmdFileSystemEncryptKeyStoreTypeDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptKeyStoreTypeDesc$str());
    }
    protected String cmdFileSystemEncryptKeyPairAliasDesc$str() {
        return "The alias of the key pair to be used, within the KeyStore. Set to integrity-key by default, only %napplicable if the filesystem realm has integrity verification enabled.";
    }
    @Override
    public final String cmdFileSystemEncryptKeyPairAliasDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptKeyPairAliasDesc$str());
    }
    protected String cmdFileSystemEncryptKeyStorePassword$str() {
        return "Password for KeyStore. Can also be provided by console prompt. Only applicable if %nthe filesystem realm has integrity verification enabled.";
    }
    @Override
    public final String cmdFileSystemEncryptKeyStorePassword() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptKeyStorePassword$str());
    }
    protected String cmdFileSystemEncryptKeyStorePasswordEnv$str() {
        return "Name of an environment variable from which to resolve the KeyStore password. Only %napplicable if the filesystem realm has integrity verification enabled.";
    }
    @Override
    public final String cmdFileSystemEncryptKeyStorePasswordEnv() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptKeyStorePasswordEnv$str());
    }
    protected String inputLocationNotSpecified$str() {
        return "Input Realm location not specified.";
    }
    @Override
    public final MissingArgumentException inputLocationNotSpecified() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), inputLocationNotSpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String inputLocationDoesNotExist$str() {
        return "Input Realm location directory does not exist.";
    }
    @Override
    public final MissingArgumentException inputLocationDoesNotExist() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), inputLocationDoesNotExist$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String outputLocationNotSpecified$str() {
        return "Output Realm location not specified.";
    }
    @Override
    public final MissingArgumentException outputLocationNotSpecified() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), outputLocationNotSpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String credentialStoreDoesNotExist$str() {
        return "Credential Store location not specified.";
    }
    @Override
    public final MissingArgumentException credentialStoreDoesNotExist() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), credentialStoreDoesNotExist$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fileSystemEncryptRequiredParametersNotSpecified$str() {
        return "A required parameter is not specified.";
    }
    @Override
    public final String fileSystemEncryptRequiredParametersNotSpecified() {
        return String.format(getLoggingLocale(), fileSystemEncryptRequiredParametersNotSpecified$str());
    }
    protected String cmdFileSystemEncryptHashEncodingDesc$str() {
        return "The hash encoding to be used in the filesystem realm. Set to BASE64 by default.";
    }
    @Override
    public final String cmdFileSystemEncryptHashEncodingDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptHashEncodingDesc$str());
    }
    protected String cmdFileSystemEncryptEncodedDesc$str() {
        return "If the original realm has encoded set to true. Set to true by default.";
    }
    @Override
    public final String cmdFileSystemEncryptEncodedDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptEncodedDesc$str());
    }
    protected String cmdFileSystemEncryptLevelsDesc$str() {
        return "The levels to be used in the filesystem realm. Set to 2 by default.";
    }
    @Override
    public final String cmdFileSystemEncryptLevelsDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptLevelsDesc$str());
    }
    protected String cmdFileSystemEncryptInputLocationDesc$str() {
        return "The absolute or relative location of the original filesystem realm.";
    }
    @Override
    public final String cmdFileSystemEncryptInputLocationDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptInputLocationDesc$str());
    }
    protected String cmdFileSystemEncryptOutputLocationDesc$str() {
        return "The directory where the new filesystem realm resides.";
    }
    @Override
    public final String cmdFileSystemEncryptOutputLocationDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptOutputLocationDesc$str());
    }
    protected String cmdFileSystemEncryptNewRealmDesc$str() {
        return "The name of the new filesystem-realm.";
    }
    @Override
    public final String cmdFileSystemEncryptNewRealmDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptNewRealmDesc$str());
    }
    protected String cmdFileSystemRealmRolesFileDesc$str() {
        return "The relative or absolute path to the roles file.";
    }
    @Override
    public final String cmdFileSystemRealmRolesFileDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmRolesFileDesc$str());
    }
    protected String cmdFileSystemRealmOutputLocationDesc$str() {
        return "The relative or absolute path to the output directory.";
    }
    @Override
    public final String cmdFileSystemRealmOutputLocationDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmOutputLocationDesc$str());
    }
    protected String cmdFileSystemRealmFileSystemRealmNameDesc$str() {
        return "Name of the filesystem-realm to be configured.";
    }
    @Override
    public final String cmdFileSystemRealmFileSystemRealmNameDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmFileSystemRealmNameDesc$str());
    }
    protected String cmdFileSystemRealmSecurityDomainNameDesc$str() {
        return "Name of the security-domain to be configured.";
    }
    @Override
    public final String cmdFileSystemRealmSecurityDomainNameDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmSecurityDomainNameDesc$str());
    }
    protected String cmdFileSystemRealmBulkConvertDesc$str() {
        return "* Bulk conversion with options listed in description file. Optional options have default values, required options do not.%nThe options fileSystemRealmName and securityDomainName are optional. %nThese optional options have default values of: converted-properties-filesystem-realm and converted-properties-security-domain. %nValues are required for the following options: users-file, roles-file, and output-location. %nIf one or more these required values are not set, the corresponding block is skipped. %nEach option must be specified in the following format: <option>:<value>. The order of options does not matter. %nBlocks of options must be separated by a blank line.";
    }
    @Override
    public final String cmdFileSystemRealmBulkConvertDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmBulkConvertDesc$str());
    }
    protected String cmdFileSystemRealmEncryptBulkConvertDesc$str() {
        return "* Bulk conversion with options listed in description file. Optional options have default values, required options do not. %nThe options realm-name, hash-encoding, levels, secret-key, create, populate, keystore, type, password, password-env, and key-pair are optional. %nValues are required for the following options: input-location, output-location, and credential-store. %nThe default values of realm-name, hash-encoding, hash-charset, levels, secret-key, create, and populate are encrypted-filesystem-realm, BASE64, UTF-8, 2, key, true, and true respectively. %nIf one or more these required values are not set, the corresponding block is skipped. %nIf keystore is provided, then either password or password-env are required. %nEach option must be specified in the following format: <option>:<value>. The order of options does not matter. %nBlocks of options must be separated by a blank line.";
    }
    @Override
    public final String cmdFileSystemRealmEncryptBulkConvertDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmEncryptBulkConvertDesc$str());
    }
    protected String cmdFileSystemRealmIntegrityBulkConvertDesc$str() {
        return "* Bulk conversion with options listed in description file. Optional options have defaults and can be skipped ([type, default_or_NULL]), required options do not (<type>). %nOne of either password or password-env is required. %nBlocks of options must be separated by a blank line; order is not important. Syntax: %ninput-location:<directory>%noutput-location:[directory,NULL]%nrealm-name:[name,filesystem-realm-with-integrity]%nkeystore:<file>%ntype:[name,NULL]%npassword:[password,NULL]%npassword-env:[name,NULL]%nkey-pair:[name,integrity-key]%ncredential-store:[file,NULL]%nsecret-key:[name,NULL]%nlevels:[number,2]%nhash-encoding:[name,BASE64]%nhash-charset:[name,UTF-8]%nencoded:[bool,true]";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityBulkConvertDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityBulkConvertDesc$str());
    }
    protected String cmdFileSystemEncryptHelpHeader$str() {
        return "\"filesystem-realm-encrypt\" command is used to convert non-empty, un-encrypted FileSystemSecurityRealm(s) to encrypted FileSystemSecurityRealm(s) with a SecretKey.";
    }
    @Override
    public final String cmdFileSystemEncryptHelpHeader() {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptHelpHeader$str());
    }
    protected String cmdFileSystemEncryptionNoSecretKey$str() {
        return "Secret Key was not found in the Credential Store at %s, and populate option was not set. Skipping descriptor file block number %d.";
    }
    @Override
    public final String cmdFileSystemEncryptionNoSecretKey(final String arg0, final Integer arg1) {
        return String.format(getLoggingLocale(), cmdFileSystemEncryptionNoSecretKey$str(), arg0, arg1);
    }
    protected String cmdFileSystemRealmIntegrityOutputLocationDesc$str() {
        return "The directory where the new filesystem realm resides. If not provided, realm will be upgraded in-place (with backup), %nand realm-name option will not be used in file path.";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityOutputLocationDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityOutputLocationDesc$str());
    }
    protected String cmdFileSystemRealmIntegrityNewRealmDesc$str() {
        return "The name of the new filesystem-realm. Will be appended to output-location path (if output-location is provided). %nWhen not set, nothing is appended to the path, and `filesystem-realm-with-integrity` is used for the WildFly resource name.%n";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityNewRealmDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityNewRealmDesc$str());
    }
    protected String cmdFileSystemRealmIntegrityKeyStoreDesc$str() {
        return "The relative or absolute path to the KeyStore file that contains the key pair.";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityKeyStoreDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityKeyStoreDesc$str());
    }
    protected String cmdFileSystemRealmIntegrityKeyStoreTypeDesc$str() {
        return "The type of KeyStore to be used. Optional.";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityKeyStoreTypeDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityKeyStoreTypeDesc$str());
    }
    protected String cmdFileSystemRealmIntegrityKeyPairAliasDesc$str() {
        return "The alias of the key pair to be used, within the KeyStore. Set to integrity-key by default.";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityKeyPairAliasDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityKeyPairAliasDesc$str());
    }
    protected String cmdFileSystemRealmIntegrityCredentialStoreDesc$str() {
        return "The relative or absolute path to the secret-key-credential-store file. Only %napplicable if the filesystem realm is encrypted.";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityCredentialStoreDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityCredentialStoreDesc$str());
    }
    protected String cmdFileSystemRealmIntegritySecretKeyDesc$str() {
        return "The alias of the secret key stored in the credential store file. Set to key by default, only %napplicable if the filesystem realm is encrypted.";
    }
    @Override
    public final String cmdFileSystemRealmIntegritySecretKeyDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegritySecretKeyDesc$str());
    }
    protected String cmdFileSystemRealmIntegrityLevelsDesc$str() {
        return "The number of levels used in the input filesystem realm. Set to 2 by default.";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityLevelsDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityLevelsDesc$str());
    }
    protected String cmdFileSystemRealmIntegrityHashEncodingDesc$str() {
        return "The hash encoding used in the input filesystem realm. Set to BASE64 by default.%nRegardless of setting, the output realm will always be BASE64-encoded.";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityHashEncodingDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityHashEncodingDesc$str());
    }
    protected String cmdFileSystemRealmIntegrityHashCharsetDesc$str() {
        return "The character set used to convert the password string to a byte array. Defaults to UTF-8.";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityHashCharsetDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityHashCharsetDesc$str());
    }
    protected String cmdFileSystemRealmIntegrityEncodedDesc$str() {
        return "Indicates if the original realm used Base32-encoded identities as file names.%nSet to true by default. Regardless of setting, the output realm will always use Base32-encoding in file names.";
    }
    @Override
    public final String cmdFileSystemRealmIntegrityEncodedDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmIntegrityEncodedDesc$str());
    }
    protected String mutuallyExclusiveOptionsIntegritySpecified$str() {
        return "Both --bulk-convert and at least one other realm configuration option was specified. %nThe bulk-convert option may only be used with --help, --debug, --silent, and --summary options.";
    }
    @Override
    public final MissingOptionException mutuallyExclusiveOptionsIntegritySpecified() {
        final MissingOptionException result = new MissingOptionException(String.format(getLoggingLocale(), mutuallyExclusiveOptionsIntegritySpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cmdFileSystemIntegrityHelpHeader$str() {
        return "'FileSystem Realm Integrity' command is used to sign existing, non-empty FileSystem Security Realms with a key pair, for future integrity validation.";
    }
    @Override
    public final String cmdFileSystemIntegrityHelpHeader() {
        return String.format(getLoggingLocale(), cmdFileSystemIntegrityHelpHeader$str());
    }
    protected String keyStorePasswordPrompt$str() {
        return "KeyStore password: ";
    }
    @Override
    public final String keyStorePasswordPrompt() {
        return String.format(getLoggingLocale(), keyStorePasswordPrompt$str());
    }
    protected String keyStorePathNotSpecified$str() {
        return "KeyStore path not specified.";
    }
    @Override
    public final MissingArgumentException keyStorePathNotSpecified() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), keyStorePathNotSpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyStoreDoesNotExist$str() {
        return "KeyStore does not exist.";
    }
    @Override
    public final MissingArgumentException keyStoreDoesNotExist() {
        final MissingArgumentException result = new MissingArgumentException(String.format(getLoggingLocale(), keyStoreDoesNotExist$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String encodedMustBeBoolean$str() {
        return "Encoded option must be set to 'true' or 'false'.";
    }
    @Override
    public final IllegalArgumentException encodedMustBeBoolean() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), encodedMustBeBoolean$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cmdFileSystemRealmSilentDesc$str() {
        return "Suppresses all output except errors and prompts.";
    }
    @Override
    public final String cmdFileSystemRealmSilentDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmSilentDesc$str());
    }
    protected String cmdFileSystemRealmSummaryDesc$str() {
        return "Provides a detailed summary of all operations performed, once the command finishes.";
    }
    @Override
    public final String cmdFileSystemRealmSummaryDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmSummaryDesc$str());
    }
    protected String cmdFileSystemRealmOverwriteCliScriptFileDesc$str() {
        return "Whether the cli script file will be overwritten, if attempting to write to an existing file.";
    }
    @Override
    public final String cmdFileSystemRealmOverwriteCliScriptFileDesc() {
        return String.format(getLoggingLocale(), cmdFileSystemRealmOverwriteCliScriptFileDesc$str());
    }
    protected String missingUsersFile$str() {
        return "No users file specified. Please use either --bulk-convert <file> or specify a users file using --users-file <file>";
    }
    @Override
    public final MissingOptionException missingUsersFile() {
        final MissingOptionException result = new MissingOptionException(String.format(getLoggingLocale(), missingUsersFile$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingRolesFile$str() {
        return "No roles file specified. Please use either --bulk-convert <file> or specify a roles file using --roles-file <file>";
    }
    @Override
    public final MissingOptionException missingRolesFile() {
        final MissingOptionException result = new MissingOptionException(String.format(getLoggingLocale(), missingRolesFile$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingOutputLocation$str() {
        return "No output location specified. Please use either --bulk-convert <file> or specify an output location using --output-location <directory>";
    }
    @Override
    public final MissingOptionException missingOutputLocation() {
        final MissingOptionException result = new MissingOptionException(String.format(getLoggingLocale(), missingOutputLocation$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mutuallyExclusiveOptionsSpecified$str() {
        return "Both --bulk-convert and one or more of --users-file, --roles-file, and/or --output-location were specified. Please only use --bulk-convert or all of --users-file, --roles-file, and --output-location.";
    }
    @Override
    public final MissingOptionException mutuallyExclusiveOptionsSpecified() {
        final MissingOptionException result = new MissingOptionException(String.format(getLoggingLocale(), mutuallyExclusiveOptionsSpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mutuallyExclusiveOptionsEncryptSpecified$str() {
        return "Both --bulk-convert and one or more of --old-realm-name, --new-realm-name, --input-location, --output-location, --credential-store, --secret-key, --keystore, --type, --key-pair, --password and/or --password-env were specified. Please only use --bulk-convert or all of the other others.";
    }
    @Override
    public final MissingOptionException mutuallyExclusiveOptionsEncryptSpecified() {
        final MissingOptionException result = new MissingOptionException(String.format(getLoggingLocale(), mutuallyExclusiveOptionsEncryptSpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noValueFound$str() {
        return "No value found for %s.";
    }
    @Override
    public final String noValueFound(final String arg0) {
        return String.format(getLoggingLocale(), noValueFound$str(), arg0);
    }
    protected String fileNotFound$str() {
        return "Could not find the specified file %s.";
    }
    @Override
    public final FileNotFoundException fileNotFound(final String arg0) {
        final FileNotFoundException result = new FileNotFoundException(String.format(getLoggingLocale(), fileNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToUpgradeInPlace$str() {
        return "Could not copy input filesystem realm at %s for in-place upgrade.%nOutput filesystem will be placed at %s";
    }
    @Override
    public final String unableToUpgradeInPlace(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), unableToUpgradeInPlace$str(), arg0, arg1);
    }
    protected String skippingDescriptorBlock$str() {
        return "Skipping descriptor file block number %d due to %s.";
    }
    @Override
    public final String skippingDescriptorBlock(final Integer arg0, final String arg1) {
        return String.format(getLoggingLocale(), skippingDescriptorBlock$str(), arg0, arg1);
    }
    protected String skippingDescriptorBlockInputLocation$str() {
        return "Skipping descriptor file block number %d due to missing input realm location.";
    }
    @Override
    public final String skippingDescriptorBlockInputLocation(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockInputLocation$str(), arg0);
    }
    protected String skippingDescriptorBlockCredentialStoreLocation$str() {
        return "Skipping descriptor file block number %d due to missing credential store location.";
    }
    @Override
    public final String skippingDescriptorBlockCredentialStoreLocation(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockCredentialStoreLocation$str(), arg0);
    }
    protected String skippingDescriptorBlockOutputLocation$str() {
        return "Skipping descriptor file block number %d due to missing output realm location.";
    }
    @Override
    public final String skippingDescriptorBlockOutputLocation(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockOutputLocation$str(), arg0);
    }
    protected String skippingDescriptorBlockKeyStorePath$str() {
        return "Skipping descriptor file block number %d due to missing KeyStore path.";
    }
    @Override
    public final String skippingDescriptorBlockKeyStorePath(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockKeyStorePath$str(), arg0);
    }
    protected String skippingDescriptorBlockPassword$str() {
        return "Skipping descriptor file block number %d due to missing KeyStore password.";
    }
    @Override
    public final String skippingDescriptorBlockPassword(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockPassword$str(), arg0);
    }
    protected String skippingDescriptorBlockInvalidKeyStorePath$str() {
        return "Skipping descriptor file block number %d due to invalid KeyStore path.";
    }
    @Override
    public final String skippingDescriptorBlockInvalidKeyStorePath(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockInvalidKeyStorePath$str(), arg0);
    }
    protected String skippingDescriptorBlockKeyStoreNotLoaded$str() {
        return "Skipping descriptor file block number %d due to failure to load KeyStore.";
    }
    @Override
    public final String skippingDescriptorBlockKeyStoreNotLoaded(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockKeyStoreNotLoaded$str(), arg0);
    }
    protected String skippingDescriptorBlockKeyPairFail$str() {
        return "Skipping descriptor file block number %d due to failure to load key pair.";
    }
    @Override
    public final String skippingDescriptorBlockKeyPairFail(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockKeyPairFail$str(), arg0);
    }
    protected String skippingDescriptorBlockMissingPrivateKey$str() {
        return "Skipping descriptor file block number %d due to missing private key.";
    }
    @Override
    public final String skippingDescriptorBlockMissingPrivateKey(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockMissingPrivateKey$str(), arg0);
    }
    protected String skippingDescriptorBlockMissingPublicKey$str() {
        return "Skipping descriptor file block number %d due to missing public key.";
    }
    @Override
    public final String skippingDescriptorBlockMissingPublicKey(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockMissingPublicKey$str(), arg0);
    }
    protected String skippingDescriptorBlockFilesystemRealmName$str() {
        return "Skipping descriptor file block number %d due to missing new filesystem realm name.";
    }
    @Override
    public final String skippingDescriptorBlockFilesystemRealmName(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockFilesystemRealmName$str(), arg0);
    }
    protected String skippingDescriptorBlockEmptyRealm$str() {
        return "Skipping descriptor file block number %d due to no identities present in filesystem realm.%nKeys for this realm can be added via the management client.";
    }
    @Override
    public final String skippingDescriptorBlockEmptyRealm(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockEmptyRealm$str(), arg0);
    }
    protected String fileSystemRealmEncryptCreatingRealm$str() {
        return "Creating encrypted realm for: %s";
    }
    @Override
    public final String fileSystemRealmEncryptCreatingRealm(final String arg0) {
        return String.format(getLoggingLocale(), fileSystemRealmEncryptCreatingRealm$str(), arg0);
    }
    protected String fileSystemRealmIntegrityCreatingRealm$str() {
        return "Creating filesystem realm with integrity verification for: %s";
    }
    @Override
    public final String fileSystemRealmIntegrityCreatingRealm(final String arg0) {
        return String.format(getLoggingLocale(), fileSystemRealmIntegrityCreatingRealm$str(), arg0);
    }
    protected String fileSystemRealmIntegrityInPlaceBackup$str() {
        return "In-place upgrade for descriptor block %d: filesystem realm backed up at %s%nRealm name will not be used in output realm path.";
    }
    @Override
    public final String fileSystemRealmIntegrityInPlaceBackup(final Integer arg0, final String arg1) {
        return String.format(getLoggingLocale(), fileSystemRealmIntegrityInPlaceBackup$str(), arg0, arg1);
    }
    protected String shouldFileBeOverwritten$str() {
        return "Should file %s be overwritten? (y/n) ";
    }
    @Override
    public final String shouldFileBeOverwritten(final String arg0) {
        return String.format(getLoggingLocale(), shouldFileBeOverwritten$str(), arg0);
    }
    protected String cmdLineActionsHelpHeader$str() {
        return "Some of the parameters below are mutually exclusive actions which are marked with * in the description.";
    }
    @Override
    public final String cmdLineActionsHelpHeader() {
        return String.format(getLoggingLocale(), cmdLineActionsHelpHeader$str());
    }
    protected String keySize$str() {
        return "Key size (bits).";
    }
    @Override
    public final String keySize() {
        return String.format(getLoggingLocale(), keySize$str());
    }
    protected String generateSecretKey$str() {
        return "Generate a new SecretKey and store it in the credential store.";
    }
    @Override
    public final String generateSecretKey() {
        return String.format(getLoggingLocale(), generateSecretKey$str());
    }
    protected String exportSecretKey$str() {
        return "Export existing SecretKey stored in the credential store.";
    }
    @Override
    public final String exportSecretKey() {
        return String.format(getLoggingLocale(), exportSecretKey$str());
    }
    protected String exportedSecretKey$str() {
        return "Exported SecretKey for alias %s=%s";
    }
    @Override
    public final String exportedSecretKey(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), exportedSecretKey$str(), arg0, arg1);
    }
    protected String key$str() {
        return "The encoded Key to import.";
    }
    @Override
    public final String key() {
        return String.format(getLoggingLocale(), key$str());
    }
    protected String importSecretKey$str() {
        return "Import an existing encoded SecretKey to the credential store.";
    }
    @Override
    public final String importSecretKey() {
        return String.format(getLoggingLocale(), importSecretKey$str());
    }
    protected String keyToImport$str() {
        return "SecretKey to import: ";
    }
    @Override
    public final String keyToImport() {
        return String.format(getLoggingLocale(), keyToImport$str());
    }
    protected String encrypt$str() {
        return "Encrypt a clear text string using the SecretKey specified by <alias>.";
    }
    @Override
    public final String encrypt() {
        return String.format(getLoggingLocale(), encrypt$str());
    }
    protected String clearText$str() {
        return "The clear text to encrypt.";
    }
    @Override
    public final String clearText() {
        return String.format(getLoggingLocale(), clearText$str());
    }
    protected String clearTextToImport$str() {
        return "Clear text value:";
    }
    @Override
    public final String clearTextToImport() {
        return String.format(getLoggingLocale(), clearTextToImport$str());
    }
    protected String clearTextToImportAgain$str() {
        return "Confirm clear text value:";
    }
    @Override
    public final String clearTextToImportAgain() {
        return String.format(getLoggingLocale(), clearTextToImportAgain$str());
    }
    protected String encryptedToken$str() {
        return "Clear text encrypted to token '%s' using alias '%s'.";
    }
    @Override
    public final String encryptedToken(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), encryptedToken$str(), arg0, arg1);
    }
    protected String locationDoesNotExistCreationDisabled$str() {
        return "Location that has been specified '%s' does not exist and automatic storage creation for the Credential Store is disabled.";
    }
    @Override
    public final IllegalArgumentException locationDoesNotExistCreationDisabled(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), locationDoesNotExistCreationDisabled$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String types$str() {
        return "Credential store contains credentials of types:%s for alias '%s'";
    }
    @Override
    public final String types(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), types$str(), arg0, arg1);
    }
    protected String invalidParameterDefaultWillBeUsed$str() {
        return "Invalid \"%s\" parameter. Default value \"%s\" will be used.";
    }
    @Override
    public final String invalidParameterDefaultWillBeUsed(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), invalidParameterDefaultWillBeUsed$str(), arg0, arg1);
    }
    protected String invalidParameterGeneratedWillBeUsed$str() {
        return "Invalid \"%s\" parameter. Generated value \"%s\" will be used.";
    }
    @Override
    public final String invalidParameterGeneratedWillBeUsed(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), invalidParameterGeneratedWillBeUsed$str(), arg0, arg1);
    }
    protected String fipsModeNotAllowed$str() {
        return "Mask password operation is not allowed in FIPS mode.";
    }
    @Override
    public final String fipsModeNotAllowed() {
        return String.format(getLoggingLocale(), fipsModeNotAllowed$str());
    }
    protected String existingCredentialStore$str() {
        return "Found credential store and alias, using pre-existing key";
    }
    @Override
    public final String existingCredentialStore() {
        return String.format(getLoggingLocale(), existingCredentialStore$str());
    }
    protected String skippingDescriptorBlockCredentialStoreNotLoaded$str() {
        return "Skipping descriptor file block number %d due to failure to load Credential Store.";
    }
    @Override
    public final String skippingDescriptorBlockCredentialStoreNotLoaded(final Integer arg0) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockCredentialStoreNotLoaded$str(), arg0);
    }
    protected String skippingDescriptorBlockSecretKeyUnsupported$str() {
        return "Credential Store at %s does not support SecretKey. Skipping descriptor file block number %d.";
    }
    @Override
    public final String skippingDescriptorBlockSecretKeyUnsupported(final String arg0, final Integer arg1) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockSecretKeyUnsupported$str(), arg0, arg1);
    }
    protected String skippingDescriptorBlockUnableToPopulateCredentialStore$str() {
        return "Exception was thrown while populating Credential Store at %s. Skipping descriptor file block number %d.";
    }
    @Override
    public final String skippingDescriptorBlockUnableToPopulateCredentialStore(final String arg0, final Integer arg1) {
        return String.format(getLoggingLocale(), skippingDescriptorBlockUnableToPopulateCredentialStore$str(), arg0, arg1);
    }
    protected String missingCredentialStoreSecretKey$str() {
        return "No Credential Store location or Secret Key Alias specified.";
    }
    @Override
    public final MissingOptionException missingCredentialStoreSecretKey() {
        final MissingOptionException result = new MissingOptionException(String.format(getLoggingLocale(), missingCredentialStoreSecretKey$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String generalHelpOptionsOpening$str() {
        return "To get list of options for a specific command, please specify the command by using ./elytron-tool.sh [command] --help";
    }
    @Override
    public final String generalHelpOptionsOpening() {
        return String.format(getLoggingLocale(), generalHelpOptionsOpening$str());
    }
    protected String cmdElytronToolDescription$str() {
        return "A tool that assists with Elytron configuration";
    }
    @Override
    public final String cmdElytronToolDescription() {
        return String.format(getLoggingLocale(), cmdElytronToolDescription$str());
    }
    protected String mutuallyExclusiveOptions$str() {
        return "ELYTOOL00035: Only one of '%s' and '%s' can be specified at the same time";
    }
    @Override
    public final IllegalArgumentException mutuallyExclusiveOptions(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), mutuallyExclusiveOptions$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
