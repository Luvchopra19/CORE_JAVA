package com.rays.collection.set;
//1. set conten only unique elements
//2. set contain only one null value
//3. order of hashSet is not define

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
public static void main(String[] args) {
	
	Set s = new HashSet();
	
	s.add(null);
	s.add(null);
	s.add('a');
	s.add('d');
	s.add('b');
	s.add('d');
	s.add('e');
	s.add('a');
	s.add('a');
	s.add('a');
	System.out.println("Set: " + s);
}
}
