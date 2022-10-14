package com.day11;

import java.util.Scanner;

public class MissingNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to 7 No:");
		int num=sc.nextInt();
		int sum=0;
		int sum1=0;
		
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		for(int i=1;i<=7;i++)
		{
			sum1=sum1+i;
		}
		
		if(sum==sum1)
		{
			System.out.println("Not Missing");
		}
		else
		{
			int value=Math.abs(sum-sum1);
			System.out.println("Missing="+value);
		}

	}

}
