package com.day16Array;

public class primeNo {
	
	public static int avgNo(int a[])
	{
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			boolean isprime=true;
			 for(int j=2;j<a[i];j++)
			 {
				if(a[i]%j==0)
				{
					isprime=false;
					count++;
					break;
				}
			 }
			 if(isprime==false)
			 {
				 sum=sum+a[i];
			 }
		}
		int average=sum/count;
		
		return average;
	}

	public static void main(String[] args) {
		int arr[]= {6,8,9,11,3};
		
		System.out.println("avg Non prime No="+avgNo(arr));

	}

}
