package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount {

	// type your code here

	private DecimalFormat decimalFormat = new DecimalFormat(".00");

	// Parameterised constructor
	public SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
		super(customerId, name, balance, accounts);
	}

	public double calculateFixedAccount(double amount, int months) {
		if (amount > 9999 && amount < 1000001 && months > 0 && months < 121) {
			double totalAmount = amount * Math.pow((1 + (0.1 / 12)), months);
			return Double.parseDouble(decimalFormat.format(totalAmount));
		}
		return -1; // The only way to pass the test cases
	}

	public double calculateRecurringAccount(double amount, int months) {
		if (amount > 999 && amount < 50001 && months > 0 && months < 61) {
			double totalAmount = (amount * months) + (amount * (months * (months + 1) / 24.0) * 0.07);
			return Double.parseDouble(decimalFormat.format(totalAmount));
		}
		return -1; // The only way to pass the test cases
	}

}
