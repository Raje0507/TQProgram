package com.day2;

import java.util.Scanner;

public class SwitchIntEg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1.Sunday\n2.Monday\n3.Tuesday\n4.Wednesday"
				+ "\n5.Thrusday\n6.Friday\n7.saturday");
		System.out.println("Enter The No:");
		int n=sc.nextInt();
		
		switch(n)
		{
		 case 1:System.out.println("Sunday");
		 break;
		 case 2:System.out.println("Monday");
		 break;
		 case 3 :System.out.println("Tuesday");
		 break;
		 case 4:System.out.println("Wednesday");
		 break;
		 case 5:System.out.println("Thursday");
		 break;
		 case 6:System.out.println("Friday");
		 break;
		 case 7:System.out.println("saturday");
		 break;
		 default:System.out.println("Invalid Choice");
		}

	}

}
