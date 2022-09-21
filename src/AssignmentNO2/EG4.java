package AssignmentNO2;

import java.util.Scanner;

public class EG4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int mul=1; 
		
		while(num>0)
		{
			int res=num%10;
			sum+=res;
			mul*=res;
            num=num/10;
		}
		System.out.println("sum="+sum+" Mul="+mul);
        
		if(sum==mul)
		{
			System.out.println("Number Is SPY");
		}
		else
			System.out.println("Not SPY");
	}

}
