package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {

    /*

    0 - full name
    1 - account type
    2 - account number
    3 - balance

     */

    public static void main(String[] args) {

        // one way to make an array
        String [] bankAccountOne = { "Brad Smith", "Checking", "100219482", "100,000,000"};
        System.out.println("Number of elements in the array: " + bankAccountOne.length);
        System.out.println(Arrays.toString(bankAccountOne)); // the only way to print the whole array as a string form
        System.out.println("Name: " + bankAccountOne[0]); // the way to access the info in the array for a specific element. Same index number rules apply to arrays too

        // second way
        String [] bankAccountTwo = new String[4]; // empty array here with null as placeholder for elements
        System.out.println(Arrays.toString(bankAccountTwo));
        bankAccountTwo[0] = "Jamie Fox";
        bankAccountTwo[1] = "Savings";
        bankAccountTwo[2] = "130484192";
        bankAccountTwo[3] = "10_203_324";
//        bankAccountTwo[4] = ""; // out of bounds
        System.out.println(Arrays.toString(bankAccountTwo));


        // third way by using Scanner
        String [] bankAccountThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine(); // just to show how we used to do this before in 2 parts
        bankAccountThree[0] = fullName; // second part
        System.out.println("Enter your account type");
        bankAccountThree[1] = input.nextLine();
        System.out.println("Enter your account number");
        bankAccountThree[2] = input.nextLine();
        System.out.println("Enter your balance");
        bankAccountThree[3] = input.nextLine();
        System.out.println(Arrays.toString(bankAccountThree));

        // with loops to avoid all the repeated action

        String [] bankAccountFour = new String[4];
        String [] questions = {"full name", "account type", "account number", "balance"};

        for(int i = 0; i < bankAccountFour.length; i++){
            System.out.println("Enter your " + questions[i]);
            bankAccountFour[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(bankAccountFour));











    }
}
