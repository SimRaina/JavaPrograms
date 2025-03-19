package interviewQuestions;

/* 2  4  6   8   10
            -2  -1  Index
*/

public class ReverseArrayWithoutUsingOtherArray {
	
	public static void main(String args[]) {
		int arr[] = {2,4,6,8,10};
		int size = arr.length;
		for(int i=0; i<=size/2; i++) {
			int k=i;
			int temp = arr[k];
			arr[k] = arr[size -(i+1)]; // -1, -2, ...
			arr[size-(i+1)] = temp;
		}
	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
  }
}
