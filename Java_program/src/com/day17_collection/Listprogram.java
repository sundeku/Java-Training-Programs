package com.day17_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Listprogram {
	
	public static void main(String[] args) {
		
		List <Object> obj = new LinkedList<Object>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		
		//System.out.println(obj);
		
		obj.add(3,55);
		System.out.println(obj);
		
		// int size = obj.size();
		//System.out.println(size);
		
		//Object object = obj.get(4);
		//System.out.println(object);
		
		//obj.set(3, 54);
		//System.out.println(obj);
		
        //int indexOf = obj.indexOf(30);
		//System.out.println(indexOf);
		
		//boolean contains = obj.contains(54);
		//System.out.println(contains);
		
		//obj.clear();
		//System.out.println(obj);
		
		List <Object> obj1= new Vector<Object>();
		obj1.add(11);
		obj1.add(20);
		obj1.add(10);
		obj1.add(33);
		obj1.add(44);
		obj1.add(50);
		
		System.out.println(obj1);
		
//		obj1.addAll(obj);
//		System.out.println(obj1); 
		
		//obj1.addAll(3, obj);
		//System.out.println(obj1);
		
		obj1.retainAll(obj);
		System.out.println(obj1);
		
		
		
		
			
				
	}
	

}
