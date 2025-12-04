package interviewQuestions;

import java.util.Arrays;

public class MinimumValue {

	public static void main(String[] args) {
			int[] input= {4,2,1,6,0,8,7};
			System.out.println(min(input));
            // System.out.println(min1(input));
	}
	
	public static int min(int[] arr) {
        int[] input = {4,2,1,6,0,8,7};
		int min=arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
		return min;
	}

    public static int min1(int[] arr) {
        return Arrays.stream(arr).min().orElseThrow();
    }
}
