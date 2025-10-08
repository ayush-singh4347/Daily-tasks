package com.mypackage;

public class control_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;

        // 1. if-else 
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // 2. switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // . for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }

        // 4. while loop
        System.out.println("While loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        // 5. do-while loop
        System.out.println("Do-while loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 3);

        // 6. break statement
        System.out.println("Break example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        // 7. continue statement
        System.out.println("Continue example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

	}

}
