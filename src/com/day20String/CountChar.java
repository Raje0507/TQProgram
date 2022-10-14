package com.day20String;

import java.util.Scanner;

public class CountChar {
	
	public static int count(String st)
	{
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		
		System.out.println(count(s));

	}

}
