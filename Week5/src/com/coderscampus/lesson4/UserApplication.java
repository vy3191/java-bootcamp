package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User trevorUser = userService.createUser("trevor@craftycodr.com", "password123");
		System.out.println(trevorUser);
	}

}
