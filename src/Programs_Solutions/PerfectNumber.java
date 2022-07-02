	package Programs_Solutions;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=input.nextInt();
		getPerfectNumber(num);
	}
	public static void getPerfectNumber(int x) {
		int sum=0;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0) {
				sum=sum+i;
				
			}
			
		}
		if(sum==x) {
			System.out.println(x+" is a Perfect Number");
		}
		else {
			System.out.println(x+" is not a perfect number");
		}
			
		

	}

}
