package com.AssignmentNO7;

import java.util.Arrays;

public class EG1AlterMerg {
	
	public static int[] show(int a[],int b[])
	{
		
		int c[]=new int[a.length+b.length];
		
		int i=0,j=0,k=0;
	    while(i<a.length && j<b.length)
	    {
	    	c[k++]=a[i++];
	    	c[k++]=b[j++];
	    }
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		
		return c;
	}

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8};
		int arr2[]= {11,22,33,44};
		
		System.out.println(Arrays.toString(show(arr1,arr2)));
	}

}
