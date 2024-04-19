package Numbers;

import java.util.Scanner;

public class Fibo_Recur {
    
	static int result;
	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter Fibonacci Series position: ");
	  int n = sc.nextInt();
	  
      System.out.println("Value at " + n + "th position in the series is: " + fib(n));
      sc.close();

	}
	
	static int fib(int i) {
	
		
		if (i==1 | i==2) {
			result= 1;
		}
		
		else {
			result = fib(i-1) + fib(i-2);
		}
		
		return result;
	}

}
