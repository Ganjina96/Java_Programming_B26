package day05_variables;

public class MyName {
    public static void main(String[] args) {
        char letterOne = 'G';
        char letterTwo = 'A';
        char letterThree = 'N';
        char letterFour = 'J';
        char letterFive = 'I';
        char letterSix = 'N';
        char letterSeven = 'A';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);
        System.out.println(letterFive);
        System.out.println(letterSix);
        System.out.println(letterSeven);

        System.out.println("\nmy name is " + letterOne + letterTwo + letterThree + letterFour + letterFive + letterSix + letterSeven);
        // or you can make a variable of the name

        String name = "" + letterOne + letterTwo + letterThree + letterFour + letterFive + letterSix + letterSeven;
        System.out.println("my name is " + name);



    }
}
