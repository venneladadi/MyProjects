package Programs_Solutions;

/**
 * Date 10-06-2022
 * @author Vennela
 * Calculate the sum of the expression if the N is even -n/2-n/4-n/6----(n-10)/n*2
 *
 */

public class SumOffSeries03 {

	public static void main(String[] args) {
		int number = 8;
		boolean solution = tocheckEven(number);
		if(solution==true) {
			System.out.println("Given number is a even , we are finding Expression..");
			findingExprection(number);
			
		}
		else
			System.out.println("Given number is not a even, then these expresion are not possible..");

	}
	public static boolean tocheckEven(int y){

		
		if(y%2==0) {
			return true;
		}
		else
			return false;
	}



	public static void findingExprection(int y) {
		int sum = 0;
		for(int i=2;i<y;) {	
			sum-=y/i;
			i+=2;			
		}
		sum+=(y-10)/y*y;
		System.out.println("The Expression solution is: "+sum);
	}

	

}

