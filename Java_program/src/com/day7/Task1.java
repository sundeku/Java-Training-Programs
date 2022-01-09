package com.day7;

public class Task1 extends Task{

	@Override
	public void name() {
			System.out.println("Sanjay day7 task");
		
	}

	@Override
	public void name(int a) {
		System.out.println("Numbers :"+a);
		
	}

	@Override
	public void name(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Task1 By= new Task1();
		By.name();
		By.name(12345);
		By.name("Step by step Out ans");
		
	}

}
