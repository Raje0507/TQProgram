package com.AssignmentNO7;

public class EG3Freq {
	
	public static void show(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean isvalid=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isvalid=true;
					break;
				}
			}
			
			if(isvalid==false)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				System.out.println(a[i]+" Frequency= "+count);
			}	
		}
	}

	public static void main(String[] args) {
		int arr[]= {4,2,8,4,2,2};
		
		show(arr);

	}

}
