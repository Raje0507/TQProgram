package com.day21String;

import java.util.Scanner;

public class Sign {
	
	public static String check(String s)
	{
		String Add="";
		
		String sp[]=s.split("\\s");
		for(int i=0;i<sp.length;i++)
		{
			String word=sp[i];
			String add="";
			
			if(i!=sp.length-1)
			{
				for(int j=0;j<=0;j++)
				{
					add=add+word.charAt(j);
				}
				Add=Add+add+".";
			}
			else
			{
				Add=Add+word;
			}
			 
			
		}
		
		return Add;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.nextLine();
		
		System.out.println(check(st));

	}

}
