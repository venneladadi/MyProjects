package Programs_Solutions;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=input.nextInt();
		getExprection(num);
    }
	public static void getExprection(int x) {
		int sum=1;
		
		for(int i=1;i<=x;) {
			
			System.out.print(i+"+");
			if((i+3)>x) {
				break;			
			}
			i+=3;
			sum+=i;

		}
		System.out.println("\nSum of the series is "+sum);
		
	}
}