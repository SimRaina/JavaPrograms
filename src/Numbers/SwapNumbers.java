/**
 * 
 */
package Numbers;

import java.util.Scanner;

/**
 * @author Simran
 *
 */
public class SwapNumbers {


	public static void main(String[] args) {

		int x,y,temp;
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		
		x=in.nextInt();
		y=in.nextInt();
		
		System.out.println("Before swapping: x = "+x+ " y = " + y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swapping: x = "+x+ " y = " + y);
        
		in.close();
	}

}
