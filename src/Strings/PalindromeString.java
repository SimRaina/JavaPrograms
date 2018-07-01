/**
 * 
 */
package Strings;

import java.util.Scanner;

/**
 * @author Simran
 *
 */
public class PalindromeString {

	public static void main(String[] args) {
		String s, rev="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String to check if it is Palindrome");
		s=in.nextLine();
		int length = s.length();
		
		for (int i=length-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		
		if (s.equalsIgnoreCase(rev)) {
			System.out.println(s+ " is Palindrome");
		}
		
		else
			System.out.println(s+ " is not Palindrome");
	}

}
