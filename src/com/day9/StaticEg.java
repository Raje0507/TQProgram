package com.day9;


class Test{
	 public static void display(int x)
	 {
		 System.out.println(x);
	 }
	 
	 public static void display(float y)
	 {
		 System.out.println(y);
	 }
	
}
public class StaticEg {

	public static void main(String[] args) {
		
		Test t=new Test();
		t.display(10);
		t.display(20f);

	}

}
