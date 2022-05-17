package day10_scanner;
import java.util.Scanner;

public class Revenue {
    /*
    write a program that asks the user to enter a price and quantity
    calculate the revenue
    revenue = price * quantity
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // make scanner variable

        // popular names for scanner: scan, input, scanner, keyboard
        System.out.println("Enter the price of the item");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();
        double revenue = price * quantity;
        System.out.println(revenue);

        // System.out.println("The revenue is $" + (price * quantity)) ;
        // System.out.println("revenue is $" + (scan.nextDouble() * scan nextInt()));
    }
}
