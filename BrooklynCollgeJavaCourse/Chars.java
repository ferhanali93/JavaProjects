package BrooklynCollgeJavaCourse;

/* 9/9/2019
 Other data types:
 boolean -- true or false
 char
 String -- NOT a PDT, rather a programmer defined data type which is part of
 Java's API. (e.g. System, Math, String, Scanner)
 */

public class Chars {
    public static void main(String[] args) {
        // use boolean for flags
        boolean isOn=true;
        System.out.println("isOn="+isOn);
        char firstInitial;  // this declares a variable that can hold a single character
        firstInitial = 'A'; // use single quotes for character literal
        // firstInitial = "A"; type mismatch since "A" is a String
        System.out.println("Your first initial is: " + firstInitial);
        firstInitial++;
        System.out.println("Your first initial is: " + firstInitial);
        firstInitial=7; // 7 is the UNICODE value for BELL
        //System.out.println("Your first initial is: " + firstInitial); // pgm should ding
        // suppose I want a variable to store a first name
        String firstName="Alice";
        // assign the first char in firstName to firstInitial
        firstInitial = firstName.charAt(0);
        System.out.println("Name is: " + firstName + " Init is: " + firstInitial);
    }
}
