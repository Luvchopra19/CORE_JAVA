package Arithmetic;

public class ParentCatchBlock {

	public static void main(String[] args) {
		
String name = "SunilOs";
		
		try {
			System.out.println(name.length());//nullPointWxception
		System.out.println(name.charAt(3));//IndexOutOfBound	
		}catch (NullPointerException e) {
			System.out.println("exception: " + e.getMessage());
		}catch (IndexOutOfBoundsException e) {
			System.out.println("exception: " + e.getMessage());
		}finally {
			System.out.println("always execute");
		}
	}
}
