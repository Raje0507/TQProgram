package com.day2;

import java.util.Scanner;

public class SwitchEg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Radius:");
		int r=sc.nextInt();
		System.out.println("Enter The Base:");
		int b=sc.nextInt();
		System.out.println("Enter The Height");
		int h=sc.nextInt();
		System.out.println("1.Area Circle\n2.Area Rectriangle\n3.Area Triangle\n Choose Menu");
		int ch=sc.nextInt();
				
      switch(ch)
      {
      case 1:System.out.println("Area Of Circle:"+(3.14*r*r));
      break;
      case 2:System.out.println("Area Of Rectriangle:"+(b*h));
      break;
      case 3:System.out.println("Area Of Triangle:"+(b*h/2));
      break;
      default:System.out.println("Invalid Choice");
      }
	}

}
