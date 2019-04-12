package rest.resource;

import java.util.HashMap;
import java.util.Map;

import rest.error.NeutralValues;

public class Enclosure {
	public String id;
	public String type;
	public Map<String, Animal> animals;
	
	
	
	public Enclosure(String id, String type) {
		this.id = id;
		this.type = type;
		this.animals = new HashMap<String,Animal>();
	}
	
	
	
	public void put(Animal animal) {
		this.animals.put(animal.tag, animal);
	}
	
	public Animal get(String tag) {
		Animal animal = this.animals.get(tag);
		
		if (animal == null) {
			animal = NeutralValues.ANIMAL;
		}
		
		return animal;
	}
}
