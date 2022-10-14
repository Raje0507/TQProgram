package com.day18ArrayObject;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo {
	
	int id;
	String name;
	int[] Marks;
	
	StudentInfo(int id,String name,int[] Marks)
	{
		this.id=id;
		this.name=name;
		this.Marks=Marks;
	}
	
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(Marks);
	}

	public static void main(String[] args) {
		StudentInfo st[]=new StudentInfo[3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<st.length;i++) 
		{
			System.out.println("Enter Id");
			int num=sc.nextInt();
			System.out.println("Enter name");
			String a=sc.next();
			
			int mk[]=new int[3];
			for(int j=0;j<mk.length;j++)
			{
				System.out.println("Enter marks Subject="+(j+1));
				mk[j]=sc.nextInt();
			}
			
			st[i]=new StudentInfo(num,a,mk);
		}
		
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
		

	}

}
