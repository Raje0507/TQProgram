package com.day5;

public class SumPrime {

	public static void main(String[] args) {
		
		int sum=1;
		
		for(int num=1;num<20;num++)
	{
		boolean isPrime=true;
		 
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime==true)
		{
			sum+=num;
		}
	  }
		System.out.println("Sum of Prime No:"+sum);
	}

}
