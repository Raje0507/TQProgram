package com.day7;

import java.util.Scanner;

public class AutoMorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int sqr=num*num;
		int count=0;
		int res=num;
		
		while(res>0)
		{
			res=res/10;
			count++;
		}
		
		int lastDigit=(int) (sqr%(Math.pow(10,count)));

		if(num==lastDigit)
		{
			System.out.println("AutoMorphic");
		}
		else
			System.out.println("Not Automorphic");
	}

}
