/**
 * 
 */
package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Simran
 *
 */
public class DuplicateElementArray {

	
	public static void main(String[] args) {
	String duplicates[]=new String[] {"Java", "Spring", "Hibernate", "Java"};
	Set<String> duplicateSet=new HashSet<>();
	Set<String> nonduplicateSet=new HashSet<>();
	
	for (String str: duplicates) {
		if(!nonduplicateSet.contains(str)) {
			nonduplicateSet.add(str);
		}
		else {
			duplicateSet.add(str);
		}
	}
	System.out.println(duplicateSet);;
   }

}
