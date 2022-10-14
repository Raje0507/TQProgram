package com.AssignmentNO6;

class Gear
{
	String type="AutoManual";
	
	public String toString()
	{
		return type;
	}
}

class SubEngine
{
	String subenginetype;
	
	SubEngine(String subenginetype)
	{
		this.subenginetype=subenginetype;
	}
	
	public String toString()
	{
		return subenginetype;
	}
}

class Engine
{
	int eid;
	int lastenginecleandate;
	SubEngine subengine;
	
	Engine(int eid,int lastenginecleandate,SubEngine subengine)
	{
		this.eid=eid;
		this.lastenginecleandate=lastenginecleandate;
		this.subengine=subengine;
	}

	public String toString()
	{
		return eid+" "+lastenginecleandate;
	}
}
class Car
{
	int carid;
	String color;
	Engine engine;
	Gear gear;
	
	Car(int carid,String color,Engine engine,Gear gear)
	{
		this.carid=carid;
		this.color=color;
		this.engine=engine;
		this.gear=gear;
	}
	public String toString()
	{
		return carid+" "+color;
	}
}
public class EG7Containtment {

	public static void main(String[] args) {
		
		Car c=new Car(11,"red",new Engine(123,23,new SubEngine("BMW")),new Gear());
		
		System.out.println(c.toString());
		
		Engine e=c.engine;
		System.out.println(e.toString());
		
		SubEngine s=e.subengine;
		System.out.println(s.toString());
		
		Gear g=c.gear;
		System.out.println(g.toString());

	}

}
