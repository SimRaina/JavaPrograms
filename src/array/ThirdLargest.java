package array;

public class ThirdLargest {

	static void thirdLargest1(int arr[], 
            int arr_size) 
{ 
/* There should be  
atleast three elements */
if (arr_size < 3) 
{ 
System.out.printf(" Invalid Input "); 
return; 
} 

// Find first  
// largest element 
int first = arr[0]; 
for (int i = 1; 
i < arr_size ; i++) 
if (arr[i] > first) 
first = arr[i]; 

// Find second  
// largest element 
int second = Integer.MIN_VALUE; 
for (int i = 0;  
i < arr_size ; i++) 
if (arr[i] > second &&  
arr[i] < first) 
second = arr[i]; 

// Find third 
// largest element 
int third = Integer.MIN_VALUE; 
for (int i = 0;  
i < arr_size ; i++) 
if (arr[i] > third &&  
arr[i] < second) 
third = arr[i]; 

System.out.printf("The third Largest element is: "+third); 
} 
	
	static void thirdLargest2(int arr[], int arr_size) { 
		/* There should be atleast three elements */
		if (arr_size < 3) { 
			System.out.printf(" Invalid Input "); 
			return; 
		} 

		// Initialize first, second and third Largest element 
		int first = arr[0], second = Integer.MIN_VALUE, 
							third = Integer.MIN_VALUE; 

		// Traverse array elements to find the third Largest 
		for (int i = 1; i < arr_size; i++) { 
			/* If current element is greater than first, 
		then update first, second and third */
			if (arr[i] > first) { 
				third = second; 
				second = first; 
				first = arr[i]; 
			} /* If arr[i] is in between first and second */
			else if (arr[i] > second) { 
				third = second; 
				second = arr[i]; 
			} /* If arr[i] is in between second and third */
			else if (arr[i] > third) { 
				third = arr[i]; 
			} 
		} 

		System.out.printf("The third Largest element is: "+third); 
	} 



//Driver code 
public static void main(String []args) 
{ 
int arr[] = {12, 13, 1, 10, 34, 16}; 
int n = arr.length; 
thirdLargest1(arr, n); 
thirdLargest2(arr,n);
} 

}
