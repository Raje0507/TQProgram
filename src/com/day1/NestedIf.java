package com.day1;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Number:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is greater:"+a);
		}
		else if(b>c)
		{
			System.out.println("b is greater:"+b);
		}
		else
			System.out.println("c is greater:"+c);
	}

}
