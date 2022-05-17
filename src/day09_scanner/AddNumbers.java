package day09_scanner;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        /*
        create scanner object
        ask the user to enter 3 #s
        find and print the sum of the numbers
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers. Hit enter after each");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("The sum is: " + (num1 + num2 + num3));
    }
}
