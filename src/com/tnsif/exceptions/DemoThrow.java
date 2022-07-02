package com.tnsif.exceptions;

public class DemoThrow {
	void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible");
			
		}
		else
		{
			System.out.println("Eligible for C2TC");
		}
	}

	public static void main(String[] args) {
		DemoThrow obj=new DemoThrow();
		obj.validate(19);
		

	}

}
