package interviewQuestions;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepetitiveChar {
    public static void main(String[] args) {
        String input = "systemengineer";
        char result = findFirstNonRepetitiveChar(input);
        // char result = logic2(input);
        if (result != 0) {
            System.out.println("The first non-repetitive character is: " + result);
        } else {
            System.out.println("No non-repetitive character found.");
        }
    }

    public static char findFirstNonRepetitiveChar(String str) {
        if (str == null || str.isEmpty()) {
            return 0; // Return 0 as a default if input is invalid
        }

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0; // Return 0 if no non-repetitive character is found
    }

    public static char logic2(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,     // preserve insertion order
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse((char) 0);
    }
}
