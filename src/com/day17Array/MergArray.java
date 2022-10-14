package com.day17Array;

import java.util.Arrays;

public class MergArray {
	
	public static void show(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k++]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			c[k++]=b[j];
		}
		
		for(int i=0;i<c.length;i++)
		{
			boolean isvalid=false;
			for(int n=i-1;n>=0;n--)
			{
				if(c[i]==c[n])
				{
					isvalid=true;
					break;
				}
			}
			
			if(isvalid==false)
			{
			  System.out.print(c[i]+" ");	
			}
		}
		
	}

	public static void main(String[] args) {
		// merg 2 array to 3rd array.3rd array should have not same element
		
		int arr1[]= {1,2,3,4,4};
		int arr2[]= {5,4,3,6};
		
		show(arr1,arr2);

	}

}
