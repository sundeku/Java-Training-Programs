package com.day3_oops_concept;

public class Single_multilevel_child_P extends Single_with_maltilevel_GP {
	
	public void name(String a) {
		System.out.println("Hi i am "+a);
		
	}
	public void n() {
		System.out.println("I allowed to use all of My assets and my Bank Balance too my son's and my husband ");
		
	}
	
	public static void main(String[] args) {
		
		Single_multilevel_child_P n1= new Single_multilevel_child_P();
	
		n1.n("Jayapal.B");
		n1.n1();
		n1.n2("All of My Assets & My Bank Balances Too My D");
		n1.n3(1<2);
		n1.n4("Ramapuram");
		n1.n5(1050000);

		
			
	}

}
