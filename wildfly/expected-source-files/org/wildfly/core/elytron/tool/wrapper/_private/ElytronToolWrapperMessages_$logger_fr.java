package org.wildfly.core.elytron.tool.wrapper._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:19+0200")
public class ElytronToolWrapperMessages_$logger_fr extends ElytronToolWrapperMessages_$logger implements ElytronToolWrapperMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronToolWrapperMessages_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String redirectToScriptSimple$str() {
        return "Pour utiliser l'outil WildFly Elytron, le script elytron-tool doit être utilisé et non pas wildfly-elytron-tool.jar.";
    }
}
