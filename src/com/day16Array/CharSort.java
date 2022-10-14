package com.day16Array;

import java.util.Arrays;

public class CharSort {
	
	public static char[] show(char a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			  if(a[i]>a[j])
			    {
				  char temp=a[i];
				      a[i]=a[j];
				      a[j]=temp;
			    }
			}
		}
		return a;
	}

	public static void main(String[] args) {
		char ch[]= {'r','a','e','J','S','h'};
		
		System.out.println(Arrays.toString(ch));
		System.out.println("--------------------");
		
		char ch1[]=CharSort.show(ch);
		System.out.println(Arrays.toString(ch1));

	}

}
