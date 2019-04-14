package rest.representation;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import rest.controller.AnimalController;
import rest.controller.ContractController;
import rest.controller.ZooController;
import rest.resource.Contract;

public class ContractRepresentation extends ResourceSupport {
	public String contract_id;
	public String zoo_id;
	public List<String> animal_ids;
	
	
	
	public ContractRepresentation(Contract contract) {
		this.contract_id = contract.contract_id;
		this.zoo_id = contract.zoo_id;
		this.animal_ids = contract.animal_ids;
		
		this.addLinks();
	}
	
	
	
	private void addLinks() {
		this.addGetLink();
		this.addZooLink();
		this.addAnimalLinks();
	}
	
	private void addGetLink() {
		this.add(linkTo(methodOn(ContractController.class).getContract(this.zoo_id, this.contract_id)).withRel(RelationTypes.GET));
	}
	
	private void addZooLink() {
		this.add(linkTo(methodOn(ZooController.class).getZoo(this.zoo_id)).withRel(RelationTypes.ZOO));
	}
	
	private void addAnimalLinks() {
		for (String animal_id : this.animal_ids) {
			this.add(linkTo(methodOn(AnimalController.class).getAnimal(animal_id)).withRel(RelationTypes.ANIMAL));
		}
	}
}
