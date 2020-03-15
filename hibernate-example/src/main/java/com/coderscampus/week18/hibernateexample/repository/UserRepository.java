package com.coderscampus.week18.hibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.week18.hibernateexample.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
