package day23_loops;

import java.util.Scanner;

public class Palindrome {
    /*
        Palindrome: its the same reading from the beginning and end

        Ex:
            mom
            racecar
            anna
            madam

        Task: Check if a word is palindrome

        Flow:
            declare some initial String
            how to reverse a String
            check if the reverse version is the same as the original
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = input.nextLine();
        // reverse string, meaning we need to read the characters from end to beginning and connect them
        String reverse = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i); // characters are being read from the end and being added backwards into a reverse string
        }

        if (str.equals(reverse)){
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        // as a ternary
        System.out.println(str.equals(reverse) ? "Palindrome" : "Not Palindrome");


        // int i = str.length() - 1 will give us the number of the words last index

    }
}
