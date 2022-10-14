package com.AssignmentNO5;

class Faculty
{
	 float Total_sal=0,salary=30000;
}
class HRA extends Faculty
{
	float hra=3000;
}
class DA extends HRA
{
	float da=2000;
	float bonus=1500;
}

public class Eg3 {

	public static void main(String[] args) {
		DA d=new DA();
		
		d.Total_sal=d.salary+d.hra+d.da+d.bonus;
		
		System.out.println("Total Salary Is="+d.Total_sal);

	}

}
