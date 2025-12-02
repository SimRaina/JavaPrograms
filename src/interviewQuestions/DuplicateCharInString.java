package interviewQuestions;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Simran
 *
 */
public class DuplicateCharInString {

	public static void main(String[] args) {
	String str="swiss";
	displayDuplicates(str);
    // displayDuplicates(str);
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

    public static void displayDuplicates1(String str) {
        str.chars()
                .mapToObj(c -> (char) c) // Converts char to Character object
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .forEach(e ->
                        System.out.println("Character " + e.getKey() + " occurs " + e.getValue() + " times.")
                );
    }
}
