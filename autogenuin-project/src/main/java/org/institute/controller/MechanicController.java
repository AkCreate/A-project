package org.institute.controller;

import org.institute.entity.Mechanic;
import org.institute.repository.MechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Mechanic")
public class MechanicController {

	@Autowired
	private MechanicRepository mrepository;
	
	@PostMapping("/msave")
	public String saveMechanic(@RequestBody Mechanic mechanic) {
		mrepository.save(mechanic);
		return "Mechanic information save Sucessfully";
	}
}
