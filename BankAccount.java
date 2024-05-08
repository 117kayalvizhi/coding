package com;

	import java.util.Scanner;

	// Bank Account class to represent the user's account
	class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public boolean withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            return true;
	        } else {
	            return false;
	        }
	    }
	}

	// ATM class representing the ATM machine
	class ATM {
	    private BankAccount account;

	    public ATM(BankAccount account) {
	        this.account = account;
	    }

	    // Method to withdraw money from the ATM
	    public void withdraw(double amount) {
	        if (account.withdraw(amount)) {
	            System.out.println("Withdrawal successful. Remaining balance: $" + account.getBalance());
	        } else {
	            System.out.println("Insufficient funds. Withdrawal failed.");
	        }
	    }

	    // Method to deposit money into the ATM
	    public void deposit(double amount) {
	        account.deposit(amount);
	        System.out.println("Deposit successful. New balance: $" + account.getBalance());
	    }

	    // Method to check balance
	    public void checkBalance() {
	        System.out.println("Current balance: $" + account.getBalance());
	    }
	}

	
	
	   