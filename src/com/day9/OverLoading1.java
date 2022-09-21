package com.day9;

class CalArea{
	
	public void area(int radius)
	{
		System.out.println("Area Of Circle="+(3.14*radius));
	}
	
	public void area(int base,int height)
	{
		System.out.println("Area Of RecTriangle="+(base*height));
	}
	
	public void area(float base,int height)
	{
		System.out.println("Area of Triangle="+((base*height)/2));
	}
	
}

public class OverLoading1 {

	public static void main(String[] args) {
		
		CalArea a=new CalArea();
		
		a.area(7);
		a.area(3, 5);
		a.area(3f, 5);

	}

}
