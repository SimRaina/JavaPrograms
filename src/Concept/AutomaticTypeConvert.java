package Concept;

public class AutomaticTypeConvert 
{ 
    public static void main(String[] args) 
    { 
        int i = 100;  
          
        //automatic type conversion or Widening
        // Byte->Short->Int->Long->Float->Double
       
        long l = i;  
          
        //automatic type conversion 
        float f = l;  
        System.out.println("Int value "+i); 
        System.out.println("Long value "+l); 
        System.out.println("Float value "+f); 
    } 
} 
