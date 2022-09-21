package com.inheritance;

class CLG
{
	int clgId=1245;
	void show()
	{
		System.out.println("Welcome To College");
	}
}

class Libarary extends CLG
{
	int lId=15;
	public void lab()
	{
		System.out.println(clgId+" "+lId);
	}
}


class Dept extends CLG
{
	int did=56;
	 
	public void check()
	{
		System.out.println(clgId+" "+did);
	}
}


public class Hierarchical {

	public static void main(String[] args) {
		
		Libarary l=new Libarary();
		l.show();
		l.lab();
		
		Dept d=new Dept();
		d.show();
		d.check();

	}

}
