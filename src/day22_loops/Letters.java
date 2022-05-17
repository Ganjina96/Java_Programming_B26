package day22_loops;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        char lowerCaseUp = 'a';

        while(lowerCaseUp <= 'z'){
            System.out.print(lowerCaseUp + " " );
            lowerCaseUp++;
        }
        System.out.println();

        char upperCaseBack = 'Z'; // int i = 122

        while (upperCaseBack >= 'A'){ // i >= 97
            System.out.print(upperCaseBack + " "); // (char)i
            upperCaseBack--;
        }


    }

}
