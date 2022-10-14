package com.day21String;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Mumbai");
		System.out.println(sb);
		
		sb.insert(3, " Great ");//insert(); 
		System.out.println(sb);
		
		sb.append("city");//append()
		System.out.println(sb);
		
		sb.replace(5,7,"Mer");//replace()
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

	}

}
