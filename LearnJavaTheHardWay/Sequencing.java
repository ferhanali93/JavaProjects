package LearnJavaTheHardWay;
import java.util.Scanner;
public class Sequencing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double price = 0, salesTax, total;

        System.out.print( "How much is the purchase price? " );
        price = keyboard.nextDouble();
        // Initialize  the price first then calculate sales Tax and total price.

        salesTax = price * 0.0825;
        total = price + salesTax;

        // NOTE: Variables does not hold formula
        // Variables Only hold Values.

        System.out.println( "Item price:\t" + price );
        System.out.println( "Sales tax:\t" + salesTax);
        System.out.println( "Total cost:\t" + total);
    }
}