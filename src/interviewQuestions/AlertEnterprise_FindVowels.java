package interviewQuestions;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AlertEnterprise_FindVowels {

		public static void main(String[] args) {
			
			
			String str="ALERTENTERPRISE";
			
	      findVowels(str);
		}
		
		static void findVowels(String s)
		{
			
			Map<Character,Integer> map= new HashMap<>();
			Map<Character,Integer> map1=new HashMap<>();
			//ArrayList<Integer> list=new ArrayList<>();
			//Character ch[]=s.toCharArray();   
			
			for (int i=0;i<s.length();i++) {
				
				Character c=s.charAt(i);
				
				if((c.equals('A')) || (c.equals('E')) || (c.equals('I')) || (c.equals('O')) || (c.equals('U'))) {
				// Tricky Part: equals can work on Character and not primitive type char
					// so created Character ch but toCharArray cannot be invoked on Character
					// so used charAt()
					//list.add(i);
				if(!(map.containsKey(c))) {
					map.put(c, 1);
					map1.put(c, i);
				}
				else 
					map.put(c, map.get(c)+1);
				map1.put(c, i);
			}
		}
		
		Set<Entry<Character,Integer>> entryset=map.entrySet();	
			
			for (Entry<Character,Integer> entry: entryset){
				
				System.out.println("Character: " + entry.getKey() + " occured in the string: " + entry.getValue() + " times" );
			}
			/* for (int i = 0; i<list.size();i++) {
				System.out.println("Location of " + i + " vowel " + list.get(i));
			} */
			
			entryset=map1.entrySet();
			for (Entry<Character,Integer> entry1: entryset) {
				System.out.println("Character: " + entry1.getKey() + " occured at: " + entry1.getValue());
			}
		}

	}

