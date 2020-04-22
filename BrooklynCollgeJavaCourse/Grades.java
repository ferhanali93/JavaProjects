package BrooklynCollgeJavaCourse;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
       String name;
       int idNum;
       char grade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student 's ID number: ");
        idNum = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student's name: ");
        name = sc.nextLine();
        System.out.println("You entered: " + idNum + " " + name);
         grade = 'A';
        System.out.println("Your Grade is: " + grade);
    }
}
