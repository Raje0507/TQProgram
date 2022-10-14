package com.day15Array;

import java.util.Scanner;

public class CountOdd {
	
	static int odd(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int result=odd(arr);
		System.out.println("odd Element Count="+result);

	}

}
