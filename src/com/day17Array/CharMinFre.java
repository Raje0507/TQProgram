package com.day17Array;

public class CharMinFre {
	
	public static void check(char c[])
	{
		int min=Integer.MAX_VALUE;
		char ch1=' ';
		
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			boolean isvalid=false;
			
			for(int k=i-1;k>=0;k--)
			{
				if(c[k]==c[i])
				{
					isvalid=true;
					break;
				}
			}
			
		if(isvalid==false)
		{	
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
			if(min>count)
			{
				min=count;
				ch1=c[i];
			}
			
		 }	
		}
		System.out.println("Minimum Freq Is="+ch1);
	}

	public static void main(String[] args) {
		char ch[]= {'a','b','c','c','b','a','c','b','b'};
		
		check(ch);
		

	}

}
