package com.day16Array;

import java.util.Arrays;

public class ArrayEg {
	
	public static int[] show(int a[],int k,int b[],int j)
	{
		int n=k+j;
		int arr2[]=new int[n];
		
		int k1=0;
		for(int i=0;i<a.length;i++)
		{
			arr2[k1]=a[i];
			k1++;
		}
		
		for(int i=0;i<b.length;i++)
		{
			arr2[k1]=b[i];
			k1++;
		}
		
		return arr2;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr1[]= {6,7,8,9};
		
		int l1=arr.length;
		int l2=arr1.length;
		
		int arr2[]=ArrayEg.show(arr,l1,arr1,l2);
		
		System.out.println(Arrays.toString(arr2));

	}

}
