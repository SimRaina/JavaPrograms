package sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollections {

	public static void main(String args[]) {
		   // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("India");
        al.add("Australia");
        al.add("England");
        al.add("US");
        al.add("Canada");

        Collections.sort(al);
 
        System.out.println("Sorted" + al);
	}
}
