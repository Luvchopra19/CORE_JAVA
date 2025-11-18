package JAVA_BASIC;

public class LargestNoInArray {
		public static void main(String[] args) {
		int[] a = {5, 10, 15, 20, 25, 30, 35};
			int largestNo = a[0];
			for(int i : a) {
				if(i > largestNo) {
					largestNo = i;
				}
			}
			System.out.println(largestNo);
		}
	}



