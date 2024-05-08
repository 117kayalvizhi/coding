package com;

import java.util.Scanner;

public class MainClass {
	 public static void main(String[] args) {
	        BankAccount userAccount = new BankAccount(1000); // Initial balance $1000
	        ATM atm = new ATM(userAccount);

	        Scanner scanner = new Scanner(System.in);
	        int choice;
	        double amount;

	        do {
	            System.out.println("ATM Menu:");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to withdraw: $");
	                    amount = scanner.nextDouble();
	                    atm.withdraw(amount);
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: $");
	                    amount = scanner.nextDouble();
	                    atm.deposit(amount);
	                    break;
	                case 3:
	                    atm.checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);
	    }
	
}



