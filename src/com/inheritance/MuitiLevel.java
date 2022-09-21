package com.inheritance;

class Company
{
	String c_name="Infosys";
	int    c_id=1234;
}

class Emp extends Company
{
    int id=12;
	String Tech="Java";
}

public class MuitiLevel extends Emp{

	public static void main(String[] args) {
		
		MuitiLevel m=new MuitiLevel();
		

         System.out.println(m.c_name+" "+m.c_id+" "+m.id+" "+m.Tech);
		
	}

}
