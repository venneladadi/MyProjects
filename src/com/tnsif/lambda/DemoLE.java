package com.tnsif.lambda;
interface lambda
{
	public void add(int a,int b);
}

public class DemoLE {

	public static void main(String[] args) {
		lambda ob=(int a,int b)->System.out.println(a+b);
		ob.add(2,5);

	}

}
