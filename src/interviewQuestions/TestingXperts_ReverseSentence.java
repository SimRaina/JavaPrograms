package interviewQuestions;


import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestingXperts_ReverseSentence {
	public static void main(String[] args) {
		String str="This is my name";
		System.out.println("Reverse is=> " + findReverse(str));
        // System.out.println("Reverse is=> " + findreverse1(str));
	}
	static String findReverse(String s) {
        String res="";
        String[] words = s.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
			 res = res + words[i] + " "; 
        }
        return String.join(" ", res);
	}

    static String findReverse1(String str) {
        return Arrays.stream(str.split(" "))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));

        /*
        return Arrays.stream(str.split(" "))
        .reduce((a, b) -> b + " " + a)
        .orElse("");
         */
    }
}
