package day21_loops;

public class Factorial {
    public static void main(String[] args) {

        int n = 5;
        int result = 1;

        // 5 * 4 * 3 * 2 * 1
        // repeated action is to multiply the numbers by the one less than it
        // stopping point is 1

        while (n > 1){
            System.out.println(result + " * " + n);

            result *= n;
            n--;
        }
        System.out.println(result);
    }
}
