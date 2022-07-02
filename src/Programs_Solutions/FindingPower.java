package Programs_Solutions;
import java.util.*;

public class FindingPower {

	public static void main(String[] args) {

		int base =getBase();
		int power =getPow();
		
		int result =getPower(base, power);
		System.out.println("The result of "+base+" ^ "+power+" = "+result);
		
	}
	public static int getBase() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a base value:");
		int baseValue =input.nextInt();
		return baseValue;
	}
	public static int getPow() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a power value:");
		int powerValue =input.nextInt();
		return powerValue;
	}
	public static int getPower(int baseValue,int powerValue) {
		int answer=1;
		for(int i=1;i<=powerValue;i++)
		{
			answer =answer*baseValue;
			
			
		}
		
		return answer;
		
	}
	

}
