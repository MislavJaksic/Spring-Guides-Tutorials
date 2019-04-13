package rest.resource;

import java.util.ArrayList;
import java.util.List;

public class Contract {
	public String id;
	public String zoo_id;
	public List<String> animal_ids;
	
	
	
	public Contract(String id, String zoo_id) {
		this.id = id;
		this.zoo_id = zoo_id;
		this.animal_ids = new ArrayList<String>();
	}
	
	
	
	public void add(String animal_id) {
		animal_ids.add(animal_id);
	}
}
