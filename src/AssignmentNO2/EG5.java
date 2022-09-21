package AssignmentNO2;

import java.util.Scanner;

public class EG5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int cube=num*num*num;
		System.out.println(cube);
		
		int res=cube%10;
		if(num==res)
		{
			System.out.println("Is Trimorphic");
		}
		else
			System.out.println("Not Trimorphic");
	}

}
