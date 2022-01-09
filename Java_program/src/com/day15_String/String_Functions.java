package com.day15_String;

public class String_Functions {

	public static void main(String[] args) {

		String s = "Welcome to Japan";
		String s1 = "welocme to japan";
		String s2 = "      ";
		String s3 = null;
		String s4 = "";
		String s5 = "     Hello Japan I come soon as i can         ";

		int length = s.length();
		System.out.println("Length is :" + length);

		boolean equals = s.equals(s1);
		System.out.println("equals is : " + equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);

		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

		boolean startsWith = s.startsWith("W");
		System.out.println(startsWith);

		boolean endsWith = s.endsWith("n");
		System.out.println(endsWith);

		boolean contains = s.contains("Japan");
		System.out.println(contains);

		int indexOf = s.indexOf("p");
		System.out.println(indexOf);

		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);

		char charAt = s.charAt(11);
		System.out.println(charAt);

		String replace = s.replace("Japan", "tokyo");
		System.out.println(replace);

		String substring = s.substring(0, 10);
		System.out.println(substring);

		boolean empty = s4.isEmpty();
		System.out.println(empty);

		String trim = s5.trim();
		System.out.println(trim);

		String[] split = s.split("  ");
		for (String string : split) {
			System.out.println(string);

		}

	}

}
