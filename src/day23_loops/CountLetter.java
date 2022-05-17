package day23_loops;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        /*
        Given a string we want to count how many 'a' characters we have
        Challenge: adjust so that we can check for not only 'a' but any character
         */
//
//        String str = "google";
//        char letter = 'c';
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == letter){ // if we check for smth and it is there then we add to our count hence post-increment
//                count++;
//            }
//
//        }
//        System.out.println(count); <---- hardcoded way



 //        Different approach
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a word:");
//        String word = input.nextLine().toLowerCase().trim();
//        System.out.println("Enter a character you want to find");
//        String letter = input.nextLine().toLowerCase().trim();
//        int count = 0;
//
//        for (int i = word.length() - 1; i >= 0; i--) {
//            String check = "" + word.charAt(i);
//            if (check.equals(letter)){
//
//                count++;
//            }
//        }
//
//        System.out.println(count);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine().toLowerCase();
        System.out.println("enter a character:");
        char check = input.nextLine().toLowerCase().charAt(0); // assigns a string but gives back a char
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == check){
                count++;
            }
        }

        System.out.println("\n--------RESULT---------");
        System.out.println(count);


    }
}
