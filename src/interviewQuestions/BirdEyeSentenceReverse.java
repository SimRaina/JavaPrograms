/*

This is me
siht si em
 
 */
package interviewQuestions;
 

public class BirdEyeSentenceReverse {

	public static void main(String[] args) {
		 
		BirdEyeSentenceReverse obj=new BirdEyeSentenceReverse();
		obj.logic2();
	}
	
	public void logic2() {
		
		String str="This is me";
		String s1="";
		String s2="";
		String s="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			int k=i;
			
			while (i<ch.length && ch[i]!=' ') {
				i++;
			}
			for(int j=i-1;j>=k;j--) {
				s=Character.toString(ch[j]);
				s1=s1+s;
				}	
		}
		System.out.print(s1);
	}

}
