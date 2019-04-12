package rest.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rest.error.NeutralValues;
import rest.memory.Database;
import rest.operator.Finder;
import rest.resource.Animal;
import rest.resource.Enclosure;
import rest.resource.Zoo;
import rest.uri.AlgorithmicURIs;
import rest.uri.ObjectURIs;

@RestController
public class ZooController {
	private Database database = new Database();
	
	
	
	@PutMapping(path="/digital_zoo/predefined")
	public void putPredefinedZoo() {
		Animal animal_one = new Animal("001", "zebra", "female");
		Animal animal_two = new Animal("005", "giraffe", "female");
		Animal animal_three = new Animal("006", "elephant", "male");
		Animal animal_four = new Animal("008", "lion", "female");
		Animal animal_five = new Animal("011", "tiger", "male");
		Animal animal_six = new Animal("022", "ara", "female");
		
		Enclosure enclosure_one = new Enclosure("Zebra Enclosure", "medium");
		enclosure_one.put(animal_one);
		Enclosure enclosure_two = new Enclosure("Saharan Enclosure", "medium");
		enclosure_two.put(animal_two);
		enclosure_two.put(animal_three);
		Enclosure enclosure_three = new Enclosure("Exotic Enclosure", "large");
		enclosure_three.put(animal_four);
		enclosure_three.put(animal_five);
		enclosure_three.put(animal_six);
		
		Zoo zoo = new Zoo("New York Zoo", 10);
		zoo.put(enclosure_one);
		zoo.put(enclosure_two);
		zoo.put(enclosure_three);
		
	    this.database.put(zoo);
	}
	
	
	
	@GetMapping(path=ObjectURIs.GET_ZOO)
	public Zoo getZoo(@PathVariable String zoo_name) {
	    return this.database.get(zoo_name);
	}
	
	@GetMapping(path=ObjectURIs.GET_ENCLOSURE)
	public Enclosure getEnclosure(@PathVariable String zoo_name, @PathVariable String enclosure_id) {
	    return this.database.get(zoo_name).get(enclosure_id);
	}
	
	@GetMapping(path=ObjectURIs.GET_ANIMAL)
	public Animal getAnimal(@PathVariable String zoo_name, @PathVariable String enclosure_id, @PathVariable String animal_tag) {
	    return this.database.get(zoo_name).get(enclosure_id).get(animal_tag);
	}
	
	
	
	@GetMapping(path=AlgorithmicURIs.FIND_ZOOS)
	public List<Zoo> findZoos(@RequestParam(defaultValue=NeutralValues.MIN_INTEGER_STRING) Integer min_ticket_price, @RequestParam(defaultValue=NeutralValues.MAX_INTEGER_STRING) Integer max_ticket_price) {
		Collection<Zoo> zoos = this.database.zoos.values();
		
	    return Finder.findZoos(zoos, min_ticket_price, max_ticket_price);
	}
	
	@GetMapping(path=AlgorithmicURIs.FIND_ENCLOSURES)
	public List<Enclosure> findEnclosuresInZoo(@PathVariable String zoo_name, @RequestParam(defaultValue=NeutralValues.STRING) String enclosure_type) {
		Collection<Enclosure> enclosures = this.database.get(zoo_name).enclosures.values();
		
	    return Finder.findEnclosures(enclosures, enclosure_type);
	}
	
	@GetMapping(path=AlgorithmicURIs.FIND_ANIMALS)
	public List<Animal> findAnimalsInEnclosureInZoo(@PathVariable String zoo_name, @PathVariable String enclosure_id, @RequestParam(defaultValue=NeutralValues.STRING) String animal_sex) {
		Collection<Animal> animals = this.database.get(zoo_name).get(enclosure_id).animals.values();
		
	    return Finder.findAnimals(animals, animal_sex);
	}
}
