package com.AssignmentNO5;

import java.util.Scanner;

public class Eg14Switch {
	
	   public void show(String ch)
	   {
		   switch(ch)
		   {
		    case "India":System.out.println("Hockey");
		    break;
		    
		    case "China":System.out.println("Table tennis");
		    break;
		    
		    case "Bangladesh":System.out.println("Kabaddi");
		    break;
		    
		    case "Italy":System.out.println("football");
		    break;
		    
		    case "UnitedState":System.out.println("Baseball");
		    break;
		    
		    default:System.out.println("Invalid choice");
		   }
	   }
	
	

	public static void main(String[] args) {
		Eg14Switch e=new Eg14Switch();
				
		System.out.println("Enter Any Country Name Bolow \n India\n China\n Bangladesh\n Italy"
				+ "\n UnitedState");
	   Scanner sc=new Scanner(System.in);
	   
	   String s=sc.next();
	   
	   e.show(s);

	}

}
