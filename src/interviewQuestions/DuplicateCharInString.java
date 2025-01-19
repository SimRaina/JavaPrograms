package interviewQuestions;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Simran
 *
 */
public class DuplicateCharInString {

	public static void main(String[] args) {
	String str="swiss";
	displayDuplicates(str);
	}
	
	public static void displayDuplicates(String str) {
		Map<Character,Integer> map=new HashMap<>();
		
		for (char c: str.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
			for(Entry<Character,Integer> entry: map.entrySet()) {
				if(entry.getValue()>1) {
					System.out.println("Character " + entry.getKey()+" occurs "+entry.getValue() + " times.");
				}
		}
	}

}
