package com.day15Array;

public class AlterEle {
	
	public static void show(int a[],int l)
	{
		int k=21;
		for(int i=0;i<l;i++)
		{
			a[i]=k++;
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {12,13,14,15};
		
		int l=arr.length;
		
		AlterEle.show(arr,l);

	}

}
