package com.day19Array2D;

public class NPattern {
	
	public static void pattern(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0 || j==a.length-1 || a[i]==a[j] )
				{
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},
				      {5,6,7,8},
				      {3,1,5,7},
				      {2,4,6,8}};
		
		pattern(arr);

	}

}
