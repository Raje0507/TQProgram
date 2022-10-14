package com.day16Array;

import java.util.Arrays;

public class Separate {
	
	public static void show(int a[])
	{
		int arr1[]=new int[a.length];
		int arr2[]=new int[a.length];
		
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			  arr1[j]=a[i];
			  j++;
			}
		}
		
		int k=0;	
		for(int l=0;l<a.length;l++)	
		{	
	       if(a[l]%2==1)
			{
			  arr2[k]=a[l];
			  k++;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(arr2));
	}
	
	

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		
		Separate.show(arr);

	}

}
