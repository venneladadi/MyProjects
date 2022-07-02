package com.tnsif.colletion.set;

import java.util.HashSet;
import java.util.TreeSet;

public class Demotreeset {

	public static void main(String[] args) {
			HashSet<Integer>hs=new HashSet<Integer>();

		hs.add(20);
		hs.add(9);
		hs.add(13);
		hs.add(30);
		hs.add(10);
		System.out.println("Returing data using Treeset");
		for(Integer s:hs) {
			System.out.println(s);
		}
			TreeSet<String>ts=new TreeSet<String>();
			for(String s:ts) {
				System.out.println(s);
			}
		ts.add("A");
		ts.add("d");
		ts.add("b");
		ts.add("c");
		ts.add("e");
		for(String s:ts)
		{
			System.out.println(s);
		}
		
	}

}
