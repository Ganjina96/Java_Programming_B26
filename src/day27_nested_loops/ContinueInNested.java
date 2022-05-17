package day27_nested_loops;

public class ContinueInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i == 1 || i == 2){
                continue; //
            }
            System.out.println("i " + i);

            for (int j = 0; j < 3; j++) {
//                if (j == 1){
//                    continue; // skips j = 1 but prints everything before and after that
//                }
                System.out.println("\tj " + j);


            }
        }



    }
}
