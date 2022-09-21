package com.day5;

import java.util.Scanner;

public class DoWhileEG1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
		int r=sc.nextInt();
		System.out.println("Enter Height");
		int h=sc.nextInt();
		System.out.println("Enter base");
        int b=sc.nextInt();
        
        char ch;
		do {
        	
        System.out.println("1.Area Circle\n2.Area Triangle\n3.Area Rectriangle\nSelect Any Choice:");
        int choice=sc.nextInt();
        
        switch(choice)
        {
        case 1:System.out.println("Area Of Circle:"+(3.14*r*r));
        break;
        case 2:System.out.println("Area Of Triangle:"+(h*b)/2);
        break;
        case 3:System.out.println("Area Of Rectriangle:"+(h*b));
        break;
        default:System.out.println("Invalid Choice");
        }
        System.out.println("Do You Want Continue....");
        ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
	}

}
