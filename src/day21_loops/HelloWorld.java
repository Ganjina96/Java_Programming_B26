package day21_loops;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); // what if I want to print this statement 100 times??

        System.out.println();
//        while (true){
//            System.out.println("Hello World");
//        } do not do this because it will indefinitely and ruin your comp

        int num = 1;
        while (num <= 100){
            System.out.println("Hello World " + num++);
        }

        System.out.println();
        int z = 1;
        while (z <=50){
            System.out.println("Hello Universe " + z);
            z++;
        }
        /*
        flow of above:
            z = 1
            z <= 50 --> 1 <= 50 --> true --> goes into loop
            runs code: System.out.println("Hello Universe " + z); -->
            Universe 1
            z++ --> 2
            2 <= 50 --> true --> goes into loop
            runs code: System.out.println("Hello Universe " + z); -->
            Universe 2
            z++ --> 3 and so on till it gets to 51 and stops the loop cause the boolean expression is no longer true

         */
    }
}
