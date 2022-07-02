package com.tnsif.colletion.set;
import java.util.Iterator;
import java.util.HashSet;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class DemoHashSet {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<String>();
		hs.add("a");
		hs.add("a");
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		System.out.println("using advanced for loop:");
		for(String s:hs)
		{
			System.out.println(s);
		}
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println("using iterator");
			System.out.println();
			it.next();
			
		}
		System.out.println("after delete");
		hs.clear();
		for(String s:hs) {
			System.out.println(s);
		}
		
	}

}
