package rest.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Responsible for exporting values from Spring's injection framework.
 */
@Component
public class Extractor {
	private static ExternalConfig config;
	
	
	
	@Autowired
	public Extractor(ExternalConfig config) {
		Extractor.config = config;
	}
	
	
	
	public static String getWord() {
		return Extractor.config.getWord();
	}
	
	public static Integer getSecretNumber() {
		return Extractor.config.getSecretNumber();
	}
}
