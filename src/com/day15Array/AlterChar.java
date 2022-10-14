package com.day15Array;

import java.util.Arrays;
import java.util.Scanner;

public class AlterChar {
	
	public static void show(char a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='y'||a[i]=='Y'||a[i]=='z'||a[i]=='z')
			{
				a[i]=(char)(a[i]-24);
			}
			else
			{
				a[i]=(char)(a[i]+2);
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		char ch[]=new char[6];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Char In Array");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		AlterChar.show(ch);

	}

}
