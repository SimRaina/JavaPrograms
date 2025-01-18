package interviewQuestions;


public class MoveZeroes {

	public static void main(String[] args) {
		int[] arr = {4, 0, 2, 0, 7, 1, 0, 6, 8};
		
		moveZeroes(arr);

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
}

