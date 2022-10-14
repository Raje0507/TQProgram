package com.day20String;

import java.util.Scanner;

public class DigitAvgSt {
	
	public static int show(String s)
	{
		int sum=0;
		int avg=0;
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int x=Character.getNumericValue(ch);
				sum=sum+x;
				count++;
			}
		}
		avg=sum/count;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		
		System.out.println(show(st));

	}

}
