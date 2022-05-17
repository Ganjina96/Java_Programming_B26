package Office_Hours;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SaimPractice {

    public static void main(String[] args) {
        /*
        Given an ArrayList of Strings and a target word (String) print how many
times the target word is in the ArrayList
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
Target: java
Output:
2
         */

        ArrayList <String> arr = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals("java")){
                count++;
            }
        }
        System.out.println(count);


        System.out.println("-----------------------------------------");


        /*
        Given an ArrayList of Strings, go through and find Strings that are 4
characters or less. Take those Strings and put them into a different
ArrayList. Print that ArrayList of words
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
Output:
[ tree, loop, cat ]
         */

        ArrayList<String> words = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        ArrayList<String> characters = new ArrayList<>();

        for (String each : words){
            if (each.length() <= 4){
                characters.add(each);
            }
        }
        System.out.println(characters);
    }

}
