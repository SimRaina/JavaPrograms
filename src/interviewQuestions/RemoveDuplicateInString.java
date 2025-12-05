package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInString {
	public static void main(String[] args) {
		String str="Preet";
		removeDuplicates(str);
        // removeDuplicates1(str);
		}
	public static void removeDuplicates(String str) {
		Set<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);  
			set.add(c); // set doesn't contain duplicate
	        }
	    System.out.println("Size of String with non repeating charcters:" + set.size());
    }

    public static void removeDuplicates1(String str) {
        long count = str.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .count();

        System.out.println("Size of String with non repeating characters: " + count);
    }
}

