package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next();
        System.out.println("Please enter your last name");
        String lastName = input.next();

        firstName = firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

        String fixedFirst = firstName.substring(0,1).toUpperCase();
        fixedFirst += firstName.substring(1);
                // firstName.charAt(0) --> this will also give you the first character but as a char type
        String fixedLast = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println(fixedFirst + " " + fixedLast);


    }
}
