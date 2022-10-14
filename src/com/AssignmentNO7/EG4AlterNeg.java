package com.AssignmentNO7;

import java.util.*;
public class EG4AlterNeg {
	
	public static void show(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>0 )
			{
				int temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
			}
			}
				
		}
		
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,-4,-1,4};
		
		show(arr);

	}

}
