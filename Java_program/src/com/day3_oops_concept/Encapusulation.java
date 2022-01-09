package com.day3_oops_concept;

public class Encapusulation {
	//method creation
	public void n1() {
		System.out.println("       Hi");
	}
	public void n2(String a) {
		System.out.println(" Name        :"+a);
	}
	public void n3(String b) {
		System.out.println("Qualification:"+b);		
	}
	public void n4(int a) {
		System.out.println("Batch        :"+a);	
	}
	public void n5(String c) {
		System.out.println("Currently    :"+c);
	}
	public void n6() {
		System.out.println("Thank You");
	}
	//main method
public static void main(String[] args) {
	//object creation
	Encapusulation Number = new Encapusulation();
	Number.n1();
	Number.n2(" Kumar.V");
	Number.n3(" BE.Mechanical Enginrring");
	Number.n4( 2019 );
	Number.n5(" I joined Automation testing in Greens Technology");
	Number.n6();
			
} 
		
	

}
