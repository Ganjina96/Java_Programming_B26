package day29_arrays;

public class LongestAndShortestStrings {
    /*
    Shortest and Longest words from String array
    • Write a program that can return the shortest string element from a String array
    • Write a program that can return the longest string element from a String array
     */

    public static void main(String[] args) {
        String [] str = {"apple", "java", "computer", "water"};
        String smallest = str[0];
        String biggest = str[0];
//
//        for (int i = 0; i < str.length; i++) {
//
//            if (str[i].length() > biggest.length()){
//                biggest = str[i];
//            }
//            if (str[i].length() < smallest.length()){
//                smallest = str[i];
//            }
//        }

        for (String word : str) {
            if (word.length() > biggest.length()){
                biggest = word;
            }

            if (word.length() > smallest.length()){
                smallest = word;
            }
        }


        System.out.println("Biggest String: " + biggest);
        System.out.println("Smallest String: " + smallest);

    }
}
