package interviewQuestions;

/* 2  4  6   8   10
            -2  -1  Index
*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayWithoutUsingOtherArray {
	
	public static void main(String[] args) {
		// reverseArray();
        reverseArray1();
        // reverseArray2();
  }

  public static void reverseArray() {
      int[] arr = {2,4,6,8,10};
      int size = arr.length;
      for(int i=0; i<=size/2; i++) {
          int k=i;
          int temp = arr[k];
          arr[k] = arr[size - 1 - i]; // -1, -2, ...
          arr[size-(i+1)] = temp;
      }

      for (int j : arr) {
          System.out.print(j + " ");
      }
  }

  public static void reverseArray1() {
      int[] arr = {2,4,6,8,10};
      int[] reversed = IntStream.range(0, arr.length)
              .map(i -> arr[arr.length - 1 - i])
              .toArray();

      System.out.println(Arrays.toString(reversed));
  }

  public static void reverseArray2() {
      int[] arr = {2,4,6,8,10};
      for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
      }
      System.out.println(Arrays.toString(arr));
  }
}
