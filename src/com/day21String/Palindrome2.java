package com.day21String;

import java.util.Scanner;

public class Palindrome2 {
	
	public static boolean check(String sb)
	{
		StringBuilder sb1=new StringBuilder(sb);
		sb1.reverse();
		String sb2=sb1.toString();
		boolean equal=false;
		
		if(sb.equals(sb2))
		{
			equal=true;
		}
		
		
		return equal;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String sb=sc.next();
		
		if(check(sb))
		{
          System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
