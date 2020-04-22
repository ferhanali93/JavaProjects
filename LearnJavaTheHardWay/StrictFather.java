package LearnJavaTheHardWay;
import java.util.Scanner;
public class StrictFather {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age, income;
        double howCuteYouAre;
        boolean allowed;

        System.out.print( "Enter your Age! " );
        age = keyboard.nextInt();

        System.out.print( "What is your yearly income: " );
        income = keyboard.nextInt();

        System.out.print( "On the scale of 0.0 to 10.0, How cute you are? " );
        howCuteYouAre = keyboard.nextDouble();

        allowed = (age >= 25 && age < 35 && (income > 60000 && howCuteYouAre > 8.5));
        System.out.print( "Are you allowed to date my daughter? " + allowed);
    }
}
