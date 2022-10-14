package com.AssignmentNO6;

import java.util.Arrays;

public class EG6RemoveDup {
	
	public static void check(int a[])
	{ 
		int temp[]=new int[15];
		int m=0;
		
	   for(int i=0;i<a.length;i++)
		{
			boolean isvalid=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isvalid=true;
					break;
				}
			}
          
		if(isvalid==false)
		 {
			temp[m]=a[i];
			m++;
		 }	
		}
	   
	   for(int i=0;i<m;i++)
		{
			System.out.println(temp[i]);
		}

	}

	public static void main(String[] args) {
		int arr[]= {4,3,2,4,9,2};
		
		check(arr);
		
	}

}
