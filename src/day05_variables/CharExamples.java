package day05_variables;

public class CharExamples {
    public static void main(String[] args) {
        // assigning characters to char type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char letterThree = 'A';
        char numberOne = '9';
        char specialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne); // original: 97+90+65+57+36

        letterThree = 65;
        System.out.println(letterThree);

        // char letterThree = '65'; is invalid cause there are 2 characters

        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + numberOne + " " + specialOne); // spaces between each char

        System.out.println("chars: " + letterOne + letterTwo + letterThree + numberOne + specialOne); // string in the beginning


    }
}
