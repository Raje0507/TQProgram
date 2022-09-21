package com.day10;

class Engine
{
	String Type;
	
	Engine(String Type)
	{
		this.Type=Type;
	}
	
	public void engDetails()
	{
		System.out.println("Car Type="+Type);
	}
}
public class Car {
	String m_name;
	int price;
	Engine eng;
	
	public Car(String m_name,int price,Engine eng)
	{
		this.m_name=m_name;
		this.price=price;
		this.eng=eng;
	}
	
	public void display()
	{
		System.out.println("Model Name="+m_name+" ,Price= "+price);
		eng.engDetails();
	}

	public static void main(String[] args) {
		
		Engine e=new Engine("petrol");
		Car c=new Car("BMW",2000,e);
		
		c.display();

	}

}
