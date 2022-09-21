package AssignmentNO4;

import java.util.Scanner;

public class EG9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sales Amount=");
		short n=sc.nextShort();
		
		
		if(n>2000)
		{
			int comission = (n*5)/100;
			
			System.out.println(comission);
		}

	}

}
