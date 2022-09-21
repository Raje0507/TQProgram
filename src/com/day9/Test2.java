package com.day9;

public class Test2 {
	int add=0;
    int count=0;
	public void  avg()
	{
		
		for(int i=1;i<=20;i++)
		{
		  boolean isprime=true;
          for(int j=2;j<i;j++)
          {
        	  if(i%j==0)
        	  {
        		 isprime=false;
        		 break;
        	  }
          }
          if(isprime==true)
    	  {
        	  count++;
    		  add=add+i;
    		  System.out.print(i+",");
    	  }
     			 
		}
		System.out.println("\n count="+count);
		System.out.println("AVG="+(add/count));
		
	}
	public static void main(String[] args) {
		
		Test2 t=new Test2();
		t.avg();

	}

}
