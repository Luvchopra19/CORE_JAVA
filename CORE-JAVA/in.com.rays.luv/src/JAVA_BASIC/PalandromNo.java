package JAVA_BASIC;

public class PalandromNo {
	public static void main(String[] args) {
		int temp = 121;
		int i = temp;
		int r = 0;
		int reverseNO = 0;
		 while(i > 0) {
			 r = i % 10;
			 reverseNO = (reverseNO * 10) + r;
			 i = i / 10;
		 }
		 System.out.println(reverseNO);
			 if(temp == reverseNO) {
				 System.out.println("It is PalandromNo");
			 }else {
				 System.out.println("It is Not PalandromNo");
			 }
		 }
		}

