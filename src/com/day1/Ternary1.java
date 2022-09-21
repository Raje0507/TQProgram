package com.day1;

import java.util.Scanner;

public class Ternary1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three No:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int result=(a>c && a>b)?a:(b>c && b>a)?b:c;
		System.out.println("The Greater Is:"+result);

	}

}
