package BrooklynCollgeJavaCourse;

public class Expressions {
    public static void main(String[] args) {
    int itemsOrdered, qtyOnHand;
    itemsOrdered = 3;
    qtyOnHand = 300;
        System.out.println("My first order: " + itemsOrdered);
        qtyOnHand = qtyOnHand -itemsOrdered;
        System.out.println("Items left on hand: " + qtyOnHand);
    // Let say i want to order on more
        itemsOrdered = itemsOrdered + 1;
        System.out.println("My New order is: " + itemsOrdered);
        // print what quantity you have left on hand
        qtyOnHand = qtyOnHand - itemsOrdered;
        System.out.println("Items left on hand: " + qtyOnHand);



    }
}
