package com.tnsif.java8features;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demodateapi {

	public static void main(String[] args) {
		LocalDate dateobj=LocalDate.now();
		
		DayOfWeek obj2=dateobj.getDayOfWeek();
		int dayOfMonth=dateobj.getDayOfMonth();
		int dayOfYear=dateobj.getDayOfYear();
		
		System.out.println("Today's date is:"+dateobj);
		System.out.println("Today's day is:"+obj2);
		System.out.println("Day of Month is:"+dayOfMonth);
		System.out.println("Day of Year is:"+dayOfYear);
	}

}
