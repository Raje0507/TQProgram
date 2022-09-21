package AssignmentNO4;

import java.util.Scanner;

public class EG10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Age");
		int age=sc.nextInt();
		
		System.out.println("Sex=M or F");
		char ch1=sc.next().charAt(0);
		
		System.out.println("Marital Status=Y or N");
		char ch2=sc.next().charAt(0);
		
		if(ch1=='F' || ch1=='M')
		{
		
		   if(ch1=='F')
		   {
			System.out.println("Work Only In Urban Areas");
		   }
		   
		   if(ch1=='M')
		   {
			if(age>=20 && age<=40)
		    {
			System.out.println("Work AnyWhere");
		    }
		   else if(age>=39 && age<=60)
		    {
			System.out.println("Work In Urban Areas Only");
		    }	
		    else
		    {
			System.out.println("ERROR");
		    }
		  }
		}
		else
		{
			System.out.println("ERROR");
		}
	}	
}

