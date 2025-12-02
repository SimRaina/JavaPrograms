package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonDigits {

	/*
	 list1 = (1, 3, 3, 5, 2, 7)
	 list2 = (3, 2, 7, 4)
	 result = (3, 2, 7)  Exclude Duplicates (use Set)
	 */
	public static void main(String[] args) {
        logic1();
        // logic2();
    }

    static void logic1() {
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

    static void logic2() {
        List<Integer> list1 = Arrays.asList(1, 3, 3, 5, 2, 7);
        List<Integer> list2 = Arrays.asList(3, 2, 7, 4);

        Set<Integer> result = list1.stream()
                .filter(new HashSet<>(list2)::contains)   // O(1) lookups
                .collect(Collectors.toSet());            // deduplicates automatically

        System.out.println(result);
    }
}
