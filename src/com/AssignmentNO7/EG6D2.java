package com.AssignmentNO7;

public class EG6D2 {
	
	public static void show(int a[][])
	{
		int b[][]=new int[2][4];
		
		
		for(int i=0;i<a.length;i++)
		{
			 int k=0;
			for(int j=a[i].length-1;j>=0;j--)
			{
			     b[i][k++]=a[i][j];
			}
		
		}
		
		for(int i=0;i<b.length;i++ )
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{5,6,7,8}};
		
		
		show(arr);

	}

}
