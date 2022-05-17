package day14_nested_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pin code");
        int actualPin = input.nextInt();
        System.out.println("Please enter the last 4 digits of your SSN");
        int actualSSN = input.nextInt();

        int expectedPin = 1552;
        int expectedSSN = 1234;

        if (actualPin == expectedPin && actualSSN == expectedSSN){
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");

            if (actualPin != expectedPin){
                System.out.println("incorrect pin code");
            }
            if (actualSSN != expectedSSN){
                System.out.println("incorrect SSN");
            }
        }

    }
}
