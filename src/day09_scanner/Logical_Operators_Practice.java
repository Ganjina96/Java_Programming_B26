package day09_scanner;

public class Logical_Operators_Practice {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(n > 5);
        System.out.println(n < 10);
        // using 2 relational operators to get an answer, but I want just one answer

        System.out.println(n > 5 && n < 10); // needs both to be true

        System.out.println("---------------------------------");
        System.out.println(4 > 3 || false); // needs at least one of them to be true
        System.out.println(4 < 3 || false);

        System.out.println("---------------------------------");
        System.out.println(!false); // used when want to reverse logic or not in th range
        System.out.println(!true);
    }
}
