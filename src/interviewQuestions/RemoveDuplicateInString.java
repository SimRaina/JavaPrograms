package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInString {
	public static void main(String[] args) {
		String str="Preet";
		System.out.println("Length of given String is: "+str.length());
		removeDuplicates(str);
		}
	public static void removeDuplicates(String str) {
		Set<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);  
			set.add(c); // set doesn't contain duplicate
	        }
	System.out.println("Size of String with non repeating charcters:" + set.size());	
        }
}

