package org.institute.controller;

import org.institute.entity.JobCard;
import org.institute.repository.JobCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/JobCard")
public class JobCardController {
	
	@Autowired
	private JobCardRepository jrepository;

	@PostMapping("/jsave")
	public String saveJobcard(@RequestBody JobCard jobcard)
	{
		jrepository.save(jobcard);
		return "jobcard save sucessfully";
	}
}
