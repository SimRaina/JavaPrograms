package interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindYoungest {

		public static void main(String[] args) {
			
		  String str="ALERTENTERPRISE";
		  findVowels(str);
		}
		
		static void findVowels(String s)
		{
			
			Map<Character,Integer> map= new HashMap<>();
			
			for (int i=0;i<s.length();i++) {
				
				Character c=s.charAt(i);
				
				if((c.equals('A')) || (c.equals('E')) || (c.equals('I')) || (c.equals('O')) || (c.equals('U'))) {
				/* equals can work on Character and not primitive type char
				so created Character ch but toCharArray cannot be invoked on Character so used charAt()*/	
				map.put(c, map.getOrDefault(c,0)+1);
			}
		}
			
			for (Entry<Character,Integer> entry: map.entrySet()){
				
				System.out.println("Character: " + entry.getKey() + " occured in the string: " + entry.getValue() + " times" );
			}
		}
	}

