package com.day19Array2D;

import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2D Array Size");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int arr[][]=new int[n1][n2];
		
		System.out.println("Enter Array Element");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------By Enhance loop--------------");
		
		for(int x[]:arr)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
