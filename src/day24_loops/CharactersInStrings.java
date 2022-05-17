package day24_loops;



public class CharactersInStrings {
    public static void main(String[] args) {
        String s = "java";

        for (int i = 0; i < s.length(); i++) {
            System.out.print((int)s.charAt(i) + " ");
            // type casting from char to int

        }
    }
}
