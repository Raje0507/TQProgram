package com.day13;

abstract class First
{
	int a=35;
}

interface Secondable
{
	int b=45;
}

class Connect extends First implements Secondable
{
	public int show()
	{
		return a+b;
	}
}

public class AddEg {

	public static void main(String[] args) {
		
		Connect c=new Connect();
		
		System.out.println(c.show());

	}

}
