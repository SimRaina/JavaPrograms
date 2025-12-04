package interviewQuestions;

import java.util.Arrays;

/**
 * @author Simran
 */
public class MissingNumberArray {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,6};
		System.out.println("Missing number is " + getMissingNumber(array, 6));
        // System.out.println("Missing number is " + getMissingNumber1(array, 6));
	}
	
	private static int getMissingNumber(int[] array, int n) {
		int actualsum = 0;
		int expectedsum = n * (n + 1) / 2;
		for (int i:array) {
			actualsum += i;
		}
		return expectedsum - actualsum;
    }

    public static int getMissingNumber1(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(array).sum();
        return expectedSum - actualSum;
    }
}