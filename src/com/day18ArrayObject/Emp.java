package com.day18ArrayObject;

import java.util.Scanner;

class Date{
	int date;
	int month;
	int year;
	
	Date(int date,int month,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;	
	}
	
	public String toString()
      {
		return date+"-"+month+"-"+year;
	  }
}

public class Emp {
	int id;
	String name;
	int salary;
	Date date;
	
	Emp(int id,String name,int salary,Date date)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.date=date;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary+" "+date;
	}

	public static void main(String[] args) {
		// employee from Employee[].attribute id,name,salary,date(date,month,year).
		 //  find out same joining date.date is another object
		Scanner sc=new Scanner(System.in);
		
		Emp e[]=new Emp[3];
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter Emp Id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Salary");
			int salary=sc.nextInt();
			
			Date d[]=new Date[1];
			for(int j=0;j<d.length;j++)
			{
				System.out.println("Enter date");
				int date=sc.nextInt();
				System.out.println("Enter Month");
				int month=sc.nextInt();
				System.out.println("Enter Year");
				int year=sc.nextInt();
				
				e[i]=new Emp(id,name,salary,d[j]=new Date(date,month,year)); 
			}	
		}
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		
		for(int i=0;i<e.length;i++)
		{
			for(int j=i+1;j<e.length;j++)
			{
				int temp = e[i].date.date;
				int  temp1=e[j].date.date;
				if(temp==temp1)
				{
					int k=e[i].date.month;
					int k1=e[i].date.month;
					if(k==k1)
					{
						int y=e[i].date.year;
						int y1=e[i].date.year;
						if(y==y1)
						{
							System.out.println("\n Same Joining Date \n"+e[i]+"\n"+e[j]);
						}
					}
					
				}
			}
			
		}

	}

}
