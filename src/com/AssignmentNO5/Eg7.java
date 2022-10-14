package com.AssignmentNO5;

public class Eg7 {
	
	public Eg7(int Row)
	{
		for(int i=1;i<=Row;i++)
		{
			for(int j=1;j<=Row-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Eg7 e=new Eg7(4);

	}

}
