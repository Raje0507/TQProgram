package com.day17Array;

public class MissingNo {
	
	public static int missing(int a[],int b[])
	{
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++)
		{
			sum1 +=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			sum2 +=b[i];
		}
		
		int miss=Math.abs(sum1-sum2);
		
		return miss;
	}

	public static void main(String[] args) {
		// Find out Missing No
		
		int arr1[]= {1,2,3,4,5,6,7};
		int arr2[]= {1,2,3,4,6,7};
		
		System.out.println(missing(arr1,arr2));

	}

}
