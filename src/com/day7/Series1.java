package com.day7;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=3;i<=10;i+=2)
		{
			n=n+i;
			System.out.println(n);		
		}

	}

}
