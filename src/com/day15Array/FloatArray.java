package com.day15Array;

import java.util.Arrays;
import java.util.Scanner;

public class FloatArray {
	
	public static void show(float a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(float x:a)
		{
			System.out.println(x+" ");
		}
		
		System.out.println("\n Using ToString="+Arrays.toString(a));
	}

	public static void main(String[] args) {
		float arr[]=new float[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextFloat();
		}

		FloatArray.show(arr);
		
	}

}
