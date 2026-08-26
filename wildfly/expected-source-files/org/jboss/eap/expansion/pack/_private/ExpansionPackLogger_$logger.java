package org.jboss.eap.expansion.pack._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T12:02:09+0200")
public class ExpansionPackLogger_$logger extends DelegatingBasicLogger implements ExpansionPackLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ExpansionPackLogger_$logger.class.getName();
    public ExpansionPackLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void expansionPackActive(final String xpName) {
        super.log.logf(FQCN, INFO, null, expansionPackActive$str(), xpName);
    }
    protected String expansionPackActive$str() {
        return "JBEAPXP0003: Starting server with %s installed.";
    }
}
