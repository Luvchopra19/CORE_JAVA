package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(13);
		c1.add("Ram");
		c1.add('P');
		c1.add(true);
		c1.add(12.456);
		
		System.out.println("c1: " + c1);
		
		System.out.println("--------------");
		
		Collection c2 = new ArrayList();
		
		c2.add(12);
		c2.add("Rawan");
		c2.add(14.058);
		c2.add(45);
		System.out.println("c2: " + c2);
		
		System.out.println("---------------");
		
		System.out.println(c1.retainAll(c2));
		
		System.out.println("--------------");
		
		System.out.println(c1);
		
	}
}