package latestJavaVersion;

import java.util.stream.Collectors;

public class CountVowelOccurences {

	public static void main(String[] args) {
		  String str="ALERTENTERPRISE";
		  findVowels(str);
	}
	
	static void findVowels(String s) {
	    s.toUpperCase()
	     .chars()
	     .mapToObj(c -> (char) c)
	     .filter(c -> "AEIOU".indexOf(c) >= 0)
	     .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
	     .forEach((vowel, count) -> System.out.println(vowel + "=" + count));
	}
}
