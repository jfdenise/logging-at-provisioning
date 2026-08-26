package org.wildfly.core.elytron.tool.wrapper._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:19+0200")
public class ElytronToolWrapperMessages_$logger_pt_BR extends ElytronToolWrapperMessages_$logger_pt implements ElytronToolWrapperMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronToolWrapperMessages_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String redirectToScriptSimple$str() {
        return "Para fazer uso da ferramenta WildFly Elytron, o script elytron-tool deve ser usado em vez do wildfly-elytron-tool.jar.";
    }
}
