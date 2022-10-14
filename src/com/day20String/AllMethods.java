package com.day20String;

import java.util.Arrays;

public class AllMethods {

	public static void main(String[] args) {
		
		
		String str="23Pune is big23 city";
		String str2=new String("pune");
		String str3="Pune";
		String str4="PUNE";
		
		//equals() Method//Its compare content
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str));
		
		//compareTo() Method//Its return Ascii value
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareTo(str3));
		System.out.println(str2.compareTo(str3));
		
		//charAt() Method//return index At Position Character
		System.out.println(str.charAt(0));
		System.out.println(str2.charAt(2));
		System.out.println(str3.charAt(3));
		
		//toLowerCase() Method//Upper case String Convert Lower Case
		System.out.println(str4.toLowerCase());
		
		//toUpperCase() Method//Lower case String Convert Upper Case
		System.out.println(str.toUpperCase());
		
		//substring(0,4) Method//return substring from starting index to ending
		System.out.println(str.substring(0,3));
		
		//split("\\s") // is divide String and return no of Strings
		String st[]=str.split("\\s");
		System.out.println(Arrays.toString(st));//divide to space
		
		//Character.getNumericValue(char ch)//Character asci value convert integer type value
		int b=str.charAt(0);
		int c=str.charAt(1);
		int x=Character.getNumericValue(b);
		int y=Character.getNumericValue(c);
		System.out.println(x+y);

	}

}
