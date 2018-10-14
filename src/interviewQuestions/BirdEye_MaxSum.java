package interviewQuestions;

import java.util.Arrays;
import java.util.LinkedList;

public class BirdEye_MaxSum {

	
	public static void main(String args[]) {
		BirdEye_MaxSum obj=new BirdEye_MaxSum();
		obj.logic();
		obj.logic1();
	}
	
	/**/	
	
	public void logic() {
		int[] array = {6,2,5,3,10,9};
		Arrays.sort(array);
		int c=array[array.length-1]+array[array.length-2];
		System.out.println("Max Sum is: "+c);
	}
	
	public void logic1() {
		int[] array = {7,2,5,9,2,3};
		LinkedList<Integer> ll=new LinkedList<>();
		// Find the max sum by adding adjoining values
		int i;
		for (i=0;i<=4;i++) {
			int c=array[i]+array[i+1];
			ll.add(c);
			System.out.println(ll);
			}
		}
	
	}
	
