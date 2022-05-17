package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNums {
    /*
    String numbers to sum
    Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
    Ex:
    Input:
    “123”, “34”, “513” Output:
    [ 6, 7, 9 ]
     */

    public static ArrayList<Integer> sumFromString(ArrayList<String> list){

        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : list){ // goes thru every element of the String ArrayList

            int currentSum = 0;

            for (String eachDigit : each.split("")){ // converting the String "each" to an array by splitting by an empty space to make separate elements from a string and then loop thru the array

                currentSum += Integer.parseInt(eachDigit);

            }
            sums.add(currentSum);

        }
        return sums;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123","1111","34"));
        System.out.println(sumFromString(list));
    }
}
