package AssignmentNO3;

import java.util.Scanner;

public class EG3KaprekarNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		
		int sqr=n*n;
		System.out.println("Enter Mobile No:"+sqr);
		int count=0;
		int res = 0;
		
		while(sqr>0)
		{
		  int r=sqr%10;
		   res=r;
		   sqr=sqr/10;
		   count++;
			if(count==2) 
			{
				break;
			}
			
		}
		System.out.println("Enter Mobile No:"+res+"\t"+sqr);
	}

}
