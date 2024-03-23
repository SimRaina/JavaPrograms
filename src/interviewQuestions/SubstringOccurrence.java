package interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class SubstringOccurrence {

	public static void main(String[] args) {
		String str="A man, a plan, a canal, Panama";
		//logic1(str);
		logic2(str);
	}
	
	static void logic1(String str) {
        int count=0;
		
		String words[] = str.split(" ");
		
		for(int i=0; i<words.length; i++) {
			
			
			if(words[i].length() > 2) {
				
				if(words[i].contains("an")) {
					count++;
				}	
			}
		}
		
		System.out.println(" \"an\" exists: " + count + " times");
	}
    
	static void logic2(String str) {
		
		List<String> words = Arrays.asList(str.split(","));
		long count = words.stream()
		.filter(value -> value.contains("an"))
		.count();
		System.out.println(" \"an\" exists: " + count + " times");
	}
}
