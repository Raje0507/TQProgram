package AssignmentNO4;

public class EG2 {

	public static void main(String[] args) {
		//All Digit Even Then Print
		
		for(int i=100;i<=400;i++)	
		{
			int copy=i;
			int count=0;
			while(copy>0)
			{
				int rem=copy%10;
				if(rem%2==0)
				{
					count++;
				}
				copy=copy/10;
			}
			
			if(count==3)
			{
				System.out.println(i);
		    }
			
		}

	}

}
