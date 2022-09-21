package com.day6;

import java.util.Scanner;

public class Mock1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int count =0;
		//while(num>0 || num<0)
		//{
		
			   num=num/10;
			   count++;
		//}
		System.out.println(count);
		
		if(count==1)
		{
			System.out.println("Single");
		}
		else if(count==2)
		{
			System.out.println("Double");
		}
		else if(count==3)
		{
			System.out.println("Triple");
		}
		

	}

}
