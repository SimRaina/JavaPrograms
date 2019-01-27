package Concept;

/**
 * @author Simran
 *
 */
class A{
		public void eat(){
		System.out.println("eat of A");
		}
}

class B extends A{
		public void eat(){
		System.out.println("eat of B");
		}
		void eat1(){
		System.out.println("eat1 of B");
		}
}

class InheritConcept{
	public static void main(String args[]){
		A obj1=new B(); //Reference of A
		B obj2=new B();
		A obj3=new A();
		obj2.eat();
		obj1.eat();
		obj3.eat();
		// obj1.eat1(); Parent reference child's method - will give error
	}
}

