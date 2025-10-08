package com.mypackage;

class Students {
    String name;
    int age;

    // Default constructor
    Students() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Students(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
       
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Using default constructor
        Students s1 = new Students();
        s1.display();

        // Using parameterized constructor
        Students s2 = new Students("Ayush", 22);
        s2.display();
    }
}
