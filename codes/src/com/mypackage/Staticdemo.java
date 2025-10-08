package com.mypackage;

class Student {
    static String college = "VIT";  
    String name;

    Student(String name) {
        this.name = name;
    }
}
public class Staticdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Ayush");
        Student s2 = new Student("Rahul");
        System.out.println(s1.college); 
        System.out.println(s2.college);
	}

}
