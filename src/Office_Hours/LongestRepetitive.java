package Office_Hours;

import java.util.Arrays;

public class LongestRepetitive {
    public static void main(String[] args) {
        /*


    Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    Your program should return longest substring K, and
    if there is none it should be return "There is no repetitive substring"

            For Example is str ="abcababcababcab"                 output should be abcab
                           str ="abcdefabcdef"                    output should be abcdef

                           str ="abcdefabcdefabcdefabcdef"    output should be abcdefabcdef
                           str ="abcdefxabcdef"                   output should be "There is no repetitive substring"

         */

        String word = "abcdefabcdefabcdefabcdef";
        String [] split = word.split("abcdefabcdef");
        System.out.println(split.length);
        System.out.println(Arrays.toString(split));

        word = "abcdefabcdef";

        String temp = "";
        String longest = "";
        for (int i = 0; i < word.length()/2; i++) { // if we have repetitive substring
            temp += word.charAt(i);
            System.out.println(temp);

            String [] s = word.split(temp); // we have new array based on our temp
            System.out.println(Arrays.toString(s));

            if (s.length == 0 && longest.length() < temp.length()){
                longest = temp;
                System.out.println("longest " + longest);
            }
        }

        System.out.println(!longest.isEmpty() ? longest : "There is no repetitive substring");



    }
}
