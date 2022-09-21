package AssignmentNO1;

import java.util.Scanner;

public class EG6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int max=(a>b && a>c)?a:(b>c && b>a)?b:c;
		System.out.println("The Maximum Is:"+max);

	}

}
