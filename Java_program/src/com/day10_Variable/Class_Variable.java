package com.day10_Variable;

public class Class_Variable {

	String a = "Hi Sir";
	long b = 111415114051l;
	String c = "My Department is ";
	String d = "Please Tell Me my Results sir. ";

	public void name() {
		String a = " I Am Naresh Kumar.V";
		System.out.println(a);

	}

	public void number() {
		String b = "This is My Register number : ";
		System.out.printf(b);

	}

	public void DP() {
		String c = "Mechanical";
		System.out.println(c);

	}

	public static void main(String[] args) {

		Class_Variable A = new Class_Variable();
		System.out.printf(A.a); // Variable level
		A.name();
		System.out.printf(A.c);
		A.DP();
		A.number();
		System.out.println(A.b);
		System.out.println(A.d);

	}

}
