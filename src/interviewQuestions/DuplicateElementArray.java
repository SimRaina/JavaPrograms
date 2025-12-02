package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Simran
 *
 */
public class DuplicateElementArray {

	
	public static void main(String[] args) {
        String[] duplicates = { "Java", "Spring", "Hibernate", "Java", "Spring" };

        Set<String> set = Arrays.stream(duplicates)
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
