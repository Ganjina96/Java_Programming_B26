package day34_methods;

import java.util.Scanner;

public class NumberWords {

    public static void main(String[] args) {
        System.out.println(numberAsWord(4));

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        System.out.println(numberAsWord(input.nextInt()));

        /*
        why can't I do this:
        int num = numberAsWord(input.nextInt());

        the method returns String so we must store into a String variable
        String num = numberAsWord(input.nextInt());
         */
    }

    public static String numberAsWord(int num){
        // String is the output and int is the parameter aka input

        if (num < 1 || num > 10){
            return num + " is an invalid number";
        }
        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        return words[num - 1]; // will convert the parameter (num given) into index
    }
}
