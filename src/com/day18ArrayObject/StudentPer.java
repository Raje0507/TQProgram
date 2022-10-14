package com.day18ArrayObject;

import java.util.*;

public class StudentPer {
	
	int id;
	String name;
	int []marks;
	
	StudentPer(int id,String name,int []marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(marks);
	}

	public static void main(String[] args) {
		StudentPer st[]=new StudentPer[3];
		
		Scanner sc=new Scanner(System.in);
		 
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Enter id"+(i+1));
			int n=sc.nextInt();
			
			System.out.println("Enter name");
			String a=sc.next();
			
			int mk[]=new int[3];
			for(int j=0;j<mk.length;j++)
			{
				System.out.println("Enter Marks Subject="+(j+1));
				mk[j]=sc.nextInt();
			}
			
			st[i]=new StudentPer(n,a,mk);
		}
		
		for(int i=0;i<st.length;i++)
		{
			int temp[]=st[i].marks;
			
			int sum=0;
			for(int j=0;j<temp.length;j++)
			{
				sum=sum+temp[j];
			}
			int per=sum/temp.length;
			
			if(per>60)
			{
				System.out.println(st[i]+" "+per);
			}
		}

	}

}
