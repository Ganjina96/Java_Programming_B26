package day15_switch;

import java.util.Scanner;

public class ArmyQualify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a citizen?");
        boolean isCitizen = input.nextBoolean();
        System.out.println("Are you a resident?");
        boolean isResident = input.nextBoolean();
        System.out.println("Do you have a high school diploma?");
        boolean diploma = input.nextBoolean();
        System.out.println("How old are you?");
        int age = input.nextInt();

        if ((isCitizen || isResident) && diploma && (age >= 18 && age <= 35)){
            System.out.println("You are qualified for the army");
        } else {
            System.out.println("You can't join the army");

            if (!isCitizen && !isResident){ // !(isCitizen || isResident)
                System.out.println("You must be a citizen or a resident");
            }
            if (!diploma){
                System.out.println("Must have a high school diploma");
            }
            if (age < 18 || age > 35){ // !(age >= 18 && age <= 35)
                System.out.println("Your age must be between 18 and 35");
            }




        }
    }
}
