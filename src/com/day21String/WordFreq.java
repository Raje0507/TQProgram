package com.day21String;

import java.util.Scanner;

public class WordFreq {
	
	public static void check(String s)
	{
		String sp[]=s.split("\\s");
		for(int i=0;i<sp.length;i++)
		{
			boolean isvalid=false;
			int count=1;
			for(int k=i-1;k>=0;k--)
			{
				if(sp[i].equals(sp[k]))
				{
					isvalid=true;
					break;
				}
			}
			
			if(isvalid==false)
			{
				for(int j=i+1;j<sp.length;j++)
				{
					if(sp[i].equals(sp[j]))
					{
						count++;
					}
				}
				System.out.println(sp[i]+" Freq="+count);
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.nextLine();
		
		check(st);

	}

}
