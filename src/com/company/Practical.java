
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
        } if (a < b) {
            System.out.println("TThe smallest is: " + a + ", the big one: " + b);
        } else {
            System.out.println("They look like the same!"); //fixme parādās vienmēr pie negatīviem!!!
        }

        //Check whether they even or odd numbers

        System.out.println("Number " +"'"+ a + "'" + (a % 2 == 0 ? " is even":" is odd"));
        System.out.println("Number " +"'"+ b + "'" + (b % 2 == 0 ? " is even":" is odd"));

       //Check if the numbers are positive or negative

        System.out.println("Number " +"'"+ a + "'" + (a < 0 ? " is negative":" is positive"));
        System.out.println("Number " +"'"+ b + "'" + (b < 0 ? " is negative":" is positive"));

        //Check if the numbers are more or less than 100

        if (a < 110) {
            System.out.println(a + " is less than 100");
        } else {
            System.out.println(a + " is not less than 100");
        }

        if (b < 100) {
            System.out.println(b + " is less than 100");
        } else {
            System.out.println(b + " is not less than 100");
        }




/*

Kā savienot abus? Ex. "There are no odd/even numbers"
● Verify if there are any variables which are odd (uneven). Print out information in the console.
● Verify if there are any variables which are even. Print out information in the console.

 */

    }
}
