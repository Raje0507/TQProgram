package com.day20String;

import java.util.Scanner;

public class CountWord {
	
	public static int wordSplit(String s)
	{
		String s1[]=s.split("\\s");
		
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		
		System.out.println (wordSplit(s));

	}

}
