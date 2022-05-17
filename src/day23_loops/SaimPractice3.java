package day23_loops;

import java.util.Scanner;

public class SaimPractice3 {
    public static void main(String[] args) {
        /*
        Given a String separated by dashes calculate how many syllables the
words are
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine().trim();
        int syllables = 1;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == '-' && word.charAt(i + 1) != '-'){
                syllables++;
            }
        }
        if (word.isBlank()){
            System.out.println("no word");
        } else {
            System.out.println(syllables);
        }





    }
}
