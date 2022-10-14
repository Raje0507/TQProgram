package com.AssignmentNO6;

class Nib
{
	String type;
	int width;
	
	public void setType(String type)
	{
		this.type=type;
	}
	public void setWidth(int width)
	{
		this.width=width;
	}
	
	public String getType()
	{
		return type;
	}
	public int getWidth()
	{
		return width;
	}
}
class Refill
{
	String inkcolor;
	int length;
	Nib nib;
	
	public void setInkcolor(String inkcolor)
	{
	   this.inkcolor=inkcolor;
	}
	public void setLength(int length)
	{
		this.length=length;
	}
	public void setNib(Nib nib)
	{
		this.nib=nib;
	}
	
	public String getInkcolor()
	{
		return inkcolor;
	}
	public int getLength()
	{
		return length;
	}
}
class Pen
{
	Refill refill;
	int caplength;
	String brand;
	
	public void setRefill(Refill refill)
	{
		this.refill=refill;
	}
	public void setCaplength(int caplength)
	{
		this.caplength=caplength;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public int getCaplength()
	{
		return caplength;
	}
	public String getBrand()
	{
		return brand;
	}
}
public class EG4Structure {

	public static void main(String[] args) {
		Pen p=new Pen();
		p.setRefill(new Refill());
        p.setCaplength(78);
        p.setBrand("Cello");
        
        Refill r=p.refill;
        r.setInkcolor("red");
        r.setLength(23);
        r.setNib(new Nib());
        
        Nib b=r.nib;
        b.setType("fiber");
        b.setWidth(5);
        
        System.out.println(p.getCaplength()+" "+p.getBrand());
        System.out.println(r.getInkcolor()+" "+r.getLength());
        System.out.println(b.getType()+" "+b.getWidth());
	}

}
