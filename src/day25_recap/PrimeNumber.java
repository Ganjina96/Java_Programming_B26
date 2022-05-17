package day25_recap;

import java.util.Scanner;

public class PrimeNumber {
     /*
    [IQ] Prime number [Loops]

    Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            11

        Output:
            prime

    Ex:
        Input:
            10

        Output:
            not prime
     */
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a number");
         int num = input.nextInt();
         boolean isPrime = num >= 2; // true when you have valid numbers (more than 1 and positive)

         for (int i = 2; i < num; i++) { // number will always be divisible by itself and 1, so we have to start from 1 and exclude the value of the # itself
             if (num % i == 0){
                 isPrime = false;
                 break; // it exists the loop cause if the first attempt is not divisible then its not prime
             }

         }
         if (isPrime){
             System.out.println(num + " is prime");
         } else {
             System.out.println(num + " is not prime");
         }

         /*
         n % 2
         n % 3
         n % 4
         ....
         n % less than number
         it's a repeated action that we need to check

         this loop is trying to check if our number is evenly divisible by value from 2 to the number.
          */










     }
}
