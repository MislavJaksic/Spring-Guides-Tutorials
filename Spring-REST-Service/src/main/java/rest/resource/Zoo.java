package rest.resource;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
	public Map<String, Enclosure> enclosures;

	
	
	public Zoo() {
		this.enclosures = new HashMap<String,Enclosure>();
	}
	
	public Zoo(Map<String, Enclosure> enclosures) {
		this.enclosures = enclosures;
	}
	
	
	
	public void set(String name, Enclosure enclosure) {
		this.enclosures.put(name, enclosure);
	}
	
	public Enclosure get(String name) {
		return this.enclosures.get(name);
	}

	
	
	@Override
	public String toString() {
		return "Zoo [enclosures=" + enclosures + "]";
	}
}
