package com.SDET.codeChallenge;

public class Challenge2 {

	private long accountNumber;
	private String holderName;
	private double balance;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Challenge2(long accountNumber, String holderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public void accountCredit(double amount) {
		balance += amount;
	}

	public void accountDebit(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public double checkBalance() {
		return balance;
	}

}
