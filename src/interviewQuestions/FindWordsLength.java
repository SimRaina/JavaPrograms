package interviewQuestions;

import java.util.Arrays;

/**
 * @author Simran
 *
 */
public class FindWordsLength {

	public static void main(String[] args) {
		String str="this is java program";
		// count(str);
        // count1(str);
		count2(str);
	}
	
	static void count(String str) {
		char[] ch=str.toCharArray();
		
		for (int i=0;i<ch.length;i++) {
			
			StringBuilder s= new StringBuilder();
			
			while(i<ch.length && ch[i]!=' ') {
				s.append(ch[i]);
				i++;
			}
			if(!s.isEmpty())
				System.out.println(s+"->"+s.length());
		}	
	}

	static void count2(String str) {
		String[] words = str.split(" ");

		for (String s : words) {
			if (!s.isEmpty()) {
				System.out.println(s + " -> " + s.length());
			}
		}
	}

    static void count1(String str) {
        Arrays.stream(str.split("\\s+"))
                .forEach(word -> System.out.println(word + " -> " + word.length()));
    }
}
