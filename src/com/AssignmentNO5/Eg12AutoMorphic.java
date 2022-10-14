package com.AssignmentNO5;

import java.util.Scanner;

public class Eg12AutoMorphic {
	
	public Eg12AutoMorphic(int n)
	{
	
		for( int i=1;i<=n;i++)
		{
			int sqr=i*i;
			int res=i;
			int count=0;
			
			while(res>0) 
			{
				 res=res/10;
				count++;
			}
			
			int Morph=(int)(sqr%(Math.pow(10, count)));
			
			if(i==Morph)
			{
				System.out.println(i);
			}
			
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		Eg12AutoMorphic a=new Eg12AutoMorphic(num);

	}

}
