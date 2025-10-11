package com.rays.oop;

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Luv Chopra");
		p1.setdob("19/10/2005");
		p1.SetAddress("Limbodi");
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getdob());
		System.out.println(p1.getAddress());
	}

}
