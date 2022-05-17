package day27_nested_loops;

public class BreakInNested {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.println("i character " + i);

            if (i == 3){
                break;
            }
            // when the above break statement is run we stop the outer loop, which means both will no longer run. we get 3 full iterations of the outer loop, including the inner loop running start to finish then when i is equal to 3 the outer loop will stop

            for (int j = 0; j < 2; j++) {

                System.out.println("j character " + j);
//                break; // if the break is here the outer loop will iterate fully but the inner loop will execute the                   first iteration and then the break runs which stops the inner loop. Code resumes after the outer loop                    iterations finish

            }

            System.out.println();
//            break; // stop AFTER the first iteration of the outer loop and then the outer loop will stop
        }
    }
}
