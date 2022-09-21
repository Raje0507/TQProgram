package com.day7;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int last=num%10;
		int res=0;
		
		while(num>0)
		{
            res=num%10;
            num=num/10;
		}
		
		int first=res%10;
		
		System.out.println("sum="+(first+last));
		

	}

}
