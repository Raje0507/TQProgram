package com.day16Array;

public class MinMax {
	
	public static void show(int a[])
	{
		//int max=a[0];
		int max=Integer.MIN_VALUE;
		//int min=a[0];
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Maximum no Is="+max+" Minnimum No Is="+min);
	}

	public static void main(String[] args) {
		int arr[]= {-4,73,92,-8,0};
		
		MinMax.show(arr);

	}

}
