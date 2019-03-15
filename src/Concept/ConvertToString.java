package Concept;

public class ConvertToString 
{ 
  public static void main(String args[]) 
  {
	  ConvertToString cts= new ConvertToString();
	  cts.firstWay();
	  cts.secondWay();
	  cts.thirdWay();
	  
  }
  
  public void firstWay() {
	  
		    int a = 1234; 
		    int b = -1234; 
		    String str1 = Integer.toString(a); 
		    String str2 = Integer.toString(b); 
		    System.out.println("String str1 - first way -" + str1);  
		    System.out.println("String str2 - first way -" + str2); 
		  
  }
  
  public void secondWay() {
	  
	      int c = 1234; 
	      String str3 = String.valueOf(c); 
	      System.out.println("String str3 - second way -" + str3); 
	    
  }
  
  public void thirdWay() {
	  
	      int d = 1234; 
	      Integer obj = new Integer(d); 
	      String str4 = obj.toString(); 
	      System.out.println("String str4 - third way -" + str4); 
	    
  }
  
}  


