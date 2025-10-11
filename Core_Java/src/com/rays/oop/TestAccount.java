package com.rays.oop;

public class TestAccount {
public static void main(String[] args) {
	
	Account a1 = new Account();
	
	a1.setNumber("7872934820184");
	a1.setAccountType("Saving");
	a1.setBalance(5500.00);
	
	System.out.println("a1 Account Number :) " + a1.getNumber());
	System.out.println("a1 Account Type :) " + a1.getAccountType());
	System.out.println("a1 Account Balance :) " + a1.getBalance());
	
	
	
	System.out.println("-----------------------------");
	Account a2 = new Account();
	
	
	a2.setNumber("863663487827");
	a2.setAccountType("Curerent");
	a2.setBalance(2200.34);
	
	
	
	System.out.println("a2 Account Number :) " + a2.getNumber());
	System.out.println("a2 Account Number :) " + a2.getAccountType());
	System.out.println("a2 Account Number :) " + a2.getBalance());
}
}
