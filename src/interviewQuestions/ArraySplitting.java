package interviewQuestions;

public class ArraySplitting {
	
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4,5,5};
		int n= arr.length;
		printTwoSubArrays(arr, n);
	}
	
	public static int findSplitPoint(int arr[], int n) {
		
		int leftsum=0;
		
		for(int i=0; i<n; i++) {
			leftsum+=arr[i];
			
		    int rightsum=0;
		    
		    for(int j=i+1; j<n; j++)
		    	rightsum+=arr[j];
		    	
		    if(leftsum==rightsum)
		    	return i+1; 
		}
		return -1;	
	}

	
	public static void printTwoSubArrays(int arr[], int n) {
		int splitPoint= findSplitPoint(arr, n);
		
		if(splitPoint==-1 || splitPoint==n) {
			System.out.println("Split Not Possible");
			return;
		}
		
		for(int i=0; i<n; i++) {
			
			if(splitPoint==i) {
				System.out.println();	
			}
			System.out.print(arr[i] + " ");
		}	
	}
}
