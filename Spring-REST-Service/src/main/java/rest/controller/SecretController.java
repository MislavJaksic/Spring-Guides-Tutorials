package rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rest.external.Extractor;

@RestController
public class SecretController {
    @GetMapping(path="/secret/number")
    public Integer listSecretNumber() {
    	Integer number = Extractor.getSecretNumber();
        return number;
    }
    
    @GetMapping(path="/secret/word")
    public String listSecretWord() {
    	String word = Extractor.getWord();
        return word;
    }
}