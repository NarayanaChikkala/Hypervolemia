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
	
	@RequestMapping("/hypervolemia/{hypervolemia}")
	public String hypervolemia(@PathVariable("hypervolemia") String hypervolemia) {
		logger.info("accounts-changed byId() invoked: " + hypervolemia);
		String retVal = hypervolemiaRepository.gethypervolemia(hypervolemia);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
