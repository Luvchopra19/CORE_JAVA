package JAVA_BASIC;

public class TestString {
public static void main(String[] args) {
	String name = "Luv chopra";
	System.out.println(name);
	System.out.println(name.length());
	System.out.println(name.charAt(7));
	System.out.println(name.indexOf("h"));
	System.out.println(name.lastIndexOf("r"));
	System.out.println(name.replace("u", "a"));
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.startsWith("Luv"));
	System.out.println(name.endsWith("a"));
	System.out.println(name.substring(1, 6));
}
}
