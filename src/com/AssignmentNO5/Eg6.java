package com.AssignmentNO5;

public class Eg6 {
	 int x=10;
	
	public void assign(int x)
	{
		x=x;
		System.out.println(this.x);
	}
	

	public static void main(String[] args) {
		
         new Eg6().assign(100);
	}

}
