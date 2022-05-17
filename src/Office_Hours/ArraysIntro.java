package Office_Hours;

import java.util.Arrays;

public class ArraysIntro {
    /*
    An array is data structure that can hold multiple values
    ordered data structure (has index #s)
    Size is fixed (Disadvantage)

    Default
        String ---> null
        byte-short-int-long ----> 0
        float-double ----> 0.0
        boolean ---> false
     */
    public static void main(String[] args) {


        // declaring arrays

        //1

        String[] colors = {"Yellow", "Blue", "Pink"};
//        colors[3] = "Purple"; --> we can't add elements after initial

        //2

        int [] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;

        // how can we retrieve data from an array

        System.out.println(colors[0]); // Yellow

        // how can we re-assign data from an array
        colors[0] = "Red";
        System.out.println(colors[0]); // Red

        /*
        Arrays Utility
            Arrays class is presented "java.util"
            - toString()
         */

        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colors).replace("[", "").replace("]", "").toLowerCase().trim());

        // length
        System.out.println(colors.length);

        // What is the difference b/w length() vs length?

            // length --> this is for arrays. this is property
            // length() --> this is for strings this is a method

        // get me last element of colors

        System.out.println(colors[colors.length - 1]);

        //String Methods
            // toCharArray
        String name = "Cydeo";
        char[] chars = name.toCharArray();
        // Shortcut = OPT+enter ---> introduce local variable

        System.out.println(Arrays.toString(chars));
        //(chars[0]+"") --> you can use String methods without any concat

            // split
        String[] split = name.split("");
        System.out.println(Arrays.toString(split));

        String a = "a b c a b c a b c";
        String[] abc = a.split(" ");
        System.out.println(Arrays.toString(abc));

        //Hint for Interview Task
        a = "abcabcabc";
        String[] abcs = a.split("abc");
        System.out.println(Arrays.toString(abcs));
        System.out.println(abcs.length);


    }

}
