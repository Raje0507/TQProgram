package com.day9;

class Car{
	int modelNO;
	String color;
	int price;
	
	public Car(int m,String c,int p)
	{
		this.modelNO=m;
		this.color=c;
		this.price=p;
	}
	
	void display()
	{
		System.out.println(modelNO+" "+color+" "+price);
	}
	
	
}

public class ThisKey1 {

	public static void main(String[] args) {
		Car car=new Car(111,"RED",20000);
        
		car.display();
	}

}
