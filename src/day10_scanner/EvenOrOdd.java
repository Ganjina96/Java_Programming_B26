package day10_scanner;
import java.util.Scanner;
public class EvenOrOdd {
     /*
    Ask the user to enter an int number. Determine if the number is even or odd
    Print a boolean for both even and odd
     */
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Enter a number");
         int number = input.nextInt();

         boolean isEven = number % 2 ==0;
         boolean isOdd = number % 2 !=0; // num % 2 == 1
         // isOdd = !isEven
         System.out.println(number + " is even: " + isEven);
         System.out.println(number + " is odd: " + isOdd);

     }
}
