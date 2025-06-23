package com.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TestCalculator {
	
	@Mock
	CalculatorInf calcMock;
	
	@InjectMocks
	CalculatorService calcService;
	
	@BeforeEach
	void setup() {
		calcService = new CalculatorService(calcMock);
	}
	

	@Test
	void verifyInteractions() {
		// Verify add
		int i = 4, j = 3;
		calcService.add(i, j);
		verify(calcMock).add(i, j);
		
		// verify subtract
		calcService.sub(i, j);
		verify(calcMock).sub(i, j);
		
		// verify multiply
		calcService.mul(i, j);
		verify(calcMock).mul(i, j);
		
		// verify division
		calcService.div(i, j);
		verify(calcMock).div(i, j);
	}

}
