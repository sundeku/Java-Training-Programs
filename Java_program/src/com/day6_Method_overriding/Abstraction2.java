package com.day6_Method_overriding;

public class Abstraction2 extends Abstraction_1 {

	@Override
	public void name(String a) {
		System.out.println("Patient Nam       :"+a);
	}

	@Override
	public void no(int a) {
		System.out.println("Petient ID        :"+a);
		
	}

	@Override
	public void room(String a, int b) {
		System.out.println("Room No           :"+a+b);
		
	}

	@Override
	public void prob(String b) {
		System.out.println("Problem           :"+b);
		
	}

	@Override
	public void corrunt(String c) {
		System.out.println("corrunt Situation :"+c);
		
	}
public static void main(String[] args) {
	Abstraction2 n = new Abstraction2();
	n.name();
	n.name("Rajasekar.D");
	n.no(222345);
	n.room("Frist Floor", 301);
	n.prob("blood cancar");
	n.corrunt("Stating Stage");
	
	
}	

}
