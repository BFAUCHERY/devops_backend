package com.devops.exam.Controller;

import com.devops.exam.Entity.Person;
import com.devops.exam.Repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
	
	private final PersonRepository personRepository;
	
	public PersonController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@GetMapping
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}
}
