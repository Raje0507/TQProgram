package com.AssignmentNO6;

public class EG3Freq {
	
	public static void check(char a[])
	{
	  for(int i=0;i<a.length;i++)
	  {	  
		  int count=1;
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
		if(count==1)
		{
			System.out.println(a[i]);
		}
		}	
	  }	
	}

	public static void main(String[] args) {
		char arr[]= {'a','b','b','c','c','b'};
		
		check(arr);

	}

}
