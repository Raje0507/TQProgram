package com.day8;

import java.util.Scanner;

public class Account {
	int acc_no;
	String type;
	double balance; 
	
	public void AcceptDet(int no,String n,double b)
	{
		acc_no=no;
		type=n;
		balance=b;		
	}
	public void display()
	{
		System.out.println("Account No="+acc_no);
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
		int num=sc.nextInt();
		String t=sc.next();
		double bal=sc.nextDouble();
		
		ac.AcceptDet(num,t,bal);
		
		ac.display();
		
		System.out.println("Enter Deposite Amount");
		double dep=sc.nextDouble();
		ac.deposite(dep);
		
		System.out.println("Enter Withdraw Amount");
        double with=sc.nextDouble();
        ac.withdraw(with);
        
        System.out.println("Current balance Is="+ac.balance);
	}

}
