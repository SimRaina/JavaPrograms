package interviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZeroes {
	public static void main(String[] args) {
		int[] arr = {4, 0, 2, 0, 7, 1, 0, 6, 8};
		moveZeroes(arr);
        // moveZeroes1(arr);
	 }
	static void moveZeroes(int[] arr1) {
        int index = 0;
		 int n = arr1.length;
		 
		 for(int i = 0; i < n; i++) {
			 if(arr1[i] != 0) {
				 int temp = arr1[index];
				 arr1[index] = arr1[i];
				 arr1[i] = temp;
				 index++;
			 }	 
		  }
         for(int i=0; i<n; i++) {
             System.out.print(arr1[i]);
         }
      }

    static void moveZeroes1(int[] arr1) {
        int[] result =
                IntStream.concat(
                        Arrays.stream(arr1).filter(x -> x != 0),   // all non-zero values
                        Arrays.stream(arr1).filter(x -> x == 0)    // all zeros at the end
                ).toArray();

        System.out.println(Arrays.toString(result));
    }
}

