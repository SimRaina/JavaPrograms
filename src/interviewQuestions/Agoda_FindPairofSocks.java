/*
 Create a function that accept 2 parameters
a.	n => number of socks (pieces) in stock
b.	ar => array that contains the color of each sock
Objective: 
The function must return the number that indicate how many PAIRS of socks are available 

 */

package interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Agoda_FindPairofSocks{

      public static void main(String args[]){

       int n=12;

       int[] arr = {1,2,1,2,1,2,1,2,3,4,4,4};

       findPair(n, arr); //Need to work on return aspect

      }

      static void findPair(int m, int[] arr1){


Map<Integer, Integer> map=new HashMap<>();

for (int a: arr1)
{
if (!(map.containsKey(a))){
map.put(a,1);
}
else 
{
map.put(a,map.get(a)+1);

}
}

Set<Entry<Integer,Integer>> entryset=map.entrySet();
for(Entry<Integer,Integer> entry:entryset){
 
	int n=entry.getValue()/2;
	if (n!=0)
		{
			System.out.println(n + " pair of"+ entry.getKey());
		}
 }
}
}
