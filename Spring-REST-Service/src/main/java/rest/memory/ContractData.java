package rest.memory;

import java.util.HashMap;
import java.util.Map;

import rest.error.NeutralValues;
import rest.resource.Contract;

public class ContractData {
	public static Map<String, Contract> contracts = new HashMap<String, Contract>();

	
	
	public static void put(Contract contract) {
		ContractData.contracts.put(contract.id, contract);
	}
	
	public static Contract get(String contract_id) {
		Contract contract = ContractData.contracts.get(contract_id);
		
		if (contract == null) {
			contract = NeutralValues.CONTRACT;
		}
		
		return contract;
	}
	
	
	
	public static Contract find(String contract_id) {
		Contract contract = ContractData.contracts.get(contract_id);
		
		if (contract == null) {
			contract = NeutralValues.CONTRACT;
		}
		
		return contract;
	}
}
