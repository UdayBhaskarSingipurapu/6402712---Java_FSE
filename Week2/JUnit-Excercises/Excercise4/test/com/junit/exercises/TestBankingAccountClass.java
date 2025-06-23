package com.junit.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class TestBankingAccountClass {
	
	private BankingAccount bankingAccount;
	
	@BeforeAll
	static void initAll() {
		System.out.println("Setting up the Test EnvironMent");
	}
	
	@AfterAll
	static void tearDownAll() {
		System.out.println("Testing for BankingAccount Class completed");
	}
	
	@BeforeEach
	void setup() {
		bankingAccount = new BankingAccount("Uday", 1000.00);
		System.out.println("Initial Balance for " + bankingAccount.getOwner() + ": " + bankingAccount.getBalance());
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("Testing for Owner " + bankingAccount.getOwner() + "is completed");
	}

	@Test
    void should_DepositMoneySuccessfully() {
		//Arrange
		double depo = 500.0;
		
        // Act
        bankingAccount.depositMoney(depo);

        // Assert
        assertEquals(1500.0, bankingAccount.getBalance());
    }

    @Test
    void should_WithdrawMoneySuccessfully() {
    	// Arrange
    	double withdraw = 300.00;
        // Act
    	bankingAccount.withdrawMoney(withdraw);

        // Assert
        assertEquals(700.0, bankingAccount.getBalance());
    }

    @Test
    void should_ThrowException_When_Overdrawing() {
        // Act & Assert
        Exception ex = assertThrows(IllegalArgumentException.class, () -> bankingAccount.withdrawMoney(2000.00));
        assertEquals("Insufficient Funds", ex.getMessage());
    }

    @Test
    void should_ThrowException_When_DepositingNegativeAmount() {
        // Act & Assert
        Exception ex = assertThrows(IllegalArgumentException.class, () -> bankingAccount.depositMoney(-100.00));
        assertEquals("Invalid Deposit Amount", ex.getMessage());
    }

}
