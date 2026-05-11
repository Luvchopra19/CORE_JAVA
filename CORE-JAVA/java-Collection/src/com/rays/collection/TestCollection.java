package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
public static void main(String[] args) {
	
	Collection c = new ArrayList();
	
	c.add("Apple");
	c.add('a');
	c.add(23);
	c.add(true);
	c.add(2.99);
	System.out.println(c);
}
}
