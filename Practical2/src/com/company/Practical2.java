package com.company;

import java.util.Scanner;

public class Practical2 {

    static Scanner input = new Scanner(System.in);

    static void Assignment1() {


        System.out.println("What day is it?");
        int day = input.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day");
                break;
            case 6:
            case 7:
                System.out.println("It is a holiday");
                break;
            default:
                System.out.println("Please enter a valid day!");
        }
    }

    static void Assignment2() {

        System.out.println("Type in your grade (From A to F):");
        char grade = input.next().charAt(0);

        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("This kind of grade does not exist, try again!");
        }
    }

    static void Assignment3() {

        System.out.println("Enter the first number, a:");
        short a = input.nextShort();
        System.out.println("Enter the second number, b:");
        short b = input.nextShort();
        System.out.println("Choose the option:\n" +
                " ‘+’ sum both elements;\n" +
                " ’-’: do subtraction;\n" +
                " ’/’: do dividing;\n" +
                " ‘*’: do multiplication;\n" +
                " ‘%’: get remainder when the first element is divided by the second element;\n" +
                " ‘p’: print out both elements;\n" +
                " ‘b’: verify which element is bigger;\n" +
                " ‘s’:verify which element is smaller;);\n");
        char option = input.next().charAt(0);

        switch (option) {
            case '+':
                System.out.println("Result is a + b: " + (a + b));
                break;
            case '-':
                System.out.println("Result is a - b: " + (a - b));
                break;
            case '/':
                System.out.println("Result is a / b: " + (a / b));
                break;
            case '*':
                System.out.println("Result is a * b: " + (a * b));
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Please don't divide with zero!");
                } else {
                    System.out.println("Result is a % b: " + (a % b));
                }
                break;
            case 'p':
                System.out.println("Both elements are: " + a + " and " + b);
                break;
            case 'b':
                if (a > b) {
                    System.out.println("a is bigger than b");
                } else if (b > a) {
                    System.out.println("b is bigger than a");
                } else {
                    System.out.println("a and b are the same!");
                }
                break;
            case 's':
                if (a < b) {
                    System.out.println("a is smller than b");
                } else if (b < a) {
                    System.out.println("b is smaller than a");
                } else {
                    System.out.println("a and b are the same!");
                }                break;
            default:
                System.out.println("Result is ");
        }
    }

    public static void main(String[] args) {

        //Assignment1();
        //Assignment2();
        //Assignment3();

    }

}