package com.day6;

import java.util.Scanner;

public class FibonicNO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N1 And N2 Value:");
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3;
		
		for(int i=0;i<=10;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
