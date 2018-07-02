/**
 * 
 */
package Numbers;

import java.util.Scanner;

/**
 * @author Simran
 *
 */
public class PrimeNumbersSquareRoot {

/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Enter a number");
	int n=in.nextInt();
	if(isPrime(n)) {
		System.out.println(n+ " is Prime Number");
	}
	else {
		System.out.println(n+ " is not Prime Number");
	}
}
	public static boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
		for (int i=2;i<Math.sqrt(n);i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;	
	}

}
