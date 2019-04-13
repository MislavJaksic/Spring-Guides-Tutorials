package rest.memory;

import java.util.HashMap;
import java.util.Map;

import rest.error.NeutralValues;
import rest.resource.Zoo;

public class ZooData {
	public static Map<String, Zoo> zoos = new HashMap<String, Zoo>();
	
	
	
	public static void put(Zoo zoo) {
		ZooData.zoos.put(zoo.id, zoo);
	}
	
	public static Zoo get(String id) {
		Zoo zoo = ZooData.zoos.get(id);
		
		if (zoo == null) {
			zoo = NeutralValues.ZOO;
		}
		
		return zoo;
	}
}
