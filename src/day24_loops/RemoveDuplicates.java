package day24_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        /*
        Write a program that can remove duplicates from a String
         */

        String str = "abcabc";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains("" + str.charAt(i))){ // contains method needs an argument of string, and now we are giving him char, adding the "" will concatenate and make the whole thing a string
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);


    }
}

/*
Breakdown of the flow:

        String str = "abcabc";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains("" + str.charAt(i))){
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);

        iteration 1:
            i = 0
            charAt(i) --> chartAt(0) --> a
            unique = "";
            if (!unique.contains("a"){ --> false --> !false --> true
            so we add the a to the unique string

 */
