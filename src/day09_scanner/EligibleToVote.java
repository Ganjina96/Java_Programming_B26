package day09_scanner;

public class EligibleToVote {
    /*
    name
    are they a citizen
    do they have criminal background
    age
    determine voter eligibility
     */
    public static void main(String[] args) {
        String name = "Jane Doe";
        boolean isCitizen = true;
        boolean criminalBackground = false;
        int age = 25;
        boolean isEligibleToVote = age >= 18 && isCitizen && !criminalBackground;
        System.out.println("Is " + name + " eligible to vote? " + isEligibleToVote);
    }
}
