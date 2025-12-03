package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionAddAll {
	
	public static void main(String[] args) {
		
	Collection c1 = new ArrayList();
	
	c1.add(13);
	c1.add("Ram");
	c1.add('P');
	c1.add(true);
	c1.add(12.456);
	
	System.out.println(c1);
	System.out.println(c1.size());
	
	System.out.println("--------------");
	
	Collection c2 = new ArrayList();
	
	c2.add(12);
	c2.add("Rawan");
	c2.add(14.058);
	
	System.out.println(c2);
	
	c1.add(c2);
	System.out.println("After adding c2: " + c1);
	
	c1.removeAll(c2);
	System.out.println("after removing c2: " + c1);
	System.out.println(c2.removeAll(c1));
	
	c1.isEmpty();
	System.out.println("c1 is empty: " + c1);
	
	c1.containsAll(c2);
	System.out.println("contain All: " + c2);
	
	
	System.out.println("Is Empty: " + !c1.isEmpty());
	
	c2.clear();	
	System.out.println("affter clear elements c2: " + c2);
	
	
	}

}
