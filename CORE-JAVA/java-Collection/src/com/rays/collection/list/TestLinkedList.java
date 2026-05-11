package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestLinkedList {
	public static void main(String[] args) {
		
		List List = new ArrayList();
		
		List.add(0, "Ram");
		List.add(1, "Ram");
		List.add(2, "Mango");
		List.add(3, "Orange");
		List.add(4, "Banana");
		List.add(5, "Apple");
		//List cand add more value of null
		//List.add(null);
		//List.add(null);
		System.out.println(List.indexOf("ram"));//search element from 0 index
		System.out.println(List.lastIndexOf("Ram"));//sesrch element from last index
		System.out.println(List.subList(1, 4));
		System.out.println("------------------");
		
		System.out.println("List: " + List);
		System.out.println(List.get(2));
		List.remove(1);
		System.out.println("List" + List);
		System.out.println(List.get(2));
		List.set(2, "Grapse");
		System.out.println("List" + List);
	}
}
