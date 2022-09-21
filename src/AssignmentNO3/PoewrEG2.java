package AssignmentNO3;

import java.util.Scanner;

public class PoewrEG2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base:");
		int x=sc.nextInt();
		System.out.println("Enter Index:");
		int y=sc.nextInt();
		int pow=x;
		
		while(y>1)
		{
			pow*=x;
			y--;
		}
		System.out.println(pow);

	}

}
