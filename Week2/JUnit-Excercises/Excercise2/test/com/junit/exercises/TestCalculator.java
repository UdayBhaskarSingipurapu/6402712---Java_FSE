package com.junit.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCalculator {
	static Calculator c;
	
	@BeforeAll
	static void setup() {
		c = new Calculator();
	}

	@Test
	void test_Add() {
		int expected = 20;
		int actual = c.add(10, 10);
		assertEquals(expected, actual, "Test Case Failed");  // success test case
		
		// Failure case
		int actual2 = c.add(8,  4);
		assertEquals(expected, actual2, "Test Case Failed");		
		
	}
	
	@Test
	void test_Subtract() {
		int expected = 0;
		int actual = c.subtract(10, 10);
		assertEquals(expected, actual, "Test Case Failed");  // success test case
		
	}
	
	@Test
	void test_Multiply() {
		int expected = 10;
		int actual = c.multiply(5, 2);
		assertEquals(expected, actual, "Test Case Failed");  // success test case
		
	}
	
	@Test
	void test_Divide() {
		int expected = 2;
		int actual = c.divide(5, 2);
		assertEquals(expected, actual, "Test Case Failed");  // success test case
	}
}
