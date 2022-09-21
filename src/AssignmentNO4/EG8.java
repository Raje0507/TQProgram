package AssignmentNO4;

public class EG8 {

	public static void main(String[] args) {
		
		float comm;
		int sale=15020;
		
		/*if(sale>15000)
		{
			comm=sale*5/100;
		}
		else
		{
			comm=(long) 0.0;
		}*/
		
		comm=(long) (sale>15000?(sale*5)/100:0.0);
		
       System.out.print(comm);
	}

}
