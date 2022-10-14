package com.AssignmentNO6;

import java.util.Scanner;

public class EG1ConutEven {
	
	public static void check(int a[])
	{
		int count = 0,count1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
			else
			{
			    count1++;	
			}
		}
		System.out.println("Even No is="+count+" Odd No is="+count1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		
		int arr[]=new int[7];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
       
		check(arr);
	}

}
