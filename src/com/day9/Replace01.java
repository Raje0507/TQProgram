package com.day9;

import java.util.Scanner;

public class Replace01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int t=1;
        
        while(num>0)
        {
        	int rem=num%10;
        	{
        		if(rem==1)
        		{
        			rem=0;
        		}
        		t=t*10+rem;
        	}
        }
	}

}
