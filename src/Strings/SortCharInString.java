package Strings;

import java.util.Arrays;

/**
 * @author Simran
 *
 */
public class SortCharInString {

	
	public static void main(String[] args) {
	String str="java";
	char ch[]=str.toCharArray();
	Arrays.sort(ch);
	String sortedstr=new String(ch);
	System.out.println(sortedstr);
	}

}
