package com.tnsif.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Demoarrylist {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("lavanya");
		al.add("joyce");
		al.add("mary");
		for(String s:al)
		{
			System.out.println(s);
		}
		//INsert new value at zeroth index
		al.add(0,"ruhi");
		for(String s:al)
		{
			System.out.println(s);
			
		}
		//delete joyce
		System.out.println("After update");
		al.set(2, "chinnu");
		for(String s:al)
		{
			System.out.println(s);
		}
		//sorting data
		System.out.println("After sort");
		Collections.sort(al);
		for(String s:al)
		{
			System.out.println(s);
		}
		//delete all data
		al.clear();
		for(String s:al)
		{
			System.out.println(s);
		}
	

	}

}
