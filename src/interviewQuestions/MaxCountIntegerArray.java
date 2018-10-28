/**
 * 
 */
package interviewQuestions;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
			if(!map.containsKey(i)) {
				map.put(i, 1);
			}
			else {
				map.put(i, map.get(i)+1);
			}
		}
			Set<Entry<Integer,Integer>> entrySet=map.entrySet();
			for(Entry<Integer,Integer> entry: entrySet) {
				
					System.out.println(entry.getKey()+" : "+entry.getValue());
				
		}
	}

}
