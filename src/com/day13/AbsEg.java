package com.day13;

abstract class Car
{
	int a=30;
	
	abstract void show();
	
	Car(int x)
	{
		System.out.println("Speed is"+x);
	}
}
class BMW extends Car
{
	
	BMW()
	{
		super(15);//Call Parent Constructor
	}
	
	@Override
	void show()
	{
		System.out.println("Car Is Running");
	}
	
	int a=40;
	public void display()
	{
		System.out.println("Car Milage Is"+super.a);//Call Parent Variable
	}
}


public class AbsEg {

	public static void main(String[] args) {
		
		BMW B=new BMW();
		
		B.show();
        B.display();
	}

}
