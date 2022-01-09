package com.day2;

public class Primitive_types {
//method creation
	public void name(String a) {
		System.out.println("Name     :"+a);
	}
	public void phonenumber(long a) {
		System.out.println("Phone No :"+a);	
	}
	public void age(int a,int b ) {
		System.out.println("Age      :"+(a-b));	
	}
//main method
	public static void main(String[] args) {
//object creation
		Primitive_types details = new Primitive_types();
		details.name("Naresh kumas.V");
		details.phonenumber(9751795616l);
		details.age(2021, 1998);

	}
	
	        
}
