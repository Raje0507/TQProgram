package com.AssignmentNO6;

import java.util.Arrays;

public class EG11Replace {
	public static int[] replace(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		
		return a;
	}

	public static void main(String[] args) {
		int arr[]= {26,0,67,45,0,78,54,34,10,0,34};
		
		System.out.println(Arrays.toString(replace(arr)));

	}

}
