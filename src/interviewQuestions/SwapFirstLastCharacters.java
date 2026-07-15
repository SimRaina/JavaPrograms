package interviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SwapFirstLastCharacters {
	public static void main(String[] args) {
		String str="it is java program";
		System.out.println(count(str));
        // System.out.println(count1(str));
        // System.out.println(count2(str));
	}
	static String count(String str) {
		char[] ch=str.toCharArray();
		for (int i=0;i<ch.length;i++) {
			int k=i;
			while (i<ch.length && ch[i]!=' ') {
				i++;
			}
			char temp=ch[k];   // Swapping using third variable logic
			ch[k]=ch[i-1];     // i-1 = last character
			ch[i-1]=temp;
		}
		return new String(ch);
	}

    public static String count1(String str) {
        String[] words = str.split(" ");   // split into words
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (w.length() > 1) {                // swap only if at least 2 chars
                char first = w.charAt(0);
                char last  = w.charAt(w.length() - 1);
                words[i] = last + w.substring(1, w.length() - 1) + first;
            }
        }
        return String.join(" ", words);
    }

    public static String count2(String str) {
        return Arrays.stream(str.split(" "))
                .map(word -> {
                    return word.charAt(word.length() - 1)                  // last char
                        + word.substring(1, word.length() - 1) // middle char
                        + word.charAt(0);                           // first char
                })
                .collect(Collectors.joining(" "));
    }
}
