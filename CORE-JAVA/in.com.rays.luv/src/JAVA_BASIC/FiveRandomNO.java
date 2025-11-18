package JAVA_BASIC;

public class FiveRandomNO {
public static void main(String[] args) {
	for(int i = 1; i < 6;i++) {
		System.out.println(Math.random() * 100);
	}
	System.out.println("-----------------");
	for(int i = 1; i < 6;i++) {
		System.out.println(((int)(Math.random() * 100)));
	}
	}
}
