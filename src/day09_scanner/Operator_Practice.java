package day09_scanner;

public class Operator_Practice {
    public static void main(String[] args) {
        int w = 78 / 2 * 2 + 3 - 5 % 5;
        /*         39  * 2 + 3 - 5 % 5
                        78 + 3 - 5 % 5
                        78 + 3 - 0
                        = 81
         */
        System.out.println(w);
        System.out.println("---------------------------------");

        int a = 8; // 8 -> 7
        int b = a--; // post decrement, prints the original value and then subtracts 1 in the next line so b = 8;
        System.out.println(a);
        System.out.println(b);

        System.out.println("---------------------------------");

        int L = 50; // 50 -> 49 -> 50 -> 49 -> 50
        int P = --L + L++ + L-- + L++;
        //       49 +  49 +  50  + 49
        System.out.println(L);
        System.out.println(P);

        System.out.println("---------------------------------");

        int R = 20; // 20 -> 19 -> 20 -> 19 -> 18
        int W = -R-- + -R++ + --R * R-- % 2;
        //       -20 +  -19 +  19 * 19  % 2
        //             -20 + -19 + 361 % 2
        //                 -20 + -19 + 1
        //                     -39 + 1
        //                         -38
        System.out.println(R);
        System.out.println(W);


    }
}
