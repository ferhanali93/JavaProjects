package BrooklynCollgeJavaCourse;
/*
 * This example source code demonstrates the use of
 * random() method of Math class
 * Generating a
 * random number from 1 to 10
 * also, Math.round() and example of forced conversion
 * long data type
 */
public class RandomNum {
    public static void main(String[] args) {
        // Define the range here
       int  max = 10;
        int min = 1;
        int range = max - min + 1;
        // generate random number from 1 to 10
        int rand = (int) (Math.random()* range +  min);
        System.out.println("Random number is: " + rand);
    }
}
