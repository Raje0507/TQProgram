package com.day11;

class Order{
	int oid;
	int cust_id;
	String city;
	
	Order(int oid,int cust_id,String city)
	{
		this.oid=oid;
		this.cust_id=cust_id;
		this.city=city;
	}
	
	public String toString()
	{
		return oid+" "+cust_id+" "+city;
	}
}

class MyDate{
	int dd,mm,yy;
	
	MyDate(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public String toString()
	{
		return dd+" "+mm+" "+yy;
	}
	
}

public class Shipment {
	
	int sid;
	Order o;
	MyDate d;
	
	Shipment(int sid,Order o,MyDate d)
	{
		this.sid=sid;
		this.o=o;
		this.d=d;
	}
	
	public String tostring()
	{
		return sid+" "+o+" "+d;
	}

	public static void main(String[] args) {
		
		Shipment s=new Shipment(111,new Order(101,455,"Mumbai"),new MyDate(3,9,2012));
		
		System.out.println(s);

	}

}
