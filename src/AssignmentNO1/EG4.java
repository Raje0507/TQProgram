package AssignmentNO1;

import java.util.Scanner;

public class EG4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Year");
		int year=sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("This Year Is Leap");
		}
		else
		{
			System.out.println("Is Not Leap Year");
		}

	}

}
