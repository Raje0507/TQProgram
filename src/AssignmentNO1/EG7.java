package AssignmentNO1;

import java.util.Scanner;

public class EG7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Small Later:");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case'A':System.out.println("Vowel");
		   break;
		case'E':System.out.println("Vowel");
		   break;
		case'I':System.out.println("Vowel");
		   break;
		case'O':System.out.println("Vowel");
		   break;
		case'U':System.out.println("Vowel");
		   break;
		default:System.out.println("consonent");   
		}

	}

}
