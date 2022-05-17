package day26_nested_loops;

public class NestedLoopEx {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe");


        // outer loop
        for (int j = 0; j < 3; j++){ // j = 1; j <= 3; both give 3 iterations

            // inner loop
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello World");
            }

            System.out.println("Hello Universe\n");
        }

        // every iteration of outer loop, the inner loop will run from beginning to end













    }
}
