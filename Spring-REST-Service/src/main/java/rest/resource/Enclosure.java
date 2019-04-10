package rest.resource;

import java.util.HashMap;
import java.util.Map;

public class Enclosure {
	public Map<String, Animal> animals;
	
	
	
	public Enclosure() {
		this.animals = new HashMap<String,Animal>();
	}

	public Enclosure(Map<String, Animal> animals) {
		this.animals = animals;
	}
	
	
	
	public void set(String name, Animal animal) {
		this.animals.put(name, animal);
	}
	
	public Animal get(String name) {
		return this.animals.get(name);
	}

	
	
	@Override
	public String toString() {
		return "Enclosure [animals=" + animals + "]";
	}
}
