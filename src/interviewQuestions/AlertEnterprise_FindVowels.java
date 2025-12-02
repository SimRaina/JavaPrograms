package interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AlertEnterprise_FindVowels {

		public static void main(String[] args) {
			
		  String str="AlertEnterprise";
		  findVowels(str);
          // findVowels1(str);
		}
		
		static void findVowels(String s) {
			Map<Character,Integer> map= new HashMap<>();
			for (int i=0;i<s.length();i++) {
				Character c=s.charAt(i);
				if((c.equals('A')) || (c.equals('E')) || (c.equals('I')) || (c.equals('O')) || (c.equals('U'))) {
				map.put(c, map.getOrDefault(c,0)+1);
			}
		}
			for (Entry<Character,Integer> entry: map.entrySet()){
				System.out.println("Character: " + entry.getKey() + " occurred in the string: " + entry.getValue() + " times" );
			}
		}

    static void findVowels1(String s) {
        s.toUpperCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "AEIOU".indexOf(c) >= 0)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach((vowel, count) -> System.out.println(vowel + "=" + count));
    }
}

