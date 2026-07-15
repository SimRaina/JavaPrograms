package interviewQuestions;

import java.util.Map;
import java.util.Map.Entry;

public class FindYoungest {

	public static void main(String[] args) {
        test1();
        // test2();
    }

    static void test1() {
		// Creating a HashMap to store student names and their ages
        Map<String, Integer> students = Map.of(
            "Alice", 20,
            "Bob", 19,
            "Charlie", 22,
            "David", 18,
            "Emma", 21
        );

        // Finding the youngest student
        String youngestStudent = null;
        int minAge = Integer.MAX_VALUE;

        for (Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() < minAge) {
                minAge = entry.getValue();
                youngestStudent = entry.getKey();
            }
        }
        // Printing the youngest student name
        System.out.println("The youngest student is: " 
        + youngestStudent + " (Age: " + minAge + ")");
    }

    static void test2() {
        // Creating a HashMap to store student names and their ages
        Map<String, Integer> students = Map.of(
        "Alice", 20,
        "Bob", 19,
        "Charlie", 22,
        "David", 18,
        "Emma", 21);

        // Finding the youngest student using Streams
        students.entrySet()
                .stream()
                .min(Entry.comparingByValue())
                .ifPresent(youngest ->
                        System.out.println("The youngest student is: "
                        + youngest.getKey() 
                        + " (Age: " + youngest.getValue() + ")"));
    }
}

