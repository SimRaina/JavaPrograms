package interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindYoungest {

	public static void main(String[] args) {
		// Creating a HashMap to store student names and their ages
        HashMap<String, Integer> students = new HashMap<>();
        
        // Adding student data
        students.put("Alice", 20);
        students.put("Bob", 19);
        students.put("Charlie", 22);
        students.put("David", 18);
        students.put("Emma", 21);

        // Finding the youngest student
        String youngestStudent = null;
        int minAge = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() < minAge) {
                minAge = entry.getValue();
                youngestStudent = entry.getKey();
            }
        }

        // Printing the youngest student name
        System.out.println("The youngest student is: " + youngestStudent + " (Age: " + minAge + ")");
    }	
}

