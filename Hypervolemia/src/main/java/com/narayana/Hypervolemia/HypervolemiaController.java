package com.narayana.Hypervolemia;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HypervolemiaController {
	
	protected Logger logger = Logger
			.getLogger(HypervolemiaController.class.getName());
	
	@Autowired
	HypervolemiaRepository hypervolemiaRepository;
	
	@RequestMapping("/Hypervolemia/{hypervolemicSymptoms}")
	public String Hypervolemia(@PathVariable("hypervolemicSymptoms") String hypervolemicSymptoms) {
		logger.info("accounts-changed byId() invoked: " + hypervolemicSymptoms);
		String retVal = hypervolemiaRepository.gethypervolemia(hypervolemicSymptoms);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
