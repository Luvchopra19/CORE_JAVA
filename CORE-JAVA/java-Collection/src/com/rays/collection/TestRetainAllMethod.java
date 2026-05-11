package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAllMethod {
public static void main(String[] args) {
Collection c1 = new ArrayList();
	
	c1.add("Mango");
	c1.add("apple");
	c1.add("graps");
	System.out.println(c1);
	System.out.println("Size of c1:> " + c1.size());
	
	System.out.println("---------------------");
	
	Collection c2 = new ArrayList();
	
	c2.add("Orange");
	c2.add("banana");
	
	c1.addAll(c2);
	System.out.println("Size of c1:> " + c1.size());
	System.out.println(c1);
	
	System.out.println("--------------------");
	System.out.println(c1.containsAll(c2));
	System.out.println(c2.isEmpty());
	System.out.println(c1);
	System.out.println(c1.retainAll(c2));
	System.out.println(c1.removeAll(c2));
}
}
