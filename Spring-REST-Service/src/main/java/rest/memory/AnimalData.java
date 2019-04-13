package rest.memory;

import java.util.HashMap;
import java.util.Map;

import rest.error.NeutralValues;
import rest.resource.Animal;

public class AnimalData {
	public static Map<String, Animal> animals = new HashMap<String, Animal>();
	
	

	public static void put(Animal animal) {
		AnimalData.animals.put(animal.id, animal);
	}
	
	public static Animal get(String id) {
		Animal animal = AnimalData.animals.get(id);
		
		if (animal == null) {
			animal = NeutralValues.ANIMAL;
		}
		
		return animal;
	}
}
