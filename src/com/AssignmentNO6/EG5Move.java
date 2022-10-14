package com.AssignmentNO6;

import java.util.Arrays;

public class EG5Move {
	public static int[] move(int a[])
	{
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{	
			if(a[i]==0)
			{
				int temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
			}
			}
		}
		return a;
	}
      public static void main(String args[])
      {
    	  int arr[]= {12,0,7,0,8,0,3};
    	  
    	  System.out.println(Arrays.toString(move(arr)));
      }
}
