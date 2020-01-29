package com.coderscampus.week13.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.week13.service.FileService;

@RestController
public class FileController {
	
	@Autowired
	private FileService fileService;
	
	@GetMapping("/read-lines")
	public List<String> readLines () throws IOException {
		return fileService.readFile("test.txt");
	}
	
	@GetMapping("/hello-world")
	public String helloWorld () {
		return "Hello world!";
	}
	
	@PostMapping("/hello-world")
	public String helloWorldPost () {
		return "Okay cool, you just posted some data!";
	}
}
