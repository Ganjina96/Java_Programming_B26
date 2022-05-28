package day63_functional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n) -> {

            if (n % 2 == 0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }; // lambda syntax

       evenOrOdd.apply(5);
       evenOrOdd.apply(20);

       NumberInterface cube = (n) -> {

           System.out.println(n * n * n);
       };

       cube.apply(3);
       cube.apply(6);

    }
}
