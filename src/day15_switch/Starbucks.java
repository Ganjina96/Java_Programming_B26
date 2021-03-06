package day15_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Name of the size");
        String size = input.next();
        double price = 0;
        int calories = 0;
        boolean validOrder = true; // by making it true i pick all orders are valid when I have an invalid order I will change the value

        switch (size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                validOrder = false;
                System.out.println("We dont have that size");
        }
        if (validOrder) {
            System.out.println("Your order for a " + size + " coffee is $" + price + " and has " + calories + " calories");
        }
    }
}
