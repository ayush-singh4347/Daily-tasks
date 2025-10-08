package com.mypackage;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  
        System.out.println("a - b = " + (a - b));  
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b));  
        System.out.println("a % b = " + (a % b)); 

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));  
        System.out.println("a != b: " + (a != b));  
        System.out.println("a > b: " + (a > b));    
        System.out.println("a < b: " + (a < b));    

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > 5) && (b < 10): " + ((a > 5) && (b < 10))); // true
        System.out.println("(a < 5) || (b < 10): " + ((a < 5) || (b < 10))); // true
        System.out.println("!(a == b): " + !(a == b));                      // true

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a;      
        c += b;         
        System.out.println("c after c += b: " + c);  
        c *= 2;         
        System.out.println("c after c *= 2: " + c);  

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int x = 5;
        System.out.println("x = " + x);           // 5
        System.out.println("++x = " + (++x));     // 6 (pre-increment)
        System.out.println("x++ = " + (x++));     // 6 (post-increment)
        System.out.println("x = " + x);           // 7
        System.out.println("--x = " + (--x));     // 6
        System.out.println("x-- = " + (x--));     // 6
        System.out.println("x = " + x);           // 5
        System.out.println();
        System.out.println();

	}

}
