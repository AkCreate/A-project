package org.institute.controller;

import org.institute.entity.Customer;
import org.institute.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository crepository;
	
	@PostMapping("/csave")
	public String saveCustomer(@RequestBody Customer customer) {
		
		crepository.save(customer);
		return "Customer saved sucessfully";
	}
	
}
