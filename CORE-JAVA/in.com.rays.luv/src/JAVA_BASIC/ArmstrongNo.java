package JAVA_BASIC;

public class ArmstrongNo {
	public static void main(String[] args) {
		int temp = 153;
		int i = temp;
		int r = 0;
		int reverseNO = 0;
		 while(i > 0) {
			 r = i % 10;
			 reverseNO = reverseNO + r * r * r;
			 i = i / 10;
		 }
		 System.out.println(reverseNO);
			 if(temp == reverseNO) {
				 System.out.println("It is ArmstrongNo");
			 }else {
				 System.out.println("It is Not ArmstrongNo");
			 }
		 }
}
