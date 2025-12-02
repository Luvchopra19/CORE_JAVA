package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
			
		c.add(12);
		c.add("Luv");
		c.add('P');
		c.add(true);
		c.add(12.456);
		
		System.out.println(c);
		System.out.println(c.size());
		
		System.out.println("--------------");
		
		for(Object o : c) {
			 System.out.println(o);
		}
			 System.out.println("--------------");
			 
			 System.out.println(c.contains('P'));// membership checking
			 System.out.println(c.contains(13));
			 System.out.println(c.remove('P'));
			 System.out.println(c);
			 System.out.println(c.remove(13));
			 System.out.println(c.size());
	}
}