package com.day8;

public class Vehicle {
	int model_No;
	String name;
	int price;
	

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		  v.model_No=143;
		  v.name="BMW";
		  v.price=1053000;
		  
		  System.out.println(v.model_No+" "+v.name+" "+v.price);

	}

}
