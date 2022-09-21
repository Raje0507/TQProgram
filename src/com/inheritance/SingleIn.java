package com.inheritance;

class Department
{
	int Did=23;
	String Dname="Engg";
}

class Student extends Department
{
	int sid=11;
	void Display()
	{
	System.out.println(sid+" "+Did+" "+Dname);
	}
}

public class SingleIn {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		s.Display();

	}

}
