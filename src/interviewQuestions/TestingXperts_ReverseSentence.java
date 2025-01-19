package interviewQuestions;


public class TestingXperts_ReverseSentence {

	public static void main(String[] args) {
		String str="This is my name";
		
		System.out.println("Reverse is=> " + findreverse(str));

	}
	
	static String findreverse(String s) {
		
		 String res="";
		 String[] words = s.split(" "); 
		 for (int i = words.length-1; i >= 0; i--) { 
			 res = res + words[i] + " "; 
		 }
		 return String.join(" ", res);
	}
}

