package com.junit.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertions {

	@Test
	void test_Asserts() {
		
		// Assert Equals
		assertEquals(20, 10 + 10);
		
		// Assert Array Equals
		int []a = {1, 2, 3, 4};
		int []b = {1, 2, 3, 4};
		
		assertArrayEquals(a, b);  // check the size, contents and order of element in both arrays
		
		// Assert true
		assertTrue(5 > 3);   // Test Case passes if condition is true
		
		// Assert False
		assertFalse(5 < 3);  // Test case Passes if condition is false;
		
		// Assert Null
		assertNull(null);  // Test Case Passes if object inside is null
		
		// Assert Not Null
		assertNotNull(new Object());
	}

}
