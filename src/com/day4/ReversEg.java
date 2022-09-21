package com.day4;

import java.util.Scanner;

public class ReversEg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int revers = 0;
		while(num>0)
		{
			int r=num%10;
			revers=revers*10+r;
			num=num/10;
			
		}
		System.out.print(revers);
		

	}

}
