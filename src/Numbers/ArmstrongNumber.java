/**
 * 
 */
package Numbers;

import java.util.Scanner;

/**
 * @author Simran
 *
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n, temp, remainder, digits=0;
		double sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number to check if it is Armstrong");
		n= in.nextInt();
		
		temp=n;
		while(temp!=0)
		{
			digits++;
			temp=temp/10;
		}
		
		temp=n;
		while(temp!=0)
		{
			remainder=temp%10;
			sum=sum+Math.pow(remainder, digits);
			temp=temp/10;
		}
		
		if(n==sum)
			System.out.println(n+ " is Armstrong Number");
		else
			System.out.println(n+ " is not Armstrong Number");

	in.close();
	}

}
