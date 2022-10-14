package com.AssignmentNO5;

class Car
{
	int speed;
	String Model;
	 
	public Car(int s,String m)  //Parameterized Con
	{
		this.speed=s;
		this.Model=m;
	}
	
	public String toString()
	{
		return Model+" Speed Is "+speed;
	}
	
	
}

public class Eg5 {

	public static void main(String[] args) {
		
         Car c=new Car(55,"BMW");
         
        System.out.println( c.toString());
	}

}
