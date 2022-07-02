package com.tnsif.colletion.set;

import java.util.PriorityQueue;

import java.util.Iterator;

class Student implements Comparable<Student>
{
	private int rank;
	private String name;
	/**
	 * @param rank
	 * @param name
	 */
	public Student(int rank, String name) {
		super();
		this.rank = rank;
		this.name = name;
	}
	public int compareTo(Student st)
	{
		if(rank<st.rank)
			return -1;
		else if(rank>st.rank)
			return 1;
		return 0;
	}
	public String toString()
	{
		String result="Student name:" +name+",Student rank"+rank;
		return result;
	}
}

public class Demopriorityqueue {

	public static void main(String[] args) {
		PriorityQueue<Student> pq=new PriorityQueue<>();
		pq.add(new Student(5,"a"));
		pq.add(new Student(3,"c"));
		pq.add(new Student(2,"b"));
		pq.add(new Student(1,"e"));
		pq.add(new Student(4,"f"));
		
		Iterator<Student> it=pq.iterator();
		while(it.hasNext())
		{
			System.out.println("The items in queue:"+pq.poll().toString());
		}
	}

}
