package com.SDET.codeChallenge;

public class Savings extends Challenge2 {

	double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		if (interestRate >= 0) {
			this.interestRate = interestRate;
		} else {
			System.out.println("Enter valid Interest Rate.");
		}

	}

	public Savings(long accountNumber, String holderName, double balance, double interestRate) {
		super(accountNumber, holderName, balance);
		this.interestRate = interestRate;
	}

	public void addInterest(double balance) {
		double interestAmount = balance * interestRate / 100;
		accountCredit(interestAmount);
	}

}
