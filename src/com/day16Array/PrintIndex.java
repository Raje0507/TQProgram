package com.day16Array;

import java.util.Scanner;

public class PrintIndex {
	
	public static void check(int a[],int n)
	{
		boolean isvalid=false;
		for(int j=0;j<a.length;j++)
		{
		   if(a[j]==n)
		   {
			   isvalid=true;
			   break;
		   }
		}
		
		if(isvalid)
		{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println(a[i]+" Is Exist position "+i);
			}
		}
		}
		else
			System.out.print("Is Not Exist");
	}

	public static void main(String[] args) {
		int arr[]= {1,2,5,6,8};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element");
		int num=sc.nextInt();
		
		check(arr,num);

	}

}
