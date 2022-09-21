package com.inheritance;

class Car
{
	int speed=75;
	public void show()
	{
		System.out.println("It is Car Class");
	}
	
	Car(int y)
	{
		System.out.println(y);
	}
	
}

class Engine extends Car
{
	
	int speed=80;
	public void show()
	{
		super.show();  //call parent method
		
		System.out.println("Engine Speed="+super.speed); //call parent variable
		
		System.out.println("It Is Engine Class");
	}
	
	Engine(int y)
	{
		super(y);  //call parent constructed 
		
	}
	
}


public class SuperKey {

	public static void main(String[] args) {
		
		Engine en=new Engine(20);
		
		en.show();
		

	}

}
