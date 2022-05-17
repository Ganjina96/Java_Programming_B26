package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temperature outside");
        int temperature = input.nextInt();
        if(temperature >= 70){
            System.out.println("Its a nice day. Go outside and practice java");
        } else {
            System.out.println("Its too cold. Stay inside and practice java");
        }
    }
}
