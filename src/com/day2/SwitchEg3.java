package com.day2;

import java.util.Scanner;

public class SwitchEg3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First value");
		int a=sc.nextInt();
		System.out.println("Enter Second value");
		int b=sc.nextInt();
		
		System.out.println("Choose Any Choice\n+.Addition\n-.Subtraction"
				+ "\n*.Multiplication\n/.Division");
		
		System.out.println("Enter The Choice");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case'+':System.out.println("Addition:"+(a+b));
		break;
		case'-':System.out.println("Subtraction:"+(a-b));
		break;
		case'*':System.out.println("Multiplication:"+(a*b));
		break;
		case'/':System.out.println("Division:"+(a/b));
		break;
		default:System.out.println("Invalid Choice");
		}

	}

}
