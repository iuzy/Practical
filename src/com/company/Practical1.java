
package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Practical1 {

    static void Assignment1() {

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

        System.out.println("Number " + "'" + a + "'" + (a % 2 == 0 ? " is even" : " is odd"));
        System.out.println("Number " + "'" + b + "'" + (b % 2 == 0 ? " is even" : " is odd"));

        //Check if the numbers are positive or negative

        System.out.println("Number " + "'" + a + "'" + (a < 0 ? " is negative" : " is positive"));
        System.out.println("Number " + "'" + b + "'" + (b < 0 ? " is negative" : " is positive"));

        //Check if the numbers are more or less than 100

        System.out.println("Number " + "'" + a + "'" + (a < 100 ? " is less than 100" : " is equal or more than 100"));
        System.out.println("Number " + "'" + b + "'" + (b < 100 ? " is less than 100" : " is equal or more than 100"));
    }

    static void Assignment2() {

        Scanner input = new Scanner(System.in);
        System.out.println("What time it is (in full hours)?");
        int time = input.nextInt();

        if (time <= 12 && time >= 0) {
            System.out.println("Good Morning Sunshine!");
        } else if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon. Work Hard!");
        } else if (time >= 20 && time <= 24) {
            System.out.println("Good Evening. Get some rest!");
        } else {
            System.out.println("Enter valid hours!");
        }
    }

    static void Assignment3() {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a day: ");
        short day = input.nextShort();
        System.out.println("Choose a month: ");
        short month = input.nextShort();
        System.out.println("Choose a year: ");
        short year = input.nextShort();
        System.out.println("Please select the date formatting. 1 - YYYY/MM/DD, 2 - YYYY.MM.DD: ");
        short format = input.nextShort();

        String sep1 = ("/");
        String sep2 = (".");

        if ((day < 1 || day > 31) || (month < 1 || month > 12) || (year < 1900 || year > 9999)) {
            System.out.println("There is a problem with your chosen day, month or year!");
        } else if (format == 1) {
            System.out.println("Your chosen date is " + year + sep1 + month + sep1 + day);
        } else if (format == 2) {
            System.out.println("Your chosen date is " + year + sep2 + month + sep2 + day);
        } else {
            System.out.println("Choose a correct format - either 1 or 2 !");
        }
    }

    static void Assignment4_1() {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a day: ");
        int day = input.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_YEAR, day);
        System.out.println("The day number is: " + day);
        int month = cal.get(Calendar.MONTH);
        if (month == 0) {
            System.out.println("It is January!");
        } else if (month == 1) {
            System.out.println("It is February!");
        } else if (month == 2) {
            System.out.println("It is March!");
        } else if (month == 3) {
            System.out.println("It is April!");
        } else if (month == 4) {
            System.out.println("It is May!");
        } else if (month == 5) {
            System.out.println("It is June!");
        } else if (month == 6) {
            System.out.println("It is July!");
        } else if (month == 7) {
            System.out.println("It is August!");
        } else if (month == 8) {
            System.out.println("It is September!");
        } else if (month == 9) {
            System.out.println("It is October!");
        } else if (month == 10) {
            System.out.println("It is November!");
        } else {
            System.out.println("It is December!");
        }
    }

    static void Assignment5() {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose how many working hours:  ");
        int workingHourInDay = input.nextInt();

        int salary1 = workingHourInDay * 10;
        int salary2 = 80 + (workingHourInDay-8)*15;

        if (workingHourInDay < 0 || workingHourInDay > 24) {
            System.out.println("You must be a superhuman, but please choose between 1 and 24 hours");
        } else if (workingHourInDay <= 8) {
            System.out.println("Your salary is: " + salary1);
        } else {
            System.out.println("Your salary is: " + salary2);
        }
    }

    public static void main(String[] args) {

        //Assignment1();
        //Assignment2();
        //Assignment3();
        //Assignment4_1();
        //Assignment5();


    }
}
