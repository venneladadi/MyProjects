package Programs_Solutions;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=input.nextInt();
		sumOfEvenNumbers(num);
		sumOfOddNumbers(num);
		sumOfPrimeNumbers(num);
	}
	public static void sumOfEvenNumbers(int x) {
		int sum1=0;
		for(int i=1;i<=x;i++) {
			if(i%2==0)
			{
				System.out.print(i+" + ");
				sum1+=i;
				
			}
			
		}
		System.out.println("\n sum of even numbers:"+sum1);
	}
	public static void sumOfOddNumbers(int x) {
		int sum2=0;
		for(int j=1;j<=x;j++) {
			if(j%2!=0)
			{
				System.out.print(j+" + ");
				sum2+=j;
			}
		}
		System.out.println("\n sum of odd numbers:"+sum2);
	}
	
	public static void sumOfPrimeNumbers(int x) {
		int sum=0;
		boolean flag=true;
		for(int i=2;i<x;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.print(i+"+");
				sum+=i;
			}
			flag=true;
		}
		System.out.println("\nsum of prime numbers:"+sum);
	}
}
	
