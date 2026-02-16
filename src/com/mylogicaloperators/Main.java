/**
 *  Java program to demonstrate logical OR operator.
 */

package com.mylogicaloperators;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        //Creating string variable with name of organization.
        String name = "Google";

        // Condition to get access to webpage.
        if (name.equals("Google") | name.equals("Microsoft")) {

            System.out.println("User permitted. "); // Output: User permitted.

        } else {

            System.out.println("User denied.");

        }

        //Creating string variable with name of organization.
        String name1 = "Microsoft";

        // Condition to get access to webpage.
        if (name1.equals("Google") | name1.equals("Microsoft")) {

            System.out.println("User permitted. "); // Output: User permitted.

        } else {

            System.out.println("User denied.");

        }

        //Creating string variable with name of organization.
        String name2 = "Apple";

        // Condition to get access to webpage.
        if (name2.equals("Google") | name2.equals("Microsoft")) {

            System.out.println("User permitted. ");

        } else {

            System.out.println("User denied."); // Output: User denied.

        }
    }
}