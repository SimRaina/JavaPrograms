/**
 * 
 */
package interviewQuestions;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Simran
 *
 */
public class MaxCountIntegerArray {

	public static void main(String[] args) {
	int[] arr= {1,1,5,5,3,3,3,8,8};
	displayDuplicates(arr);
	}
	
	public static void displayDuplicates(int arr[]) {
		Map<Integer,Integer> map=new HashMap<>();
		
		for (int i: arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(Entry<Integer,Integer> entry: map.entrySet()) {
				
			System.out.println(entry.getKey()+" : "+entry.getValue());		
		}
	}
}
