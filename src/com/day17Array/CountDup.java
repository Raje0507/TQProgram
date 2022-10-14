package com.day17Array;

public class CountDup {
	
	public static void check(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
		  boolean isvalid=false;
		  for(int k=i-1;k>=0;k--)
		  {
			if(a[i]==a[k])
			{
				isvalid=true;
				break;
			}
		 }
		  
		  if(isvalid==false)
		  {
			  for(int j=i+1;j<a.length;j++)
			  {
				  if(a[i]==a[j])
				  {
					  count++;
				  }
			  }
		  }
	   }
		System.out.println("Total Duplicate Number="+count);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1,1};
		
		check(arr);

	}

}
