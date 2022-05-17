package day24_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String msg = input.nextLine().trim();
        int spaces = 0;

        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == ' '){ // msg.substring(i, i+1).equals(" ")
                spaces++;
            }

        }
        System.out.println("Number of words: " + (spaces + 1));










    }
}
