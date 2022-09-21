package AssignmentNO2;

import java.util.Scanner;

public class EG15 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=0;
	    int fact=1;
	    
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		fact=fact*j;
	    	}
	    	sum=sum+fact;
	    	fact=1;
	    }
        System.out.println(sum);
	}

}
