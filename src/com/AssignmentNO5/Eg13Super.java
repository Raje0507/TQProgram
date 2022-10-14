package com.AssignmentNO5;

class Bank
{
	int id=145;
	
	public void show()
	{
		System.out.println("The Bank Details...");
	}
	
	Bank(int y)
	{
		System.out.println("Branch No"+y);
	}
}
class Emp extends Bank
{
	int id=678;
	
	@Override
	public void show()
	{
		super.show();
		System.out.println("The Emp Detais..."+super.id);
	}
	
	Emp()
	{
		super(5);
	}
	
}

public class Eg13Super {

	public static void main(String[] args) {
		
		Emp e=new Emp();
		
		e.show();

	}

}
