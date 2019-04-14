package rest.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rest.error.NeutralValues;
import rest.resource.Contract;

public class ContractData {
	public static Map<String, Contract> contracts = new HashMap<String, Contract>();

	
	
	public static void put(Contract contract) {
		ContractData.contracts.put(contract.contract_id, contract);
	}
	
	public static Contract get(String contract_id) {
		Contract contract = ContractData.contracts.get(contract_id);
		
		if (contract == null) {
			contract = NeutralValues.CONTRACT;
		}
		
		return contract;
	}
	
	
	
	public static String findContactIdByAnimalId(String animal_id) {
		String contract_id = NeutralValues.STRING;
		for (Map.Entry<String, Contract> contract : ContractData.contracts.entrySet()) {
			for (String contract_animal_id : contract.getValue().animal_ids) {
				if (contract_animal_id.equals(animal_id)) {
					contract_id = contract.getKey();
				}
			}
		}
		
		return contract_id;
	}
	
	public static List<String> findContactIdsByZooId(String zoo_id) {
		List<String> contract_ids = new ArrayList<String>();
		for (Map.Entry<String, Contract> contract : ContractData.contracts.entrySet()) {
			if (contract.getValue().zoo_id.equals(zoo_id)) {
				contract_ids.add(contract.getValue().contract_id);
			}
		}
		
		return contract_ids;
	}
	
	public static String findZooId(String animal_id) {
		String zoo_id = NeutralValues.STRING;
		for (Map.Entry<String, Contract> contract : ContractData.contracts.entrySet()) {
			for (String contract_animal_id : contract.getValue().animal_ids) {
				if (contract_animal_id.equals(animal_id)) {
					zoo_id = contract.getValue().zoo_id;
				}
			}
		}
		
		return zoo_id;
	}
}
