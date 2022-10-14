package com.day16Array;

import java.util.Arrays;

public class Separate2 {
	
	public static void check(int a[])
	{
		int even[]=new int[a.length];
		int odd[]=new int[a.length];
		
		int e=0;
		int o=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[e]=a[i];
				e++;
			}
			
			if(a[i]%2==1)
			{
				odd[o]=a[i];
				o++;
			}
		}
		
		System.out.println("---------EVEN-----------");
		for(int i=0;i<e;i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println("\n--------ODD----------");
		for(int i=0;i<o;i++)
		{
			System.out.print(odd[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,7,5,6};
		
		System.out.println(Arrays.toString(arr)+"\n");
		
		check(arr);
		

	}

}
