package day06_arithmetic_operators;

public class CastingExamples {
    public static void main(String[] args) {

        short numOne = 40;
        float numtwo = numOne;
        System.out.println(numOne);
        System.out.println(numtwo);

        float numThree = 100.5F;
        short numFour =  (short) numThree;
        System.out.println(numThree);
        System.out.println(numFour);

        float num5 = 300;
        byte num6 = (byte) num5;
        System.out.println(num5);
        System.out.println(num6);

        char letter = 'A';
        int letter2 = letter;
        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int) letter);
        System.out.println((char) 66);

    }
}
