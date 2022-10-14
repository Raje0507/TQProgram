package com.AssignmentNO5;

class Animal1
{
	String name="Animal";
	String makeNoise()
	{
		return "generic noise";
	}
}

class Dog2 extends Animal1
{
	String name;
	String show()
	{
		return name;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		
		Dog2 a=new Dog2();
		System.out.println(a.show());

	}

}
