package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input original balance");
        double balance = input.nextDouble();
        System.out.println("Please input withdraw amount");
        double withdraw = input.nextDouble();

        // hard coded
//        double balance = 100;
//        double withdraw = 50;


        // withdraw some amount of money from my balance
        balance -= withdraw; //balance = balance - withdraw

        if(balance < 0){
            System.out.println("took out too much money, $100 overdraft fee applied");
            System.out.println("balance before the fee: " + balance);
            balance -= 100; // balance = balance - 100;
        }
        System.out.println("Balance $" + balance);

    }
}

