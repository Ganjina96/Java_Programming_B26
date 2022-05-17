package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer [] arr = {1,2,3}; // we made an Integer array because ArrayList does not accept primitive types

        Arrays.asList(arr); // converts the array to a collection type (ArrayList)

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr)); // creating an ArrayList with values from a collection type
        System.out.println(nums);

        // creating an ArrayList with some initial values; we will mostly do it this way

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(4,5,6,7));
        System.out.println(other);

    }
}
