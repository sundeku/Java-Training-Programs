package com.day7;

public class Task_2 extends Task {

	public static void main(String[] args) {

		int a = 12345;
		float d = 10;
		String b = "Step By Step Process";
		boolean c = 1 < 5;
		Task_2 n = new Task_2();
		System.out.println(a + d);
		System.out.println(b);
		System.out.println(c);

		n.name();
		n.name(21);
		n.name("Hi Guys");

	}

	@Override
	public void name() {
		System.out.println("Hello Frnds");

	}

	@Override
	public void name(int a) {
		System.out.println(a);

	}

	@Override
	public void name(String a) {
		System.out.println(a);

	}

}
