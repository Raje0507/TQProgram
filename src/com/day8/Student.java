package com.day8;

public class Student {
	int sid;
	String sname;
	int m1;
	int m2;
	int m3;
	float pers;
	
	public void details(int id,String n,int p1,int p2,int p3)
	{
		sid=id;
		sname=n;
		m1=p1;
		m2=p2;
		m3=p3;
	}
	
	public void per()
	{
	  pers=((m1+m2+m3)*100)/300;
	}
	
	public void display()
	{
		System.out.println(sid+" "+sname+" "+m1+" "+m2+" "+m3+" "+pers);
	}

	public static void main(String[] args) {
		Student std=new Student();
		std.details(12,"Sanket",85,89,93);
		std.per();
		std.display();
	}

}
