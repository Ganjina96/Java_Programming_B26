package day32_arrays;

import java.util.Arrays;

public class BinarySearchEx {
    public static void main(String[] args) {

        int [] nums = {4,10,30,100};
        System.out.println(Arrays.binarySearch(nums,4));
        System.out.println(Arrays.binarySearch(nums,100));
        System.out.println(Arrays.binarySearch(nums,200)); // will give you the negative number cause does not exist in the array
        System.out.println(Arrays.binarySearch(nums,6)); // it will give you position where it would be +1 for 11/12


    }
}
