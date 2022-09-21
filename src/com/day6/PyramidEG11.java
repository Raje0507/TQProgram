package com.day6;

public class PyramidEG11 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			if(i%2==1)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print((char)(64+j));
				}
			}
			System.out.println();
		}
		

	}

}
