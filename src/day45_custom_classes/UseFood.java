package day45_custom_classes;

import java.util.Arrays;

public class UseFood {
    /*
    Create a separate class to create and test the Food objects

        try making an array of Food objects
        find all the Food objects that start with 'a'
        find all the Food objects that have a total price over 20
     */
    public static void main(String[] args) {

        Food apples = new Food("Apples");
        System.out.println(apples);

        Food chips = new Food("Lays", 2);
        System.out.println(chips);

        chips.unitPrice = 1.99;
        chips.calculatePrice();


        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);

        apples.quantity = 10;
        apples.unitPrice = 1.99;
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println(apples.totalPrice);

        String [] strs = {"one", "two", "three"};

        Food [] allFood = {apples,chips, chicken, null}; // = new Food [4]
        System.out.println(allFood[2]);

        allFood[3] = new Food("Fish", 4, 3.55); // manually assigned a food item to the array
        System.out.println(Arrays.toString(allFood));

        // calculate the total price of the whole shopping cart
        System.out.println();
        double totalPriceForAll = 0.0;

        for (Food each : allFood){ // Food is the first thing because it is a datatype of each element
            System.out.println(each);
            totalPriceForAll += each.totalPrice;
        }

        System.out.println(totalPriceForAll);
    }
}
