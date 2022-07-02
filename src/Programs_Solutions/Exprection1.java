package Programs_Solutions;

import java.util.Scanner;

public class Exprection1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//int sum=0;
		System.out.println("Enter a number:");
		int n=input.nextInt();
		getExprection(n);
	}
	public static void getExprection (int x) {
		int sum=0;
		for(int i=1;i<=x;i++)
		{
			
			//sum+=(i+3)/(Math.pow(i, 2)-5);
			sum+=(i+3)/((i*i)-5);
			
			//int num1=i+3;
			//int num2=((i*i)-5);
			//sum+=num1/num2;
			
		}
		System.out.println("Sum of Exprection:"+sum);
	}
		
}
