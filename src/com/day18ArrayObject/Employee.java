package com.day18ArrayObject;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	float salary;
	
	Employee(int id,String name,float salary)
	{
	   this.id=id;
	   this.name=name;
	   this.salary=salary;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Employee");
		
		int size=sc.nextInt();
		Employee e[]=new Employee[size];
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Emter Id");
			int num=sc.nextInt();
			System.out.println("Enter name");
			String a=sc.next();
			System.out.println("Enter salary");
			float s=sc.nextFloat();
			
			e[i]=new Employee(num,a,s);
		}
		
		for(int i=0;i<e.length;i++)
		{
			float temp=e[i].salary;
			
			if(temp<15000)
			{
				//float bonus=temp/10; 
				
				e[i].salary=temp*1.1f;
				
				System.out.println(e[i]);
			}
			else
			{
				System.out.println(e[i]);
			}
		}

	}

}
