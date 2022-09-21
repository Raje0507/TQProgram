package com.day3;

import java.util.Scanner;

public class ForEg6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int num=sc.nextInt();
		int sum=1;
		for(int i=1;i<=10;i++)
		{
			sum=num*i;
			System.out.println(sum);
		}

	}

}
