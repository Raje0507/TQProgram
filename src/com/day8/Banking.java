package com.day8;

import java.util.Scanner;

public class Banking {
	int acc_no;
	String type;
	double balance;
	double dep;
	double with;
	
	public void AcceptDet(int no,String n,double b)
	{
		acc_no=no;
		type=n;
		balance=b;		
	}
	public void display()
	{
		System.out.println("\nAccount No="+acc_no);
		System.out.println("Account Type="+type);
		System.out.println("Current Balance="+balance);
	}
	public void deposite(double d)
	{
		 balance=balance+d;
	}
	public void withdraw(double w)
	{
		balance=balance-w;
	}

	public static void main(String[] args) {
		
		Account ac=new Account();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account Number");
		int num=sc.nextInt();
		System.out.println("Enter Account Type");
		String t=sc.next();
		double bal=10000;
		
		ac.AcceptDet(num,t,bal);
		
		ac.display();
		
		System.out.println("\nDeposite Press=d or Withdraw Press=w");
		char r=sc.next().charAt(0);
		
		if(r=='d')
		{
		System.out.println("Enter Deposite Amount");
	     double dep=sc.nextDouble();
		ac.deposite(dep);
	    }
		
		if(r=='w')
		{
		System.out.println("Enter Withdraw Amount");
         double with=sc.nextDouble();
        ac.withdraw(with);
		}
		System.out.println("current Balance Is="+ac.balance);
	}
		
}


