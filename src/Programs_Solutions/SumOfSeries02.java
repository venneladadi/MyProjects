package Programs_Solutions;

/**
 * Date 10-06-2022
 * @author Vennela
 * Calculate the sum of the expression if the N is prime i=2 run till i=n, n/2+n/4+n/6++++n*3/n
 *
 */

public class SumOfSeries02 {

	public static void main(String[] args) {
		int num = 3;
		boolean answer = checkPrime(num);
		if(answer==true) {
			System.out.println("Given number is prime Calculating the Expression..");
			calculateExpression(num);
			
		}
		else
			System.out.println("Given number is not prime, expresion not possible..");

	}
	public static boolean checkPrime(int x){
		boolean flag = true;  
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			return true; 
		}
		else
			return false;
	}



	public static void calculateExpression(int x) {
		int sum = 0;
		for(int i=2;i<x;) {	
			sum-=x/i;
			i+=2;			
		}
		sum+=(x*x*x)/x;
		System.out.println("The Expression answer is: "+sum);
	}
}