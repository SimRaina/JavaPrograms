/**
 * 
 */
package Concept;

/**
 * @author Simran
 *
 */
public class Singleton {

	
	public static void main(String[] args) {
	ABC obj1 = ABC.getInstance();
	ABC obj2 = ABC.getInstance();
	ABC obj3 = ABC.getInstance();
	System.out.println(obj1);
	System.out.println(obj2);
	System.out.println(obj3);
	}
}

class ABC{
	static ABC obj=new ABC();
	private ABC() {
		System.out.println("This is Private Constructor");	
	}
	public static ABC getInstance() {
		return obj;
	}
}

