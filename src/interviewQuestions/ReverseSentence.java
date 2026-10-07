package interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseSentence {
	public static void main(String[] args) {
		String str="This is my name"; // OUTPUT: name my is This
		System.out.println("Reverse is=> " + findReverse(str));
	}
	static String findReverse(String s) {
        String revSentence = "";
        String[] words = s.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
			 revSentence = revSentence + words[i] + " "; 
        }
        return String.join(" ", revSentence);
	}
}
