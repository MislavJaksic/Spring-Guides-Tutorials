package rest.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rest.resource.Animal;
import rest.resource.Enclosure;
import rest.resource.Zoo;

@RestController
public class ZooController {
	private Zoo zoo = new Zoo();
    
    @GetMapping(path="/zoo/enclosure")
    public Zoo listEnclosures() {
        return this.zoo;
    }
    
    @GetMapping(path="/zoo/{enclosure}")
    public Enclosure getEnclosure(@RequestParam(value="enclosure") String name) {
        return this.zoo.get(name);
    }
    
    @PutMapping(path="/zoo/{enclosure}")
    public Zoo createEnclosure(@RequestParam(value="enclosure") String name) {
    	Enclosure enclosure = new Enclosure();
        this.zoo.set(name, enclosure);
        return this.zoo;
    }
    
    @GetMapping(path="/zoo/{enclosure}/animal")
    public Map<String, Enclosure> listAnimals() {
        return this.zoo.enclosures;
    }
    
    @GetMapping(path="/zoo/{enclosure}/{animal}")
    public Animal getAnimal(@RequestParam(value="enclosure") String enclosure_name, @RequestParam(value="animal") String animal_name) {
        return this.zoo.enclosures.get(enclosure_name).get(animal_name);
    }
    
    @PutMapping(path="/zoo/{enclosure}/{animal}")
    public Animal createAnimal(@RequestParam(value="enclosure") String enclosure_name, @RequestParam(value="animal") String animal_name, @RequestBody Animal animal) {
    	this.zoo.enclosures.get(enclosure_name).set(animal_name, animal);
        return animal;
    }
}
