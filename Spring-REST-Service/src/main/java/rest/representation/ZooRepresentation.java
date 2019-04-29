package rest.representation;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import rest.controller.ContractController;
import rest.controller.ZooController;
import rest.memory.ContractData;
import rest.resource.Zoo;

public class ZooRepresentation extends ResourceSupport {
	public String zoo_id;
	public Integer ticket_price;

	
	
	public ZooRepresentation(Zoo zoo) {
		this.zoo_id = zoo.zoo_id;
		this.ticket_price = zoo.ticket_price;
		
		this.addLinks();
	}



	private void addLinks() {
		this.addSelfLink();
		this.addContractLinks();
	}
	
	private void addSelfLink() {
		this.add(linkTo(methodOn(ZooController.class).getZoo(this.zoo_id)).withRel(RelationTypes.SELF));
	}
	
	private void addContractLinks() {
		List<String> contract_ids = ContractData.findContactIdsByZooId(this.zoo_id);
		
		for (String contract_id : contract_ids) {
			this.add(linkTo(methodOn(ContractController.class).getContract(this.zoo_id, contract_id)).withRel(RelationTypes.CONTRACT));
		}
	}
}
