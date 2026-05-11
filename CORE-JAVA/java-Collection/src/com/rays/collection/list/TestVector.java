package com.rays.collection.list;

import java.util.Vector;

public class TestVector {
public static void main(String[] args) {
	
	Vector v = new Vector();
	
	v.add("Ram");
	v.add("Shyam");
	v.add("Kamlesh");
	v.add(2, "Raman");
	
	System.out.println(v.get(2));
	System.out.println(v);
}
}
