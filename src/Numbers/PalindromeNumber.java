/**
 * 
 */
package Numbers;

import java.util.Scanner;

/**
 * @author Simran
 *
 */
public class PalindromeNumber {


	public static void main(String[] args) {
		int n,r,temp,reverse=0;
		Scanner in =new Scanner(System.in);
		System.out.println("Input a number to check if it is Palindrome");
		n=in.nextInt();
		
		temp=n;
		while (temp!=0) {
			r=temp%10;
			reverse=(reverse*10)+r;
			temp=temp/10;
		}
		if (reverse==n)
			System.out.println(n+ " is Palindrome Number");
		else 
			System.out.println(n+ " is not Palindrome Number");
		in.close();
	}

}
