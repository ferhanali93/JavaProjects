package BrooklynCollgeJavaCourse;


import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        double celsius;
        System.out.println("Enter degrees celsius: ");
        // Read in user input
        Scanner sc = new Scanner(System.in); // Gives a scanner object to help read
        celsius = sc.nextDouble();
        double faran = 9/5.0 * celsius + 32;
        System.out.println("Celsius " + celsius + " is equal to " + faran + " Fahrenheit ");

        // Try wrong input

        System.out.println("Enter an integer ");
        int num = sc.nextInt();
        System.out.println("num is " + num);
        /*
        when it ask for enter your integer and you put in decimal 98.8
        it will gives u error because it will only store integer values
        so the system will crash i.e. runtime exception.
         */

        // Lets do weight into lbs and convert it into kg

        double weightInPound;
        System.out.println("Enter your weight ");
        weightInPound = sc.nextDouble();
        double weightInKg = weightInPound/2.2046;
        System.out.println("Weight in pounds " + weightInPound + " is equal to " + weightInKg + " in kg.");







    }
}