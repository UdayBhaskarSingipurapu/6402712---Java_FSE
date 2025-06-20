package com.SingletonPatternExample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger instance1 = Logger.getInstance();
		Logger instance2 = Logger.getInstance();
		System.out.println(instance1);
		System.out.println(instance1);
		if(instance1 == instance2) {
			System.out.println("instance1 is same as instance2");
		}
		else {
			System.out.println("2 instances are created");
		}

	}

}
