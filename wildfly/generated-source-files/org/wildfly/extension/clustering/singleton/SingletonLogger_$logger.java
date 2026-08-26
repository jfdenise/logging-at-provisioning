package org.wildfly.extension.clustering.singleton;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.wildfly.clustering.singleton.service.ServiceTargetFactory;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:07+0200")
public class SingletonLogger_$logger extends DelegatingBasicLogger implements SingletonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = SingletonLogger_$logger.class.getName();
    public SingletonLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void singletonDeploymentDetected(final ServiceTargetFactory arg0) {
        super.log.logf(FQCN, INFO, null, singletonDeploymentDetected$str(), arg0);
    }
    protected String singletonDeploymentDetected$str() {
        return "WFLYCLSNG0001: Singleton deployment detected. Deployment will reset using %s policy.";
    }
}
