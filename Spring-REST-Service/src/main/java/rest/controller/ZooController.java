package rest.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rest.memory.ZooData;
import rest.representation.ZooRepresentation;
import rest.resource.Zoo;

@RestController
public class ZooController {
	@GetMapping(path="/zoos")
	public List<ZooRepresentation> getZoos() {
		List<ZooRepresentation> representations = new ArrayList<ZooRepresentation>();
		Collection<Zoo> zoos = ZooData.zoos.values();
		for (Zoo zoo : zoos) {
			ZooRepresentation representation = new ZooRepresentation(zoo);
			representations.add(representation);
		}
		
	    return representations;
	}
	
	@GetMapping(path="/zoo/{zoo_id}")
	public ZooRepresentation getZoo(@PathVariable String zoo_id) {
		Zoo zoo = ZooData.get(zoo_id);
		ZooRepresentation representation = new ZooRepresentation(zoo);
		
	    return representation;
	}
	
	
	
	
	
	
	
//	@GetMapping(path=AlgorithmicURIs.FIND_ZOOS)
//	public List<Zoo> findZoos(@RequestParam(defaultValue=NeutralValues.MIN_INTEGER_STRING) Integer min_ticket_price, @RequestParam(defaultValue=NeutralValues.MAX_INTEGER_STRING) Integer max_ticket_price) {
//		Collection<Zoo> zoos = this.data.zoos.values();
//		
//	    return Finder.findZoos(zoos, min_ticket_price, max_ticket_price);
//	}
//	
//	@GetMapping(path=AlgorithmicURIs.FIND_ENCLOSURES)
//	public List<Enclosure> findEnclosuresInZoo(@PathVariable String zoo_name, @RequestParam(defaultValue=NeutralValues.STRING) String enclosure_type) {
//		Collection<Enclosure> enclosures = this.data.get(zoo_name).enclosures.values();
//		
//	    return Finder.findEnclosures(enclosures, enclosure_type);
//	}
//	
//	@GetMapping(path=AlgorithmicURIs.FIND_ANIMALS)
//	public List<Animal> findAnimalsInEnclosureInZoo(@PathVariable String zoo_name, @PathVariable String enclosure_id, @RequestParam(defaultValue=NeutralValues.STRING) String animal_sex) {
//		Collection<Animal> animals = this.data.get(zoo_name).get(enclosure_id).animals.values();
//		
//	    return Finder.findAnimals(animals, animal_sex);
//	}
}
