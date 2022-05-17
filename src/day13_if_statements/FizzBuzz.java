package day13_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();

        if (n % 3 == 0 && n % 5 == 0){ // has to be in the beginning to take priority in case divisible by both
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0){
            System.out.println("Fizz");
        } else if (n % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
}
