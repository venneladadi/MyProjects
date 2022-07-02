package com.tnsif.java8features;

import java.util.function.BiFunction;

public class DemoMR {
	public static<T> T mergeVars(T a,T b,BiFunction<T,T,T>result) {
		return result.apply(a, b);
	}
	public static String appendString(String a,String b)
	{
		return a+b;
	}
	public String appendString2(String a,String b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		DemoMR obj =new DemoMR();
		//calling with lambda expression
		System.out.println("Using lambda "+DemoMR.mergeVars("Hello ","VIIT",(a,b)->a+b));
		//calling with static method
	    System.out.println("Using static method "+DemoMR.mergeVars("Hello ","VIIT",DemoMR::appendString));
	    //calling with instance expression
	  	System.out.println("Using instance method "+DemoMR.mergeVars("Hello ","TNSIF",obj::appendString2));
	    //calling with instance orbitary object of a particular type
	  	System.out.println("Using instance method with a orbitary type "+DemoMR.mergeVars("Hello ","GOOD DAY",String::concat));
	  													
	}

}
