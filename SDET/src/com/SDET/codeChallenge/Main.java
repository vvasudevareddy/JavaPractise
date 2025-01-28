package com.SDET.codeChallenge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the accountNumber: ");
		long accountNumber = Long.parseLong(sc.nextLine());

		System.out.println("Enter the account Holder's Name: ");
		String holderName = sc.nextLine();

		System.out.println("Enter the balance of the account Holder: ");
		double balance = Double.parseDouble(sc.nextLine());

		System.out.println("Enter the rate of interest: ");
		double interestRate = Double.parseDouble(sc.nextLine());

		if (interestRate < 0) {
			System.out.println("Enter valid interest rate.");
			return;
		}

		Savings s = new Savings(accountNumber, holderName, balance, interestRate);

		System.out.println("Enter the transaction type (Deposit or withdraw or checkBalance): ");
		String transactionType = sc.nextLine();

		if (transactionType.equalsIgnoreCase("Deposit")) {
			System.out.println("Enter the amount to be credited: ");
			double amount = Double.parseDouble(sc.nextLine());
			s.accountCredit(amount);
			System.out.println("Rs." + amount + " has been credited successfully.");
			System.out.println("Available balance is: Rs." + s.checkBalance());
		}
		if (transactionType.equalsIgnoreCase("Withdraw")) {
			System.out.println("Enter the amount to be withdrawn: ");
			double amount = Double.parseDouble(sc.nextLine());
			if (amount > s.getBalance()) {
				s.accountDebit(amount);
			} else {
				s.accountDebit(amount);
				System.out.println("Rs." + amount + " has been debited successfully.");
				System.out.println("Available balance is: Rs." + s.checkBalance());
			}

		}
		if(transactionType.equalsIgnoreCase("checkbalance"))
		{
			System.out.println("Available balance is: Rs." + s.checkBalance());
		}

	}

}
