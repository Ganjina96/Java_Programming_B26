package Office_Hours;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        /*
        Task 01 : Write a program that accepts start and end numbers. Given start and end
          numbers, return a new array containing the sequence of integers from start up to
          but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].

                Input:
                        start = 5    end = 10
                Output
                        int[] a → [5, 6, 7, 8, 9]
                Input:
                        start = 11    end = 18
                Output
                        int[] b → [11, 12, 13, 14, 15, 16, 17]
         */

        int start = 11;
        int end = 18;

        int[] newArray = new int[end-start];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = start++;
        }

        System.out.println(Arrays.toString(newArray));


        // increase all values of element by 1

        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = newArray[i]+1;
            newArray[i] += 1;
        }
        System.out.println(Arrays.toString(newArray));

        // same as above but with for each loop

        for (int each : newArray) {
            each += 1;
        }
        System.out.println(Arrays.toString(newArray));












    }
}
