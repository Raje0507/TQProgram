package com.inheritance;

class Customer
{
	String c_Name="sanket";
	int c_id=134;
}
class Product extends Customer
{
	String p_name="IceCream";
	int price=120;
	
	public void Bill()
	{
		System.out.println(c_Name+" "+c_id+" "+p_name+" "+price);
	}
	
}

public class SingleIn2 {

	public static void main(String[] args) {
		
		Product p=new Product();
		
		p.Bill();

	}

}
