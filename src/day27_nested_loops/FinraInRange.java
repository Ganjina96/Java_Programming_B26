package day27_nested_loops;

import java.util.Scanner;

public class FinraInRange {
    /*
    similar to fizzbuzz
    number
        % 3 --> fin
        % 5 --> ra
        both --> finra
        neither --> number

        repeated up to some number
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your stopping point");
        int stop = input.nextInt();

        for (int i = 1; i <= stop; i++) {

            String str = "";

            if (i % 3 == 0){
                str += "FIN";
            }

            if (i % 5 == 0){ // separate if statements allow for the code to run top to bottom, and it will print FINRA in the str if the num is divisible by both
                str += "RA";
            }
            System.out.println(str.isEmpty() ? i : str);
        }
    }
}
