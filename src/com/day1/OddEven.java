package com.day1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Is Even");
		}
		else
		{
			System.out.println("Is Odd");
		}

	}

}
