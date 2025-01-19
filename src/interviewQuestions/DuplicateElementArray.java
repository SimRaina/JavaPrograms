package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Simran
 *
 */
public class DuplicateElementArray {

	
	public static void main(String[] args) {
	String duplicates[]=new String[] {"Java", "Spring", "Hibernate", "Java", "Spring"};
	Set<String> set=new HashSet<>();
	
	for (String str: duplicates) {
			set.add(str);
	}
	System.out.println(set);
   }
}
