package day64_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Recap {
    public static void main(String[] args) {

        // 1.1 Create a function that can verify if a number contains duplicate digits
        Predicate<Integer> verifyDuplicates = n -> {
            String str = n + "";
            String uniques = "";

            for (int i = 0; i < str.length(); i++) {
                if (!uniques.contains(str.charAt(i) + "")){ // the first time a number digit is found in our str String
                    uniques += str.charAt(i);
                }else {
                    return true;
                }
            }
            return false;
        };
        System.out.println(verifyDuplicates.test(123));
        System.out.println(verifyDuplicates.test(1231));


        // 1.3 Create a function that can return the longest String from a List of String
        // List<String> -> parameter
        // , String -> return type

        Function<List<String>, String> longestStringFromList = (list) -> {
            String longest = "";
            for (String each : list) {
                if (each.length() > longest.length()){
                    longest = each;
                }

            }
            return longest;
        };
        System.out.println(longestStringFromList.apply(new ArrayList<>(Arrays.asList("Dog", "Apple", "java", "astrophile", "i hate this", "when am i gonna be good at this"))));
    }
}

/*

    if you wanted to make this one reusable:

        this is in main method, so it was local to only this class main method

        Function< List<String>, String > longestStringFromList = (list) -> {
            String longest = "";
            for(String each : list){
                if(each.length() > longest.length()){
                    longest = each;
                }
            }
            return longest;
        };

        ------------------

        defined the implementation in the class level, not the main method:


     class{

        public static Function< List<String>, String > longestStringFromList = (list) -> {
            String longest = "";
            for(String each : list){
                if(each.length() > longest.length()){
                    longest = each;
                }
            }
            return longest;
        };

        above is accessible by className.longestStringFromList


        }

 */

