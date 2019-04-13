package rest.resource;

import org.springframework.hateoas.ResourceSupport;

public class Animal extends ResourceSupport {
	public String id;
	public String species;
	public String sex;
	
	
	
	public Animal(String id, String species, String sex) {
		this.id = id;
		this.species = species;
		this.sex = sex;
		
		//ControllerLinkBuilder.methodOn(ZooController.class).getAnimal(zoo_name, enclosure_id, animal_tag)
		//this.add(HATEOASer.createGetLink(ObjectURIs.GET_ANIMAL + "/" + this.tag));
	}
}
