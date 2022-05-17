package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int num = 2;

        while (num <= 100){
            System.out.println(num);
            num += 2;
        }
        System.out.println("--------------------------");
        // approach 2
        int z = 1;

        while (z <= 100){
            if (z % 2 == 0){
                System.out.println(z);
            }
            z++;
        }
        System.out.println("----------------");
        // odd numbers

        int a = 1;
        while (a <= 100){
            System.out.print(a + " ");
            a += 2;
        }

        System.out.println();

      //approach 2

        int b = 0;

        while (b++ <= 100){
            if (b % 2 == 1){
                System.out.print(b + " ");
            }
        }

        /*
        flow:
        b = 0
        b++ <= 100 --> 0 <= 100 --> loop runs and b is now 1
            if (b % 2 == 1) --> 1 % 2 == 1 --> true --> prints #
            while (b++ <= 100) --> 1 <=100 --> loop runs and b is now 2
            if (b % 2 == 1) --> 2 % 2 == 1 --> false --> nothing happens and etc

         */

    }
}
