package com.day15Array;

public class AvgOdd {
	
	public static int show(int a[])
	{
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				sum += a[i];
				count++;
			}
		}
		
		int avg=sum/count;
		
		return avg;
	}

	public static void main(String[] args) {
		int arr[]= {67,54,89,73,68};
		
		int l=arr.length;
		
		int result=AvgOdd.show(arr);
		System.out.println("Average of odd No Is="+result);

	}

}
