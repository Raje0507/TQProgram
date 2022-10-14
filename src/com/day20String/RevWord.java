package com.day20String;

import java.util.Scanner;

public class RevWord {
	
	public static String revers(String s)
	{
		String sp[]=s.split("\\s");
		String revers="";
		
		for(int i=0;i<sp.length;i++)
		{
			
			if(i!=0 && i!=sp.length-1)
			{
				String word=sp[i];
				String rev="";
				for(int j=word.length()-1;j>=0;j--)
				{
					rev=rev+word.charAt(j);
				}
				revers=revers+rev+" ";
			}
			 else
			 { 
				 revers=revers+sp[i]+" "; 
			 }
			
		}
		
		return revers;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String st=sc.nextLine();
		
		System.out.println(revers(st));

	}

}
