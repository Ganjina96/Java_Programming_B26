package day64_functional_interface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionEx {
    public static void main(String[] args) {

        // compare 2 nums, find the biggest one
        // first 2 types are the parameter types, and last one is the return type
        BiFunction<Integer, Integer, Integer> maxNumber = (num1, num2) -> {
            return num1 > num2 ? num1 : num2;
        };
        System.out.println(maxNumber.apply(5,2));

        System.out.println("---------------------------------------------------------------");

        /*
        List<Integer> --> keys -> first param
        List<String>  --> values -> second param
        Map<Integer, String> --> final map that will be returned
         */
        BiFunction< List<Integer>, List<String>, Map<Integer, String>> createMap = (keys, values) -> {
            Map<Integer, String> map = new HashMap<>();
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i) );
            }
            return map;
        };
        List<Integer> keys = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<String> values = new ArrayList<>(Arrays.asList("Plato", "Diogenes", "Nietzsche", "Homer"));
        System.out.println(createMap.apply(keys,values));
    }
}
