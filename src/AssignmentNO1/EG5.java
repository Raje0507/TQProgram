package AssignmentNO1;

import java.util.Scanner;

public class EG5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%5==0 && num%11==0)
		{
			System.out.println("Is Divided");
		}
		else
		{
			System.out.println("Not Divisible");
		}
	}

}
