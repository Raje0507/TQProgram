package com.day8;

public class Student1 {
	public String name="sachin";
	private int id=123;
	protected String add="Chinchwad";
	          float salary=2000.0f;
	          
	 public void tony()
	 {
		 System.out.println("Hello I am Tony Strak");
	 }
	 private void spidy()
	 {
		 System.out.println("Hii I Am Spider");
	 }
	 protected void hulk()
	 {
		 System.out.println("Hulk");
	 }
	 void groot()
	 {
		 System.out.println("I Am Groot");
	 }
	

	public static void main(String[] args) {
		
		Student1 std=new Student1();
		System.out.println(std.name);
		System.out.println(std.id);
		System.out.println(std.add);
		System.out.println(std.salary);
		
		std.tony();
		std.spidy();
		std.hulk();
		std.groot();
		

	}

}
