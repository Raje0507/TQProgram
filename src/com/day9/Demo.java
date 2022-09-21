package com.day9;

import java.util.Scanner;

class Power1{	
	 public Power1(int n)
	 {
		if(n>0)
		{
		   if(n%3==0)
		  {
			 System.out.println("yes");
		  }
		   
		}
		else
		  {
			System.out.println("NO");
		  }
		
	 }
}

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
        
		Power1 p=new Power1(num);
	}

}
