package com.recursion;

import java.util.*;

public class FinancialForecast {
	public static double futureValue(double principal, double rate, int years) {
        if (years == 0) return principal;
        return futureValue(principal, rate, years - 1) * (1 + rate);
    }
	
	static HashMap<Integer, Double> memo = new HashMap<>();
	public static double futureValueOptimized(double principal, double rate, int years) {
        if (years == 0) return principal;
        if (memo.containsKey(years)) return memo.get(years);

        double value = futureValue(principal, rate, years - 1) * (1 + rate);
        memo.put(years, value);
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Priciple: ");
        double principal = sc.nextDouble();
        
        System.out.println("Enter Rate: ");
        double rate = sc.nextDouble();
        
        System.out.println("Enter Year: ");
        int years = sc.nextInt();

        double result = futureValue(principal, rate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, result);
        
        System.out.println("Optimizing using Memoization");
        double optimizedResult = futureValueOptimized(principal, rate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, optimizedResult);
    }
}
