package com.day5_Method_Overloading;

public class Default {
	  void name(String a) {
		System.out.println("Frist Name     :"+a);
	}
      void age(int a,float b ) {
		System.out.println("Age            :"+(a-b));	
	}
	
	public static void main(String[] args) {
		Default Details = new Default();
		Details.name("NARESH ");
		Details.age(2021, 1998);
	}
}
