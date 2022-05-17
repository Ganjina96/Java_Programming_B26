package day09_scanner;

public class ShortCircuit {
    public static void main(String[] args) {
        // system.out.println(5 / 0); gives you short circuit error
        System.out.println(true || 5/0 == 0);


    }
}
