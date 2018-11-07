package Strings;

public class StringSwap {

	
	public static void main(String args[]) {
		
		String a="Hello";
		String b="World";
		System.out.println("Value of a before swap: "+a);
		System.out.println("Value of b before swap: "+b);
		
		a=a+b;  //First Step "HelloWorld"
		
		b=a.substring(0,a.length()-b.length()); //Second Step
		
		a=a.substring(b.length()); //Third Step
		
		System.out.println("Value of a after swap: "+a);
		System.out.println("Value of b after swap: "+b);
	}
}
