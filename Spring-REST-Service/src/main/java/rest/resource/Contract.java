package rest.resource;

import java.util.ArrayList;
import java.util.List;

public class Contract {
	public String contract_id;
	public String zoo_id;
	public List<String> animal_ids;
	
	
	
	public Contract(String contract_id, String zoo_id) {
		this.contract_id = contract_id;
		this.zoo_id = zoo_id;
		this.animal_ids = new ArrayList<String>();
	}
	
	
	
	public void add(String animal_id) {
		animal_ids.add(animal_id);
	}
}
