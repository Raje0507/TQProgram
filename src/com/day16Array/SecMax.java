package com.day16Array;

public class SecMax {
	
	public static int second(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					    a[i]=a[j];
					    a[j]=temp;
				}
			}
		}
		
		int l=a.length;
		int max=a[l-2];
		return max;
	}

	public static void main(String[] args) {
		int arr[]= {75,89,34,65,92};
		
		int secmax=second(arr);
		
		System.out.println("Second Maximum No is="+secmax);

	}

}
