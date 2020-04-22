package LearnJavaTheHardWay;
import java.util.Scanner;
/*
Imagine Grand mother is a programmer and she will only allowed you date her
grand child if your age is between 25 and 35, and have income more than 50k
and cute more than 8.5 on the scale 0-10
 */
public class ShallowGrandmother {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        double yourIncome, howCuteYouAre;
        boolean allowedToDate;

        System.out.println( "Enter your Age! " );
        age = keyboard.nextInt();

        System.out.println( "Enter your yearly Income: " );
        yourIncome = keyboard.nextDouble();

        System.out.println( "How cute you are, on the scale of 0.0 to 10.0? " );
        howCuteYouAre = keyboard.nextDouble();

        allowedToDate = (age >= 25 && age < 35 && (yourIncome > 60000 || howCuteYouAre > 8.5));
        System.out.println( "Allowed to date my grandchild? " + allowedToDate);
    }
}