package array;

import java.util.Arrays;

public class SmallestAndLargest {

	public static void main(String[] args) {
		
		int numbers[]= {-10,4,-4,3,666,-3455,234567,2};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		
		for (int i=1;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		
		System.out.println("\n Given Array is: "+Arrays.toString(numbers));
		System.out.println("Largest number is: "+largest);
		System.out.println("Smallest number is: "+smallest);
	}

}
