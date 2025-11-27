package Arithmetic;

public class TestAritmeticWithTYrayCatch {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		try {
			int c = a / b;   //AritmeticException
			System.out.println("C" + c);
		}catch(ArithmeticException e) {
			System.out.println("exception" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("program is finish");
	}
}
