package Strings;

public class RemoveJunk {
	
	public static void main(String args[]) {
		
		String s="一周有七天。This is Chinese 2";
		s=s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);
	}

}
