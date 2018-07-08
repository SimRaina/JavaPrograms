package Concept;

class AA{
void callme(){
System.out.println("Inside A's callme method");
}
}
class BB extends AA{
void callme()
{
System.out.println("Inside B's callme method");
}
}
class C extends AA{
void callme(){
System.out.println("Inside C's callme methos");
}
}
class InheritDispatch{
public static void main(String args[]){
AA a=new AA();
BB b=new BB();
C c=new C();
AA r;
r=a;
r.callme();
r=b;
r.callme();
r=c;
r.callme();
}
}
