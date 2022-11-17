package sort;

import java.util.Arrays;

public class SortingUsingBuiltIn {

	public static void main(String[] args) {
		int arr[] = {4, 2, 9, 6, 7, 3, 1};
		
		Arrays.sort(arr);
		 System.out.printf("Sorted: %s", Arrays.toString(arr));
	}
}
