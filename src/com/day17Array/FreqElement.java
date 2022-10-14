package com.day17Array;

import java.util.Arrays;

public class FreqElement {

	public static void show(int a[])
	{
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
			
			int count=1;
			if(isvalid==false)
			{
			 for(int j=i+1;j<a.length;j++)
			 {
				if(a[i]==a[j])
				{
					count++;
				}
			 }
			  System.out.println(a[i]+" "+count);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,4,5,4,1,4};
		
		show(arr);

	}

}
