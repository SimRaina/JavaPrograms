/**
 * 
 */
package hashsSet;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Simran
 *
 */
public class DuplicateElementArray1 {

	
	public static void main(String[] args) {
	String duplicates[]=new String[] {"Java", "Spring", "Hibernate", "Java"};
	Set<String> duplicateSet=new HashSet<>();
	
	for(String s: duplicates) {
		if(duplicateSet.add(s)==false) {
			System.out.println("Duplicate Element is: "+s);
		}
	}
	
   }

}
