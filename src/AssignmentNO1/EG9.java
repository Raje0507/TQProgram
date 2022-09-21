package AssignmentNO1;

import java.util.Scanner;

public class EG9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z'))
		{
			System.out.println("This Is Character");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("This is Digit");
		}
		else
		{
			System.out.println("This Is Special Character");
		}

		
	}

}
