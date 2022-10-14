package com.day21String;

import java.util.*;

public class check2 {
	
	public static void Check(String st)
	{
		boolean isdigit=true;
		int sum1=0,sum2=0;
		String revers="";
		
		for(int i=0;i<st.length();i++)
		{
			if(Character.isDigit(st.charAt(i)))
			{
				isdigit=true;
			}
			else
			{
				isdigit=false;
				break;
			}
		}
		
		if(isdigit)
		{
			for(int j=0;j<st.length();j++)
			{
				revers=st.charAt(j)+revers;
			}
			
			for(int i=0;i<3;i++)
			{
				int x=Character.getNumericValue(st.charAt(i));
				sum1=sum1+x;
			}
			
			for(int k=0;k<3;k++)
			{
				int x=Character.getNumericValue(revers.charAt(k));
				sum2=sum2+x;
			}
			
			
			if(sum1==sum2)
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("Invalid");
			}
			
		}
		else
		{
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		
		Check(st);

	}

}
