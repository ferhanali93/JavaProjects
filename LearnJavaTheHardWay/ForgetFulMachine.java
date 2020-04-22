package LearnJavaTheHardWay;

 import java.util.Scanner;
public class ForgetFulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "What is your First Name?" );
        keyboard.next();

        System.out.println( "What is your Last Name?" );
        keyboard.next();

        System.out.println( "What is your Date of Birth" );
        keyboard.next();

        System.out.println( "What is your zip code? " );
        keyboard.nextInt();

        System.out.println( "What is your favorite vacation spot?" );
        keyboard.next();

        /*
         In this exercise, you learned how to pause the program and
         allow the human to type in something. But what happened to what was
         typed? When you typed in the answer “Ferhan” for the first question,
         where did that answer go? Well, it was thrown away right after it was
         typed because we didn’t put any instructions to tell the Scanner object
         where to store it. So that is the topic of today’s lesson.
         */




    }
}
