package com.rays.oop;

public class TestArthametic {
public static void main(String[] args) {
 
	Arthametic a = new Arthametic() ;
	
	a.sum(5, 5);
	
	a.substrection(10, 5);
	
	a.divide(10, 2);
	
	a.multiply(2, 2);
	
	a.remender(8, 3);
		
	System.out.println(a.getmaximumNo(7, 2));
	
	System.out.println(a.getoddoreven(7));
	
}
}
