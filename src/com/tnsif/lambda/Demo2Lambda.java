package com.tnsif.lambda;
interface shape
{
	void draw();
}

public class Demo2Lambda {

	public static void main(String[] args) {
		shape circle=()->System.out.println("This is a draw method");
		shape rect=()->System.out.println("This is a draw method for rect");
		shape triangle=()->System.out.println("This is a draw method for triangle");
		
		circle.draw();
		rect.draw();
		triangle.draw();
				

	}

}
