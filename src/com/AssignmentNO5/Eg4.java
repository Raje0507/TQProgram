package com.AssignmentNO5;

class Animal
{
	int legs=4;
	
	Animal(int y)      //Consructo Overload 
	{
		System.out.println("Animal is"+y);
	}
	
	Animal (float y)               
	{
		System.out.println("Animal is"+y);
	}
	
}

class Dog extends Animal
{

	Dog(float y) 
	{
		super(y);
	}
    /* Animal(int  y)   //Constructor Not Overirde
	{
		Sysetm.out.println("");
	}*/
     
     
}


public class Eg4 {

	public static void main(String[] args) {
      

	}

}
