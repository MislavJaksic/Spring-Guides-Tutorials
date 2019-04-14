package rest.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rest.memory.AnimalData;
import rest.representation.AnimalRepresentation;
import rest.resource.Animal;

@RestController
public class AnimalController {
	@GetMapping(path="/animals")
	public List<AnimalRepresentation> getAnimals() {
		List<AnimalRepresentation> representations = new ArrayList<AnimalRepresentation>();
		Collection<Animal> animals = AnimalData.animals.values();
		for (Animal animal : animals) {
			AnimalRepresentation representation = new AnimalRepresentation(animal);
			representations.add(representation);
		}
		
	    return representations;
	}
	
	@GetMapping(path="/zoo/{zoo_id}/{ownership_id}/{animal_id}")
	public AnimalRepresentation getAnimal(@PathVariable String zoo_id, @PathVariable String ownership_id, @PathVariable String animal_id) {
		Animal animal = AnimalData.get(animal_id);
		AnimalRepresentation representation = new AnimalRepresentation(animal);
		
		return representation;
	}
	
	@GetMapping(path="/animal/{animal_id}")
	public AnimalRepresentation getAnimal(@PathVariable String animal_id) {
		Animal animal = AnimalData.get(animal_id);
		AnimalRepresentation representation = new AnimalRepresentation(animal);
		
	    return representation;
	}
}
