package com.day16Array;
import java.util.*;
public class PresentCheck {
	
	public static boolean show(int a[],int n)
	{
		boolean present=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				present=true;
				break;
			}
		}
		return present;
	}
	

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Checking No");
		int num=sc.nextInt();
		
		boolean ispresent=show(arr,num);
		
		if(ispresent)
		{
			System.out.println("is Present");
		}
		else
		{
			System.out.println("Not Present");
		}

	}

}
