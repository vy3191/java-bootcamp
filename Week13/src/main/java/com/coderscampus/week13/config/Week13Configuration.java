package com.coderscampus.week13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coderscampus.week13.domain.User;
import com.coderscampus.week13.service.FileService;

@Configuration
public class Week13Configuration {

	// For illustration purposes only as an example of a real
	//  world type scenario of connecting to a database
//	@Bean
//	public Datasource datasource () {
//		Datasource db = new Datasource();
//		db.setConnectionString("http://aslkdfj.sdkfjhsd.com:3360");
//		db.setUsername("dev01dbblahblah")
//		
//		return db;
//	}
	
	@Bean
	public FileService fileService () {
		return new FileService("test.txt");
	}
	
	@Bean
	public User user () {
		return new User("trevor@craftycodr.com", "asdfasdf", "Trevor Page");
	}
}
