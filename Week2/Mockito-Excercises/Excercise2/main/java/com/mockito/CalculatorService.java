package com.mockito;

public class CalculatorService {
	CalculatorInf calc;
	
	public CalculatorService(CalculatorInf calc) {
		this.calc = calc;
	}
	
	int add(int i, int j) {
		int val = calc.add(i, j);
		return val;
	}
	
	int sub(int i, int j) {
		int val = calc.sub(i, j);
		return val;
	}
	
	int mul(int i, int j) {
		int val = calc.mul(i, j);
		return val;
	}
	
	int div(int i, int j) {
		int val = calc.div(i, j);
		return val;
	}

}

