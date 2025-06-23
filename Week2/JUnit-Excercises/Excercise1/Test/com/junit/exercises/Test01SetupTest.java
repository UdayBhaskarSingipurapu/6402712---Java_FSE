package com.junit.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test01SetupTest {
	Welcome wc;

	@Test
	void test() {
		// given
		wc = new Welcome();
		
		// when
		String res = wc.greet();
		
		// then
		assertEquals("Welcome back Developer", res);
	}

}
