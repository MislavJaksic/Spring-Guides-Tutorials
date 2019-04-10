package rest.external;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix="app")
@Validated
public class ExternalConfig {
	@NotNull
	private Integer secretNumber;
	private String word;
	
	
	
	public Integer getSecretNumber() {
		return secretNumber;
	}
	public void setSecretNumber(Integer secretNumber) {
		this.secretNumber = secretNumber;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
}
