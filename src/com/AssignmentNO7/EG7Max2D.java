package com.AssignmentNO7;

//Find out Row Wise Max No e.g=31,25

public class EG7Max2D {
	
	public static void show(int a[][])
	{
		
		for(int i=0;i<a.length;i++)
		{
			int max=Integer.MIN_VALUE;
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ="+max);
		}
	}

	public static void main(String[] args) {
		int arr[][]= {{22,31,9},{12,25,16}};  
 
		show(arr);
	}

}
