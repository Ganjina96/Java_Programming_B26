package day08_relational_operators;

public class AgeGroup {
    /*
    declare and assign an age variable
    is the person a kid ( up to 13, including 13)
    is the person a senior citizen (65 and above)
     */

    public static void main(String[] args) {
        int age = 80;

        boolean isKid = age <= 13;
        boolean isSenior = age >= 65;
        System.out.println("you are a kid: " + isKid);
        System.out.println("you are a senior citizen: " + isSenior);

    }
}
