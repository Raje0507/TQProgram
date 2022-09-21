package com.day8;

public class Student2 {

	public static void main(String[] args) {
		Student1 std=new Student1();
		System.out.println(std.name);
		// System.out.println(std.id); //private
		System.out.println(std.add);
		System.out.println(std.salary);
		
		std.tony();
		// std.spidy(); //private
		std.hulk();
		std.groot();
	}

}
