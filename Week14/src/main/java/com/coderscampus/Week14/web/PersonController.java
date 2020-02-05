package com.coderscampus.Week14.web;

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
	
}
