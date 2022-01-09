package com.day13_If_condition;

public class If_else_if_ledder {
	public static void main(String[] args) {
		int mark=55;
		if (mark<=35) {
			System.out.println("fail");
		}
		else if (mark>=50  &&mark<60) {
			System.err.println("D grade");
		}
		else if (mark>=60  &&mark<70) {
			System.out.println("C grade");
		}
		else if (mark>=70 &&mark<80 ) {
			System.out.println("B grade");
		}
		else if (mark>=80 &&mark<90) {
			System.out.println("A grade");
		}
		else {
			System.out.println("s grade");
		}
		
		
	}
	

}
