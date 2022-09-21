package com.day4;

public class BreakEg {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=20)
		{
			if(i%3==0)
			{
				break;
			}
			
			System.out.println(i);
			i++;
		}

	}

}
