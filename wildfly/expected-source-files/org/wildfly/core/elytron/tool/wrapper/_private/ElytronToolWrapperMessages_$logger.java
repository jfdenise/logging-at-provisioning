package org.wildfly.core.elytron.tool.wrapper._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:27:19+0200")
public class ElytronToolWrapperMessages_$logger extends DelegatingBasicLogger implements ElytronToolWrapperMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ElytronToolWrapperMessages_$logger.class.getName();
    public ElytronToolWrapperMessages_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String redirectToScript$str() {
        return "To make use of the WildFly Elytron Tool, the elytron-tool script should be used instead of wildfly-elytron-tool.jar.\n\nRun elytron-tool.sh, elytron-tool.bat, or elytron-tool.ps1 with the same arguments that were previously passed when using wildfly-elytron-tool.jar.\n\nFor example, run:\n%s";
    }
    @Override
    public final String redirectToScript(final String command) {
        return String.format(getLoggingLocale(), redirectToScript$str(), command);
    }
    protected String redirectToScriptSimple$str() {
        return "To make use of the WildFly Elytron Tool, the elytron-tool script should be used instead of wildfly-elytron-tool.jar.\nRun elytron-tool.sh, elytron-tool.bat, or elytron-tool.ps1 with the same arguments that were previously passed when using wildfly-elytron-tool.jar.";
    }
    @Override
    public final String redirectToScriptSimple() {
        return String.format(getLoggingLocale(), redirectToScriptSimple$str());
    }
}
