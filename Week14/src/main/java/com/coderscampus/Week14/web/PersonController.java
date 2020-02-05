package com.coderscampus.Week14.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Week14.dto.Person;

@RestController
public class PersonController {
	
	@PostMapping("/persons")
	public Person createPerson (String name, String gender, Integer age) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		return person;
	}
	
	// fetches the person with ID 1
	// http://localhost:8080/persons/1
	
	@GetMapping("/persons/{personId}")
	public Person getPerson (@PathVariable Long personId) {
		System.out.println("Person ID is: " + personId);
		return null;
	}
	
}
