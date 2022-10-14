package com.AssignmentNO6;

public class EG12 {
	
	public static void show()
	{ 
		int buzz=0;
		int fizz=0;
		int buzzfizz=0;
		
		for(int i=1;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("buzzfizz "+i);
				buzzfizz++;
			}
			else if(i%5==0)
			{
				System.out.println("fizz "+i);
				fizz++;
			}
			else if(i%3==0)
			{
				System.out.println("buzz "+i);
				buzz++;
			}
		}
		
		System.out.println("buzz="+buzz+"\tfizz="+fizz+"\tbuzzfizz="+buzzfizz);
	}

	public static void main(String[] args) {
		
		show();

	}

}
