package com.coderscampus.objects;

public class PassByValueExample3 {

	public static void main (String[] args) {
		Human trevor = new Human("Male", "5'10\"", "165", "Brown");
		System.out.println("Outside of the modifyValues method: " + trevor.getInfo());
		System.out.println(trevor.hashCode());
		modifyValues(trevor);
		System.out.println(trevor.hashCode());
		System.out.println("Outside of the modifyValues method: " + trevor.getInfo());
	}
	
	public static void modifyValues (Human trevor) {
		System.out.println("Inside of the modifyValues method: " + trevor.getInfo());
		trevor.eyeColor = "Blue";
		trevor.gender = "Female";
		trevor.weight = "150";
		trevor.height = "5'8\"";
		System.out.println(trevor.hashCode());
		System.out.println("Inside of the modifyValues method: " + trevor.getInfo());
	}
}
