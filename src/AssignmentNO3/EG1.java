package AssignmentNO3;

import java.util.Scanner;

public class EG1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile No:");
		long number=sc.nextLong();
		//System.out.println("Enter digit:");
		//int digit=sc.nextInt();
		
		long temp=number;
		long res;
		for(int i=0;i<=9;i++)
		{
			number=temp;
			int count=0;
			while(number>0)
			{
				res=number%10;
				if(res==i)
				{
					count++;
				}
				number=number/10;
			}
			if(count>0)
			{
				System.out.println("Digit="+i+"\tFreq="+count);
			}
			  
		}
		

	}

}
