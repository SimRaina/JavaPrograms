package interviewQuestions;

public class MinimumValue {

	public static void main(String[] args) {
			int input[]= {4,2,1,6,0,8,7};
			System.out.println(min(input));
	}
	
	public static int min(int[] arr) {
		
		int min=arr[0];
		
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i] < min) {
				min=arr[i];
			}
		}
		return min;
	}
}
