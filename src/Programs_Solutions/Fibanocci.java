package Programs_Solutions;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {	
	int num=0;
	while(true)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a nth number of fibanocci: ");
		num=input.nextInt();
		if(num<=0)
		{
			System.out.print("you entered number is wrong plese enter valid number: ");
			continue;
		}
		else

			break;
		
	}
	getFibanocciSequence(num);
	getFibanocciNthNumber(num);
}
	
	public static void getFibanocciSequence(int num) {
		int currentNum=1;
		int previousNum=1;
		int temp=0;
		System.out.print("Fibnocci sequence first"+num+": "+1+" ");
		for(int i=1;i<num;i++)
		{
			System.out.print(currentNum+" ");
			temp=currentNum;
			currentNum+=previousNum;
			previousNum=temp;
			
		}
		
	}
	
		
	public static void getFibanocciNthNumber(int num) {
		int currentNum=1;
		int previousNum=1;
		int temp=0;
		
		for(int i=1;i<num;i++)
		{
			if(num-1==i)
			{
				System.out.println("\n"+num+"th Fibnocci number is "+currentNum);
			}
			
			temp=currentNum;
			currentNum+=previousNum;
			previousNum=temp;
			
		}
		
	}
	


}


