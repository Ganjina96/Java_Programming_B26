package day31_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str = "listen";
        String str2 = "silent";

        char[] one = str.toCharArray();
        char[] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        if (Arrays.equals(one,two)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }

    }
}
