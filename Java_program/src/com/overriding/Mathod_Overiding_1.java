package com.overriding;

public class Mathod_Overiding_1 extends Method_Overiding_0{
	
	@Override
	public void name() {
		// TODO Auto-generated method stub
		super.name();
	}
	@Override
	public void Add(String a) {
		// TODO Auto-generated method stub
		super.Add(a);
	}
	@Override
	public void workhr(float a) {
		// TODO Auto-generated method stub
		super.workhr(a);
	}
	public static void main(String[] args) {
		Mathod_Overiding_1 n = new Mathod_Overiding_1();
		n.name();
		n.Add("No:101,Rajaji Street, Uthukottai,Thiruvallutr,Tamil Nadu-602026.");
		n.workhr(12);
		
	}

}
