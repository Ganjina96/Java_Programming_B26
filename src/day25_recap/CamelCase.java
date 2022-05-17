package day25_recap;

import java.util.Scanner;

public class CamelCase {
    /*
     Camel Case

    Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

    Ex:

        Today is SUNDAY

        Output:

        todayIsSunday

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = input.nextLine().toLowerCase();
        String camelCase = str.substring(0,1); // i'm putting the first char into the string right away so my loop can start from i = 1 to check for spaces and we do not want to do this in the first iteration

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' '){
                camelCase += str.substring(i, i + 1).toUpperCase();
            } else {
                camelCase += str.charAt(i);
            }

        }
        System.out.println(camelCase.replace(" ", ""));
    }
}
