package com.day10Inhe;

class Animal1
{
	int x;
	float y;
	
	final void eat(int x)
	{
		System.out.println("Eating..."+x+" piece");
	}
}

class Cow extends Animal1
{
	final void eat(float y)
	{
		System.out.println("Eat.."+y+" piece");
	}
}


public class finalLoad {

	public static void main(String[] args) {
		
		Cow c=new Cow();
		
		c.eat(20);
		c.eat(30.0f);

	}

}
