package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CommonDigits {

	/*
	 list1 = (1, 3, 3, 5, 2, 7)
	 list2 = (3, 2, 7, 4)
	 result = (3, 2, 7)  Exclude Duplicates (use Set)
	 */
	public static void main(String[] args) {
		
		List<Integer> list1 = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		Set<Integer> result = new HashSet<>();
		
		list1 = Arrays.asList(1, 3, 3, 5, 2, 7);
		list2 = Arrays.asList(3, 2, 7, 4);
		
		for(int i=0; i< list1.size(); i++) {
			for(int j=0; j< list2.size(); j++) {
				if(list1.get(i) == list2.get(j)) {
					result.add(list1.get(i));
				}
			}
		}
        System.out.println(result);
	}
}
