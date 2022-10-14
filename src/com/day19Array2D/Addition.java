package com.day19Array2D;

public class Addition {
	
	public static void check(int a[][],int b[][])
	{
		 int c[][]=new int[a.length][b.length];
		 
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		int arr1[][]= {{1,2},{3,4}};
		int arr2[][]= {{7,2},{3,5}};
		
		check(arr1,arr2);
		
		

	}

}
