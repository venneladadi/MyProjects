package Programs_Solutions;
import java.util.Scanner;
public class sum_of_input {

	public static void main(String[] args) {
		SumOfNum();

	}

	public static void SumOfNum()
	{ 
		int result=0;
		Scanner input = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a value:");
		
			int num=input.nextInt();
			if(num<0) {
				System.out.println("Entered negative numer existing number:");
				break;
			}
			result += num;
			if(result>=100)
				{
					break;
				}
	    	    
	    }
		System.out.println("sum of the numbers is:"+result);
    }
}