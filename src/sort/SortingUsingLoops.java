package sort;

public class SortingUsingLoops {

	public static void main(String[] args) {
		
		int arr[] = {4, 2, 9, 6, 7, 3, 1};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp = 0;
				
				if(arr[j] < arr[i]) {
					temp = arr[j];
				    arr[j] = arr[i];
				    arr[i] = temp;
			}
		}
		System.out.print(arr[i] + " ");

	}
	}
}
