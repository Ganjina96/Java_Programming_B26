package day26_nested_loops;

public class MultiplicationTable {
    /*
    print the multiplication table by the numbers from 1 to 10
    we will see for all numbers 1-10
     */

    public static void main(String[] args) {

        // hard coded loop

//        for (int i = 1; i <= 10; i++) {
//            System.out.print(1 + " x " + i + " = " + (1 * i) + " | ");
//        }
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(2 + " x " + i + " = " + (2 * i) + " | ");
//        }

        // nested loop

        for (int num = 1; num <= 10 ; num++) {

            for (int multi = 1; multi <= 10 ; multi++) {

                System.out.print(num + " x " + multi + " = " + (num * multi) + " | ");
            }
            System.out.println();
        }











    }
}
