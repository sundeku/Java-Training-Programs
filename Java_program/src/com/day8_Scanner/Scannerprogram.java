package com.day8_Scanner;

import java.util.Scanner;

public class Scannerprogram {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("        Physical test ");
			
		System.out.println("Enter your Name    : ");		
		String name = s.nextLine();
		System.out.println(name);
		
		System.out.println("Enter your age     :");
		int age = s.nextInt();
		System.out.println(age);
		
		System.out.println("Entter your Height :");
		float Height = s.nextFloat();
		System.out.println(Height);
		
		System.out.println("Enter your weight  :");
		float Weight = s.nextFloat();
		System.out.println(Weight);
		
		System.out.println("Thanks FOR YOUR Time.");
		
	
		
		
		
	}

}
