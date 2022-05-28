package day62_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    /*
        Given a String count how many times each character is in the String
     */

    public static void frequencyOfEachChar(String str){

        Map<Character, Integer> counter = new LinkedHashMap<>(); // to maintain the order in which the characters appear

        for (int i = 0; i < str.length(); i++){

            char key = str.charAt(i);

            if (counter.containsKey(key)){

                // the letter/char was found before, meaning a duplicate occurrence, so we must update the counter for it which is the value in our map

                counter.put(key, counter.get(key) + 1); // counter.get() is a method from the map to get the value of the previous counter, then we add 1 to that number then assigns that result as the new value linked to that key

            }else {
                // the map doesn't contain the letter/character, meaning this is the first time the character was found, so we should add it to the map

                counter.put(key, 1);

            }


        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        frequencyOfEachChar("banana");
    }




}
