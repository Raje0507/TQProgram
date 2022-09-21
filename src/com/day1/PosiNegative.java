package com.day1;

import java.util.Scanner;

public class PosiNegative {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No:");
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("No Is Positive");
		}
		else if(num<0)
		{
			System.out.println("No Is Negative");
		}
		else
			System.out.println("No Is Zero");

	}

}
