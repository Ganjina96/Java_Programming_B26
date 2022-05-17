package day48_encapsulation;

public class Pizza {
    /*
        create a class called Pizza

        - data:

            size (String), number of toppings

        - constructor

            - create a constructor that creates a Pizza object with the size and number of toppings

                call setters here

        - encapsulate the Pizza class

            - setter condition:
                size can only be:
                    small, medium, or large

                number of toppings must be a positive number

        - other methods methods:

            - calculatePrice()
                    calculate the price of the pizza based on:

                        small base: $4
                        medium base: $6
                        large base: $8

                        each topping adds $0.75 to the price

                        calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza
     */

    private String size;
    private int numberOfToppings;

    public Pizza(String size, int numberOfToppings){
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")){
            this.size = size;
        }
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings >= 0){
            this.numberOfToppings = numberOfToppings;
        }
    }

    public double calculatePrice(){
        if (size == null){
            return -1;
        }
        double price = size.equalsIgnoreCase("small") ? 4 : size.equalsIgnoreCase("medium") ? 6 : 8;
        return price + (numberOfToppings * 0.75);
    }

    public String toString(){
        return "Pizza size: " + size + " with " + numberOfToppings + " toppings, equals to $" + calculatePrice();
    }
}
