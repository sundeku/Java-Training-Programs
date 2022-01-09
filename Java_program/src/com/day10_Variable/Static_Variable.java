package com.day10_Variable;

public class Static_Variable {

	static String a = "Big Boss";
	static int b = 100;
	static int c = 20;

	public static void name() {
		System.out.printf("Nmae             :");
	}

	public static void count() {
		System.out.printf("Days             :");
	}

	public static void day() {
		System.out.printf("Number of Pepole :");

	}

	public static void main(String[] args) {

		name();
		System.out.println(" "+a);
		count();
		System.out.println(" "+b);
		day();
		System.out.println(" "+c);

	}

}
