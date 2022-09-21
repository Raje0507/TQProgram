package com.basic;

public class Percentage {

	public static void main(String[] args) {
		
		int m1=89,m2=97,m3=75,m4=60,m5=80;
		
		int total=m1+m2+m3+m4+m5;
		
		int avg=total/5;
		
		float per=(total*100)/500;
		
		System.out.println("The Total Is:"+total);
		System.out.println("The Average Is:"+avg);
		System.out.println("The Percentage Is:"+per+"%");
	}

}
