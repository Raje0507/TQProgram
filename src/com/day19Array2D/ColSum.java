package com.day19Array2D;

public class ColSum {
	
	public static void display(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				sum +=a[j][i];
				System.out.print(a[j][i]+" ");
			}
			System.out.println("="+sum);
		}
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("-----------------------");
		
		display(arr);

	}

}
