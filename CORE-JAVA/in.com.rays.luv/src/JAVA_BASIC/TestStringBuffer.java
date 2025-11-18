package JAVA_BASIC;

public class TestStringBuffer {

public static void main(String[] args) {
	String name = "Luv";
	
	System.out.println(name);
	
	System.out.println(name.replace('u', 'a'));
	
	System.out.println(name);//return same name because of string immutable
	
	System.out.println("------------");
	
	StringBuffer sb = new StringBuffer ("Luv");
	
	System.out.println(sb);
	
	System.out.println(sb.append("chopra"));
	
	System.out.println(sb);
}
}
