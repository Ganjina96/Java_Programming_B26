package day12_multi_if_statements;

import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your hourly rate?");
        double hourlyRate = input.nextDouble();
        System.out.println("How many hours did you work?");
        double numOfHrsWorked = input.nextDouble();
        double netPay = hourlyRate * 40;
        double overtimePay;
        double overtimeHrs;


        if (numOfHrsWorked > 40) {
            overtimePay = hourlyRate * 1.5;
            overtimeHrs = numOfHrsWorked - 40;
            netPay += overtimeHrs * overtimePay;
            System.out.println("You got overtime pay of $" + (overtimePay * overtimeHrs));

        } else {
            System.out.println("You did not get overtime time, your regular paycheck is $" + netPay);
        }
        System.out.println("Your net pay is $" + netPay);

    }
}
