package com.day3_oops_concept;

public class Single_multiLevel_Child_1 extends Single_multilevel_child_P{
	public void n1() {
		System.out.println("Hello, I am Dinesh");
		
	}
	public void n1(String a) {
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
	
		Single_multiLevel_Child_1 n = new Single_multiLevel_Child_1();
		n.name("Sathya");
		n.name();
		n.n1();
		n.n1("I Decided All of my Mom Assets And Bank Balance Will Tranfor into My Name");
		
				
				
	}

}
