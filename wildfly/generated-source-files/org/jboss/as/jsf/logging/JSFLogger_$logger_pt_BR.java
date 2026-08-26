package org.jboss.as.jsf.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:26+0200")
public class JSFLogger_$logger_pt_BR extends JSFLogger_$logger_pt implements JSFLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JSFLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String classLoadingFailed$str() {
        return "WFLYJSF0008: Falha ao carregar a classe anotada: %1$s";
    }
    @Override
    protected String loadingJsf12$str() {
        return "WFLYJSF0017: Classes detectadas Faces 1.2. Utilizando org.jboss.as.jsf.injection.weld.legacy.WeldApplicationFactoryLegacy.";
    }
    @Override
    protected String lazyBeanValidationEnabled$str() {
        return "WFLYJSF0020: A validação do bean lento foi habilitada. Isso pode resultar na falta de eventos @PreDestroy quando as sessões distribuídas na web expiram.";
    }
    @Override
    protected String jsfInjectionFailed$str() {
        return "WFLYJSF0016: Falha ao injetar Jakarta Server Faces a partir do slot %1$s";
    }
    @Override
    protected String jsfArtifactNoDefaultConstructor$str() {
        return "WFLYJSF0019: Artefato %1$s de Jakarta Server Faces com classe %2$s não tem construtor padrão, portanto não será considerado para injeção";
    }
    @Override
    protected String unknownJSFVersion$str() {
        return "WFLYJSF0005: Versão desconhecida do Jakarta Server Faces '%1$s'. A versão padrão '%2$s' será usada em seu lugar.";
    }
    @Override
    protected String activatedJSFImplementations$str() {
        return "WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: %1$s";
    }
    @Override
    protected String invalidDefaultJSFImpl$str() {
        return "WFLYJSF0014: O slot '%1$s' de implementação padrão do Jakarta Server Faces é inválido";
    }
    @Override
    protected String managedBeansConfigParseFailed$str() {
        return "WFLYJSF0004: Falha ao analisar %1$s, artefatos de Jakarta Server Faces definidos neste arquivo não estarão disponíveis";
    }
    @Override
    protected String missingJSFModule$str() {
        return "WFLYJSF0006: O slot '%1$s' da versão de Jakarta Server Faces está faltando do módulo %2$s";
    }
    @Override
    protected String invalidAnnotationLocation$str() {
        return "WFLYJSF0009: A anotação %1$s na classe %2$s é apenas permitida nas classes";
    }
    @Override
    protected String loadingJsf2x$str() {
        return "WFLYJSF0018: Classes não detectadas Faces 1.2. Utilizando org.jboss.as.jsf.injection.weld.WeldApplicationFactory.";
    }
}
