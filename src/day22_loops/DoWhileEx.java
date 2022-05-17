package day22_loops;

public class DoWhileEx {
    public static void main(String[] args) {

        int num = 0;

        do {
            // everything b/w the curly brackets are in the loop

            System.out.println(num);
            num++;

        } while (num <= 10);

        System.out.println("With false boolean:");

        int num2 = 0;

        do {
            // everything b/w the curly brackets are in the loop

            System.out.println(num2);
            num2++;

        } while (num2 == 10);

        System.out.println("as while loop");

        int a3 = 0;

        while (a3 == 10){
            System.out.println(a3);
            a3++;
        }
    }
}
