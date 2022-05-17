package day29_arrays;

import java.util.Arrays;

public class ReverseArray {
     /*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
    [1, 2, 3, 4, 5]
    Output:
    [5, 4, 3, 2, 1]
     */

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int [] reverse = new int[arr.length];

//        for (int i = arr.length - 1, j = 0; i >= 0 ; i--, j++) {
//            reverse [j] = arr [i];
//        }

        // j is the index of the new numbers in reverse order, we are declaring the variable to make sure we are assigning index numbers to the new variable reverse. j index is the same as whatever that i index is gonna be at that position. So for index 0 for j the element equivalent to that will be index 4 for i. we have to re-assign the variables in order to print properly

        for (int i = 0; i < arr.length; i++){
            reverse[arr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));

        /*
            the way to get indexes from the end
        i = 0
        reverse[arr.length - 1 - i] = arr[i];
        reverse [5 -1 -0] = arr[0];
        reverse[4] = arr[0];

        i = 1
        reverse[arr.length - 1 - i] = arr[i];
        reverse [5 -1 -1] = arr[0];
        reverse[3] = arr[1];


         */





    }
}
