package com.day17Array;

public class RemoveTwo {
	
	public static void show(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==a[j])
				{
					
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr1[]= {1,4,5,6};
		int arr2[]= {3,5,7,4,8};

		show(arr1,arr2);
	}

}
