package com.tnsif.demo;

import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<Integer>();
		ll.add(2);
		ll.add(3);
		ll.add(4);
		for(int i:ll)
		{
			System.out.println(i);
		}
		//first node n last node insertion
		System.out.println("first n last node insertion");
		ll.addFirst(1);
		ll.addLast(5);
		for(int i:ll)
		{
			System.out.println(i);
		}
		//remove
		System.out.println("after remove");
		ll.remove(3);
		for(int i:ll)
		{
			System.out.println(i);
		}
		System.out.println("first remove");
		ll.removeFirst();
		ll.removeLast();
		for(int i:ll)
		{
			System.out.println(i);
			
		}
		boolean b=ll.contains(5);
		System.out.println(b);
	}

}
