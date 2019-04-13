package rest.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import rest.memory.AnimalData;
import rest.memory.ZooData;
import rest.resource.Animal;
import rest.resource.Contract;
import rest.resource.Zoo;

@RestController
public class DataController {
	@PutMapping(path="/predefined/data")
	public void putPredefinedData() {
		Zoo zoo_one = new Zoo("New York Zoo", 10);
		ZooData.put(zoo_one);
		
		Animal animal_one = new Animal("001", "zebra", "female");
		Animal animal_two = new Animal("005", "giraffe", "female");
		Animal animal_three = new Animal("006", "elephant", "male");
		Animal animal_four = new Animal("008", "lion", "female");
		Animal animal_five = new Animal("011", "tiger", "male");
		Animal animal_six = new Animal("022", "ara", "female");
		AnimalData.put(animal_one);
		AnimalData.put(animal_two);
		AnimalData.put(animal_three);
		AnimalData.put(animal_four);
		AnimalData.put(animal_five);
		AnimalData.put(animal_six);
		
		Contract contract_one = new Contract("5BA", "New York Zoo");
		contract_one.add("001");
		Contract contract_two = new Contract("AAF", "New York Zoo");
		contract_two.add("005");
		contract_two.add("006");
		Contract contract_three = new Contract("10F", "New York Zoo");
		contract_three.add("008");
	}
}
