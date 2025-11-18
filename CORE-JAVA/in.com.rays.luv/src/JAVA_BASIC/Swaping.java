package JAVA_BASIC;

public class Swaping {
public static void main(String[] args) {
	int a = 20;
	int b = 15;
	int c = 0;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	a = a - b;
	b = b + a;
	c = b - a;
	a = c;
	System.out.println("-----------");
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	//With out third element also swaping
	a = b - a;
	b = b - a;
	a = b + a;
	System.out.println("-----------");
	System.out.println("a = " + a);
	System.out.println("b = " + b);
}
}
