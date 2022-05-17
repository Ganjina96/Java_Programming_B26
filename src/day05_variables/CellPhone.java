package day05_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "apple";
        String model = "iPhone 12 Pro Max";
        String color = "gold";
        double price = 1999.99;
        int storage = 120;
        boolean hasCamera = true;
        char sim = 'C';

        System.out.println("I have an " + brand + " " + model + " in " + color + " color " + " it cost me " + "$" + price + " and it has " + storage + " GB storage. " + " It has a camera? " + hasCamera + " with a " + sim + " sim");

        // approach 2 w/ String variable

        String fullMessage = "I have an " + brand + " " + model + " in " + color + " color " + " it cost me " + "$" + price + " and it has " + storage + " GB storage. " + " It has a camera? " + hasCamera + " with a " + sim + " sim";

        System.out.println(fullMessage);





    }
}
