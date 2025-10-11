package com.rays.oop;

public class Account {
	private String Number;
	private String AccountType;
	private double Balance;
	public String getNumber() {
		return this.Number;
	}
	public void setNumber(String number) {
		this.Number = number;
	}
	public String getAccountType() {
		return this.AccountType;
	}
	public void setAccountType(String accountType) {
		this.AccountType = accountType;
	}
	public double getBalance() {
		return this.Balance;
	}
	public void setBalance(double balance) {
		this.Balance = balance;
	}
}
	