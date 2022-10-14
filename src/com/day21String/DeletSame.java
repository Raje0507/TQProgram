package com.day21String;

public class DeletSame {
	
	public static void show(String s1,String s2) 
	{
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean isvalid=false;
			for(int j=0;j<ch1.length;j++)
			{
				if(ch[i]==ch[j])
				{
					isvalid=true;
					break;
				}
			}
			
			if(isvalid==false)
			{
				System.out.println(ch[i]);
			}
		}
	}

	public static void main(String[] args) {
		String s1="india";
		String s2="in";
		
		show(s1,s2);

	}

}
