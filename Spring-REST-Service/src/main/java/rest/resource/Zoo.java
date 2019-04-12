package rest.resource;

import java.util.HashMap;
import java.util.Map;

import rest.error.NeutralValues;

public class Zoo {
	public String name;
	public Integer ticket_price;
	public Map<String, Enclosure> enclosures;

	
	
	public Zoo(String name, Integer ticket_price) {
		this.name = name;
		this.ticket_price = ticket_price;
		this.enclosures = new HashMap<String,Enclosure>();
	}
	
	
	
	public void put(Enclosure enclosure) {
		this.enclosures.put(enclosure.id, enclosure);
	}
	
	public Enclosure get(String id) {
		Enclosure enclosure = this.enclosures.get(id);
		
		if (enclosure == null) {
			enclosure = NeutralValues.ENCLOSURE;
		}
		
		return enclosure;
	}
}
