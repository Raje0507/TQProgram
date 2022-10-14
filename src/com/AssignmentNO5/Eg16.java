package com.AssignmentNO5;

import java.util.Scanner;

public class Eg16 {
	
	   public void shopping(String Cd, int dis)
	   {
		   System.out.println("You Got"+ dis+"% discount an bill an Credit Card Transaction");
	   }
	   
	   public void shopping(String Dd)
	   {
		   System.out.println("No Discount an bill an debit card transaction");
	   }

	public static void main(String[] args) {
		
		Eg16 e=new Eg16();
		Scanner sc=new Scanner(System.in);
		System.out.println("Crad Type=Credit Or Debit");
		String c=sc.next();
		
		if(c=="Credit")
		{
			e.shopping(c, 15);
		}
		else if(c=="Debit")
		{
			e.shopping(c);
		}

	}

}
