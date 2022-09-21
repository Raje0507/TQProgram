package com.basic;

public class Unary {
	public static void main(String args[])
	{
		int a=2;
		int b=2;
		
		int x=a++ + b++;
		System.out.println(x+" "+a+" "+b);
		
		x=++a - ++b;
		System.out.println(x+" "+a+" "+b);
		
		x=--a -b++;
		System.out.println(x+" "+a+" "+b);
		
		x=a++ - --b -b;
		System.out.println(x+" "+a+" "+b);
		
		x=++b - --a - --b;
		System.out.println(x+" "+a+" "+b);
	}

}
