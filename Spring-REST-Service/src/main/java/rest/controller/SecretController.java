package rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rest.external.ExternalConfig;

@RestController
public class SecretController {
	@Autowired
	private ExternalConfig config;
	
    @GetMapping(path="/secret/number")
    public Integer listSecretNumber() {
    	Integer number = this.config.getSecretNumber();
        return number;
    }
    
    @GetMapping(path="/secret/word")
    public String listSecretWord() {
    	String word = this.config.getWord();
        return word;
    }
}