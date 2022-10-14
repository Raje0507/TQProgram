package com.day17Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversManner {
	
	public static int[] show(int a[])
	{
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
			    j--;
		}
		
		return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		
		System.out.println("Enter Array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(show(arr)));

	}

}
