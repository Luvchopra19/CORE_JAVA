package JAVA_BASIC;

public class SecondLargestNoInArray {
	public static void main(String[] args) {
		int[] a = {5, 10, 15, 20, 25, 30, 35};	
		int n = a[0];
		int largestNo = 0;
		for(int i : a) {
			if(i > largestNo) {
				largestNo = i;
			}
		}
		System.out.println("largestNo : " + largestNo);
		int secondLargestNo = 0;
		for(int i : a) {
		if(i > secondLargestNo && i < largestNo) {
			secondLargestNo = i;
			
		}
		}
		System.out.println("secondLargestNo : " + secondLargestNo);
		}
}

