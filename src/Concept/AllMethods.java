/**
 * 
 */
package Concept;

/**
 * @author Simran
 *
 */
class AllMethods{
	int x, y;
		void fun(){
				System.out.println("fun method");
				}
		
		void fun1(int a,int b){  //Pass value
			x=a;    //local variable
			y=b;
			int s=a+b;
			System.out.println(s);
			int f1=fun2(s); //calling third method and passing value
			System.out.println(f1);
		}
		
		int fun2(int z){  // return type is integer
			z=z+5;
			return z;  // return should be last statement in the method
		}
		
public static void main(String args[]){
	AllMethods e=new AllMethods();
	e.fun();
	e.fun1(5,3);
	}
}
