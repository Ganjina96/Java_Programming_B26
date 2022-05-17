package day19_string;

public class IndexOfMethod3 {
    public static void main(String[] args) {

        String word = "definition";
        //             0123456789

        System.out.println("first i: " + word.indexOf('i'));
        System.out.println("last i: " + word.lastIndexOf('i'));

        System.out.println("second i: " + word.indexOf('i', 4)); // gives us the position of the i after the first i in the sequence which was in position 3
        System.out.println("third i: " + word.indexOf('i', 6));

    }
}
