package com.day9;

class Order{
	int oid;
	String city;
	int cust_id;
	int status;
	
	public Order(int id,String c,int C_id,int s)
	{
		this.oid=id;
		this.city=c;
		this.cust_id=C_id;
		this.status=s;
	}
	
	public Order()
	{
		this(33,"pune",2334,1);
		if(status==0)
		{
			System.out.println("order out delivery");
		}
		else
		{
			System.out.println("Order Is Deliverd");
			details();
		}
		
	}
	
	void details()
	{
		System.out.println(oid+" "+city+" "+cust_id);
	}
}
public class ThisKey3 {

	public static void main(String[] args) {
		Order d=new Order();

	}

}
