package com.day1;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Character For Capital");
		char ch=sc.next().charAt(0);
		
		if(ch=='A')
		{
			System.out.println("Is Vowel");
		}
		else if(ch=='E')
		{
			System.out.println("Is Vowel");
		}
		else if(ch=='I')
		{
			System.out.println("Is Vowel");
		}
		else if(ch=='O')
		{
			System.out.println("Is Vowel");
		}
		else if(ch=='U')
		{
			System.out.println("Is Vowel");
		}
		else
		{
			System.out.println("Is Consent");
		}
		
		/* if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Is Vowel");
		}
		else
		{
			System.out.println("Is Consent");
		} */

	}

}
