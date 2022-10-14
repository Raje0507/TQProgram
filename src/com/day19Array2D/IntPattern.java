package com.day19Array2D;

public class IntPattern {

	public static void main(String[] args) {
	     int a[][]=new int[3][5];
	     
	     for(int i=0;i<a.length;i++)
	     {
	    	int k=i;
	    	for(int j=0;j<a[i].length;j++)
	    	{
	    		if(j==k || j==a[i].length-1)
	    		{
	    			System.out.print("*");
	    			k--;
	    		}
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println();
	     }
	     
	     
	     
	     
	    /*234*
	     **3**
	     *****/
	     

	}

}
