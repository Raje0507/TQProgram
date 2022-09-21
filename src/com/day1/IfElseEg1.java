package com.day1;

import java.util.Scanner;

public class IfElseEg1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No:");
		int num=sc.nextInt();
		
		if(num%5==0)
		{
			System.out.println("Is Divided");
		}
		else
		{
			System.out.println("Not Divisible");
		}

	}

}
