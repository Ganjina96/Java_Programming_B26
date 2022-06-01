package day64_functional_interface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateEx {
    public static void main(String[] args) {

        BiPredicate<Integer[], Integer> contains = (arr, num) -> {
            for (int each : arr) {
                if (each == num){
                    return true; // if this if statement is ever true, then my array does contain the number we were looking for, so we return true
                }
            }
            return false; // if the loop finishes and compares the num with every number in the array, the array does not contain the num, returning false
        };
        Integer [] arr = {4,5,12,10,24};
        System.out.println(contains.test(arr, 12));
        System.out.println(contains.test(arr,34));


        BiPredicate<String, String> anagram = (str, str2) -> {
            char[] arr1 = str.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        };
        System.out.println(anagram.test("listen", "silent"));
        System.out.println(anagram.test("lisa", "sail"));
        System.out.println(anagram.test("ana", "anna"));
    }
}
