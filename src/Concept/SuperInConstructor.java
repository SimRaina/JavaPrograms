package Concept;

//3. super() with constructors 
/* superclass Person */
class Person1 
{ 
 Person1() 
 { 
     System.out.println("Person class Constructor"); 
 } 
} 

/* subclass Student extending the Person class */
class Student1 extends Person1
{ 
 Student1() 
 { 
     // invoke or call parent class constructor 
     super(); 

     System.out.println("Student class Constructor"); 
 } 
} 

/* Driver program to test*/
class SuperInConstructor
{ 
 @SuppressWarnings("unused")
public static void main(String[] args) 
 { 
     Student1 s = new Student1(); // Invoked student constructor + person constructor
 } 
} 

/* Output:
Person class Constructor
Student class Constructor */
