package Concept;

public class ComparisonConcept {

	public static void main(String args[]){
		String str1=new String("Simran");
		String str2=new String("Simran");
		String str3=new String("Preet");
		
		String str4="Simran";
		
		//Reference/Address Comparison
		System.out.println(str1==str2); //False
		System.out.println(str1==str3); //False
		System.out.println(str2==str3); //False
		
		//Content Comparison
		System.out.println("Equals: "+str1.equals(str2)); //True 
		System.out.println("Equals: "+str1.equals(str3)); //False
		System.out.println("Equals: "+str2.equals(str3)); //False
		
		System.out.println(str1.equals(str4)); //True
		System.out.println(str1==str4); //True
		
		
	}
}
