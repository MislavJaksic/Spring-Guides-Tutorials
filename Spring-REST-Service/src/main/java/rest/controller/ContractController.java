package rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rest.memory.ContractData;
import rest.representation.ContractRepresentation;
import rest.resource.Contract;

@RestController
public class ContractController {
	@GetMapping(path="/zoo/{zoo_id}/{contract_id}")
	public ContractRepresentation getContract(@PathVariable String zoo_id, @PathVariable String contract_id) {
		Contract contract = ContractData.get(contract_id);
		ContractRepresentation representation = new ContractRepresentation(contract);
		
		return representation;
	}
}
