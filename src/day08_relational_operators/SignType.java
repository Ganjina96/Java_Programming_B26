package day08_relational_operators;

public class SignType {
    public static void main(String[] args) {
        /*
        declare and assign a number
        I want to know the sign of the number
        is the number pos, neg, or zero
         */

        int number = -25;
        boolean isItPos = number > 0;
        boolean isItNeg = number < 0;
        boolean isItZero = number == 0;
        System.out.println("Is " + number + " positive? " + isItPos + "\nIs " + number + " negative? " + isItNeg + "\nIs " + number + " zero? " + isItZero);

    }
}
