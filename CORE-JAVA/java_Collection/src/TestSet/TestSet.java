package TestSet;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	
public static void main(String[] args) {
	
	// 1.Set contain only unique elements
	// 2.Set contain only one null value
	// 3.Order of set is not define

	Set s = new HashSet();
	
			s.add(null);
			s.add(null);
			s.add('a');
			s.add('b');
			s.add('c');
			s.add('d');
			s.add('e');
			s.add('f');
			s.add('a');
			s.add('a');
			s.add('a');
			
			System.out.println("set: " + s);

		}
}

