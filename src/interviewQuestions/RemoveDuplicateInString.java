package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Simran
 *
 */
public class RemoveDuplicateInString {

	
	public static void main(String[] args) {
	String str="Preet";
	System.out.println("Length of:"+str+" is:"+str.length());
	String strnew=removeDuplicates(str);
	System.out.println("Length of:"+strnew+" is:"+strnew.length());
	}
	 
	public static String removeDuplicates(String str) {
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
		Character c=str.charAt(i);
		
		if(!set.contains(c)) {
			set.add(c);
			sf.append(c);
		}
	}
	return sf.toString();	
}
}

