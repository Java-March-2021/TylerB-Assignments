package com.codingdojo.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkBal;
	private double savingsBal;
	
	private static int totalAccounts;
	private static double totalMoney;
	
	private static String accNumMaker() {
		Random r = new Random();
		int accNum = r.nextInt(1147000000) + 1000000000;
		return String.valueOf(accNum);
	}
	
	BankAccount(){
		this.accountNumber = accNumMaker();
		totalAccounts++;
		System.out.println("Your account number is " + accountNumber);
	}
	
	public double getCheckBal() {
		return this.checkBal;
	}
	public double getSaveBal() {
		return this.savingsBal;
	}
	
	public void depositChecking(double amount) {
		this.checkBal = checkBal + amount;
		totalMoney = totalMoney + amount;
		System.out.println("You deposited $" + amount + " bringing your balance to $" + checkBal);
	}
	public void depositSavings(double amount) {
		this.savingsBal = savingsBal + amount;
		totalMoney = totalMoney + amount;
		System.out.println("You deposited $" + amount + " bringing your balance to $" + savingsBal);
	}
	
	public void withdrawChecking(double amount) {
		double total = this.checkBal - amount;
		if(total < 0) {
			System.out.println("You do not have sufficient funds to withdraw that amount");
		} else {
			this.checkBal = total;
			System.out.println("You withdrew $" + amount + " bringing your balance to $" + checkBal);
		}
	}
	public void withdrawSavings(double amount) {
		double total = this.savingsBal - amount;
		if(total < 0) {
			System.out.println("You do not have sufficient funds to withdraw that amount");
		} else {
			this.savingsBal = total;
			System.out.println("You withdrew $" + amount + " bringing your balance to $" + savingsBal);
		}
	}
	
	public void bankTotal() {
		System.out.println("You have $" + checkBal + " in checking");
		System.out.println("You have $" + savingsBal + " in savings");
		double total = checkBal + savingsBal;
		System.out.println("You have a total of $" + total + " in your accounts");
	}
	public void getTotals() {
		System.out.println(totalAccounts + " accounts");
		System.out.println("Total: $" + totalMoney);
	}
}
