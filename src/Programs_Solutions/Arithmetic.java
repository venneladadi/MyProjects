package Programs_Solutions;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		int[] answer=getNumber();
		System.out.println("Entered numbers are"+answer[0]+" "+answer[1]);
		
	}
	public static int[] getNumber() {
		Scanner input=new Scanner(System.in);
		System.out.println("Plese enter two numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int[] result= {num1,num2};
		return result;
	}
	

}
