/*

This is me
siht si em
 
 */
package interviewQuestions;
 

public class BirdEyeSentenceReverse {

	public static void main(String[] args) {
		 
		BirdEyeSentenceReverse obj=new BirdEyeSentenceReverse();
		obj.logic1();
	}
	
	public void logic1() {
		
		String str="This is me";
		String s="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			int k=i;
			
			while (i<ch.length && ch[i]!=' ') {
				i++;
			}
			for(int j=i-1;j>=k;j--) {
				s=s+str.charAt(j);  // corrected as part of Skype interview with AlertEnterprise
				}
			s=s+" ";
		}
		System.out.print(s);
	}

}
