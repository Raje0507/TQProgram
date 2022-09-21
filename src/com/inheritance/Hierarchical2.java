package com.inheritance;

class Animal
{
	void eat()
	{
		System.out.print("Eating...");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.print("Barking...");
	}
}

class Cat extends Animal
{
	void meow()
	{
		System.out.print("Meowing...");
	}
}

public class Hierarchical2 {

	public static void main(String[] args) {
		Cat c=new Cat();
		Dog g=new Dog();
		
		c.meow();
		c.eat();
		
		g.bark();
		g.eat();

	}

}
