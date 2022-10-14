package com.day17Array;

public class Unique {
	
	public static void check(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			boolean isvalid=false;
			int count=1;
			
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
			
			   if(count==1)
			   {
				System.out.println(a[i]);
			   }
			}  
		}
	}

	public static void main(String[] args) {
	     int arr[]= {1,2,4,6,4,2};
	     
	     check(arr);

	}

}
