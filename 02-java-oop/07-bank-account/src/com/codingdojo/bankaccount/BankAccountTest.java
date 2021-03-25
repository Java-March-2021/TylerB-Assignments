package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount bOne = new BankAccount();
		BankAccount bTwo = new BankAccount();
		bOne.depositChecking(4000.14);
		bOne.depositChecking(405.95);
		bOne.depositSavings(500.54);
		bOne.depositSavings(9053.90);
		bOne.bankTotal();
		
		bTwo.depositChecking(500.00);
		bTwo.depositSavings(500.00);
		bTwo.withdrawChecking(400.00);
		bTwo.bankTotal();
		
		bTwo.getTotals();
	}
}
