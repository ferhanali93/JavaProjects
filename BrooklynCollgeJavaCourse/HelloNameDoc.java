package BrooklynCollgeJavaCourse;

import java.util.Scanner;

/** class HelloName shows how to use the Scanner to read in a name
 * and says hello to the person
 */
public class HelloNameDoc {
    /** main does all the work in this program */
    public static void main(String[] args) {
        String firstName, lastName; // 2 string variables
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        firstName = input.next();
        lastName = input.next();
        System.out.println("Hello " + firstName + " "
                + lastName + "!"); // display Hello with name
        input.close();
    }

}