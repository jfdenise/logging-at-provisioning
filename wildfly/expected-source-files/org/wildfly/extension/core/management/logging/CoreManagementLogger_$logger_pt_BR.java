package org.wildfly.extension.core.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:17+0200")
public class CoreManagementLogger_$logger_pt_BR extends CoreManagementLogger_$logger_pt implements CoreManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public CoreManagementLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String processStateInitError$str() {
        return "WFLYCM0002: Erro ao inicializar o ouvinte do estado do processo %1$s";
    }
    @Override
    protected String processStateInvokationError$str() {
        return "WFLYCM0003: Erro ao invocar o ouvinte do estado do processo %1$s";
    }
    @Override
    protected String processStateTimeoutError$str() {
        return "WFLYCM0004: O ouvinte do estado do processo %1$s levou muito tempo para ser concluído.";
    }
    @Override
    protected String processStateCleanupError$str() {
        return "WFLYCM0005: Erro ao realizar limpeza para o ouvinte do estado do processo %1$s";
    }
    @Override
    protected String errorToLoadModule$str() {
        return "WFLYCM0006: Erro ao carregar o módulo %1$s";
    }
    @Override
    protected String errorToLoadModuleClass$str() {
        return "WFLYCM0007: Erro ao carregar a classe %1$s a partir do módulo %2$s";
    }
    @Override
    protected String errorToInstantiateClassInstanceFromModule$str() {
        return "WFLYCM0008: Erro ao instanciar a instância da classe %1$s a partir do módulo %2$s";
    }
    @Override
    protected String deploymentContainsUnstableApiAnnotations$str() {
        return "WFLYCM0009: %1$s contém o uso de anotações que indicam API instável.";
    }
    @Override
    protected String classExtendsClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0010: %1$s estende %2$s que foi anotado com %3$s";
    }
    @Override
    protected String classImplementsInterfaceWithUnstableApiAnnotations$str() {
        return "WFLYCM0011: %1$s implementa %2$s que foi anotado com %3$s";
    }
    @Override
    protected String classReferencesFieldWithUnstableApiAnnotations$str() {
        return "WFLYCM0012: %1$s referencia o campo %2$s. %3$s que foi anotado com %4$s";
    }
    @Override
    protected String classReferencesMethodWithUnstableApiAnnotations$str() {
        return "WFLYCM0013: %1$s referencia o método %2$s.%3$s%4$s que foi anotado com %5$s";
    }
    @Override
    protected String classUsesAnnotatedAnnotations$str() {
        return "WFLYCM0015: A classe %1$s é anotada com uma ou mais anotações que por sua vez foram anotadas com anotações indicando API instável: %2$s";
    }
    @Override
    protected String testOutputNumberOfClassesScanned$str() {
        return "WFLYCM0016: %1$d";
    }
}
