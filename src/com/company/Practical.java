
package com.company;
import java.util.Scanner;

public class Practical {

    public static void main(String[] args) {

        //User enters two digits
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers (must be between -32768 to 32767)!");
        System.out.println("First: ");
        short a = input.nextShort();
        System.out.println("Second: ");
        short b = input.nextShort();
        System.out.println("You entered " + a + " and " + b);

        //Check the biggest and the smallest number

        if (a > b) {
            System.out.println("The biggest is: " + a + ", the small one: " + b);
        } else if (a < b) {
            System.out.println("The biggest is: " + b + ", the small one: " + a);
        } else {
            System.out.println("They look like the same!");
        }

        //Check whether they even or odd numbers

        System.out.println("Number " +"'"+ a + "'" + (a % 2 == 0 ? " is even":" is odd"));
        System.out.println("Number " +"'"+ b + "'" + (b % 2 == 0 ? " is even":" is odd"));

       //Check if the numbers are positive or negative

        System.out.println("Number " +"'"+ a + "'" + (a < 0 ? " is negative":" is positive"));
        System.out.println("Number " +"'"+ b + "'" + (b < 0 ? " is negative":" is positive"));

        //Check if the numbers are more or less than 100

        System.out.println("Number " +"'"+ a + "'" + (a < 100 ? " is less than 100":" is equal or more than 100"));
        System.out.println("Number " +"'"+ b + "'" + (b < 100 ? " is less than 100":" is equal or more than 100"));

    }
}
