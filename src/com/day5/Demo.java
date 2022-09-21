package com.day5;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			if(num>=2 && num<=6)
			{
			System.out.println("Even Number");
			}
			else if(num>6)
			{
				System.out.println("Even");
			}
		}
		else if(num%2==1)
		{
			if(num>=6 && num<=10)
			{
			System.out.println("Odd Number");
			}
			else 
			{
				System.out.println("odd");
			}
		}

	}

}
