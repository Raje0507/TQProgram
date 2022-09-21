package com.day8;

public class Car {
	int modelNo;
	double price;
	String name;
	double speed;
	
	public void setModelNo(int modelNo)
	{
		this.modelNo=modelNo;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSpeed(double speed)
	{
		this.speed=speed;
	}

	
	public int getModelNo()
	{
		return modelNo;
	}
	public double getPrice()
	{
		return price;
	}
	public String getName()
	{
		return name;
	}
	public double getSpeed()
	{
		return speed;
	}
}
