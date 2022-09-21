package com.day1;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two No:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int result=a>b?a:b;
		System.out.println("Is A Greater:"+result);

	}

}
