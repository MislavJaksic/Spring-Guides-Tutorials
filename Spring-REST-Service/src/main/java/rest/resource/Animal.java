package rest.resource;

import org.springframework.hateoas.ResourceSupport;

import rest.representation.HATEOASer;
import rest.representation.RelationTypes;
import rest.uri.ObjectURIs;

public class Animal extends ResourceSupport {
	public String tag;
	public String species;
	public String sex;
	
	
	
	public Animal(String tag, String species, String sex) {
		this.tag = tag;
		this.species = species;
		this.sex = sex;
		
		this.add(HATEOASer.createGetLink(ObjectURIs.GET_ANIMAL + "/" + this.tag));
	}
}
