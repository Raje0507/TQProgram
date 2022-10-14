package com.AssignmentNO5;

class Department
{
	private int did;
	
	public void setDid(int did)
	{
		this.did=did;
	}
	
	public int getDid()
	{
		return did;
	}
}

class Employee
{
	private int id;
	private String name="hi";
	private boolean isManager; 
	private float salary;
	Department dept;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setIsManager(boolean isManager)
	{
		this.isManager=isManager;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public void setDept(Department dept)
	{
		this.dept=dept;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public boolean getIsManager()
	{
		return isManager;
	}
	public float getSalary()
	{
		return salary;
	}
	public Department getDept()
	{
		return dept;
	}
	
}

public class Eg10Encapsula {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.setId(145);
		e.setIsManager(true);        //Set Values
		e.setSalary(3500.30f);
		e.setDept(new Department());
		
		System.out.print(e.getId()+"\t"+e.getName()+"\t"+e.getIsManager()+"\t"+e.getSalary());
		
        Department d=e.getDept();
        
        d.setDid(7869);
        System.out.println("\t"+d.getDid());
	}

}
