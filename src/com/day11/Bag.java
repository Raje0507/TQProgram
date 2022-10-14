package com.day11;

class Pen{
	int price;
	String color;
	String pname;
	
	public void  setPrice(int price)
	{
		this.price=price;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setPName(String pname)
	{
		this.pname=pname;
	}
	
	public void getPrice()
	{
		System.out.println("Pen Price="+price);
	}
	public void getColor()
	{
		System.out.println("Color="+color);
	}
	public void getPName()
	{
		System.out.println("Pen Brand Name="+pname);
	}
}


public class Bag {
	String bname;
	int bprice;
	Pen pen;
	
	public void setBName(String bname)
	{
		this.bname=bname;
	}
	public void setBPrice(int bprice)
	{
		this.bprice=bprice;
	}
	public void setPen(Pen pen)
	{
		this.pen=pen;
	}
	
	public void getBName()
	{
		System.out.println("Brand Name="+bname);
	}
	public void getBPrice()
	{
		System.out.println("Bag Price="+bprice);
	}
	public Pen getPen()
	{
		return pen;
	}
	

	public static void main(String[] args) {
       
		Bag b=new Bag();
		b.setBName("SchoolBag");
		b.setBPrice(25000);
		b.setPen(new Pen());
		
		Pen p=b.getPen();
		p.setPrice(7);
		p.setColor("red");
		p.setPName("parker");
		
		b.getBName();
		b.getBPrice();
		
		p.getPName();
		p.getColor();
		p.getPrice();

	}

}
