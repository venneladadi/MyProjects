package com.tnsif.colletion.set;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("lavanya");
		lhs.add("Nitra");
		lhs.add("Divya");
		lhs.add("Madhu");
		lhs.add("");
		lhs.add("damini");
		lhs.add("damini");
		for(String s:lhs)
		{
			System.out.println(s);
		}


	}

}
