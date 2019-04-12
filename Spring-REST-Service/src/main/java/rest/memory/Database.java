package rest.memory;

import java.util.HashMap;
import java.util.Map;

import rest.error.NeutralValues;
import rest.resource.Zoo;

public class Database {
	public Map<String, Zoo> zoos;
	
	
	
	public Database() {
		this.zoos = new HashMap<String, Zoo>();
	}
	
	
	
	public void put(Zoo zoo) {
		this.zoos.put(zoo.name, zoo);
	}
	
	public Zoo get(String name) {
		Zoo zoo = this.zoos.get(name);
		
		if (zoo == null) {
			zoo = NeutralValues.ZOO;
		}
		
		return zoo;
	}
}
