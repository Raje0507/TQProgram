package com.day9;

class Morf{
	public int calculate(int x,int y) 
	{
		return x+y;
	}
	
	public void calculate(double x,int y,int z)
	{
		System.out.println("Subtraction="+(x-y-z));
	}
	
     public int calculate1(int a,int b)
     {
    	 return a*b;
     }
	
	public void calculate(float a,int b)
	{
		System.out.println("Division="+(a/b));
	}
}
public class PolyLoad {
	public static void main(String[] args) {
	 Morf m=new Morf();
	 System.out.println("Addition="+m.calculate(12, 13));
	 m.calculate(1000,78, 12);
	 System.out.println("Multi="+m.calculate1(12,8));
	 m.calculate(15.5f,5);
	
	}

}
