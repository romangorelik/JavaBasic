package com.pluralsight.getorganized;

public class Main {

    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) longVal;
        short result2 = (short) (byteVal - longVal);
        double result3 = longVal - doubleVal;
        long result4 = (long) (shortVal - longVal + floatVal + doubleVal);


        System.out.println("Success");

        // Different types

        float students = 0.0f;
        float rooms = 4.0f;

        if (students > 0.0f) {
            if (rooms > 0.0f) {
                System.out.println(students / rooms);
            }
        } else {
            System.out.println("No students");
        }

        int a =20, b = 14, c = 5;

        if (a > b && b > c) {
            System.out.println("a is greater than c");
        }

        int students1 = 150;
        int rooms1 = 0;

        if (rooms1 > 0 && students1/rooms1 > 30) {
            System.out.println("Crowded!");
        }

        // If/else statements

    }

}
