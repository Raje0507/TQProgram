package com.day21String;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean check(String s)
	{
		String sr="";
		boolean equal=false;
		
		for(int i=0;i<s.length();i++)
		{
		   sr=s.charAt(i)+sr;	
		}
		
		if(s.equals(sr))
		{
			equal=true;
		}
		
		return equal;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.nextLine();
		
          if(check(st))
          {
        	  System.out.println("Palindrome");
          }
          else
          {
        	  System.out.println("Not Palindrome");
          }
	}

}
