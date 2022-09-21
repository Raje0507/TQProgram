package com.day7;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int add=sc.nextInt();
		
		for(int i=1;i<=7;i++)
		{
			add+=i;
			System.out.println(add);
		}

	}

}
