package com.tnsif.exceptions;

public class Demotrycatch {

	public static void main(String[] args) {
		/*int n1=50/2;
		System.out.println(n1);
		System.out.println("welcome");*/
		
		
		int[] arr=new int[5];
		try
		{
			
			int a[]=new int[5];
			a[8]=30/4;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("end of block");
		}
	

	}

}
