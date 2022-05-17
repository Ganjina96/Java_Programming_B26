package day19_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words:");
        String wordOne = input.next().toLowerCase();
        String wordTwo = input.next().toLowerCase();
        String wordThree = input.next().toLowerCase();
        String longestWord = "";

//        int oneLen = wordOne.length();
//        int twoLen = wordTwo.length();
//        int threeLen = wordThree.length();
//
//        if (wordOne.contains("a") && oneLen > twoLen && oneLen > threeLen){
//            System.out.println(wordOne + " is the longest with a");
//        }else if (wordTwo.contains("a") && twoLen > oneLen && twoLen > threeLen){
//            System.out.println(wordTwo + " is the longest with a");
//        } else if (wordThree.contains("a") && threeLen > oneLen && threeLen > twoLen){
//            System.out.println(wordThree + " is the longest with a");
//        } else {
//            System.out.println("Your words do not contain letter \"a\"");
//        }

        if (wordOne.contains("a") && wordOne.length() > longestWord.length()){
            longestWord = wordOne;
        }

        if (wordTwo.contains("a") && wordTwo.length() > longestWord.length()){
            longestWord = wordTwo;
        }

        if (wordThree.contains("a") && wordThree.length() > longestWord.length()){
            longestWord = wordThree;
        }

        System.out.println(longestWord.isEmpty() ? "No single largest word with a" : longestWord + " is the longest word with a");

        /*
        if (longestWord.isEmpty())
            "No single largest"
        else
        longestWord + " is the longest word with a"
         */
    }
}
