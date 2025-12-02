package interviewQuestions;

import java.util.Arrays;

public class ArraySplitting {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        splitAndPrint(arr);
    }

    // O(n) solution
    public static void splitAndPrint(int[] arr) {

        int totalSum = Arrays.stream(arr).sum();

        int leftSum = 0;
        int splitIndex = -1;

        for (int i = 0; i < arr.length - 1; i++) {  // can't split after last element
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                splitIndex = i + 1;
                break;
            }
        }

        if (splitIndex == -1) {
            System.out.println("Split Not Possible");
            return;
        }

        int[] left = Arrays.copyOfRange(arr, 0, splitIndex);
        int[] right = Arrays.copyOfRange(arr, splitIndex, arr.length);

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }
}
