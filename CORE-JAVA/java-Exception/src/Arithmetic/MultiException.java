package Arithmetic;

public class MultiException {
	
	public static void main(String[] args) {
		
		String name = "rays";
		
		try {
			System.out.println(name.length());//nullPointWxception
		System.out.println(name.charAt(4));//IndexOutOfBound	
		}catch (NullPointerException e) {
			System.out.println("exception: " + e.getMessage());
		}catch (IndexOutOfBoundsException e) {
			System.out.println("exception: " + e.getMessage());
		}
	}

}
