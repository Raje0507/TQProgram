package com.AssignmentNO5;

class Customer
{
	int oid;
	String product;
	
	int cid;
	
	public void order(int oid,String product)
	{
	     
		this.oid=oid;        //instance value
		this.product=product;
		this.details();      //method chaining
	}
	
	public void details()
	{
		System.out.println("Its Customer Details="+oid+"\t"+product);
	}
	
	
	public Customer(int cid)
	{
	   this.cid=cid;	
	}
	
	public Customer()
	{
		this(45);                    //const chaining
		System.out.println(cid);
	}	
	
}

public class Eg13This {

	public static void main(String[] args) {
		
		Customer c=new Customer();
		
		c.order(123,"milk");
	

	}

}
