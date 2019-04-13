package rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rest.memory.AnimalData;
import rest.resource.Animal;

@RestController
public class AnimalController {
	@GetMapping(path="/zoos/{zoo_id}/{ownership_id}/{animal_id}")
	public Animal getAnimal(@PathVariable String zoo_id, @PathVariable String ownership_id, @PathVariable String animal_id) {
	    return AnimalData.get(animal_id);
	}
	
	@GetMapping(path="/animals/{animal_id}")
	public Animal getAnimal(@PathVariable String animal_id) {
	    return AnimalData.get(animal_id);
	}
}
