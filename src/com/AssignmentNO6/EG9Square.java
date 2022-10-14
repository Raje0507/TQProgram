package com.AssignmentNO6;

public class EG9Square {
	
	public static void check(int a[])
	{
	  for(int i=0;i<a.length;i++)
	  {
		for(int j=1;j<a.length;j++)
		{
			if(j*j==a[i])
			{
				System.out.println(a[i]);
			}
		}
	  }	
	}

	public static void main(String[] args) {
		int arr[]= {23,43,25,49,12,9,78,66,39,0};
		
		check(arr);

	}

}
