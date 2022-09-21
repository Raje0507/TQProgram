package com.day8;

public class Shopping {
	String purchase_item;
	int quantity;
	float price_per_item;
	double bill;

	public void accept(String name,int q,float price)
	{
		purchase_item=name;
		quantity=q;
		price_per_item=price;
	}
	
	public void calculate_Bill()
	{
		if(quantity>0)
		{
			bill=quantity*price_per_item;
			display();
		}
		else
		{
			System.out.println("Error");
		}
	}
	
	public void display()
	{
		System.out.println("item="+purchase_item);
		System.out.println("quantity="+quantity);
		System.out.println("price="+price_per_item);
		System.out.println("Bill="+bill);
	}
	
	
	public static void main(String[] args) {
		
		Shopping sh=new Shopping();
		
		sh.accept("dairy_Milk", 0, 17);
        sh.calculate_Bill();
	}

}
