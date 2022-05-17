package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    /*
    create scanner object
    ask the user to enter their first name, last name, are they employed, if they are a student
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();
        System.out.println("Are you employed?");
        boolean isEmployed = input.nextBoolean();
        System.out.println("Are you a student?");
        boolean isStudent = input.nextBoolean();
        String details = firstName + " " + lastName + " is employed: " + isEmployed + " and are they a student: " + isStudent;
        System.out.println(details);
    }

}
