package day16_review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number one");
        double num1 = input.nextDouble();
        System.out.println("Pick operator: + - * / %");
        String operator = input.next();
        System.out.println("enter number two");
        double num2 = input.nextDouble();
        double result = 0;
        boolean validCalc = true;

        switch (operator){
            case "+":
               result = num1 + num2;
               break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
            case "x":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0){
                    result = num1 / num2;
                } else {
                    System.out.println("cannot divide by 0");
                    validCalc = false;
                }
                break;
            case "%":
                if (num2 != 0){
                    result = num1 % num2;
                } else {
                    System.out.println("cannot take remainder of 0");
                    validCalc = false;
                }
                break;

            default:
                System.out.println(operator + " is not a valid operator for this calculator");
                validCalc = false;
        }
        if (validCalc){
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }




    }
}
