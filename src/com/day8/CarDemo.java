package com.day8;

public class CarDemo {

	public static void main(String[] args) {
		
		Car c=new Car();
		
		c.setModelNo(143);
		c.setPrice(20000.00);
		c.setName("BMW");
		c.setSpeed(75.69);
	
        System.out.println(c.getModelNo());
        System.out.println(c.getPrice());
        System.out.println(c.getName());
        System.out.println(c.getSpeed());
    
	}

}
