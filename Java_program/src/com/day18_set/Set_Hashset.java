package com.day18_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Hashset {
	
	public static void main(String[] args) {
		
		Set <Object> obj = new HashSet<Object>();
		obj.add(10);
		obj.add(22);
		obj.add("java");
		obj.add("java");
		obj.add(22);
		obj.add(44);
		obj.add(50);
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
		boolean contains = obj.contains("java");
		System.out.println(contains);
		
		Set<Object>obj1 = new LinkedHashSet<Object>();
		obj1.add(11);
		obj1.add(22);
		obj1.add(55);
		obj1.add("java");
		obj1.add(44);
		
		System.out.println(obj1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
