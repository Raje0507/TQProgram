package com.day7;

import com.day8.Student1;

public class AcessOutPack extends Student1 {

	public static void main(String[] args) {
		AcessOutPack ac=new AcessOutPack();
		
		System.out.println(ac.name);       //public
		// System.out.println(ac.id);      //private
		System.out.println(ac.add);        //protected with Inherited
		// System.out.println(ac.salary);  //default
		
		ac.tony();     //public
		// ac.spidy(); //private
		ac.hulk();     //protected with Inherited
		// ac.groot(); //default

	}

}
