package com.day9_Constructor;

public class Product_Data {

	public Product_Data() {
		System.out.println("           Mobile Features ");
	}

	public Product_Data(String Model) {
		System.out.println("Company Name         :" + Model);
	}

	public Product_Data(String b,char a, String name) {
		System.out.println("Model Name           :"+b+" " + a+" " + name);
	}

	public Product_Data(Float Ram, String gb) {
		System.out.println("RAM                  :" + Ram + "" + gb);
	}

	public Product_Data(long Rom, String a) {
		System.out.println("Storage              :" + Rom + a);
	}

	public Product_Data(Float f, Float b) {
		System.out.println("Camera front         :"+ f + "MP" + "    " + "Camera Back :" + b + "MP");
	}

	public Product_Data(int a, String b) {
		System.out.println("Battery              :"+ a + "" + b);
	}

	public static void main(String[] args) {

		Product_Data  n = new Product_Data();
		Product_Data n1 = new Product_Data("Redmi");
		Product_Data n2 = new Product_Data("Note",'6', "pro");
		Product_Data n3 = new Product_Data(4.00f, "GB");
		Product_Data n4 = new Product_Data(64l, "GB");
		Product_Data n5 = new Product_Data(20.00f, 12.00f);
		Product_Data n6 = new Product_Data(4000, "mAh");

	}

}
