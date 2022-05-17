package day23_loops;

import java.util.Scanner;

public class SaimPractice2 {
    public static void main(String[] args) {
        /*
        Given a String print the ascii value codes for each character
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine().trim();
        int ascii = 0;

        for (int i = 0; i < word.length(); i++) {
            ascii = word.charAt(i);
            System.out.print(ascii + " ");

        }


    }
}
