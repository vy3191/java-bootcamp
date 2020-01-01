package com.coderscampus.objects;

public class PassByValueExample2 {

	public static void main (String[] args) {
		Human trevor = new Human("Male", "5'10\"", "165", "Brown");
		System.out.println("Outside of the modifyValues method: " + trevor.getInfo());
		System.out.println(trevor.hashCode());
		modifyValues(trevor);
		System.out.println("Outside of the modifyValues method: " + trevor.getInfo());
	}
	
	public static void modifyValues (Human trevor) {
		System.out.println("Inside of the modifyValues method: " + trevor.getInfo());
		System.out.println(trevor.hashCode());
		trevor = new Human("Female", "5'8\"", "150", "Blue");
		System.out.println(trevor.hashCode());
		System.out.println("Inside of the modifyValues method: " + trevor.getInfo());
	}
}
