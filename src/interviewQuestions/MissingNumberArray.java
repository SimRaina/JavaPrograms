package interviewQuestions;

/**
 * @author Simran
 *
 */
public class MissingNumberArray {

	
	public static void main(String[] args) {
		int array[]= {1,2,3,4,6};
		int missingnumber=getMissingNumber(array,6);
		System.out.println("Missing number is "+missingnumber);
	}
	
	private static int getMissingNumber(int array[], int n) {
		int actualsum=0;
		int expectedsum=n*(n+1)/2;
		
		for (int i:array) {
			actualsum=actualsum+i;
		}
		return expectedsum-actualsum;
		}
	}

