package day29_arrays;

public class Store {
    public static void main(String[] args) {
        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 399.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };

        // print the catalog

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item ID: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i]);
        }

        System.out.println();

        // task: find the index of gloves

        int indexOfGloves = -1; // if its not there then it will give us the invalid option automatically, default cannot be 0 because there is smth in zero index always

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")){
                indexOfGloves = i;
                break;
            }
            }
        System.out.println("index of gloves is: " + indexOfGloves);

        System.out.println();

        // task: find and print the info of the most expensive item. Name price id

        double mostExpensive = prices [0];
        int indexOfMostExpensive = 0; // need to keep track of the index # to use later to find them all

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] > mostExpensive){
                mostExpensive = prices[i];
                indexOfMostExpensive = i;
            }
        }
        System.out.println("The most expensive item: ");
        System.out.println("Item: " + items[indexOfMostExpensive]);
        System.out.println("Item id: " + itemIds[indexOfMostExpensive]);
        System.out.println("Price of the most expensive is: $" + prices[indexOfMostExpensive]);

        }

    }

