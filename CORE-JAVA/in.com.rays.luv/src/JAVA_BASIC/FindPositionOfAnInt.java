package JAVA_BASIC;

public class FindPositionOfAnInt {
public static void main(String[] args) {
	int[] a = {5, 10, 15, 20, 25, 30, 35};
	int n = 20;
	int position = -1;
	for(int i = 0; i < a.length; i++) {
		if(n == a[i]) {
		position = i;
		System.out.println("POSITION OF :" + n + " = " + position);
		}
	}
	if(position == -1) {
		System.out.println("POSITION OF :" + n + " = " + position);
	}
}
}