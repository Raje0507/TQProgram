package com.day10Inhe;

class Bag
{
	static int x;
	static int y;
	
	static int display()
	{
		return x=20;
	}
}

class Book extends Bag
{
	//@Override
	static int display()
	{
		return y=30;
	}
}

public class StaticRide {

	public static void main(String[] args) {
        
       System.out.println("bag is"+Book.display());
       System.out.println("Cow is"+Book.display());
	}

}
