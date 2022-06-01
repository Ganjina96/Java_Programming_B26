package day63_functional_interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {

        DynamicInterface <String> printEachChar = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        };

        printEachChar.test("hello world");
        System.out.println();

        DynamicInterface<Integer> printNum5Times = num ->{
            System.out.println(num);
            System.out.println(num);
            System.out.println(num);
            System.out.println(num);
            System.out.println(num);
        };

        printNum5Times.test(10);


    }


}
