package rest.representation;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.ResourceSupport;

import rest.controller.AnimalController;
import rest.controller.ContractController;
import rest.error.NeutralValues;
import rest.memory.ContractData;
import rest.resource.Animal;

public class AnimalRepresentation extends ResourceSupport {
	public String animal_id;
	public String species;
	public String sex;
	
	
	
	public AnimalRepresentation(Animal animal) {
		this.animal_id = animal.animal_id;
		this.species = animal.species;
		this.sex = animal.sex;
		
		this.addLinks();
	}
	
	
	
	private void addLinks() {
		this.addSelfLink();
		this.addContractLink();
	}
	
	private void addSelfLink() {
		this.add(linkTo(methodOn(AnimalController.class).getAnimal(this.animal_id)).withRel(RelationTypes.SELF));
	}
	
	private void addContractLink() {
		String contract_id = ContractData.findContactIdByAnimalId(this.animal_id);
		String zoo_id = ContractData.findZooId(this.animal_id);
		
		if (!contract_id.equals(NeutralValues.STRING)) {
			this.add(linkTo(methodOn(ContractController.class).getContract(zoo_id, contract_id)).withRel(RelationTypes.CONTRACT));
		}
	}
}
