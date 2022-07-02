package com.tnsif.demo;
//instanceof
class Animal
{
	public void show()
	{
		System.out.println("This is wild class");
	}
}
class Dog
{
	public void show()
	{
		System.out.println("This is Dog class");
	}
}
class wildFox
{
	public void show()
	{
		System.out.println("This is wild class");
	}
}
public class Demoinstance {

	public static void main(String[] args) 
	{
		Animal ob=new Animal();
		Dog obj=new Dog();
		wildFox obj1=new wildFox();
		
		if(ob instanceof Animal)
		{
			System.out.println("ob is object of Animal");
		}
		else
		{
			System.out.println("ob is not a object of Animal class");
		}
			
		
		

	}

}
