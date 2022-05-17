package day09_scanner;

public class GoForWalk {
    public static void main(String[] args) {
         // we want to go for a walk
        // we will go if it's not raining and is above 70
        // no need to check the weather if it's raining

        boolean isRaining = true;
        int temperature = 80;
        System.out.println("Should I go for a walk? " + (!isRaining && temperature > 70));

    }
}
