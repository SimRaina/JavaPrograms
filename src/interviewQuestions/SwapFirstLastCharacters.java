package interviewQuestions;

/**
 * @author Simran
 *
 */
public class SwapFirstLastCharacters {
	public static void main(String[] args) {
		String str="it is java program";
		System.out.println(count(str));
	}
	static String count(String str) {
		char[] ch=str.toCharArray();
		for (int i=0;i<ch.length;i++) {
			int k=i;
			while (i<ch.length && ch[i]!=' ') {
				i++;
			}
			char temp=ch[k];
			ch[k]=ch[i-1]; // i-1 = last character
			ch[i-1]=temp;
		}
		return new String(ch);
	}
}
