package com.day15Array;

import java.util.Scanner;

public class CharReverse {
	
	public static void show(char a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
	


	public static void main(String[] args) {
		char ch[]=new char[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Char In Array");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		CharReverse.show(ch);

	}

}
