package com.coderscampus.lesson1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	// Test-Driven Development Methodology
	// Step 1 - Write a failing test
	// Step 2 - Write the business logic to make the test pass  
	// Step 3 - Refactor your code

	@Test
	void should_add_one_item_to_list() {
		// Three A's
		// Arrange, Act, Assert
		
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		
		// Act
		sut.add(10);
		Integer expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();
		
		// Assert
		// What would we expect to happen?
		//  I expect there to be an Integer with value 10 stored in the first
		//  index in my customList
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
	}
	
	@Test
	void should_add_11_items_to_list () {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		
		// Act
		sut.add(1); sut.add(2); sut.add(3); sut.add(4);
		sut.add(5); sut.add(6); sut.add(7); sut.add(8);
		sut.add(9); sut.add(10); sut.add(11);
		
		// Assert
		for (int i=0; i<10; i++) {
			assertEquals(i+1, sut.get(i));
		}
		assertEquals(11, sut.getSize());
	}
	
	@Test
	void should_add_100000_items_to_list () {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		
		// Act
		for (int i=1; i<=100000; i++) {
			sut.add(i);
		}
		
		// Assert
		for (int i=0; i<99999; i++) {
			assertEquals(i+1, sut.get(i));
		}
		assertEquals(100000, sut.getSize());
	}
}