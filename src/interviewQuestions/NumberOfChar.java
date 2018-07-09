/**
 * 
 */
package interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Simran
 *
 */
public class NumberOfChar {

	public static void main(String[] args) {
	String str="Preet";
	displayDuplicates(str);
	}
	
	public static void displayDuplicates(String str) {
		Map<Character,Integer> map=new HashMap<>();
		char ch[]=str.toCharArray();
		
		for (char c: ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
			Set<Entry<Character,Integer>> entrySet=map.entrySet();
			for(Entry<Character,Integer> entry: entrySet) {
				if(entry.getValue()>=1) {
					System.out.println(entry.getKey()+" : "+entry.getValue());
					
				}
		}
	}

}
