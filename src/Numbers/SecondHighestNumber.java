/**
 * 
 */
package Numbers;

import java.util.Arrays;

/**
 * @author Simran
 *
 */
public class SecondHighestNumber {

	
	public static void main(String[] args) {
		int array[]= {1,20,5,15,16,10};
		Arrays.sort(array);
		System.out.println("Second Highest Number is: "+array[array.length-2]);
	}

}
