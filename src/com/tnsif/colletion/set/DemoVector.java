package com.tnsif.colletion.set;

import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		Vector<Integer>vec=new Vector<Integer>();
		System.out.println("The fault size:"+vec.capacity());
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(60);
		vec.add(70);
		vec.add(80);
		vec.add(90);
		vec.add(100);
		vec.add(110);
		vec.add(110);
		vec.add(110);
		vec.add(110);
		System.out.println("The default size:"+vec.capacity());
		System.out.println("the size of vector after insertion.:"+vec.size());
		vec.remove(7);
		for(int i:vec)
		{
			System.out.println(i);
		}
		vec.removeAll(vec);
		for(int i:vec)
		{
			System.out.println(i);
		}
	}

}
