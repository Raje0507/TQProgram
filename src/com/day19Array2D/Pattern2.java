package com.day19Array2D;

public class Pattern2 {
	
	public static void display(char a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	   char arr[][]=new char[3][3];
	   
	   display(arr);

	}

}
