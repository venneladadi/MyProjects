package Programs_Solutions;

import java.util.Scanner;

public class DivisorsOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=input.nextInt();
		getDivisors(num);
	
	}
	public static void getDivisors(int x) {
		System.out.println("The divisors of "+x+" are:\t");
		for(int i=1;i<=x/2;i++) {
			if(x%i==0) {
				System.out.println(i);
				
			}
			
		}
		System.out.println(x);
	}

}
