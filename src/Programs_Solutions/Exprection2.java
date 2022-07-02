package Programs_Solutions;

import java.util.Scanner;

public class Exprection2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=input.nextInt();
		number(x);
	}	 
	public static void number(int n) {
		if(n%7==0)
		{
			double sum=0;
			for(int i=1;i<=n;i++)
			{
				sum+=(1/(double)i);
				System.out.println(sum);
			}
			System.out.println("The sum is:"+sum);
					
		}
		else
		{
			double sum = 0;
			for(int j=1;j<n;j++)
			{				
				
				sum+=n/(double)j;

			}
			sum+=n*(n-1)+1;
			System.out.println("The else result:"+sum);
		}

	}

}
