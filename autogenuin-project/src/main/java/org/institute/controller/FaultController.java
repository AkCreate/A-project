package org.institute.controller;

import org.institute.entity.Fault;
import org.institute.repository.FaultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Fault")
public class FaultController {

	@Autowired
	public FaultRepository frepository;
	
	@PostMapping("/fsave")
	public String saveFault(@RequestBody Fault fault) {
		
		frepository.save(fault);
		return "Faults save sucessfully";
	}
}
