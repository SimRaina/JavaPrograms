package Concept;

public class CallByValueCallByRef {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValueCallByRef obj=new CallByValueCallByRef();
		int x=10;
		int y=20;
		int z=obj.testSum(x,y); // Pass By Value
		System.out.println("Pass By Value: "+z);
		
		//Before Swap
		obj.p=10;
		obj.q=20;
		
		obj.testSwap(obj);
		
		//After Swap
		System.out.println("Pass By Ref: Swapped Values are: "+obj.p+" and "+obj.q);

	}
	
	public int testSum(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public void testSwap(CallByValueCallByRef t) {
		
		int temp = t.p;
		t.p = t.q;
		t.q = temp;
	}
}
