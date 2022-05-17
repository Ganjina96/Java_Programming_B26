package day32_arrays;

import java.util.Arrays;

public class AverageOfEach {
    /*

    Given a 2D array find the average of each inner array
    and extra: average of the whole array

    Ex:

        3, 4, 5, 6
        5, 2, 6
        10, 20, 30

     */

    public static void main(String[] args) {

        int [][] nums = {
                {3,4,5,6},
                {5,2,6},
                {10,20,30}
        };
        double total = 0;
        int totalLength = 0;

        for (int[] eachArray : nums){
//            System.out.println(Arrays.toString(eachArray)); // each array printed on separate lines
            double sum = 0; // do it after the outer loop so it can reset after each array

            for (int eachNum : eachArray){
//                System.out.println(eachNum);
                sum += eachNum;

            }
            System.out.println(Arrays.toString(eachArray) + " the average is: " + (sum/eachArray.length));

            total += sum;
            totalLength += eachArray.length;

            System.out.println(Arrays.deepToString(nums) + " the average is: " + (total/totalLength));
        }
    }

}
