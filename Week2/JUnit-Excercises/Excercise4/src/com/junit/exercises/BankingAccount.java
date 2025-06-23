package com.junit.exercises;

public class BankingAccount {
	public String owner;
	public double accBalance;
	
	public BankingAccount(String name, double balance) {
		this.owner = name;
		this.accBalance = balance;
	}
	
	public void depositMoney(double deposit) {
		if(deposit <= 0) throw new IllegalArgumentException("Invalid Deposit Amount");
		this.accBalance += deposit;
	}
	
	public void withdrawMoney(double withdraw) {
		if(withdraw > accBalance) throw new IllegalArgumentException("Insufficient Funds");
		accBalance -= withdraw;
	}
	public double getBalance() {
        return accBalance;
        
    }

    public String getOwner() {
        return owner;
    }

}
