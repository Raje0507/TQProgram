package com.day21String;

public class LongestWord {
	
	public static void longest(String st)
	{
		String sp[]=st.split("\\s");
		
		for(int i=0;i<sp.length;i++)
		{
			for(int j=i+1;j<sp.length;j++)
			{
				if(sp[i].length()>sp[j].length())
				{
					String temp=sp[i];
							sp[i]=sp[j];
							sp[j]=temp;
				}
				
			}
		}
		System.out.println(sp[sp.length-1]);
	}

	public static void main(String[] args) {
		String s="india is my lllllllll country";
		
        longest(s);
	}

}
