package com.day10Inhe;

class Bag1
{
	
	static void display(int x)
	{
	   System.out.println(x);
	}
}

class Book1 extends Bag1
{
	
	static void display(float y)
	{
		System.out.println(y);
	}
}


public class StaticLoad {
	public static void main(String args[])
	{
		Book1 b=new Book1();
		
		b.display(20);
		b.display(30.3f);
	}

}
