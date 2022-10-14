package com.day17Array;

import java.util.Scanner;

public class ElementFreq {
	
	public static int check(int a[],int n)
	{
		int count=0;
		boolean ispresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				ispresent=true;
				break;
			}
		}
		
		if(ispresent==true)
		{
			System.out.println("Is Present");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
			count++;
			}
		}
		}
		else 
			System.out.println("Not present");
		return count;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1,2};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Check Number");
		int num=sc.nextInt();
		
		System.out.println(num+" is times="+check(arr,num));

	}

}
