package Programs_Solutions;

import java.util.Scanner;

public class MinMaxSolution {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int max=0;
		int min=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter number "+i);
			int num=input.nextInt();
			if(i==1) {
				min=num;
				max=num;
			}

			if(num>max)
			{
				max=num;
			}
			if(num<min)
			{
				min=num;
				
			}
		}
		System.out.println("this is the max number "+max);
		System.out.println("this is the min number "+min);

	}

}
