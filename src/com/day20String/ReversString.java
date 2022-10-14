package com.day20String;

import java.util.Scanner;

public class ReversString {
	
	public static String rev(String s)
	{
		//String s1="";
		
		/*
		 * for(int i=0;i<s.length();i++) 
		 * {
		 *  s1=s.charAt(i)+s1;
		 *   }
		 */
		
		/*
		 * for(int i=s.length()-1;i>=0;i--) 
		 * { 
		 * s1=s1+s.charAt(i); 
		 * }
		 */
		 char ch[]=s.toCharArray();
		 
		 int j=ch.length-1;
		 for(int i=0;i<ch.length/2;i++)
		 {
			 char temp=ch[i];
			      ch[i]=ch[j];
			      ch[j]=temp;
			      j--;
		 }
		 String s1=new String(ch);
		
		
		return s1;
	}

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		
		System.out.println(rev(st));
	}

}
