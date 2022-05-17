package day20_string;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine().trim(); // to avoid any extra spaces and avoid confusion

        int spaceIndex = sentence.indexOf(' '); // looking for a space character
        String firstWord = sentence.substring(0,spaceIndex);
        String result = sentence.substring(spaceIndex + 1) + " " + firstWord;
        // String result = sentence.substring(spaceIndex).trim() + " " + firstWord;
        System.out.println(result);
    }
}
