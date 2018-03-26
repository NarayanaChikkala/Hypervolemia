package com.narayana.Hypervolemia;

import org.springframework.stereotype.Repository;

@Repository
public class HypervolemiaImpl implements HypervolemiaRepository {


	@Override
	public String gethypervolemia(String hypervolemicSymptoms) {
		if(Integer.parseInt(hypervolemicSymptoms)==1) {
			return "hypervolemia";
		
		}
		else {
			return "notHypervolemia";
		}
	}

}
