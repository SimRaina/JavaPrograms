package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementArray2 {

	
	public static void main(String[] args) {
	String duplicates[]=new String[] {"Java", "Spring", "Hibernate", "Java", "Spring"};
	Map<String,Integer> map=new HashMap<>();
	
	for(String s: duplicates) {
		Integer count=map.get(s);
		if(count==null){
			map.put(s,1);
			}
		else {
			map.put(s, ++count);
		}
		}
	
	Set<Entry<String,Integer>> entrySet=map.entrySet();
    for(Entry<String,Integer> entry: entrySet) {
    	if(entry.getValue()>1) {
    		System.out.println(entry.getKey()+" is duplicate and occurs "+entry.getValue()+" times");
    	}
    }
	}
	
   }
