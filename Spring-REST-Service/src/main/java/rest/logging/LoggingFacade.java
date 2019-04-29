package rest.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingFacade {
	private Logger logger;
	
	
	
	public LoggingFacade(Class<?> class_name) {
		this.logger = LoggerFactory.getLogger(class_name);
	}
	
	public void info(String message) {
		logger.info(message);
	}

	public void debug(String message) {
		logger.debug(message);
	}

	public void error(String message) {
		logger.error(message);
	}
}
