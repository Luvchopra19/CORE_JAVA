package JAVA_BASIC;

import java.util.Scanner;

public class TestCalculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Inter First Number");
	int a = sc.nextInt();
	
	System.out.println("Inter Second Number");
	int b = sc.nextInt();
	
	System.out.println("Inter any One +, -, *, /, % ");
	String opr = sc.next();
	
	switch(opr) {
	
	case "+":
		System.out.println("RESULT = " + (a +b));
		break;
		
	case "-":
		System.out.println("RESULT = " + (a - b));
		break;
		
	case "*":
		System.out.println("RESULT = " + (a * b));
		break;
		
	case "/":
		System.out.println("RESULT = " + (a / b));
		break;
		
	case "%":
		System.out.println("RESULT = " + (a % b));
		break;
	}
	
	
}
}
