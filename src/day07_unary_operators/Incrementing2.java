package day07_unary_operators;

public class Incrementing2 {
    public static void main(String[] args) {

        int age = 25;
        System.out.println(age); // 25
        System.out.println(age++); // executes the line first but if i run age after ill get 25 + 1 -> 26
        System.out.println(age); // 26, see above

        System.out.println(age++); // 26
        System.out.println(age); // 27

        System.out.println(++age); // automatically updates
    }
}
