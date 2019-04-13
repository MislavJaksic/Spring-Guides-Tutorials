package rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rest.memory.ContractData;
import rest.resource.Contract;

@RestController
public class ContractController {
	@GetMapping(path="/zoos/{zoo_id}/{ownership_id}")
	public Contract getContract(@PathVariable String zoo_id, @PathVariable String contract_id) {
	    return ContractData.find(contract_id);
	}
}
