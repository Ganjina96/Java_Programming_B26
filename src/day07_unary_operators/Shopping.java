package day07_unary_operators;

public class Shopping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("we pick up 1 water bottle");
        System.out.println("how many items in the cart " + ++numberOfItems);
        // preincrement so the number of items increases right away so it is printed in this line
        price = price + 2.5; // take price value of 0 and add 2.5 and reassign to the price variable
        System.out.println("we pick up 2 eggs");
        System.out.println("how many items in the cart " + ++numberOfItems);
        System.out.println("how many items in the cart " + ++numberOfItems);

        System.out.println(numberOfItems++);


    }
}
