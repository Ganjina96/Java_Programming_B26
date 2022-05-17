package day35_methods;

import java.util.Arrays;

public class FindMinInArray {
     /*
    Min Number

    create a method that will accept an int array and return the smallest number from the array
     */

    public static int minNum(int [] nums){
        int min = nums[0];

        for (int num : nums) {
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    // another cheating way
    public static int minNumSort(int [] nums){
        Arrays.sort(nums);
        return nums[0];
    }


}
