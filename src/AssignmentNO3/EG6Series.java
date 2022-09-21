package AssignmentNO3;

import java.util.Scanner;

public class EG6Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int add=sc.nextInt();
		for(int i=3;i<=15;i+=2)
		{
			add=add+i;
			System.out.println(add);
		}
		

	}

}
