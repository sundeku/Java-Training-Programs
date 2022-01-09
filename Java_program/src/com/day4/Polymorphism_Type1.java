package com.day4;

public class Polymorphism_Type1 {
	
	public void Java() {
		System.out.println("Polymorphism type1 :Method Overloading");
	}
	public void Bank(String name ) {
		System.out.println("Customer Name      :"+ name);
	}
	public void Bank(String a,String b) {
		System.out.println(a+b);
		
	}
	public void Bank(long no) {
		System.out.println("A/c Number         :"+ no);
		
	}
	public void Bank(int id ) {
		System.out.println("customer ID        :"+ id );
		
	}
	public void Bank(float RS) {
		System.out.println("Balance            :"+ RS);
	}
	public void Bank() {
		System.out.println("Thank You For your Time");
		
	}
 public static void main(String[] args) {
	 Polymorphism_Type1 Details = new Polymorphism_Type1();
	 Details.Java();
	 Details.Bank("Naresh Kumar.V");
     Details.Bank("Gender             :","Male" );
	 Details.Bank(1743155000039136l);
	 Details.Bank(17968823);
	 Details.Bank(2460f);
	 Details.Bank();
	 
	 
	 
}


}
