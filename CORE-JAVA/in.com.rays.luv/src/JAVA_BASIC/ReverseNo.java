package JAVA_BASIC;

public class ReverseNo {
public static void main(String[] args) {
	int i = 123;
	int r = 0;
	int reverseNO = 0;
	 while(i > 0) {
		 r = i % 10;
		 reverseNO = (reverseNO * 10) + r;
		 i = i / 10;
		 
	 }
	 System.out.println("REVERESE NO: " + reverseNO);
	}
}

