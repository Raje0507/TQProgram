package com.day9;

class Customer{
	String name;
	String address;
	int item_price;
	int qty;
	int total_bill;
	
	public Customer(String n,String add,int price,int q)
	{
		this.name=n;
		this.address=add;
		this.item_price=price;
		this.qty=q;
	}
	
	public void calculate_Bill()
	{
		total_bill=qty*item_price;
	}
	
	void display()
	{
		if(qty>0)
		{
			this.calculate_Bill();
			System.out.println(name+" "+address+" "+item_price+" "+qty+" "+total_bill);
		}
		else
		{
			System.out.println("qty Be Greater Than Zero");
		}
	}
	
}

public class ThisKey2 {

	public static void main(String[] args) {
       Customer cust=new Customer("Raj","pune",200,0);
       
       cust.display();

	}

}
