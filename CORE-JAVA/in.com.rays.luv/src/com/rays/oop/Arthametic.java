package com.rays.oop;

public class Arthametic {

	public void sum (int a, int b) {
		System.out.println(a + b);
	}	
		public void substrection (int a, int b) {
			System.out.println(a - b);
		}	
		public void multiply (int a, int b) {
			System.out.println(a * b);
		}
		public void divide (int a, int b) {
			System.out.println(a / b);
		}
		public void remender (int a, int b) {
			System.out.println(a % b);
		}
		public int getmaximumNo (int a, int b) {
			if (a > b) {
		return a;		
		}else {
			return b;
		} 
		}
		public String getFullName (String firstname, String lastname) {
			return firstname + " " + lastname;
		}
		public String getoddoreven (int a) {
			if (a % 2 == 0) {
				return "even";
			}else {
				return "odd";
			}
		}
}
