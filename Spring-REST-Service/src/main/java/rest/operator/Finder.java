package rest.operator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import rest.resource.Animal;
import rest.resource.Zoo;

public class Finder {
	public static List<Zoo> findZoos(Collection<Zoo> zoos, Integer min_ticket_price, Integer max_ticket_price) {
		List<Zoo> found_zoos = new ArrayList<Zoo>();
		for (Zoo zoo : zoos) {
			if (max_ticket_price >= zoo.ticket_price) {
				if (zoo.ticket_price >= min_ticket_price) {
					found_zoos.add(zoo);
				}
			}
		}
		
		return found_zoos;
	}
	
	public static List<Animal> findAnimals(Collection<Animal> animals, String sex) {
		List<Animal> found_animals = new ArrayList<Animal>();
		for (Animal animal : animals) {
			if (animal.sex == sex) {
				found_animals.add(animal);
			}
		}
		
		return found_animals;
	}
}
