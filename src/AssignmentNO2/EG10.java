package AssignmentNO2;

import java.util.Scanner;

public class EG10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		boolean isPrime1=true; 
        boolean isPrime2=true;
        
        for(int i=2;i<n1;i++)
        {
        	if(n1%i==0)
        	{
        		isPrime1=false;
        		break;
        	}
        }
        for(int i=2;i<n2;i++)
        {
        	if(n2%i==0)
        	{
        		isPrime2=false;
        		break;
        	}
        }
         //int d=Math.abs(n1-n2);
	
		if(n1-n2==2 || n2-n1==2 && isPrime1==true && isPrime2==true)
		{
			System.out.println("Twin Prime");
		}
		else
			System.out.println("N0t A Twin Prime");
		
		
	}

}
