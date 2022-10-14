package com.day21String;

public class StringBuilderMeth {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Mumbai");
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
