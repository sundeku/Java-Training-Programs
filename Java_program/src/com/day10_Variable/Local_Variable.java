package com.day10_Variable;

public class Local_Variable {
	
	public void name() {
		String a = "Sun deku";
		System.out.println("User Name :"+a);

	}
	public void password() {
		long b = 12051998l;
		System.out.println("Password  :"+b);
		
	}
	public static void main(String[] args) {
		Local_Variable n = new Local_Variable();
		n.name();
		n.password();
		
		
	}

}
