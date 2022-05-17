package day06_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;

        double addition = num1 + num2;
        double subtraction = num1 -  num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;

        System.out.println(addition);
        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainder);

    }
}
/*
    10 / 3 = 0.333333
    10 % 3 = 1
        3 + 3 + 3 -> 3
        10 - 9 --> 1
 */