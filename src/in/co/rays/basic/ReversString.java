package in.co.rays.basic;

public class ReversString {
public static void main(String[] args) {
	String str = "google";
	for(int i = str.length() - 1; i >= 0; i--) {
		System.out.print(str.charAt(i));
	}
}
}
