package com.day5_Method_Overloading;

public class Access_modoifer_protected1 {
	protected void name(String a) {
		System.out.println("Name of The Certificate     :"+a);
	}
	protected void date(double a,double b) {
		System.out.println("Date of issued  :"+a+"  TO  "+"Date of validity  :"+b);	
	}
	protected void contry(String a) {
		System.out.println("Nationality                 :"+a);
	}
	protected void Date(double a) {
		System.out.println("Date of Birth                :"+a);		
	}
	protected void group(char a,char b) {
		System.out.println("Blood Group                 :"+a+b);		
	}
	protected void Nmae(String a) {
		System.out.println("Nmae                        :"+a);		
	}
	
	public static void main(String[] args) {
		Access_modoifer_protected1 details = new Access_modoifer_protected1 ();
		details.name("Indian Driving Licanace");
		
		details.date(12.2018, 12.2038);
		
		details.contry("INDIA");
		
		details.Date(05.1998);
		
		details.group('B','+');
		
		details.Nmae("NARESH KUMAR.V");

	}


}
