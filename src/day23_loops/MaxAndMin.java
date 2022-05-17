package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    /*
    write a program to enter 5 nums and returns the biggest and smallest of those
     */

    /*
    repeated steps:
        ask for a num
        check if its the biggest
        check if its the smallest
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -2147483648; // anything I put as my max will be bigger than the biggest
        int min = 2147483647; // anything I put as my min will be less than the smallest
        // this logic helps us narrow the max and min because of the logical operators
        int iterations = 0; // how many times we run the loop

        while (iterations < 5){
            iterations++;
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


    }
}
